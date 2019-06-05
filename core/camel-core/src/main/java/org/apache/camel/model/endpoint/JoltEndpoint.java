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
 * The jolt component allows you to process a JSON messages using an JOLT
 * specification (such as JSON-JSON transformation).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class JoltEndpoint {


    public static class JoltCommon extends EndpointConfiguration {
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
         * Specifies if the input is hydrated JSON or a JSON String. The option
         * is a org.apache.camel.component.jolt.JoltInputOutputType type.
         */
        private JoltInputOutputType inputType;
        /**
         * Specifies if the output should be hydrated JSON or a JSON String. The
         * option is a org.apache.camel.component.jolt.JoltInputOutputType type.
         */
        private JoltInputOutputType outputType;
        /**
         * Specifies the Transform DSL of the endpoint resource. If none is
         * specified Chainr will be used. The option is a
         * org.apache.camel.component.jolt.JoltTransformType type.
         */
        private JoltTransformType transformDsl;
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

        public JoltInputOutputType getInputType() {
            return inputType;
        }

        public void setInputType(JoltInputOutputType inputType) {
            this.inputType = inputType;
        }

        public JoltInputOutputType getOutputType() {
            return outputType;
        }

        public void setOutputType(JoltInputOutputType outputType) {
            this.outputType = outputType;
        }

        public JoltTransformType getTransformDsl() {
            return transformDsl;
        }

        public void setTransformDsl(JoltTransformType transformDsl) {
            this.transformDsl = transformDsl;
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

    public static class JoltConsumer extends JoltCommon {
    }

    public static class JoltProducer extends JoltCommon {
    }

    public static enum JoltInputOutputType {
        Hydrated, JsonString;
    }

    public static enum JoltTransformType {
        Chainr, Shiftr, Defaultr, Removr, Sortr;
    }
}