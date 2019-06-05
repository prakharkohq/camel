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
 * Represents a nsq endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class NsqEndpoint {


    public static class NsqCommon extends EndpointConfiguration {
        /**
         * The hostnames of one or more nsqlookupd servers (consumer) or nsqd
         * servers (producer). The option is a java.lang.String type.
         */
        private String servers;
        /**
         * The name of topic we want to use. The option is a java.lang.String
         * type.
         */
        private String topic;
        /**
         * A String to identify the kind of client. The option is a
         * java.lang.String type.
         */
        private String userAgent;
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
         * Set secure option indicating TLS is required. The option is a boolean
         * type.
         */
        private Boolean secure;
        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        private Object sslContextParameters;

        public String getServers() {
            return servers;
        }

        public void setServers(String servers) {
            this.servers = servers;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getUserAgent() {
            return userAgent;
        }

        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent;
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

        public Boolean getSecure() {
            return secure;
        }

        public void setSecure(Boolean secure) {
            this.secure = secure;
        }

        public Object getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }
    }

    public static class NsqConsumer extends NsqCommon {
        /**
         * Automatically finish the NSQ message when it is retrieved from the
         * quese and before the Exchange is processed. The option is a
         * java.lang.Boolean type.
         */
        private Boolean autoFinish;
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
         * The name of channel we want to use. The option is a java.lang.String
         * type.
         */
        private String channel;
        /**
         * The lookup retry interval. The option is a long type.
         */
        private Long lookupInterval;
        /**
         * The port of the nsqdlookupd server. The option is a int type.
         */
        private Integer lookupServerPort;
        /**
         * The NSQ message timeout for a consumer. The option is a long type.
         */
        private Long messageTimeout;
        /**
         * Consumer pool size. The option is a int type.
         */
        private Integer poolSize;
        /**
         * The requeue interval. The option is a long type.
         */
        private Long requeueInterval;
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

        public Boolean getAutoFinish() {
            return autoFinish;
        }

        public void setAutoFinish(Boolean autoFinish) {
            this.autoFinish = autoFinish;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public Long getLookupInterval() {
            return lookupInterval;
        }

        public void setLookupInterval(Long lookupInterval) {
            this.lookupInterval = lookupInterval;
        }

        public Integer getLookupServerPort() {
            return lookupServerPort;
        }

        public void setLookupServerPort(Integer lookupServerPort) {
            this.lookupServerPort = lookupServerPort;
        }

        public Long getMessageTimeout() {
            return messageTimeout;
        }

        public void setMessageTimeout(Long messageTimeout) {
            this.messageTimeout = messageTimeout;
        }

        public Integer getPoolSize() {
            return poolSize;
        }

        public void setPoolSize(Integer poolSize) {
            this.poolSize = poolSize;
        }

        public Long getRequeueInterval() {
            return requeueInterval;
        }

        public void setRequeueInterval(Long requeueInterval) {
            this.requeueInterval = requeueInterval;
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

    public static class NsqProducer extends NsqCommon {
        /**
         * The port of the nsqd server. The option is a int type.
         */
        private Integer port;

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }
}