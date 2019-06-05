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
import java.util.Properties;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * To send or receive emails using imap/pop3 or smtp protocols.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class MailEndpoint {


    public static class MailCommon extends EndpointConfiguration {
        /**
         * The mail server host name. The option is a java.lang.String type.
         */
        private String host;
        /**
         * The port number of the mail server. The option is a int type.
         */
        private Integer port;
        /**
         * Sets additional java mail properties, that will append/override any
         * default properties that is set based on all the other options. This
         * is useful if you need to add some special options but want to keep
         * the others as is. The option is a java.util.Properties type.
         */
        private Properties additionalJavaMailProperties;
        /**
         * Specifies the key to an IN message header that contains an
         * alternative email body. For example, if you send emails in text/html
         * format and want to provide an alternative mail body for non-HTML
         * email clients, set the alternative mail body with this key as a
         * header. The option is a java.lang.String type.
         */
        private String alternativeBodyHeader;
        /**
         * To use a custom AttachmentsContentTransferEncodingResolver to resolve
         * what content-type-encoding to use for attachments. The option is a
         * org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver type.
         */
        private Object attachmentsContentTransferEncodingResolver;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private Boolean basicPropertyBinding;
        /**
         * Sets the binding used to convert from a Camel message to and from a
         * Mail message. The option is a
         * org.apache.camel.component.mail.MailBinding type.
         */
        private Object binding;
        /**
         * The connection timeout in milliseconds. The option is a int type.
         */
        private Integer connectionTimeout;
        /**
         * The mail message content type. Use text/html for HTML mails. The
         * option is a java.lang.String type.
         */
        private String contentType;
        /**
         * Resolver to determine Content-Type for file attachments. The option
         * is a org.apache.camel.component.mail.ContentTypeResolver type.
         */
        private Object contentTypeResolver;
        /**
         * Enable debug mode on the underlying mail framework. The SUN Mail
         * framework logs the debug messages to System.out by default. The
         * option is a boolean type.
         */
        private Boolean debugMode;
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * headers. The option is a org.apache.camel.spi.HeaderFilterStrategy
         * type.
         */
        private HeaderFilterStrategy headerFilterStrategy;
        /**
         * Option to let Camel ignore unsupported charset in the local JVM when
         * sending mails. If the charset is unsupported then charset=XXX (where
         * XXX represents the unsupported charset) is removed from the
         * content-type and it relies on the platform default instead. The
         * option is a boolean type.
         */
        private Boolean ignoreUnsupportedCharset;
        /**
         * Option to let Camel ignore unsupported charset in the local JVM when
         * sending mails. If the charset is unsupported then charset=XXX (where
         * XXX represents the unsupported charset) is removed from the
         * content-type and it relies on the platform default instead. The
         * option is a boolean type.
         */
        private Boolean ignoreUriScheme;
        /**
         * Specifies the mail session that camel should use for all mail
         * interactions. Useful in scenarios where mail sessions are created and
         * managed by some other resource, such as a JavaEE container. If this
         * is not specified, Camel automatically creates the mail session for
         * you. The option is a javax.mail.Session type.
         */
        private Object session;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private Boolean synchronous;
        /**
         * Whether to use disposition inline or attachment. The option is a
         * boolean type.
         */
        private Boolean useInlineAttachments;
        /**
         * To use a dummy security setting for trusting all certificates. Should
         * only be used for development mode, and not production. The option is
         * a boolean type.
         */
        private Boolean dummyTrustManager;
        /**
         * The password for login. The option is a java.lang.String type.
         */
        private String password;
        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        private Object sslContextParameters;
        /**
         * The username for login. The option is a java.lang.String type.
         */
        private String username;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Properties getAdditionalJavaMailProperties() {
            return additionalJavaMailProperties;
        }

        public void setAdditionalJavaMailProperties(
                Properties additionalJavaMailProperties) {
            this.additionalJavaMailProperties = additionalJavaMailProperties;
        }

        public String getAlternativeBodyHeader() {
            return alternativeBodyHeader;
        }

        public void setAlternativeBodyHeader(String alternativeBodyHeader) {
            this.alternativeBodyHeader = alternativeBodyHeader;
        }

        public Object getAttachmentsContentTransferEncodingResolver() {
            return attachmentsContentTransferEncodingResolver;
        }

        public void setAttachmentsContentTransferEncodingResolver(
                Object attachmentsContentTransferEncodingResolver) {
            this.attachmentsContentTransferEncodingResolver = attachmentsContentTransferEncodingResolver;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Object getBinding() {
            return binding;
        }

        public void setBinding(Object binding) {
            this.binding = binding;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public Object getContentTypeResolver() {
            return contentTypeResolver;
        }

        public void setContentTypeResolver(Object contentTypeResolver) {
            this.contentTypeResolver = contentTypeResolver;
        }

        public Boolean getDebugMode() {
            return debugMode;
        }

        public void setDebugMode(Boolean debugMode) {
            this.debugMode = debugMode;
        }

        public HeaderFilterStrategy getHeaderFilterStrategy() {
            return headerFilterStrategy;
        }

        public void setHeaderFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            this.headerFilterStrategy = headerFilterStrategy;
        }

        public Boolean getIgnoreUnsupportedCharset() {
            return ignoreUnsupportedCharset;
        }

        public void setIgnoreUnsupportedCharset(Boolean ignoreUnsupportedCharset) {
            this.ignoreUnsupportedCharset = ignoreUnsupportedCharset;
        }

        public Boolean getIgnoreUriScheme() {
            return ignoreUriScheme;
        }

        public void setIgnoreUriScheme(Boolean ignoreUriScheme) {
            this.ignoreUriScheme = ignoreUriScheme;
        }

        public Object getSession() {
            return session;
        }

        public void setSession(Object session) {
            this.session = session;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public Boolean getUseInlineAttachments() {
            return useInlineAttachments;
        }

        public void setUseInlineAttachments(Boolean useInlineAttachments) {
            this.useInlineAttachments = useInlineAttachments;
        }

        public Boolean getDummyTrustManager() {
            return dummyTrustManager;
        }

        public void setDummyTrustManager(Boolean dummyTrustManager) {
            this.dummyTrustManager = dummyTrustManager;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(Object sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class MailConsumer extends MailCommon {
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
         * Whether the consumer should close the folder after polling. Setting
         * this option to false and having disconnect=false as well, then the
         * consumer keep the folder open between polls. The option is a boolean
         * type.
         */
        private Boolean closeFolder;
        /**
         * After processing a mail message, it can be copied to a mail folder
         * with the given name. You can override this configuration value, with
         * a header with the key copyTo, allowing you to copy messages to folder
         * names configured at runtime. The option is a java.lang.String type.
         */
        private String copyTo;
        /**
         * Deletes the messages after they have been processed. This is done by
         * setting the DELETED flag on the mail message. If false, the SEEN flag
         * is set instead. As of Camel 2.10 you can override this configuration
         * option by setting a header with the key delete to determine if the
         * mail should be deleted or not. The option is a boolean type.
         */
        private Boolean delete;
        /**
         * Whether the consumer should disconnect after polling. If enabled this
         * forces Camel to connect on each poll. The option is a boolean type.
         */
        private Boolean disconnect;
        /**
         * If the mail consumer cannot retrieve a given mail message, then this
         * option allows to handle the caused exception by the consumer's error
         * handler. By enable the bridge error handler on the consumer, then the
         * Camel routing error handler can handle the exception instead. The
         * default behavior would be the consumer throws an exception and no
         * mails from the batch would be able to be routed by Camel. The option
         * is a boolean type.
         */
        private Boolean handleFailedMessage;
        /**
         * Specifies the maximum number of messages to gather per poll. By
         * default, no maximum is set. Can be used to set a limit of e.g. 1000
         * to avoid downloading thousands of files when the server starts up.
         * Set a value of 0 or negative to disable this option. The option is a
         * int type.
         */
        private Integer maxMessagesPerPoll;
        /**
         * This option enables transparent MIME decoding and unfolding for mail
         * headers. The option is a boolean type.
         */
        private Boolean mimeDecodeHeaders;
        /**
         * Will mark the javax.mail.Message as peeked before processing the mail
         * message. This applies to IMAPMessage messages types only. By using
         * peek the mail will not be eager marked as SEEN on the mail server,
         * which allows us to rollback the mail message if there is an error
         * processing in Camel. The option is a boolean type.
         */
        private Boolean peek;
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        private Boolean sendEmptyMessageWhenIdle;
        /**
         * If the mail consumer cannot retrieve a given mail message, then this
         * option allows to skip the message and move on to retrieve the next
         * mail message. The default behavior would be the consumer throws an
         * exception and no mails from the batch would be able to be routed by
         * Camel. The option is a boolean type.
         */
        private Boolean skipFailedMessage;
        /**
         * Whether to limit by unseen mails only. The option is a boolean type.
         */
        private Boolean unseen;
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
         * Sets the maximum number of messages to consume during a poll. This
         * can be used to avoid overloading a mail server, if a mailbox folder
         * contains a lot of messages. Default value of -1 means no fetch size
         * and all messages will be consumed. Setting the value to 0 is a
         * special corner case, where Camel will not consume any messages at
         * all. The option is a int type.
         */
        private Integer fetchSize;
        /**
         * The folder to poll. The option is a java.lang.String type.
         */
        private String folderName;
        /**
         * A pluggable MailUidGenerator that allows to use custom logic to
         * generate UUID of the mail message. The option is a
         * org.apache.camel.component.mail.MailUidGenerator type.
         */
        private Object mailUidGenerator;
        /**
         * Specifies whether Camel should map the received mail message to Camel
         * body/headers. If set to true, the body of the mail message is mapped
         * to the body of the Camel IN message and the mail headers are mapped
         * to IN headers. If this option is set to false then the IN message
         * contains a raw javax.mail.Message. You can retrieve this raw message
         * by calling exchange.getIn().getBody(javax.mail.Message.class). The
         * option is a boolean type.
         */
        private Boolean mapMailMessage;
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        private PollingConsumerPollStrategy pollStrategy;
        /**
         * Refers to an MailBoxPostProcessAction for doing post processing tasks
         * on the mailbox once the normal processing ended. The option is a
         * org.apache.camel.component.mail.MailBoxPostProcessAction type.
         */
        private Object postProcessAction;
        /**
         * A pluggable repository org.apache.camel.spi.IdempotentRepository
         * which allows to cluster consuming from the same mailbox, and let the
         * repository coordinate whether a mail message is valid for the
         * consumer to process. By default no repository is in use. The option
         * is a org.apache.camel.spi.IdempotentRepository type.
         */
        private IdempotentRepository idempotentRepository;
        /**
         * When using idempotent repository, then when the mail message has been
         * successfully processed and is committed, should the message id be
         * removed from the idempotent repository (default) or be kept in the
         * repository. By default its assumed the message id is unique and has
         * no value to be kept in the repository, because the mail message will
         * be marked as seen/moved or deleted to prevent it from being consumed
         * again. And therefore having the message id stored in the idempotent
         * repository has little value. However this option allows to store the
         * message id, for whatever reason you may have. The option is a boolean
         * type.
         */
        private Boolean idempotentRepositoryRemoveOnCommit;
        /**
         * Refers to a javax.mail.search.SearchTerm which allows to filter mails
         * based on search criteria such as subject, body, from, sent after a
         * certain date etc. The option is a javax.mail.search.SearchTerm type.
         */
        private Object searchTerm;
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
         * Milliseconds before the next poll. The option is a long type.
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
        /**
         * Sorting order for messages. Only natively supported for IMAP.
         * Emulated to some degree when using POP3 or when IMAP server does not
         * have the SORT capability. The option is a java.lang.String type.
         */
        private Object[] sortTerm;

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public Boolean getCloseFolder() {
            return closeFolder;
        }

        public void setCloseFolder(Boolean closeFolder) {
            this.closeFolder = closeFolder;
        }

        public String getCopyTo() {
            return copyTo;
        }

        public void setCopyTo(String copyTo) {
            this.copyTo = copyTo;
        }

        public Boolean getDelete() {
            return delete;
        }

        public void setDelete(Boolean delete) {
            this.delete = delete;
        }

        public Boolean getDisconnect() {
            return disconnect;
        }

        public void setDisconnect(Boolean disconnect) {
            this.disconnect = disconnect;
        }

        public Boolean getHandleFailedMessage() {
            return handleFailedMessage;
        }

        public void setHandleFailedMessage(Boolean handleFailedMessage) {
            this.handleFailedMessage = handleFailedMessage;
        }

        public Integer getMaxMessagesPerPoll() {
            return maxMessagesPerPoll;
        }

        public void setMaxMessagesPerPoll(Integer maxMessagesPerPoll) {
            this.maxMessagesPerPoll = maxMessagesPerPoll;
        }

        public Boolean getMimeDecodeHeaders() {
            return mimeDecodeHeaders;
        }

        public void setMimeDecodeHeaders(Boolean mimeDecodeHeaders) {
            this.mimeDecodeHeaders = mimeDecodeHeaders;
        }

        public Boolean getPeek() {
            return peek;
        }

        public void setPeek(Boolean peek) {
            this.peek = peek;
        }

        public Boolean getSendEmptyMessageWhenIdle() {
            return sendEmptyMessageWhenIdle;
        }

        public void setSendEmptyMessageWhenIdle(Boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
        }

        public Boolean getSkipFailedMessage() {
            return skipFailedMessage;
        }

        public void setSkipFailedMessage(Boolean skipFailedMessage) {
            this.skipFailedMessage = skipFailedMessage;
        }

        public Boolean getUnseen() {
            return unseen;
        }

        public void setUnseen(Boolean unseen) {
            this.unseen = unseen;
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

        public Integer getFetchSize() {
            return fetchSize;
        }

        public void setFetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
        }

        public String getFolderName() {
            return folderName;
        }

        public void setFolderName(String folderName) {
            this.folderName = folderName;
        }

        public Object getMailUidGenerator() {
            return mailUidGenerator;
        }

        public void setMailUidGenerator(Object mailUidGenerator) {
            this.mailUidGenerator = mailUidGenerator;
        }

        public Boolean getMapMailMessage() {
            return mapMailMessage;
        }

        public void setMapMailMessage(Boolean mapMailMessage) {
            this.mapMailMessage = mapMailMessage;
        }

        public PollingConsumerPollStrategy getPollStrategy() {
            return pollStrategy;
        }

        public void setPollStrategy(PollingConsumerPollStrategy pollStrategy) {
            this.pollStrategy = pollStrategy;
        }

        public Object getPostProcessAction() {
            return postProcessAction;
        }

        public void setPostProcessAction(Object postProcessAction) {
            this.postProcessAction = postProcessAction;
        }

        public IdempotentRepository getIdempotentRepository() {
            return idempotentRepository;
        }

        public void setIdempotentRepository(
                IdempotentRepository idempotentRepository) {
            this.idempotentRepository = idempotentRepository;
        }

        public Boolean getIdempotentRepositoryRemoveOnCommit() {
            return idempotentRepositoryRemoveOnCommit;
        }

        public void setIdempotentRepositoryRemoveOnCommit(
                Boolean idempotentRepositoryRemoveOnCommit) {
            this.idempotentRepositoryRemoveOnCommit = idempotentRepositoryRemoveOnCommit;
        }

        public Object getSearchTerm() {
            return searchTerm;
        }

        public void setSearchTerm(Object searchTerm) {
            this.searchTerm = searchTerm;
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

        public Object[] getSortTerm() {
            return sortTerm;
        }

        public void setSortTerm(Object[] sortTerm) {
            this.sortTerm = sortTerm;
        }
    }

    public static class MailProducer extends MailCommon {
        /**
         * Sets the BCC email address. Separate multiple email addresses with
         * comma. The option is a java.lang.String type.
         */
        private String bcc;
        /**
         * Sets the CC email address. Separate multiple email addresses with
         * comma. The option is a java.lang.String type.
         */
        private String cc;
        /**
         * The from email address. The option is a java.lang.String type.
         */
        private String from;
        /**
         * The Reply-To recipients (the receivers of the response mail).
         * Separate multiple email addresses with a comma. The option is a
         * java.lang.String type.
         */
        private String replyTo;
        /**
         * The Subject of the message being sent. Note: Setting the subject in
         * the header takes precedence over this option. The option is a
         * java.lang.String type.
         */
        private String subject;
        /**
         * Sets the To email address. Separate multiple email addresses with
         * comma. The option is a java.lang.String type.
         */
        private String to;
        /**
         * To use a custom org.apache.camel.component.mail.JavaMailSender for
         * sending emails. The option is a
         * org.apache.camel.component.mail.JavaMailSender type.
         */
        private Object javaMailSender;

        public String getBcc() {
            return bcc;
        }

        public void setBcc(String bcc) {
            this.bcc = bcc;
        }

        public String getCc() {
            return cc;
        }

        public void setCc(String cc) {
            this.cc = cc;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getReplyTo() {
            return replyTo;
        }

        public void setReplyTo(String replyTo) {
            this.replyTo = replyTo;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public Object getJavaMailSender() {
            return javaMailSender;
        }

        public void setJavaMailSender(Object javaMailSender) {
            this.javaMailSender = javaMailSender;
        }
    }
}