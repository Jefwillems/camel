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
package org.apache.camel.component.jetty;

import java.net.URL;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.parallel.Isolated;
import org.junit.jupiter.api.parallel.ResourceLock;

import static org.apache.camel.component.jetty.BaseJettyTest.SSL_SYSPROPS;

@Isolated
@ResourceLock(SSL_SYSPROPS)
public class HttpsRouteSetupWithSystemPropsTest extends HttpsRouteTest {

    @Override
    public void doPreSetup() throws Exception {
        // ensure jsse clients can validate the self signed dummy localhost
        // cert,
        // use the server keystore as the trust store for these tests
        URL trustStoreUrl = this.getClass().getClassLoader().getResource("jsse/localhost.p12");
        setSystemProp("javax.net.ssl.trustStore", "file://" + trustStoreUrl.getPath());

        // START SNIPPET: e1
        // setup SSL using system properties
        setSystemProp("org.eclipse.jetty.ssl.keystore", "file://" + trustStoreUrl.getPath());
        setSystemProp("org.eclipse.jetty.ssl.keypassword", pwd);
        setSystemProp("org.eclipse.jetty.ssl.password", pwd);
        setSystemProp("jdk.tls.client.protocols", "TLSv1.3");
        // END SNIPPET: e1
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("jetty:https://localhost:" + port1 + "/test").to("mock:a");

                Processor proc = new Processor() {
                    public void process(Exchange exchange) {
                        exchange.getMessage().setBody("<b>Hello World</b>");
                    }
                };
                from("jetty:https://localhost:" + port1 + "/hello").process(proc);

                from("jetty:https://localhost:" + port2 + "/test").to("mock:b");
            }
        };
    }
}
