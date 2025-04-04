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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform caching operations using Caffeine Cache with an attached
 * CacheLoader.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CaffeineLoadCacheEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Caffeine LoadCache component.
     */
    public interface CaffeineLoadCacheEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCaffeineLoadCacheEndpointBuilder advanced() {
            return (AdvancedCaffeineLoadCacheEndpointBuilder) this;
        }

        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param action the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder action(String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * Automatic create the Caffeine cache if none has been configured or
         * exists in the registry.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param createCacheIfNotExist the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder createCacheIfNotExist(boolean createCacheIfNotExist) {
            doSetProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Automatic create the Caffeine cache if none has been configured or
         * exists in the registry.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param createCacheIfNotExist the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder createCacheIfNotExist(String createCacheIfNotExist) {
            doSetProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option is a:
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * 
         * Default: SIZE_BASED
         * Group: producer
         * 
         * @param evictionType the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder evictionType(org.apache.camel.component.caffeine.EvictionType evictionType) {
            doSetProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * 
         * Default: SIZE_BASED
         * Group: producer
         * 
         * @param evictionType the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder evictionType(String evictionType) {
            doSetProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Specifies that each entry should be automatically removed from the
         * cache once a fixed duration has elapsed after the entry's creation,
         * the most recent replacement of its value, or its last read. Access
         * time is reset by all cache read and write operations. The unit is in
         * seconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         * 
         * @param expireAfterAccessTime the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterAccessTime(int expireAfterAccessTime) {
            doSetProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Specifies that each entry should be automatically removed from the
         * cache once a fixed duration has elapsed after the entry's creation,
         * the most recent replacement of its value, or its last read. Access
         * time is reset by all cache read and write operations. The unit is in
         * seconds.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         * 
         * @param expireAfterAccessTime the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterAccessTime(String expireAfterAccessTime) {
            doSetProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Specifies that each entry should be automatically removed from the
         * cache once a fixed duration has elapsed after the entry's creation,
         * or the most recent replacement of its value. The unit is in seconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         * 
         * @param expireAfterWriteTime the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterWriteTime(int expireAfterWriteTime) {
            doSetProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Specifies that each entry should be automatically removed from the
         * cache once a fixed duration has elapsed after the entry's creation,
         * or the most recent replacement of its value. The unit is in seconds.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         * 
         * @param expireAfterWriteTime the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder expireAfterWriteTime(String expireAfterWriteTime) {
            doSetProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Sets the minimum total size for the internal data structures.
         * Providing a large enough estimate at construction time avoids the
         * need for expensive resizing operations later, but setting this value
         * unnecessarily high wastes memory.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         * 
         * @param initialCapacity the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder initialCapacity(Integer initialCapacity) {
            doSetProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * Sets the minimum total size for the internal data structures.
         * Providing a large enough estimate at construction time avoids the
         * need for expensive resizing operations later, but setting this value
         * unnecessarily high wastes memory.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         * 
         * @param initialCapacity the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder initialCapacity(String initialCapacity) {
            doSetProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param key the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder key(String key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Specifies the maximum number of entries the cache may contain. Note
         * that the cache may evict an entry before this limit is exceeded or
         * temporarily exceed the threshold while evicting. As the cache size
         * grows close to the maximum, the cache evicts entries that are less
         * likely to be used again. For example, the cache may evict an entry
         * because it hasn't been used recently or very often. When size is
         * zero, elements will be evicted immediately after being loaded into
         * the cache. This can be useful in testing or to disable caching
         * temporarily without a code change. As eviction is scheduled on the
         * configured executor, tests may instead prefer to configure the cache
         * to execute tasks directly on the same thread.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         * 
         * @param maximumSize the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder maximumSize(Integer maximumSize) {
            doSetProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Specifies the maximum number of entries the cache may contain. Note
         * that the cache may evict an entry before this limit is exceeded or
         * temporarily exceed the threshold while evicting. As the cache size
         * grows close to the maximum, the cache evicts entries that are less
         * likely to be used again. For example, the cache may evict an entry
         * because it hasn't been used recently or very often. When size is
         * zero, elements will be evicted immediately after being loaded into
         * the cache. This can be useful in testing or to disable caching
         * temporarily without a code change. As eviction is scheduled on the
         * configured executor, tests may instead prefer to configure the cache
         * to execute tasks directly on the same thread.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         * 
         * @param maximumSize the value to set
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder maximumSize(String maximumSize) {
            doSetProperty("maximumSize", maximumSize);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Caffeine LoadCache component.
     */
    public interface AdvancedCaffeineLoadCacheEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CaffeineLoadCacheEndpointBuilder basic() {
            return (CaffeineLoadCacheEndpointBuilder) this;
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * 
         * Group: advanced
         * 
         * @param cacheLoader the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder cacheLoader(com.github.benmanes.caffeine.cache.CacheLoader cacheLoader) {
            doSetProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * 
         * Group: advanced
         * 
         * @param cacheLoader the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder cacheLoader(String cacheLoader) {
            doSetProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * 
         * Group: advanced
         * 
         * @param removalListener the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder removalListener(com.github.benmanes.caffeine.cache.RemovalListener removalListener) {
            doSetProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * 
         * Group: advanced
         * 
         * @param removalListener the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder removalListener(String removalListener) {
            doSetProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * 
         * Group: advanced
         * 
         * @param statsCounter the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder statsCounter(com.github.benmanes.caffeine.cache.stats.StatsCounter statsCounter) {
            doSetProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * 
         * Group: advanced
         * 
         * @param statsCounter the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder statsCounter(String statsCounter) {
            doSetProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param statsEnabled the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder statsEnabled(boolean statsEnabled) {
            doSetProperty("statsEnabled", statsEnabled);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param statsEnabled the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder statsEnabled(String statsEnabled) {
            doSetProperty("statsEnabled", statsEnabled);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         * 
         * @param valueType the value to set
         * @return the dsl builder
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder valueType(String valueType) {
            doSetProperty("valueType", valueType);
            return this;
        }
    }

    public interface CaffeineLoadCacheBuilders {
        /**
         * Caffeine LoadCache (camel-caffeine)
         * Perform caching operations using Caffeine Cache with an attached
         * CacheLoader.
         * 
         * Category: cache,clustering
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-caffeine
         * 
         * @return the dsl builder for the headers' name.
         */
        default CaffeineLoadCacheHeaderNameBuilder caffeineLoadcache() {
            return CaffeineLoadCacheHeaderNameBuilder.INSTANCE;
        }
        /**
         * Caffeine LoadCache (camel-caffeine)
         * Perform caching operations using Caffeine Cache with an attached
         * CacheLoader.
         * 
         * Category: cache,clustering
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-caffeine
         * 
         * Syntax: <code>caffeine-loadcache:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * the cache name
         * 
         * @param path cacheName
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder caffeineLoadcache(String path) {
            return CaffeineLoadCacheEndpointBuilderFactory.endpointBuilder("caffeine-loadcache", path);
        }
        /**
         * Caffeine LoadCache (camel-caffeine)
         * Perform caching operations using Caffeine Cache with an attached
         * CacheLoader.
         * 
         * Category: cache,clustering
         * Since: 2.20
         * Maven coordinates: org.apache.camel:camel-caffeine
         * 
         * Syntax: <code>caffeine-loadcache:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * the cache name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cacheName
         * @return the dsl builder
         */
        default CaffeineLoadCacheEndpointBuilder caffeineLoadcache(String componentName, String path) {
            return CaffeineLoadCacheEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Caffeine LoadCache component.
     */
    public static class CaffeineLoadCacheHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final CaffeineLoadCacheHeaderNameBuilder INSTANCE = new CaffeineLoadCacheHeaderNameBuilder();

        /**
         * The action to execute. Possible values: CLEANUP PUT PUT_ALL GET
         * GET_ALL INVALIDATE INVALIDATE_ALL AS_MAP.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CaffeineAction}.
         */
        public String caffeineAction() {
            return "CamelCaffeineAction";
        }
        /**
         * The flag indicating whether the action has a result or not.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CaffeineActionHasResult}.
         */
        public String caffeineActionHasResult() {
            return "CamelCaffeineActionHasResult";
        }
        /**
         * The flag indicating whether the action was successful or not.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CaffeineActionSucceeded}.
         */
        public String caffeineActionSucceeded() {
            return "CamelCaffeineActionSucceeded";
        }
        /**
         * The key for all actions on a single entry.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CaffeineKey}.
         */
        public String caffeineKey() {
            return "CamelCaffeineKey";
        }
        /**
         * The keys to get (GET_ALL), to invalidate (INVALIDATE_ALL) or existing
         * (AS_MAP) according to the action.
         * 
         * The option is a: {@code Set} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CaffeineKeys}.
         */
        public String caffeineKeys() {
            return "CamelCaffeineKeys";
        }
        /**
         * The value of key for all put actions (PUT or PUT_ALL).
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CaffeineValue}.
         */
        public String caffeineValue() {
            return "CamelCaffeineValue";
        }
        /**
         * The old value returned according to the action.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code CaffeineOldValue}.
         */
        public String caffeineOldValue() {
            return "CamelCaffeineOldValue";
        }
    }
    static CaffeineLoadCacheEndpointBuilder endpointBuilder(String componentName, String path) {
        class CaffeineLoadCacheEndpointBuilderImpl extends AbstractEndpointBuilder implements CaffeineLoadCacheEndpointBuilder, AdvancedCaffeineLoadCacheEndpointBuilder {
            public CaffeineLoadCacheEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new CaffeineLoadCacheEndpointBuilderImpl(path);
    }
}