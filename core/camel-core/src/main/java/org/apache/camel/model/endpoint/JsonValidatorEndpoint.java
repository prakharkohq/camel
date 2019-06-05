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

/**
 * Validates the payload of a message using NetworkNT JSON Schema library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class JsonValidatorEndpoint {


    public static class JsonValidatorCommon extends EndpointConfiguration {
        /**
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod. The option is a java.lang.String type.
         */
        private String resourceUri;
        /**
         * Sets whether to use resource content cache or not. The option is a
         * boolean type.
         */
        private Boolean contentCache;
        /**
         * Whether to fail if no body exists. The option is a boolean type.
         */
        private Boolean failOnNullBody;
        /**
         * Whether to fail if no header exists when validating against a header.
         * The option is a boolean type.
         */
        private Boolean failOnNullHeader;
        /**
         * To validate against a header instead of the message body. The option
         * is a java.lang.String type.
         */
        private String headerName;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private Boolean basicPropertyBinding;
        /**
         * To use a custom ValidatorErrorHandler. The default error handler
         * captures the errors and throws an exception. The option is a
         * org.apache.camel.component.jsonvalidator.JsonValidatorErrorHandler
         * type.
         */
        private Object errorHandler;
        /**
         * To use a custom schema loader allowing for adding custom format
         * validation. The default implementation will create a schema loader
         * with draft v4 support. The option is a
         * org.apache.camel.component.jsonvalidator.JsonSchemaLoader type.
         */
        private Object schemaLoader;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private Boolean synchronous;

        public String getResourceUri() {
            return resourceUri;
        }

        public void setResourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
        }

        public Boolean getContentCache() {
            return contentCache;
        }

        public void setContentCache(Boolean contentCache) {
            this.contentCache = contentCache;
        }

        public Boolean getFailOnNullBody() {
            return failOnNullBody;
        }

        public void setFailOnNullBody(Boolean failOnNullBody) {
            this.failOnNullBody = failOnNullBody;
        }

        public Boolean getFailOnNullHeader() {
            return failOnNullHeader;
        }

        public void setFailOnNullHeader(Boolean failOnNullHeader) {
            this.failOnNullHeader = failOnNullHeader;
        }

        public String getHeaderName() {
            return headerName;
        }

        public void setHeaderName(String headerName) {
            this.headerName = headerName;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Object getErrorHandler() {
            return errorHandler;
        }

        public void setErrorHandler(Object errorHandler) {
            this.errorHandler = errorHandler;
        }

        public Object getSchemaLoader() {
            return schemaLoader;
        }

        public void setSchemaLoader(Object schemaLoader) {
            this.schemaLoader = schemaLoader;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class JsonValidatorConsumer extends JsonValidatorCommon {
    }

    public static class JsonValidatorProducer extends JsonValidatorCommon {
    }
}