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
package org.apache.camel.model.endpoint;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The hazelcast-queue component is used to access Hazelcast distributed queue.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class HazelcastQueueEndpoint {


    public static class HazelcastQueueCommon extends EndpointConfiguration {
        /**
         * The name of the cache. The option is a java.lang.String type.
         */
        private String cacheName;
        /**
         * To specify a default operation to use, if no operation header has
         * been provided. The option is a
         * org.apache.camel.component.hazelcast.HazelcastOperation type.
         */
        private HazelcastOperation defaultOperation;
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. The option is a com.hazelcast.core.HazelcastInstance type.
         */
        private Object hazelcastInstance;
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance. The
         * option is a java.lang.String type.
         */
        private String hazelcastInstanceName;
        /**
         * Define if the endpoint will use a reliable Topic struct or not. The
         * option is a boolean type.
         */
        private Boolean reliable;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private Boolean basicPropertyBinding;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private Boolean synchronous;
        /**
         * To use concurrent consumers polling from the SEDA queue. The option
         * is a int type.
         */
        private Integer concurrentConsumers;
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred. The option is a int type.
         */
        private Integer onErrorDelay;
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown. The option is a int type.
         */
        private Integer pollTimeout;
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete. The option is
         * a boolean type.
         */
        private Boolean transacted;
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped. The
         * option is a boolean type.
         */
        private Boolean transferExchange;

        public String getCacheName() {
            return cacheName;
        }

        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        public HazelcastOperation getDefaultOperation() {
            return defaultOperation;
        }

        public void setDefaultOperation(HazelcastOperation defaultOperation) {
            this.defaultOperation = defaultOperation;
        }

        public Object getHazelcastInstance() {
            return hazelcastInstance;
        }

        public void setHazelcastInstance(Object hazelcastInstance) {
            this.hazelcastInstance = hazelcastInstance;
        }

        public String getHazelcastInstanceName() {
            return hazelcastInstanceName;
        }

        public void setHazelcastInstanceName(String hazelcastInstanceName) {
            this.hazelcastInstanceName = hazelcastInstanceName;
        }

        public Boolean getReliable() {
            return reliable;
        }

        public void setReliable(Boolean reliable) {
            this.reliable = reliable;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Integer getConcurrentConsumers() {
            return concurrentConsumers;
        }

        public void setConcurrentConsumers(Integer concurrentConsumers) {
            this.concurrentConsumers = concurrentConsumers;
        }

        public Integer getOnErrorDelay() {
            return onErrorDelay;
        }

        public void setOnErrorDelay(Integer onErrorDelay) {
            this.onErrorDelay = onErrorDelay;
        }

        public Integer getPollTimeout() {
            return pollTimeout;
        }

        public void setPollTimeout(Integer pollTimeout) {
            this.pollTimeout = pollTimeout;
        }

        public Boolean getTransacted() {
            return transacted;
        }

        public void setTransacted(Boolean transacted) {
            this.transacted = transacted;
        }

        public Boolean getTransferExchange() {
            return transferExchange;
        }

        public void setTransferExchange(Boolean transferExchange) {
            this.transferExchange = transferExchange;
        }
    }

    public static class HazelcastQueueConsumer extends HazelcastQueueCommon {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        private Boolean bridgeErrorHandler;
        /**
         * Define the polling timeout of the Queue consumer in Poll mode. The
         * option is a long type.
         */
        private Long pollingTimeout;
        /**
         * Define the Pool size for Queue Consumer Executor. The option is a int
         * type.
         */
        private Integer poolSize;
        /**
         * Define the Queue Consumer mode: Listen or Poll. The option is a
         * org.apache.camel.component.hazelcast.queue.HazelcastQueueConsumerMode
         * type.
         */
        private HazelcastQueueConsumerMode queueConsumerMode;
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        private ExceptionHandler exceptionHandler;
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        private ExchangePattern exchangePattern;

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public Long getPollingTimeout() {
            return pollingTimeout;
        }

        public void setPollingTimeout(Long pollingTimeout) {
            this.pollingTimeout = pollingTimeout;
        }

        public Integer getPoolSize() {
            return poolSize;
        }

        public void setPoolSize(Integer poolSize) {
            this.poolSize = poolSize;
        }

        public HazelcastQueueConsumerMode getQueueConsumerMode() {
            return queueConsumerMode;
        }

        public void setQueueConsumerMode(
                HazelcastQueueConsumerMode queueConsumerMode) {
            this.queueConsumerMode = queueConsumerMode;
        }

        public ExceptionHandler getExceptionHandler() {
            return exceptionHandler;
        }

        public void setExceptionHandler(ExceptionHandler exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
        }

        public ExchangePattern getExchangePattern() {
            return exchangePattern;
        }

        public void setExchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
        }
    }

    public static class HazelcastQueueProducer extends HazelcastQueueCommon {
    }

    public static enum HazelcastOperation {
        PUT, DELETE, GET, UPDATE, QUERY, GET_ALL, CLEAR, PUT_IF_ABSENT, ADD_ALL, REMOVE_ALL, RETAIN_ALL, EVICT, EVICT_ALL, VALUE_COUNT, CONTAINS_KEY, CONTAINS_VALUE, GET_KEYS, REMOVE_VALUE, INCREMENT, DECREMENT, SET_VALUE, DESTROY, COMPARE_AND_SET, GET_AND_ADD, ADD, OFFER, PEEK, POLL, REMAINING_CAPACITY, DRAIN_TO, REMOVE_IF, TAKE, PUBLISH, READ_ONCE_HEAD, READ_ONCE_TAIL, CAPACITY;
    }

    public static enum HazelcastQueueConsumerMode {
        LISTEN, POLL;
    }
}