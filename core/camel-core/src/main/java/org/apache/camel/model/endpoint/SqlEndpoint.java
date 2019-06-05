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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The sql component allows you to work with databases using JDBC SQL queries.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class SqlEndpoint {


    public static class SqlCommon extends EndpointConfiguration {
        /**
         * Sets the SQL query to perform. You can externalize the query by using
         * file: or classpath: as prefix and specify the location of the file.
         * The option is a java.lang.String type.
         */
        private String query;
        /**
         * Whether to allow using named parameters in the queries. The option is
         * a boolean type.
         */
        private Boolean allowNamedParameters;
        /**
         * Sets the DataSource to use to communicate with the database. The
         * option is a javax.sql.DataSource type.
         */
        private Object dataSource;
        /**
         * Sets the reference to a DataSource to lookup from the registry, to
         * use for communicating with the database. The option is a
         * java.lang.String type.
         */
        @Deprecated
        private String dataSourceRef;
        /**
         * Specify the full package and class name to use as conversion when
         * outputType=SelectOne. The option is a java.lang.String type.
         */
        private String outputClass;
        /**
         * Store the query result in a header instead of the message body. By
         * default, outputHeader == null and the query result is stored in the
         * message body, any existing content in the message body is discarded.
         * If outputHeader is set, the value is used as the name of the header
         * to store the query result and the original message body is preserved.
         * The option is a java.lang.String type.
         */
        private String outputHeader;
        /**
         * Make the output of consumer or producer to SelectList as List of Map,
         * or SelectOne as single Java object in the following way: a) If the
         * query has only single column, then that JDBC Column object is
         * returned. (such as SELECT COUNT( ) FROM PROJECT will return a Long
         * object. b) If the query has more than one column, then it will return
         * a Map of that result. c) If the outputClass is set, then it will
         * convert the query result into an Java bean object by calling all the
         * setters that match the column names. It will assume your class has a
         * default constructor to create instance with. d) If the query resulted
         * in more than one rows, it throws an non-unique result exception. The
         * option is a org.apache.camel.component.sql.SqlOutputType type.
         */
        private SqlOutputType outputType;
        /**
         * The separator to use when parameter values is taken from message body
         * (if the body is a String type), to be inserted at # placeholders.
         * Notice if you use named parameters, then a Map type is used instead.
         * The default value is comma. The option is a char type.
         */
        private Character separator;
        /**
         * If enabled then the populateStatement method from
         * org.apache.camel.component.sql.SqlPrepareStatementStrategy is always
         * invoked, also if there is no expected parameters to be prepared. When
         * this is false then the populateStatement is only invoked if there is
         * 1 or more expected parameters to be set; for example this avoids
         * reading the message body/headers for SQL queries with no parameters.
         * The option is a boolean type.
         */
        private Boolean alwaysPopulateStatement;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private Boolean basicPropertyBinding;
        /**
         * If set greater than zero, then Camel will use this count value of
         * parameters to replace instead of querying via JDBC metadata API. This
         * is useful if the JDBC vendor could not return correct parameters
         * count, then user may override instead. The option is a int type.
         */
        private Integer parametersCount;
        /**
         * Specifies a character that will be replaced to in SQL query. Notice,
         * that it is simple String.replaceAll() operation and no SQL parsing is
         * involved (quoted strings will also change). The option is a
         * java.lang.String type.
         */
        private String placeholder;
        /**
         * Allows to plugin to use a custom
         * org.apache.camel.component.sql.SqlPrepareStatementStrategy to control
         * preparation of the query and prepared statement. The option is a
         * org.apache.camel.component.sql.SqlPrepareStatementStrategy type.
         */
        private Object prepareStatementStrategy;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private Boolean synchronous;
        /**
         * Configures the Spring JdbcTemplate with the key/values from the Map.
         * The option is a java.util.Map<java.lang.String,java.lang.Object>
         * type.
         */
        private Map<String, Object> templateOptions;
        /**
         * Sets whether to use placeholder and replace all placeholder
         * characters with sign in the SQL queries. This option is default true.
         * The option is a boolean type.
         */
        private Boolean usePlaceholder;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public Boolean getAllowNamedParameters() {
            return allowNamedParameters;
        }

        public void setAllowNamedParameters(Boolean allowNamedParameters) {
            this.allowNamedParameters = allowNamedParameters;
        }

        public Object getDataSource() {
            return dataSource;
        }

        public void setDataSource(Object dataSource) {
            this.dataSource = dataSource;
        }

        @Deprecated
        public String getDataSourceRef() {
            return dataSourceRef;
        }

        @Deprecated
        public void setDataSourceRef(String dataSourceRef) {
            this.dataSourceRef = dataSourceRef;
        }

        public String getOutputClass() {
            return outputClass;
        }

        public void setOutputClass(String outputClass) {
            this.outputClass = outputClass;
        }

        public String getOutputHeader() {
            return outputHeader;
        }

        public void setOutputHeader(String outputHeader) {
            this.outputHeader = outputHeader;
        }

        public SqlOutputType getOutputType() {
            return outputType;
        }

        public void setOutputType(SqlOutputType outputType) {
            this.outputType = outputType;
        }

        public Character getSeparator() {
            return separator;
        }

        public void setSeparator(Character separator) {
            this.separator = separator;
        }

        public Boolean getAlwaysPopulateStatement() {
            return alwaysPopulateStatement;
        }

        public void setAlwaysPopulateStatement(Boolean alwaysPopulateStatement) {
            this.alwaysPopulateStatement = alwaysPopulateStatement;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Integer getParametersCount() {
            return parametersCount;
        }

        public void setParametersCount(Integer parametersCount) {
            this.parametersCount = parametersCount;
        }

        public String getPlaceholder() {
            return placeholder;
        }

        public void setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
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

        public Map<String, Object> getTemplateOptions() {
            return templateOptions;
        }

        public void setTemplateOptions(Map<String, Object> templateOptions) {
            this.templateOptions = templateOptions;
        }

        public Boolean getUsePlaceholder() {
            return usePlaceholder;
        }

        public void setUsePlaceholder(Boolean usePlaceholder) {
            this.usePlaceholder = usePlaceholder;
        }
    }

    public static class SqlConsumer extends SqlCommon {
        /**
         * Sets whether to break batch if onConsume failed. The option is a
         * boolean type.
         */
        private Boolean breakBatchOnConsumeFail;
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
         * Sets an expected update count to validate when using onConsume. The
         * option is a int type.
         */
        private Integer expectedUpdateCount;
        /**
         * Sets the maximum number of messages to poll. The option is a int
         * type.
         */
        private Integer maxMessagesPerPoll;
        /**
         * After processing each row then this query can be executed, if the
         * Exchange was processed successfully, for example to mark the row as
         * processed. The query can have parameter. The option is a
         * java.lang.String type.
         */
        private String onConsume;
        /**
         * After processing the entire batch, this query can be executed to bulk
         * update rows etc. The query cannot have parameters. The option is a
         * java.lang.String type.
         */
        private String onConsumeBatchComplete;
        /**
         * After processing each row then this query can be executed, if the
         * Exchange failed, for example to mark the row as failed. The query can
         * have parameter. The option is a java.lang.String type.
         */
        private String onConsumeFailed;
        /**
         * Sets whether empty resultset should be allowed to be sent to the next
         * hop. Defaults to false. So the empty resultset will be filtered out.
         * The option is a boolean type.
         */
        private Boolean routeEmptyResultSet;
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        private Boolean sendEmptyMessageWhenIdle;
        /**
         * Enables or disables transaction. If enabled then if processing an
         * exchange failed then the consumer break out processing any further
         * exchanges to cause a rollback eager. The option is a boolean type.
         */
        private Boolean transacted;
        /**
         * Sets how resultset should be delivered to route. Indicates delivery
         * as either a list or individual object. defaults to true. The option
         * is a boolean type.
         */
        private Boolean useIterator;
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
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        private PollingConsumerPollStrategy pollStrategy;
        /**
         * Allows to plugin to use a custom
         * org.apache.camel.component.sql.SqlProcessingStrategy to execute
         * queries when the consumer has processed the rows/batch. The option is
         * a org.apache.camel.component.sql.SqlProcessingStrategy type.
         */
        private Object processingStrategy;
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        private Integer backoffErrorThreshold;
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        private Integer backoffIdleThreshold;
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        private Integer backoffMultiplier;
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        private Long delay;
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        private Boolean greedy;
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        private Long initialDelay;
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        private LoggingLevel runLoggingLevel;
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        private ScheduledExecutorService scheduledExecutorService;
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        private ScheduledPollConsumerScheduler scheduler;
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> schedulerProperties;
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        private Boolean startScheduler;
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        private TimeUnit timeUnit;
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        private Boolean useFixedDelay;

        public Boolean getBreakBatchOnConsumeFail() {
            return breakBatchOnConsumeFail;
        }

        public void setBreakBatchOnConsumeFail(Boolean breakBatchOnConsumeFail) {
            this.breakBatchOnConsumeFail = breakBatchOnConsumeFail;
        }

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public Integer getExpectedUpdateCount() {
            return expectedUpdateCount;
        }

        public void setExpectedUpdateCount(Integer expectedUpdateCount) {
            this.expectedUpdateCount = expectedUpdateCount;
        }

        public Integer getMaxMessagesPerPoll() {
            return maxMessagesPerPoll;
        }

        public void setMaxMessagesPerPoll(Integer maxMessagesPerPoll) {
            this.maxMessagesPerPoll = maxMessagesPerPoll;
        }

        public String getOnConsume() {
            return onConsume;
        }

        public void setOnConsume(String onConsume) {
            this.onConsume = onConsume;
        }

        public String getOnConsumeBatchComplete() {
            return onConsumeBatchComplete;
        }

        public void setOnConsumeBatchComplete(String onConsumeBatchComplete) {
            this.onConsumeBatchComplete = onConsumeBatchComplete;
        }

        public String getOnConsumeFailed() {
            return onConsumeFailed;
        }

        public void setOnConsumeFailed(String onConsumeFailed) {
            this.onConsumeFailed = onConsumeFailed;
        }

        public Boolean getRouteEmptyResultSet() {
            return routeEmptyResultSet;
        }

        public void setRouteEmptyResultSet(Boolean routeEmptyResultSet) {
            this.routeEmptyResultSet = routeEmptyResultSet;
        }

        public Boolean getSendEmptyMessageWhenIdle() {
            return sendEmptyMessageWhenIdle;
        }

        public void setSendEmptyMessageWhenIdle(Boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        }

        public Boolean getTransacted() {
            return transacted;
        }

        public void setTransacted(Boolean transacted) {
            this.transacted = transacted;
        }

        public Boolean getUseIterator() {
            return useIterator;
        }

        public void setUseIterator(Boolean useIterator) {
            this.useIterator = useIterator;
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

        public PollingConsumerPollStrategy getPollStrategy() {
            return pollStrategy;
        }

        public void setPollStrategy(PollingConsumerPollStrategy pollStrategy) {
            this.pollStrategy = pollStrategy;
        }

        public Object getProcessingStrategy() {
            return processingStrategy;
        }

        public void setProcessingStrategy(Object processingStrategy) {
            this.processingStrategy = processingStrategy;
        }

        public Integer getBackoffErrorThreshold() {
            return backoffErrorThreshold;
        }

        public void setBackoffErrorThreshold(Integer backoffErrorThreshold) {
            this.backoffErrorThreshold = backoffErrorThreshold;
        }

        public Integer getBackoffIdleThreshold() {
            return backoffIdleThreshold;
        }

        public void setBackoffIdleThreshold(Integer backoffIdleThreshold) {
            this.backoffIdleThreshold = backoffIdleThreshold;
        }

        public Integer getBackoffMultiplier() {
            return backoffMultiplier;
        }

        public void setBackoffMultiplier(Integer backoffMultiplier) {
            this.backoffMultiplier = backoffMultiplier;
        }

        public Long getDelay() {
            return delay;
        }

        public void setDelay(Long delay) {
            this.delay = delay;
        }

        public Boolean getGreedy() {
            return greedy;
        }

        public void setGreedy(Boolean greedy) {
            this.greedy = greedy;
        }

        public Long getInitialDelay() {
            return initialDelay;
        }

        public void setInitialDelay(Long initialDelay) {
            this.initialDelay = initialDelay;
        }

        public LoggingLevel getRunLoggingLevel() {
            return runLoggingLevel;
        }

        public void setRunLoggingLevel(LoggingLevel runLoggingLevel) {
            this.runLoggingLevel = runLoggingLevel;
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            return scheduledExecutorService;
        }

        public void setScheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.scheduledExecutorService = scheduledExecutorService;
        }

        public ScheduledPollConsumerScheduler getScheduler() {
            return scheduler;
        }

        public void setScheduler(ScheduledPollConsumerScheduler scheduler) {
            this.scheduler = scheduler;
        }

        public Map<String, Object> getSchedulerProperties() {
            return schedulerProperties;
        }

        public void setSchedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.schedulerProperties = schedulerProperties;
        }

        public Boolean getStartScheduler() {
            return startScheduler;
        }

        public void setStartScheduler(Boolean startScheduler) {
            this.startScheduler = startScheduler;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }

        public void setTimeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
        }

        public Boolean getUseFixedDelay() {
            return useFixedDelay;
        }

        public void setUseFixedDelay(Boolean useFixedDelay) {
            this.useFixedDelay = useFixedDelay;
        }
    }

    public static class SqlProducer extends SqlCommon {
        /**
         * Enables or disables batch mode. The option is a boolean type.
         */
        private Boolean batch;
        /**
         * If set, will ignore the results of the SQL query and use the existing
         * IN message as the OUT message for the continuation of processing. The
         * option is a boolean type.
         */
        private Boolean noop;
        /**
         * Whether to use the message body as the SQL and then headers for
         * parameters. If this option is enabled then the SQL in the uri is not
         * used. The option is a boolean type.
         */
        private Boolean useMessageBodyForSql;

        public Boolean getBatch() {
            return batch;
        }

        public void setBatch(Boolean batch) {
            this.batch = batch;
        }

        public Boolean getNoop() {
            return noop;
        }

        public void setNoop(Boolean noop) {
            this.noop = noop;
        }

        public Boolean getUseMessageBodyForSql() {
            return useMessageBodyForSql;
        }

        public void setUseMessageBodyForSql(Boolean useMessageBodyForSql) {
            this.useMessageBodyForSql = useMessageBodyForSql;
        }
    }

    public static enum SqlOutputType {
        SelectOne, SelectList, StreamList;
    }
}