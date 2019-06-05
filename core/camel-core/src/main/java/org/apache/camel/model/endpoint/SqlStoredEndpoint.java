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
 * The sql component allows you to work with databases using JDBC Stored
 * Procedure queries.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class SqlStoredEndpoint {


    public static class SqlStoredCommon extends EndpointConfiguration {
        /**
         * Sets the StoredProcedure template to perform. The option is a
         * java.lang.String type.
         */
        private String template;
        /**
         * Enables or disables batch mode. The option is a boolean type.
         */
        private Boolean batch;
        /**
         * Sets the DataSource to use to communicate with the database. The
         * option is a javax.sql.DataSource type.
         */
        private Object dataSource;
        /**
         * Whether this call is for a function. The option is a boolean type.
         */
        private Boolean function;
        /**
         * If set, will ignore the results of the template and use the existing
         * IN message as the OUT message for the continuation of processing. The
         * option is a boolean type.
         */
        private Boolean noop;
        /**
         * Store the template result in a header instead of the message body. By
         * default, outputHeader == null and the template result is stored in
         * the message body, any existing content in the message body is
         * discarded. If outputHeader is set, the value is used as the name of
         * the header to store the template result and the original message body
         * is preserved. The option is a java.lang.String type.
         */
        private String outputHeader;
        /**
         * Whether to use the message body as the template and then headers for
         * parameters. If this option is enabled then the template in the uri is
         * not used. The option is a boolean type.
         */
        private Boolean useMessageBodyForTemplate;
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

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public Boolean getBatch() {
            return batch;
        }

        public void setBatch(Boolean batch) {
            this.batch = batch;
        }

        public Object getDataSource() {
            return dataSource;
        }

        public void setDataSource(Object dataSource) {
            this.dataSource = dataSource;
        }

        public Boolean getFunction() {
            return function;
        }

        public void setFunction(Boolean function) {
            this.function = function;
        }

        public Boolean getNoop() {
            return noop;
        }

        public void setNoop(Boolean noop) {
            this.noop = noop;
        }

        public String getOutputHeader() {
            return outputHeader;
        }

        public void setOutputHeader(String outputHeader) {
            this.outputHeader = outputHeader;
        }

        public Boolean getUseMessageBodyForTemplate() {
            return useMessageBodyForTemplate;
        }

        public void setUseMessageBodyForTemplate(
                Boolean useMessageBodyForTemplate) {
            this.useMessageBodyForTemplate = useMessageBodyForTemplate;
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

    public static class SqlStoredConsumer extends SqlStoredCommon {
    }

    public static class SqlStoredProducer extends SqlStoredCommon {
    }
}