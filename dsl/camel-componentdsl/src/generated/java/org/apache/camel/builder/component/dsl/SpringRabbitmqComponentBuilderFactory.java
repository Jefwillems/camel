/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.springrabbit.SpringRabbitMQComponent;

/**
 * Send and receive messages from RabbitMQ using the Spring RabbitMQ client.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SpringRabbitmqComponentBuilderFactory {

    /**
     * Spring RabbitMQ (camel-spring-rabbitmq)
     * Send and receive messages from RabbitMQ using the Spring RabbitMQ client.
     * 
     * Category: messaging
     * Since: 3.8
     * Maven coordinates: org.apache.camel:camel-spring-rabbitmq
     * 
     * @return the dsl builder
     */
    static SpringRabbitmqComponentBuilder springRabbitmq() {
        return new SpringRabbitmqComponentBuilderImpl();
    }

    /**
     * Builder for the Spring RabbitMQ component.
     */
    interface SpringRabbitmqComponentBuilder extends ComponentBuilder<SpringRabbitMQComponent> {
    
        /**
         * Optional AMQP Admin service to use for auto declaring elements
         * (queues, exchanges, bindings).
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.amqp.core.AmqpAdmin&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param amqpAdmin the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder amqpAdmin(org.springframework.amqp.core.AmqpAdmin amqpAdmin) {
            doSetProperty("amqpAdmin", amqpAdmin);
            return this;
        }
    
        /**
         * The connection factory to be use. A connection factory must be
         * configured either on the component or endpoint.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.amqp.rabbit.connection.ConnectionFactory&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param connectionFactory the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder connectionFactory(org.springframework.amqp.rabbit.connection.ConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
    
        
        /**
         * Specifies whether to test the connection on startup. This ensures
         * that when Camel starts that all the JMS consumers have a valid
         * connection to the JMS broker. If a connection cannot be granted then
         * Camel throws an exception on startup. This ensures that Camel is not
         * started with failed connections. The JMS producers is tested as
         * well.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param testConnectionOnStartup the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder testConnectionOnStartup(boolean testConnectionOnStartup) {
            doSetProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
    
        
        /**
         * Specifies whether the consumer should auto declare binding between
         * exchange, queue and routing key when starting. Enabling this can be
         * good for development to make it easy to standup exchanges, queues and
         * bindings on the broker.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param autoDeclare the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder autoDeclare(boolean autoDeclare) {
            doSetProperty("autoDeclare", autoDeclare);
            return this;
        }
    
        
        /**
         * Specifies whether the consumer container should auto-startup.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param autoStartup the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder autoStartup(boolean autoStartup) {
            doSetProperty("autoStartup", autoStartup);
            return this;
        }
    
        
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        /**
         * The name of the dead letter exchange.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param deadLetterExchange the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder deadLetterExchange(java.lang.String deadLetterExchange) {
            doSetProperty("deadLetterExchange", deadLetterExchange);
            return this;
        }
    
        
        /**
         * The type of the dead letter exchange.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: direct
         * Group: consumer
         * 
         * @param deadLetterExchangeType the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder deadLetterExchangeType(java.lang.String deadLetterExchangeType) {
            doSetProperty("deadLetterExchangeType", deadLetterExchangeType);
            return this;
        }
    
        /**
         * The name of the dead letter queue.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param deadLetterQueue the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder deadLetterQueue(java.lang.String deadLetterQueue) {
            doSetProperty("deadLetterQueue", deadLetterQueue);
            return this;
        }
    
        /**
         * The routing key for the dead letter exchange.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param deadLetterRoutingKey the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder deadLetterRoutingKey(java.lang.String deadLetterRoutingKey) {
            doSetProperty("deadLetterRoutingKey", deadLetterRoutingKey);
            return this;
        }
    
        
        /**
         * How many times a Rabbitmq consumer will retry the same message if
         * Camel failed to process the message.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5
         * Group: consumer
         * 
         * @param maximumRetryAttempts the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder maximumRetryAttempts(int maximumRetryAttempts) {
            doSetProperty("maximumRetryAttempts", maximumRetryAttempts);
            return this;
        }
    
        
        /**
         * Whether a Rabbitmq consumer should reject the message without
         * requeuing. This enables failed messages to be sent to a Dead Letter
         * Exchange/Queue, if the broker is so configured.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param rejectAndDontRequeue the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder rejectAndDontRequeue(boolean rejectAndDontRequeue) {
            doSetProperty("rejectAndDontRequeue", rejectAndDontRequeue);
            return this;
        }
    
        
        /**
         * Delay in msec a Rabbitmq consumer will wait before redelivering a
         * message that Camel failed to process.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param retryDelay the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder retryDelay(int retryDelay) {
            doSetProperty("retryDelay", retryDelay);
            return this;
        }
    
        
        /**
         * The number of consumers.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer (advanced)
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder concurrentConsumers(int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
    
        /**
         * To use a custom ErrorHandler for handling exceptions from the message
         * listener (consumer).
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.util.ErrorHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param errorHandler the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder errorHandler(org.springframework.util.ErrorHandler errorHandler) {
            doSetProperty("errorHandler", errorHandler);
            return this;
        }
    
        /**
         * To use a custom factory for creating and configuring
         * ListenerContainer to be used by the consumer for receiving messages.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.springrabbit.ListenerContainerFactory&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param listenerContainerFactory the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder listenerContainerFactory(org.apache.camel.component.springrabbit.ListenerContainerFactory listenerContainerFactory) {
            doSetProperty("listenerContainerFactory", listenerContainerFactory);
            return this;
        }
    
        /**
         * The maximum number of consumers (available only with SMLC).
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param maxConcurrentConsumers the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder maxConcurrentConsumers(java.lang.Integer maxConcurrentConsumers) {
            doSetProperty("maxConcurrentConsumers", maxConcurrentConsumers);
            return this;
        }
    
        
        /**
         * The type of the MessageListenerContainer.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: DMLC
         * Group: consumer (advanced)
         * 
         * @param messageListenerContainerType the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder messageListenerContainerType(java.lang.String messageListenerContainerType) {
            doSetProperty("messageListenerContainerType", messageListenerContainerType);
            return this;
        }
    
        
        /**
         * Tell the broker how many messages to send to each consumer in a
         * single request. Often this can be set quite high to improve
         * throughput.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 250
         * Group: consumer (advanced)
         * 
         * @param prefetchCount the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder prefetchCount(int prefetchCount) {
            doSetProperty("prefetchCount", prefetchCount);
            return this;
        }
    
        /**
         * Custom retry configuration to use. If this is configured then the
         * other settings such as maximumRetryAttempts for retry are not in
         * use.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.retry.interceptor.RetryOperationsInterceptor&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param retry the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder retry(org.springframework.retry.interceptor.RetryOperationsInterceptor retry) {
            doSetProperty("retry", retry);
            return this;
        }
    
        
        /**
         * The time to wait for workers in milliseconds after the container is
         * stopped. If any workers are active when the shutdown signal comes
         * they will be allowed to finish processing as long as they can finish
         * within this timeout.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: consumer (advanced)
         * 
         * @param shutdownTimeout the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder shutdownTimeout(long shutdownTimeout) {
            doSetProperty("shutdownTimeout", shutdownTimeout);
            return this;
        }
    
        
        /**
         * Whether to allow sending messages with no body. If this option is
         * false and the message body is null, then an
         * MessageConversionException is thrown.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param allowNullBody the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder allowNullBody(boolean allowNullBody) {
            doSetProperty("allowNullBody", allowNullBody);
            return this;
        }
    
        
        /**
         * Specifies whether the producer should auto declare binding between
         * exchange, queue and routing key when starting. Enabling this can be
         * good for development to make it easy to standup exchanges, queues and
         * bindings on the broker.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param autoDeclareProducer the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder autoDeclareProducer(boolean autoDeclareProducer) {
            doSetProperty("autoDeclareProducer", autoDeclareProducer);
            return this;
        }
    
        
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Specify the timeout in milliseconds to be used when waiting for a
         * reply message when doing request/reply messaging. The default value
         * is 5 seconds. A negative value indicates an indefinite timeout.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: producer
         * 
         * @param replyTimeout the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder replyTimeout(long replyTimeout) {
            doSetProperty("replyTimeout", replyTimeout);
            return this;
        }
    
        /**
         * Specify arguments for configuring the different RabbitMQ concepts, a
         * different prefix is required for each element: consumer. exchange.
         * queue. binding. dlq.exchange. dlq.queue. dlq.binding. For example to
         * declare a queue with message ttl argument:
         * queue.x-message-ttl=60000.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param args the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder args(java.util.Map<java.lang.String, java.lang.Object> args) {
            doSetProperty("args", args);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        
        /**
         * Switch on ignore exceptions such as mismatched properties when
         * declaring.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param ignoreDeclarationExceptions the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder ignoreDeclarationExceptions(boolean ignoreDeclarationExceptions) {
            doSetProperty("ignoreDeclarationExceptions", ignoreDeclarationExceptions);
            return this;
        }
    
        /**
         * To use a custom MessageConverter so you can be in control how to map
         * to/from a org.springframework.amqp.core.Message.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.amqp.support.converter.MessageConverter&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param messageConverter the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder messageConverter(org.springframework.amqp.support.converter.MessageConverter messageConverter) {
            doSetProperty("messageConverter", messageConverter);
            return this;
        }
    
        /**
         * To use a custom MessagePropertiesConverter so you can be in control
         * how to map to/from a
         * org.springframework.amqp.core.MessageProperties.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.springrabbit.MessagePropertiesConverter&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param messagePropertiesConverter the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder messagePropertiesConverter(org.apache.camel.component.springrabbit.MessagePropertiesConverter messagePropertiesConverter) {
            doSetProperty("messagePropertiesConverter", messagePropertiesConverter);
            return this;
        }
    
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: filter
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default SpringRabbitmqComponentBuilder headerFilterStrategy(org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
    }

    class SpringRabbitmqComponentBuilderImpl
            extends AbstractComponentBuilder<SpringRabbitMQComponent>
            implements SpringRabbitmqComponentBuilder {
        @Override
        protected SpringRabbitMQComponent buildConcreteComponent() {
            return new SpringRabbitMQComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amqpAdmin": ((SpringRabbitMQComponent) component).setAmqpAdmin((org.springframework.amqp.core.AmqpAdmin) value); return true;
            case "connectionFactory": ((SpringRabbitMQComponent) component).setConnectionFactory((org.springframework.amqp.rabbit.connection.ConnectionFactory) value); return true;
            case "testConnectionOnStartup": ((SpringRabbitMQComponent) component).setTestConnectionOnStartup((boolean) value); return true;
            case "autoDeclare": ((SpringRabbitMQComponent) component).setAutoDeclare((boolean) value); return true;
            case "autoStartup": ((SpringRabbitMQComponent) component).setAutoStartup((boolean) value); return true;
            case "bridgeErrorHandler": ((SpringRabbitMQComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "deadLetterExchange": ((SpringRabbitMQComponent) component).setDeadLetterExchange((java.lang.String) value); return true;
            case "deadLetterExchangeType": ((SpringRabbitMQComponent) component).setDeadLetterExchangeType((java.lang.String) value); return true;
            case "deadLetterQueue": ((SpringRabbitMQComponent) component).setDeadLetterQueue((java.lang.String) value); return true;
            case "deadLetterRoutingKey": ((SpringRabbitMQComponent) component).setDeadLetterRoutingKey((java.lang.String) value); return true;
            case "maximumRetryAttempts": ((SpringRabbitMQComponent) component).setMaximumRetryAttempts((int) value); return true;
            case "rejectAndDontRequeue": ((SpringRabbitMQComponent) component).setRejectAndDontRequeue((boolean) value); return true;
            case "retryDelay": ((SpringRabbitMQComponent) component).setRetryDelay((int) value); return true;
            case "concurrentConsumers": ((SpringRabbitMQComponent) component).setConcurrentConsumers((int) value); return true;
            case "errorHandler": ((SpringRabbitMQComponent) component).setErrorHandler((org.springframework.util.ErrorHandler) value); return true;
            case "listenerContainerFactory": ((SpringRabbitMQComponent) component).setListenerContainerFactory((org.apache.camel.component.springrabbit.ListenerContainerFactory) value); return true;
            case "maxConcurrentConsumers": ((SpringRabbitMQComponent) component).setMaxConcurrentConsumers((java.lang.Integer) value); return true;
            case "messageListenerContainerType": ((SpringRabbitMQComponent) component).setMessageListenerContainerType((java.lang.String) value); return true;
            case "prefetchCount": ((SpringRabbitMQComponent) component).setPrefetchCount((int) value); return true;
            case "retry": ((SpringRabbitMQComponent) component).setRetry((org.springframework.retry.interceptor.RetryOperationsInterceptor) value); return true;
            case "shutdownTimeout": ((SpringRabbitMQComponent) component).setShutdownTimeout((long) value); return true;
            case "allowNullBody": ((SpringRabbitMQComponent) component).setAllowNullBody((boolean) value); return true;
            case "autoDeclareProducer": ((SpringRabbitMQComponent) component).setAutoDeclareProducer((boolean) value); return true;
            case "lazyStartProducer": ((SpringRabbitMQComponent) component).setLazyStartProducer((boolean) value); return true;
            case "replyTimeout": ((SpringRabbitMQComponent) component).setReplyTimeout((long) value); return true;
            case "args": ((SpringRabbitMQComponent) component).setArgs((java.util.Map) value); return true;
            case "autowiredEnabled": ((SpringRabbitMQComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "ignoreDeclarationExceptions": ((SpringRabbitMQComponent) component).setIgnoreDeclarationExceptions((boolean) value); return true;
            case "messageConverter": ((SpringRabbitMQComponent) component).setMessageConverter((org.springframework.amqp.support.converter.MessageConverter) value); return true;
            case "messagePropertiesConverter": ((SpringRabbitMQComponent) component).setMessagePropertiesConverter((org.apache.camel.component.springrabbit.MessagePropertiesConverter) value); return true;
            case "headerFilterStrategy": ((SpringRabbitMQComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            default: return false;
            }
        }
    }
}