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
import org.apache.camel.component.azure.cosmosdb.CosmosDbComponent;

/**
 * To read and write records to the CosmosDB database on Azure cloud platform.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureCosmosdbComponentBuilderFactory {

    /**
     * Azure CosmosDB (camel-azure-cosmosdb)
     * To read and write records to the CosmosDB database on Azure cloud
     * platform.
     * 
     * Category: cloud,database
     * Since: 3.10
     * Maven coordinates: org.apache.camel:camel-azure-cosmosdb
     * 
     * @return the dsl builder
     */
    static AzureCosmosdbComponentBuilder azureCosmosdb() {
        return new AzureCosmosdbComponentBuilderImpl();
    }

    /**
     * Builder for the Azure CosmosDB component.
     */
    interface AzureCosmosdbComponentBuilder extends ComponentBuilder<CosmosDbComponent> {
    
        
        /**
         * Sets the flag to enable client telemetry which will periodically
         * collect database operations aggregation statistics, system
         * information like cpu/memory and send it to cosmos monitoring service,
         * which will be helpful during debugging. DEFAULT value is false
         * indicating this is an opt-in feature, by default no telemetry
         * collection.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param clientTelemetryEnabled the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder clientTelemetryEnabled(boolean clientTelemetryEnabled) {
            doSetProperty("clientTelemetryEnabled", clientTelemetryEnabled);
            return this;
        }
    
        /**
         * The component configurations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder configuration(org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        
        /**
         * Enables connections sharing across multiple Cosmos Clients. The
         * default is false. When you have multiple instances of Cosmos Client
         * in the same JVM interacting with multiple Cosmos accounts, enabling
         * this allows connection sharing in Direct mode if possible between
         * instances of Cosmos Client. Please note, when setting this option,
         * the connection configuration (e.g., socket timeout config, idle
         * timeout config) of the first instantiated client will be used for all
         * other client instances.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param connectionSharingAcrossClientsEnabled the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder connectionSharingAcrossClientsEnabled(boolean connectionSharingAcrossClientsEnabled) {
            doSetProperty("connectionSharingAcrossClientsEnabled", connectionSharingAcrossClientsEnabled);
            return this;
        }
    
        
        /**
         * Sets the consistency levels supported for Azure Cosmos DB client
         * operations in the Azure Cosmos DB service. The requested
         * ConsistencyLevel must match or be weaker than that provisioned for
         * the database account. Consistency levels by order of strength are
         * STRONG, BOUNDED_STALENESS, SESSION and EVENTUAL. Refer to consistency
         * level documentation for additional details:
         * https://docs.microsoft.com/en-us/azure/cosmos-db/consistency-levels.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.ConsistencyLevel&lt;/code&gt; type.
         * 
         * Default: SESSION
         * Group: common
         * 
         * @param consistencyLevel the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder consistencyLevel(com.azure.cosmos.ConsistencyLevel consistencyLevel) {
            doSetProperty("consistencyLevel", consistencyLevel);
            return this;
        }
    
        /**
         * Sets the container partition key path.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param containerPartitionKeyPath the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder containerPartitionKeyPath(java.lang.String containerPartitionKeyPath) {
            doSetProperty("containerPartitionKeyPath", containerPartitionKeyPath);
            return this;
        }
    
        
        /**
         * Sets the boolean to only return the headers and status code in Cosmos
         * DB response in case of Create, Update and Delete operations on
         * CosmosItem. In Consumer, it is enabled by default because of the
         * ChangeFeed in the consumer that needs this flag to be enabled, and
         * thus it shouldn't be overridden. In Producer, it is advised to
         * disable it since it reduces the network overhead.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param contentResponseOnWriteEnabled the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder contentResponseOnWriteEnabled(boolean contentResponseOnWriteEnabled) {
            doSetProperty("contentResponseOnWriteEnabled", contentResponseOnWriteEnabled);
            return this;
        }
    
        /**
         * Inject an external CosmosAsyncClient into the component which
         * provides a client-side logical representation of the Azure Cosmos DB
         * service. This asynchronous client is used to configure and execute
         * requests against the service.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.CosmosAsyncClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cosmosAsyncClient the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder cosmosAsyncClient(com.azure.cosmos.CosmosAsyncClient cosmosAsyncClient) {
            doSetProperty("cosmosAsyncClient", cosmosAsyncClient);
            return this;
        }
    
        
        /**
         * Sets if the component should create the Cosmos container
         * automatically in case it doesn't exist in the Cosmos database.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createContainerIfNotExists the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder createContainerIfNotExists(boolean createContainerIfNotExists) {
            doSetProperty("createContainerIfNotExists", createContainerIfNotExists);
            return this;
        }
    
        
        /**
         * Sets if the component should create the Cosmos database automatically
         * in case it doesn't exist in the Cosmos account.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param createDatabaseIfNotExists the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder createDatabaseIfNotExists(boolean createDatabaseIfNotExists) {
            doSetProperty("createDatabaseIfNotExists", createDatabaseIfNotExists);
            return this;
        }
    
        /**
         * Sets the Azure Cosmos database endpoint the component will connect
         * to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param databaseEndpoint the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder databaseEndpoint(java.lang.String databaseEndpoint) {
            doSetProperty("databaseEndpoint", databaseEndpoint);
            return this;
        }
    
        
        /**
         * Sets the flag to enable writes on any regions for geo-replicated
         * database accounts in the Azure Cosmos DB service. When the value of
         * this property is true, the SDK will direct write operations to
         * available writable regions of geo-replicated database account.
         * Writable regions are ordered by PreferredRegions property. Setting
         * the property value to true has no effect until
         * EnableMultipleWriteRegions in DatabaseAccount is also set to true.
         * DEFAULT value is true indicating that writes are directed to
         * available writable regions of geo-replicated database account.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param multipleWriteRegionsEnabled the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder multipleWriteRegionsEnabled(boolean multipleWriteRegionsEnabled) {
            doSetProperty("multipleWriteRegionsEnabled", multipleWriteRegionsEnabled);
            return this;
        }
    
        /**
         * Sets the comma separated preferred regions for geo-replicated
         * database accounts. For example, East US as the preferred region. When
         * EnableEndpointDiscovery is true and PreferredRegions is non-empty,
         * the SDK will prefer to use the regions in the container in the order
         * they are specified to perform operations.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param preferredRegions the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder preferredRegions(java.lang.String preferredRegions) {
            doSetProperty("preferredRegions", preferredRegions);
            return this;
        }
    
        
        /**
         * Sets whether to allow for reads to go to multiple regions configured
         * on an account of Azure Cosmos DB service. DEFAULT value is true. If
         * this property is not set, the default is true for all Consistency
         * Levels other than Bounded Staleness, The default is false for Bounded
         * Staleness. 1. endpointDiscoveryEnabled is true 2. the Azure Cosmos DB
         * account has more than one region.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param readRequestsFallbackEnabled the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder readRequestsFallbackEnabled(boolean readRequestsFallbackEnabled) {
            doSetProperty("readRequestsFallbackEnabled", readRequestsFallbackEnabled);
            return this;
        }
    
        /**
         * Sets throughput of the resources in the Azure Cosmos DB service.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.models.ThroughputProperties&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param throughputProperties the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder throughputProperties(com.azure.cosmos.models.ThroughputProperties throughputProperties) {
            doSetProperty("throughputProperties", throughputProperties);
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
        default AzureCosmosdbComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        /**
         * Sets the ChangeFeedProcessorOptions to be used. Unless specifically
         * set the default values that will be used are: maximum items per page
         * or FeedResponse: 100 lease renew interval: 17 seconds lease acquire
         * interval: 13 seconds lease expiration interval: 60 seconds feed poll
         * delay: 5 seconds maximum scale count: unlimited.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.models.ChangeFeedProcessorOptions&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param changeFeedProcessorOptions the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder changeFeedProcessorOptions(com.azure.cosmos.models.ChangeFeedProcessorOptions changeFeedProcessorOptions) {
            doSetProperty("changeFeedProcessorOptions", changeFeedProcessorOptions);
            return this;
        }
    
        
        /**
         * Sets if the component should create Cosmos lease container for the
         * consumer automatically in case it doesn't exist in Cosmos database.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param createLeaseContainerIfNotExists the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder createLeaseContainerIfNotExists(boolean createLeaseContainerIfNotExists) {
            doSetProperty("createLeaseContainerIfNotExists", createLeaseContainerIfNotExists);
            return this;
        }
    
        
        /**
         * Sets if the component should create the Cosmos lease database for the
         * consumer automatically in case it doesn't exist in the Cosmos
         * account.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param createLeaseDatabaseIfNotExists the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder createLeaseDatabaseIfNotExists(boolean createLeaseDatabaseIfNotExists) {
            doSetProperty("createLeaseDatabaseIfNotExists", createLeaseDatabaseIfNotExists);
            return this;
        }
    
        /**
         * Sets the hostname. The host: a host is an application instance that
         * uses the change feed processor to listen for changes. Multiple
         * instances with the same lease configuration can run in parallel, but
         * each instance should have a different instance name. If not
         * specified, this will be a generated random hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param hostName the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder hostName(java.lang.String hostName) {
            doSetProperty("hostName", hostName);
            return this;
        }
    
        
        /**
         * Sets the lease container which acts as a state storage and
         * coordinates processing the change feed across multiple workers. The
         * lease container can be stored in the same account as the monitored
         * container or in a separate account. It will be auto-created if
         * createLeaseContainerIfNotExists is set to true.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: camel-lease
         * Group: consumer
         * 
         * @param leaseContainerName the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder leaseContainerName(java.lang.String leaseContainerName) {
            doSetProperty("leaseContainerName", leaseContainerName);
            return this;
        }
    
        /**
         * Sets the lease database where the leaseContainerName will be stored.
         * If it is not specified, this component will store the lease container
         * in the same database that is specified in databaseName. It will be
         * auto-created if createLeaseDatabaseIfNotExists is set to true.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param leaseDatabaseName the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder leaseDatabaseName(java.lang.String leaseDatabaseName) {
            doSetProperty("leaseDatabaseName", leaseDatabaseName);
            return this;
        }
    
        /**
         * Sets the itemId in case needed for operation on item like delete,
         * replace.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param itemId the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder itemId(java.lang.String itemId) {
            doSetProperty("itemId", itemId);
            return this;
        }
    
        /**
         * Sets partition key. Represents a partition key value in the Azure
         * Cosmos DB database service. A partition key identifies the partition
         * where the item is stored in.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param itemPartitionKey the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder itemPartitionKey(java.lang.String itemPartitionKey) {
            doSetProperty("itemPartitionKey", itemPartitionKey);
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
        default AzureCosmosdbComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * The CosmosDB operation that can be used with this component on the
         * producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.cosmosdb.CosmosDbOperationsDefinition&lt;/code&gt; type.
         * 
         * Default: listDatabases
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder operation(org.apache.camel.component.azure.cosmosdb.CosmosDbOperationsDefinition operation) {
            doSetProperty("operation", operation);
            return this;
        }
    
        /**
         * An SQL query to execute on a given resources. To learn more about
         * Cosmos SQL API, check this link {link
         * https://docs.microsoft.com/en-us/azure/cosmos-db/sql-query-getting-started}.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder query(java.lang.String query) {
            doSetProperty("query", query);
            return this;
        }
    
        /**
         * Set additional QueryRequestOptions that can be used with queryItems,
         * queryContainers, queryDatabases, listDatabases, listItems,
         * listContainers operations.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.models.CosmosQueryRequestOptions&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param queryRequestOptions the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder queryRequestOptions(com.azure.cosmos.models.CosmosQueryRequestOptions queryRequestOptions) {
            doSetProperty("queryRequestOptions", queryRequestOptions);
            return this;
        }
    
        /**
         * The CosmosDB Indexing Policy that will be set in case of container
         * creation, this option is related to createLeaseContainerIfNotExists
         * and it will be taken into account when the latter is true.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.models.IndexingPolicy&lt;/code&gt;
         * type.
         * 
         * Group:  advanced
         * 
         * @param indexingPolicy the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder indexingPolicy(com.azure.cosmos.models.IndexingPolicy indexingPolicy) {
            doSetProperty("indexingPolicy", indexingPolicy);
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
        default AzureCosmosdbComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * Sets either a master or readonly key used to perform authentication
         * for accessing resource.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accountKey the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder accountKey(java.lang.String accountKey) {
            doSetProperty("accountKey", accountKey);
            return this;
        }
    
        
        /**
         * Determines the credential strategy to adopt.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.cosmosdb.CredentialType&lt;/code&gt; type.
         * 
         * Default: SHARED_ACCOUNT_KEY
         * Group: security
         * 
         * @param credentialType the value to set
         * @return the dsl builder
         */
        default AzureCosmosdbComponentBuilder credentialType(org.apache.camel.component.azure.cosmosdb.CredentialType credentialType) {
            doSetProperty("credentialType", credentialType);
            return this;
        }
    }

    class AzureCosmosdbComponentBuilderImpl
            extends AbstractComponentBuilder<CosmosDbComponent>
            implements AzureCosmosdbComponentBuilder {
        @Override
        protected CosmosDbComponent buildConcreteComponent() {
            return new CosmosDbComponent();
        }
        private org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration getOrCreateConfiguration(CosmosDbComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "clientTelemetryEnabled": getOrCreateConfiguration((CosmosDbComponent) component).setClientTelemetryEnabled((boolean) value); return true;
            case "configuration": ((CosmosDbComponent) component).setConfiguration((org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration) value); return true;
            case "connectionSharingAcrossClientsEnabled": getOrCreateConfiguration((CosmosDbComponent) component).setConnectionSharingAcrossClientsEnabled((boolean) value); return true;
            case "consistencyLevel": getOrCreateConfiguration((CosmosDbComponent) component).setConsistencyLevel((com.azure.cosmos.ConsistencyLevel) value); return true;
            case "containerPartitionKeyPath": getOrCreateConfiguration((CosmosDbComponent) component).setContainerPartitionKeyPath((java.lang.String) value); return true;
            case "contentResponseOnWriteEnabled": getOrCreateConfiguration((CosmosDbComponent) component).setContentResponseOnWriteEnabled((boolean) value); return true;
            case "cosmosAsyncClient": getOrCreateConfiguration((CosmosDbComponent) component).setCosmosAsyncClient((com.azure.cosmos.CosmosAsyncClient) value); return true;
            case "createContainerIfNotExists": getOrCreateConfiguration((CosmosDbComponent) component).setCreateContainerIfNotExists((boolean) value); return true;
            case "createDatabaseIfNotExists": getOrCreateConfiguration((CosmosDbComponent) component).setCreateDatabaseIfNotExists((boolean) value); return true;
            case "databaseEndpoint": getOrCreateConfiguration((CosmosDbComponent) component).setDatabaseEndpoint((java.lang.String) value); return true;
            case "multipleWriteRegionsEnabled": getOrCreateConfiguration((CosmosDbComponent) component).setMultipleWriteRegionsEnabled((boolean) value); return true;
            case "preferredRegions": getOrCreateConfiguration((CosmosDbComponent) component).setPreferredRegions((java.lang.String) value); return true;
            case "readRequestsFallbackEnabled": getOrCreateConfiguration((CosmosDbComponent) component).setReadRequestsFallbackEnabled((boolean) value); return true;
            case "throughputProperties": getOrCreateConfiguration((CosmosDbComponent) component).setThroughputProperties((com.azure.cosmos.models.ThroughputProperties) value); return true;
            case "bridgeErrorHandler": ((CosmosDbComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "changeFeedProcessorOptions": getOrCreateConfiguration((CosmosDbComponent) component).setChangeFeedProcessorOptions((com.azure.cosmos.models.ChangeFeedProcessorOptions) value); return true;
            case "createLeaseContainerIfNotExists": getOrCreateConfiguration((CosmosDbComponent) component).setCreateLeaseContainerIfNotExists((boolean) value); return true;
            case "createLeaseDatabaseIfNotExists": getOrCreateConfiguration((CosmosDbComponent) component).setCreateLeaseDatabaseIfNotExists((boolean) value); return true;
            case "hostName": getOrCreateConfiguration((CosmosDbComponent) component).setHostName((java.lang.String) value); return true;
            case "leaseContainerName": getOrCreateConfiguration((CosmosDbComponent) component).setLeaseContainerName((java.lang.String) value); return true;
            case "leaseDatabaseName": getOrCreateConfiguration((CosmosDbComponent) component).setLeaseDatabaseName((java.lang.String) value); return true;
            case "itemId": getOrCreateConfiguration((CosmosDbComponent) component).setItemId((java.lang.String) value); return true;
            case "itemPartitionKey": getOrCreateConfiguration((CosmosDbComponent) component).setItemPartitionKey((java.lang.String) value); return true;
            case "lazyStartProducer": ((CosmosDbComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((CosmosDbComponent) component).setOperation((org.apache.camel.component.azure.cosmosdb.CosmosDbOperationsDefinition) value); return true;
            case "query": getOrCreateConfiguration((CosmosDbComponent) component).setQuery((java.lang.String) value); return true;
            case "queryRequestOptions": getOrCreateConfiguration((CosmosDbComponent) component).setQueryRequestOptions((com.azure.cosmos.models.CosmosQueryRequestOptions) value); return true;
            case "indexingPolicy": getOrCreateConfiguration((CosmosDbComponent) component).setIndexingPolicy((com.azure.cosmos.models.IndexingPolicy) value); return true;
            case "autowiredEnabled": ((CosmosDbComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "accountKey": getOrCreateConfiguration((CosmosDbComponent) component).setAccountKey((java.lang.String) value); return true;
            case "credentialType": getOrCreateConfiguration((CosmosDbComponent) component).setCredentialType((org.apache.camel.component.azure.cosmosdb.CredentialType) value); return true;
            default: return false;
            }
        }
    }
}