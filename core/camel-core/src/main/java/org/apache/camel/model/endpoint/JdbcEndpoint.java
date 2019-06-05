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

/**
 * The jdbc component enables you to access databases through JDBC, where SQL
 * queries are sent in the message body.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class JdbcEndpoint {


    public static class JdbcCommon extends EndpointConfiguration {
        /**
         * Name of DataSource to lookup in the Registry. If the name is
         * dataSource or default, then Camel will attempt to lookup a default
         * DataSource from the registry, meaning if there is a only one instance
         * of DataSource found, then this DataSource will be used. The option is
         * a java.lang.String type.
         */
        private String dataSourceName;
        /**
         * Whether to allow using named parameters in the queries. The option is
         * a boolean type.
         */
        private Boolean allowNamedParameters;
        /**
         * Specify the full package and class name to use as conversion when
         * outputType=SelectOne or SelectList. The option is a java.lang.String
         * type.
         */
        private String outputClass;
        /**
         * Determines the output the producer should use. The option is a
         * org.apache.camel.component.jdbc.JdbcOutputType type.
         */
        private JdbcOutputType outputType;
        /**
         * Optional parameters to the java.sql.Statement. For example to set
         * maxRows, fetchSize etc. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> parameters;
        /**
         * The default maximum number of rows that can be read by a polling
         * query. The default value is 0. The option is a int type.
         */
        private Integer readSize;
        /**
         * Camel will set the autoCommit on the JDBC connection to be false,
         * commit the change after executed the statement and reset the
         * autoCommit flag of the connection at the end, if the resetAutoCommit
         * is true. If the JDBC connection doesn't support to reset the
         * autoCommit flag, you can set the resetAutoCommit flag to be false,
         * and Camel will not try to reset the autoCommit flag. When used with
         * XA transactions you most likely need to set it to false so that the
         * transaction manager is in charge of committing this tx. The option is
         * a boolean type.
         */
        private Boolean resetAutoCommit;
        /**
         * Whether transactions are in use. The option is a boolean type.
         */
        private Boolean transacted;
        /**
         * To read BLOB columns as bytes instead of string data. This may be
         * needed for certain databases such as Oracle where you must read BLOB
         * columns as bytes. The option is a boolean type.
         */
        private Boolean useGetBytesForBlob;
        /**
         * Set this option to true to use the prepareStatementStrategy with
         * named parameters. This allows to define queries with named
         * placeholders, and use headers with the dynamic values for the query
         * placeholders. The option is a boolean type.
         */
        private Boolean useHeadersAsParameters;
        /**
         * Sets whether to use JDBC 4 or JDBC 3.0 or older semantic when
         * retrieving column name. JDBC 4.0 uses columnLabel to get the column
         * name where as JDBC 3.0 uses both columnName or columnLabel.
         * Unfortunately JDBC drivers behave differently so you can use this
         * option to work out issues around your JDBC driver if you get problem
         * using this component This option is default true. The option is a
         * boolean type.
         */
        private Boolean useJDBC4ColumnNameAndLabelSemantics;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private Boolean basicPropertyBinding;
        /**
         * To use a custom org.apache.camel.component.jdbc.BeanRowMapper when
         * using outputClass. The default implementation will lower case the row
         * names and skip underscores, and dashes. For example CUST_ID is mapped
         * as custId. The option is a
         * org.apache.camel.component.jdbc.BeanRowMapper type.
         */
        private Object beanRowMapper;
        /**
         * Allows to plugin to use a custom
         * org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy to
         * control preparation of the query and prepared statement. The option
         * is a org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy
         * type.
         */
        private Object prepareStatementStrategy;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private Boolean synchronous;

        public String getDataSourceName() {
            return dataSourceName;
        }

        public void setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
        }

        public Boolean getAllowNamedParameters() {
            return allowNamedParameters;
        }

        public void setAllowNamedParameters(Boolean allowNamedParameters) {
            this.allowNamedParameters = allowNamedParameters;
        }

        public String getOutputClass() {
            return outputClass;
        }

        public void setOutputClass(String outputClass) {
            this.outputClass = outputClass;
        }

        public JdbcOutputType getOutputType() {
            return outputType;
        }

        public void setOutputType(JdbcOutputType outputType) {
            this.outputType = outputType;
        }

        public Map<String, Object> getParameters() {
            return parameters;
        }

        public void setParameters(Map<String, Object> parameters) {
            this.parameters = parameters;
        }

        public Integer getReadSize() {
            return readSize;
        }

        public void setReadSize(Integer readSize) {
            this.readSize = readSize;
        }

        public Boolean getResetAutoCommit() {
            return resetAutoCommit;
        }

        public void setResetAutoCommit(Boolean resetAutoCommit) {
            this.resetAutoCommit = resetAutoCommit;
        }

        public Boolean getTransacted() {
            return transacted;
        }

        public void setTransacted(Boolean transacted) {
            this.transacted = transacted;
        }

        public Boolean getUseGetBytesForBlob() {
            return useGetBytesForBlob;
        }

        public void setUseGetBytesForBlob(Boolean useGetBytesForBlob) {
            this.useGetBytesForBlob = useGetBytesForBlob;
        }

        public Boolean getUseHeadersAsParameters() {
            return useHeadersAsParameters;
        }

        public void setUseHeadersAsParameters(Boolean useHeadersAsParameters) {
            this.useHeadersAsParameters = useHeadersAsParameters;
        }

        public Boolean getUseJDBC4ColumnNameAndLabelSemantics() {
            return useJDBC4ColumnNameAndLabelSemantics;
        }

        public void setUseJDBC4ColumnNameAndLabelSemantics(
                Boolean useJDBC4ColumnNameAndLabelSemantics) {
            this.useJDBC4ColumnNameAndLabelSemantics = useJDBC4ColumnNameAndLabelSemantics;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Object getBeanRowMapper() {
            return beanRowMapper;
        }

        public void setBeanRowMapper(Object beanRowMapper) {
            this.beanRowMapper = beanRowMapper;
        }

        public Object getPrepareStatementStrategy() {
            return prepareStatementStrategy;
        }

        public void setPrepareStatementStrategy(Object prepareStatementStrategy) {
            this.prepareStatementStrategy = prepareStatementStrategy;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class JdbcConsumer extends JdbcCommon {
    }

    public static class JdbcProducer extends JdbcCommon {
    }

    public static enum JdbcOutputType {
        SelectOne, SelectList, StreamList;
    }
}