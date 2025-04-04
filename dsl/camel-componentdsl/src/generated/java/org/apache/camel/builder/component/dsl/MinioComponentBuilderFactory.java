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
import org.apache.camel.component.minio.MinioComponent;

/**
 * Store and retrieve objects from Minio Storage Service using Minio SDK.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MinioComponentBuilderFactory {

    /**
     * Minio (camel-minio)
     * Store and retrieve objects from Minio Storage Service using Minio SDK.
     * 
     * Category: cloud,file
     * Since: 3.5
     * Maven coordinates: org.apache.camel:camel-minio
     * 
     * @return the dsl builder
     */
    static MinioComponentBuilder minio() {
        return new MinioComponentBuilderImpl();
    }

    /**
     * Builder for the Minio component.
     */
    interface MinioComponentBuilder extends ComponentBuilder<MinioComponent> {
    
        
        /**
         * Setting the autocreation of the bucket if bucket name not exist.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoCreateBucket the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder autoCreateBucket(boolean autoCreateBucket) {
            doSetProperty("autoCreateBucket", autoCreateBucket);
            return this;
        }
    
        /**
         * The component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.minio.MinioConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder configuration(org.apache.camel.component.minio.MinioConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        /**
         * Endpoint can be an URL, domain name, IPv4 address or IPv6 address.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder endpoint(java.lang.String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
    
        /**
         * Reference to a Minio Client object in the registry.
         * 
         * The option is a: &lt;code&gt;io.minio.MinioClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param minioClient the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder minioClient(io.minio.MinioClient minioClient) {
            doSetProperty("minioClient", minioClient);
            return this;
        }
    
        
        /**
         * Set when creating new bucket.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param objectLock the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder objectLock(boolean objectLock) {
            doSetProperty("objectLock", objectLock);
            return this;
        }
    
        /**
         * The policy for this queue to set in the method.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param policy the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder policy(java.lang.String policy) {
            doSetProperty("policy", policy);
            return this;
        }
    
        /**
         * TCP/IP port number. 80 and 443 are used as defaults for HTTP and
         * HTTPS.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
    
        /**
         * The region in which Minio client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1). You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
    
        
        /**
         * Flag to indicate to use secure connection to minio service or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param secure the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
    
        
        /**
         * If this option is true and includeBody is true, then the
         * MinioObject.close() method will be called on exchange completion.
         * This option is strongly related to includeBody option. In case of
         * setting includeBody to true and autocloseBody to false, it will be up
         * to the caller to close the MinioObject stream. Setting autocloseBody
         * to true, will close the MinioObject stream automatically.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param autoCloseBody the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder autoCloseBody(boolean autoCloseBody) {
            doSetProperty("autoCloseBody", autoCloseBody);
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
        default MinioComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        
        /**
         * Set this flag if you want to bypassGovernanceMode when deleting a
         * particular object.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bypassGovernanceMode the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder bypassGovernanceMode(boolean bypassGovernanceMode) {
            doSetProperty("bypassGovernanceMode", bypassGovernanceMode);
            return this;
        }
    
        
        /**
         * Delete objects from Minio after they have been retrieved. The delete
         * is only performed if the Exchange is committed. If a rollback occurs,
         * the object is not deleted. If this option is false, then the same
         * objects will be retrieve over and over again on the polls. Therefore
         * you need to use the Idempotent Consumer EIP in the route to filter
         * out duplicates. You can filter using the MinioConstants#BUCKET_NAME
         * and MinioConstants#OBJECT_NAME headers, or only the
         * MinioConstants#OBJECT_NAME header.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param deleteAfterRead the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder deleteAfterRead(boolean deleteAfterRead) {
            doSetProperty("deleteAfterRead", deleteAfterRead);
            return this;
        }
    
        /**
         * The delimiter which is used in the ListObjectsRequest to only consume
         * objects we are interested in.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param delimiter the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder delimiter(java.lang.String delimiter) {
            doSetProperty("delimiter", delimiter);
            return this;
        }
    
        /**
         * Destination bucket name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param destinationBucketName the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder destinationBucketName(java.lang.String destinationBucketName) {
            doSetProperty("destinationBucketName", destinationBucketName);
            return this;
        }
    
        /**
         * Destination object name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param destinationObjectName the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder destinationObjectName(java.lang.String destinationObjectName) {
            doSetProperty("destinationObjectName", destinationObjectName);
            return this;
        }
    
        
        /**
         * If it is true, the exchange body will be set to a stream to the
         * contents of the file. If false, the headers will be set with the
         * Minio object metadata, but the body will be null. This option is
         * strongly related to autocloseBody option. In case of setting
         * includeBody to true and autocloseBody to false, it will be up to the
         * caller to close the MinioObject stream. Setting autocloseBody to
         * true, will close the MinioObject stream automatically.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param includeBody the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder includeBody(boolean includeBody) {
            doSetProperty("includeBody", includeBody);
            return this;
        }
    
        
        /**
         * The flag which is used in the ListObjectsRequest to set include
         * folders.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param includeFolders the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder includeFolders(boolean includeFolders) {
            doSetProperty("includeFolders", includeFolders);
            return this;
        }
    
        
        /**
         * The flag which is used in the ListObjectsRequest to get objects with
         * user meta data.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param includeUserMetadata the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder includeUserMetadata(boolean includeUserMetadata) {
            doSetProperty("includeUserMetadata", includeUserMetadata);
            return this;
        }
    
        
        /**
         * The flag which is used in the ListObjectsRequest to get objects with
         * versioning.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param includeVersions the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder includeVersions(boolean includeVersions) {
            doSetProperty("includeVersions", includeVersions);
            return this;
        }
    
        /**
         * Number of bytes of object data from offset.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param length the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder length(long length) {
            doSetProperty("length", length);
            return this;
        }
    
        /**
         * Set match ETag parameter for get object(s).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param matchETag the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder matchETag(java.lang.String matchETag) {
            doSetProperty("matchETag", matchETag);
            return this;
        }
    
        
        /**
         * Set the maxConnections parameter in the minio client configuration.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 60
         * Group: consumer
         * 
         * @param maxConnections the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder maxConnections(int maxConnections) {
            doSetProperty("maxConnections", maxConnections);
            return this;
        }
    
        
        /**
         * Gets the maximum number of messages as a limit to poll at each
         * polling. Gets the maximum number of messages as a limit to poll at
         * each polling. The default value is 10. Use 0 or a negative number to
         * set it as unlimited.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param maxMessagesPerPoll the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder maxMessagesPerPoll(int maxMessagesPerPoll) {
            doSetProperty("maxMessagesPerPoll", maxMessagesPerPoll);
            return this;
        }
    
        /**
         * Set modified since parameter for get object(s).
         * 
         * The option is a: &lt;code&gt;java.time.ZonedDateTime&lt;/code&gt;
         * type.
         * 
         * Group: consumer
         * 
         * @param modifiedSince the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder modifiedSince(java.time.ZonedDateTime modifiedSince) {
            doSetProperty("modifiedSince", modifiedSince);
            return this;
        }
    
        
        /**
         * Move objects from bucket to a different bucket after they have been
         * retrieved. To accomplish the operation the destinationBucket option
         * must be set. The copy bucket operation is only performed if the
         * Exchange is committed. If a rollback occurs, the object is not
         * moved.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param moveAfterRead the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder moveAfterRead(boolean moveAfterRead) {
            doSetProperty("moveAfterRead", moveAfterRead);
            return this;
        }
    
        /**
         * Set not match ETag parameter for get object(s).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param notMatchETag the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder notMatchETag(java.lang.String notMatchETag) {
            doSetProperty("notMatchETag", notMatchETag);
            return this;
        }
    
        /**
         * To get the object from the bucket with the given object name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param objectName the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder objectName(java.lang.String objectName) {
            doSetProperty("objectName", objectName);
            return this;
        }
    
        /**
         * Start byte position of object data.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param offset the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder offset(long offset) {
            doSetProperty("offset", offset);
            return this;
        }
    
        /**
         * Object name starts with prefix.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param prefix the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder prefix(java.lang.String prefix) {
            doSetProperty("prefix", prefix);
            return this;
        }
    
        
        /**
         * List recursively than directory structure emulation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
    
        /**
         * list objects in bucket after this object name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param startAfter the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder startAfter(java.lang.String startAfter) {
            doSetProperty("startAfter", startAfter);
            return this;
        }
    
        /**
         * Set un modified since parameter for get object(s).
         * 
         * The option is a: &lt;code&gt;java.time.ZonedDateTime&lt;/code&gt;
         * type.
         * 
         * Group: consumer
         * 
         * @param unModifiedSince the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder unModifiedSince(java.time.ZonedDateTime unModifiedSince) {
            doSetProperty("unModifiedSince", unModifiedSince);
            return this;
        }
    
        
        /**
         * when true, version 1 of REST API is used.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param useVersion1 the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder useVersion1(boolean useVersion1) {
            doSetProperty("useVersion1", useVersion1);
            return this;
        }
    
        /**
         * Set specific version_ID of a object when deleting the object.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param versionId the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder versionId(java.lang.String versionId) {
            doSetProperty("versionId", versionId);
            return this;
        }
    
        
        /**
         * Delete file object after the Minio file has been uploaded.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param deleteAfterWrite the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder deleteAfterWrite(boolean deleteAfterWrite) {
            doSetProperty("deleteAfterWrite", deleteAfterWrite);
            return this;
        }
    
        /**
         * Setting the key name for an element in the bucket through endpoint
         * parameter.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyName the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder keyName(java.lang.String keyName) {
            doSetProperty("keyName", keyName);
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
        default MinioComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        /**
         * The operation to do in case the user don't want to do only an
         * upload.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.minio.MinioOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder operation(org.apache.camel.component.minio.MinioOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
    
        
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
    
        /**
         * The storage class to set in the request.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param storageClass the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder storageClass(java.lang.String storageClass) {
            doSetProperty("storageClass", storageClass);
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
        default MinioComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * Set custom HTTP client for authenticated access.
         * 
         * The option is a: &lt;code&gt;okhttp3.OkHttpClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param customHttpClient the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder customHttpClient(okhttp3.OkHttpClient customHttpClient) {
            doSetProperty("customHttpClient", customHttpClient);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder healthCheckConsumerEnabled(boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder healthCheckProducerEnabled(boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    
        /**
         * Amazon AWS Secret Access Key or Minio Access Key. If not set camel
         * will connect to service for anonymous access.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
    
        /**
         * Amazon AWS Access Key Id or Minio Secret Key. If not set camel will
         * connect to service for anonymous access.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    
        /**
         * Server-side encryption.
         * 
         * The option is a:
         * &lt;code&gt;io.minio.ServerSideEncryption&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param serverSideEncryption the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder serverSideEncryption(io.minio.ServerSideEncryption serverSideEncryption) {
            doSetProperty("serverSideEncryption", serverSideEncryption);
            return this;
        }
    
        /**
         * Server-side encryption for source object while copy/move objects.
         * 
         * The option is a:
         * &lt;code&gt;io.minio.ServerSideEncryptionCustomerKey&lt;/code&gt;
         * type.
         * 
         * Group: security
         * 
         * @param serverSideEncryptionCustomerKey the value to set
         * @return the dsl builder
         */
        default MinioComponentBuilder serverSideEncryptionCustomerKey(io.minio.ServerSideEncryptionCustomerKey serverSideEncryptionCustomerKey) {
            doSetProperty("serverSideEncryptionCustomerKey", serverSideEncryptionCustomerKey);
            return this;
        }
    }

    class MinioComponentBuilderImpl
            extends AbstractComponentBuilder<MinioComponent>
            implements MinioComponentBuilder {
        @Override
        protected MinioComponent buildConcreteComponent() {
            return new MinioComponent();
        }
        private org.apache.camel.component.minio.MinioConfiguration getOrCreateConfiguration(MinioComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.minio.MinioConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoCreateBucket": getOrCreateConfiguration((MinioComponent) component).setAutoCreateBucket((boolean) value); return true;
            case "configuration": ((MinioComponent) component).setConfiguration((org.apache.camel.component.minio.MinioConfiguration) value); return true;
            case "endpoint": getOrCreateConfiguration((MinioComponent) component).setEndpoint((java.lang.String) value); return true;
            case "minioClient": getOrCreateConfiguration((MinioComponent) component).setMinioClient((io.minio.MinioClient) value); return true;
            case "objectLock": getOrCreateConfiguration((MinioComponent) component).setObjectLock((boolean) value); return true;
            case "policy": getOrCreateConfiguration((MinioComponent) component).setPolicy((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((MinioComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "region": getOrCreateConfiguration((MinioComponent) component).setRegion((java.lang.String) value); return true;
            case "secure": getOrCreateConfiguration((MinioComponent) component).setSecure((boolean) value); return true;
            case "autoCloseBody": getOrCreateConfiguration((MinioComponent) component).setAutoCloseBody((boolean) value); return true;
            case "bridgeErrorHandler": ((MinioComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "bypassGovernanceMode": getOrCreateConfiguration((MinioComponent) component).setBypassGovernanceMode((boolean) value); return true;
            case "deleteAfterRead": getOrCreateConfiguration((MinioComponent) component).setDeleteAfterRead((boolean) value); return true;
            case "delimiter": getOrCreateConfiguration((MinioComponent) component).setDelimiter((java.lang.String) value); return true;
            case "destinationBucketName": getOrCreateConfiguration((MinioComponent) component).setDestinationBucketName((java.lang.String) value); return true;
            case "destinationObjectName": getOrCreateConfiguration((MinioComponent) component).setDestinationObjectName((java.lang.String) value); return true;
            case "includeBody": getOrCreateConfiguration((MinioComponent) component).setIncludeBody((boolean) value); return true;
            case "includeFolders": getOrCreateConfiguration((MinioComponent) component).setIncludeFolders((boolean) value); return true;
            case "includeUserMetadata": getOrCreateConfiguration((MinioComponent) component).setIncludeUserMetadata((boolean) value); return true;
            case "includeVersions": getOrCreateConfiguration((MinioComponent) component).setIncludeVersions((boolean) value); return true;
            case "length": getOrCreateConfiguration((MinioComponent) component).setLength((long) value); return true;
            case "matchETag": getOrCreateConfiguration((MinioComponent) component).setMatchETag((java.lang.String) value); return true;
            case "maxConnections": getOrCreateConfiguration((MinioComponent) component).setMaxConnections((int) value); return true;
            case "maxMessagesPerPoll": getOrCreateConfiguration((MinioComponent) component).setMaxMessagesPerPoll((int) value); return true;
            case "modifiedSince": getOrCreateConfiguration((MinioComponent) component).setModifiedSince((java.time.ZonedDateTime) value); return true;
            case "moveAfterRead": getOrCreateConfiguration((MinioComponent) component).setMoveAfterRead((boolean) value); return true;
            case "notMatchETag": getOrCreateConfiguration((MinioComponent) component).setNotMatchETag((java.lang.String) value); return true;
            case "objectName": getOrCreateConfiguration((MinioComponent) component).setObjectName((java.lang.String) value); return true;
            case "offset": getOrCreateConfiguration((MinioComponent) component).setOffset((long) value); return true;
            case "prefix": getOrCreateConfiguration((MinioComponent) component).setPrefix((java.lang.String) value); return true;
            case "recursive": getOrCreateConfiguration((MinioComponent) component).setRecursive((boolean) value); return true;
            case "startAfter": getOrCreateConfiguration((MinioComponent) component).setStartAfter((java.lang.String) value); return true;
            case "unModifiedSince": getOrCreateConfiguration((MinioComponent) component).setUnModifiedSince((java.time.ZonedDateTime) value); return true;
            case "useVersion1": getOrCreateConfiguration((MinioComponent) component).setUseVersion1((boolean) value); return true;
            case "versionId": getOrCreateConfiguration((MinioComponent) component).setVersionId((java.lang.String) value); return true;
            case "deleteAfterWrite": getOrCreateConfiguration((MinioComponent) component).setDeleteAfterWrite((boolean) value); return true;
            case "keyName": getOrCreateConfiguration((MinioComponent) component).setKeyName((java.lang.String) value); return true;
            case "lazyStartProducer": ((MinioComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((MinioComponent) component).setOperation((org.apache.camel.component.minio.MinioOperations) value); return true;
            case "pojoRequest": getOrCreateConfiguration((MinioComponent) component).setPojoRequest((boolean) value); return true;
            case "storageClass": getOrCreateConfiguration((MinioComponent) component).setStorageClass((java.lang.String) value); return true;
            case "autowiredEnabled": ((MinioComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "customHttpClient": getOrCreateConfiguration((MinioComponent) component).setCustomHttpClient((okhttp3.OkHttpClient) value); return true;
            case "healthCheckConsumerEnabled": ((MinioComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((MinioComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((MinioComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((MinioComponent) component).setSecretKey((java.lang.String) value); return true;
            case "serverSideEncryption": getOrCreateConfiguration((MinioComponent) component).setServerSideEncryption((io.minio.ServerSideEncryption) value); return true;
            case "serverSideEncryptionCustomerKey": getOrCreateConfiguration((MinioComponent) component).setServerSideEncryptionCustomerKey((io.minio.ServerSideEncryptionCustomerKey) value); return true;
            default: return false;
            }
        }
    }
}