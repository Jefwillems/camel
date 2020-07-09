/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.netty.http.rest;

import org.apache.camel.BindToRegistry;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.netty.http.BaseNettyTest;
import org.apache.camel.component.netty.http.RestNettyHttpBinding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestNettyHttpGetWildcardsTest extends BaseNettyTest {

    @BindToRegistry("mybinding")
    private RestNettyHttpBinding binding = new RestNettyHttpBinding();

    @Test
    public void testProducerGet() throws Exception {
        String out = template.requestBody("netty-http:http://localhost:{{port}}/users/123/basic", null, String.class);
        assertEquals("123;Donald Duck", out);
    }

    @Test
    public void testServletProducerGetWildcards() throws Exception {
        String out = template.requestBody("netty-http:http://localhost:{{port}}/users/456/name=g*", null, String.class);
        assertEquals("456;Goofy", out);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                // configure to use netty-http on localhost with the given port
                restConfiguration().component("netty-http").host("localhost").port(getPort()).endpointProperty("nettyHttpBinding", "#mybinding");

                // use the rest DSL to define the rest services
                rest("/users/")
                    .get("{id}/{query}")
                        .route()
                        .to("log:query")
                        .process(exchange -> {
                            String id = exchange.getIn().getHeader("id", String.class);
                            exchange.getMessage().setBody(id + ";Goofy");
                        }).endRest()
                    .get("{id}/basic")
                        .route()
                        .to("log:input")
                        .process(exchange -> {
                            String id = exchange.getIn().getHeader("id", String.class);
                            exchange.getMessage().setBody(id + ";Donald Duck");
                        }).endRest();
            }
        };
    }

}
