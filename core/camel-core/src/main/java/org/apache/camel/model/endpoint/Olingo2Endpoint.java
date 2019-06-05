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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Communicates with OData 2.0 services using Apache Olingo.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class Olingo2Endpoint {


    public static class Olingo2Common extends EndpointConfiguration {
        /**
         * What kind of operation to perform. The option is a
         * org.apache.camel.component.olingo2.internal.Olingo2ApiName type.
         */
        private Olingo2ApiName apiName;
        /**
         * What sub operation to use for the selected operation. The option is a
         * java.lang.String type.
         */
        private String methodName;
        /**
         * HTTP connection creation timeout in milliseconds, defaults to 30,000
         * (30 seconds). The option is a int type.
         */
        private Integer connectTimeout;
        /**
         * Content-Type header value can be used to specify JSON or XML message
         * format, defaults to application/json;charset=utf-8. The option is a
         * java.lang.String type.
         */
        private String contentType;
        /**
         * Set this to true to filter out results that have already been
         * communicated by this component. The option is a boolean type.
         */
        private Boolean filterAlreadySeen;
        /**
         * Custom HTTP async client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely. The
         * option is a org.apache.http.impl.nio.client.HttpAsyncClientBuilder
         * type.
         */
        private Object httpAsyncClientBuilder;
        /**
         * Custom HTTP client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely. The
         * option is a org.apache.http.impl.client.HttpClientBuilder type.
         */
        private Object httpClientBuilder;
        /**
         * Custom HTTP headers to inject into every request, this could include
         * OAuth tokens, etc. The option is a
         * java.util.Map<java.lang.String,java.lang.String> type.
         */
        private Map<String, String> httpHeaders;
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a java.lang.String type.
         */
        private String inBody;
        /**
         * HTTP proxy server configuration. The option is a
         * org.apache.http.HttpHost type.
         */
        private Object proxy;
        /**
         * Target OData service base URI, e.g.
         * http://services.odata.org/OData/OData.svc. The option is a
         * java.lang.String type.
         */
        private String serviceUri;
        /**
         * HTTP request timeout in milliseconds, defaults to 30,000 (30
         * seconds). The option is a int type.
         */
        private Integer socketTimeout;
        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        private Object sslContextParameters;
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

        public Olingo2ApiName getApiName() {
            return apiName;
        }

        public void setApiName(Olingo2ApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public Integer getConnectTimeout() {
            return connectTimeout;
        }

        public void setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public Boolean getFilterAlreadySeen() {
            return filterAlreadySeen;
        }

        public void setFilterAlreadySeen(Boolean filterAlreadySeen) {
            this.filterAlreadySeen = filterAlreadySeen;
        }

        public Object getHttpAsyncClientBuilder() {
            return httpAsyncClientBuilder;
        }

        public void setHttpAsyncClientBuilder(Object httpAsyncClientBuilder) {
            this.httpAsyncClientBuilder = httpAsyncClientBuilder;
        }

        public Object getHttpClientBuilder() {
            return httpClientBuilder;
        }

        public void setHttpClientBuilder(Object httpClientBuilder) {
            this.httpClientBuilder = httpClientBuilder;
        }

        public Map<String, String> getHttpHeaders() {
            return httpHeaders;
        }

        public void setHttpHeaders(Map<String, String> httpHeaders) {
            this.httpHeaders = httpHeaders;
        }

        public String getInBody() {
            return inBody;
        }

        public void setInBody(String inBody) {
            this.inBody = inBody;
        }

        public Object getProxy() {
            return proxy;
        }

        public void setProxy(Object proxy) {
            this.proxy = proxy;
        }

        public String getServiceUri() {
            return serviceUri;
        }

        public void setServiceUri(String serviceUri) {
            this.serviceUri = serviceUri;
        }

        public Integer getSocketTimeout() {
            return socketTimeout;
        }

        public void setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
        }

        public Object getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
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
    }

    public static class Olingo2Consumer extends Olingo2Common {
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

    public static class Olingo2Producer extends Olingo2Common {
    }

    public static enum Olingo2ApiName {
        DEFAULT;
    }
}