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
 * For reading/writing from/to an HDFS filesystem using Hadoop 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class HdfsEndpoint {


    public static class HdfsCommon extends EndpointConfiguration {
        /**
         * HDFS host to use. The option is a java.lang.String type.
         */
        private String hostName;
        /**
         * HDFS port to use. The option is a int type.
         */
        private Integer port;
        /**
         * The directory path to use. The option is a java.lang.String type.
         */
        private String path;
        /**
         * Whether to connect to the HDFS file system on starting the
         * producer/consumer. If false then the connection is created on-demand.
         * Notice that HDFS may take up till 15 minutes to establish a
         * connection, as it has hardcoded 45 x 20 sec redelivery. By setting
         * this option to false allows your application to startup, and not
         * block for up till 15 minutes. The option is a boolean type.
         */
        private Boolean connectOnStartup;
        /**
         * Set to LOCAL to not use HDFS but local java.io.File instead. The
         * option is a org.apache.camel.component.hdfs2.HdfsFileSystemType type.
         */
        private HdfsFileSystemType fileSystemType;
        /**
         * The file type to use. For more details see Hadoop HDFS documentation
         * about the various files types. The option is a
         * org.apache.camel.component.hdfs2.HdfsFileType type.
         */
        private HdfsFileType fileType;
        /**
         * The type for the key in case of sequence or map files. The option is
         * a org.apache.camel.component.hdfs2.WritableType type.
         */
        private WritableType keyType;
        /**
         * The file owner must match this owner for the consumer to pickup the
         * file. Otherwise the file is skipped. The option is a java.lang.String
         * type.
         */
        private String owner;
        /**
         * The type for the key in case of sequence or map files. The option is
         * a org.apache.camel.component.hdfs2.WritableType type.
         */
        private WritableType valueType;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private Boolean basicPropertyBinding;
        /**
         * The size of the HDFS blocks. The option is a long type.
         */
        private Long blockSize;
        /**
         * The buffer size used by HDFS. The option is a int type.
         */
        private Integer bufferSize;
        /**
         * How often (time in millis) in to run the idle checker background
         * task. This option is only in use if the splitter strategy is IDLE.
         * The option is a int type.
         */
        private Integer checkIdleInterval;
        /**
         * When reading a normal file, this is split into chunks producing a
         * message per chunk. The option is a int type.
         */
        private Integer chunkSize;
        /**
         * The compression codec to use. The option is a
         * org.apache.camel.component.hdfs2.HdfsCompressionCodec type.
         */
        private HdfsCompressionCodec compressionCodec;
        /**
         * The compression type to use (is default not in use). The option is a
         * org.apache.hadoop.io.SequenceFile.CompressionType type.
         */
        private Object compressionType;
        /**
         * When a file is opened for reading/writing the file is renamed with
         * this suffix to avoid to read it during the writing phase. The option
         * is a java.lang.String type.
         */
        private String openedSuffix;
        /**
         * Once the file has been read is renamed with this suffix to avoid to
         * read it again. The option is a java.lang.String type.
         */
        private String readSuffix;
        /**
         * The HDFS replication factor. The option is a short type.
         */
        private Short replication;
        /**
         * In the current version of Hadoop opening a file in append mode is
         * disabled since it's not very reliable. So, for the moment, it's only
         * possible to create new files. The Camel HDFS endpoint tries to solve
         * this problem in this way: If the split strategy option has been
         * defined, the hdfs path will be used as a directory and files will be
         * created using the configured UuidGenerator. Every time a splitting
         * condition is met, a new file is created. The splitStrategy option is
         * defined as a string with the following syntax:
         * splitStrategy=ST:value,ST:value,... where ST can be: BYTES a new file
         * is created, and the old is closed when the number of written bytes is
         * more than value MESSAGES a new file is created, and the old is closed
         * when the number of written messages is more than value IDLE a new
         * file is created, and the old is closed when no writing happened in
         * the last value milliseconds. The option is a java.lang.String type.
         */
        private String splitStrategy;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private Boolean synchronous;

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Boolean getConnectOnStartup() {
            return connectOnStartup;
        }

        public void setConnectOnStartup(Boolean connectOnStartup) {
            this.connectOnStartup = connectOnStartup;
        }

        public HdfsFileSystemType getFileSystemType() {
            return fileSystemType;
        }

        public void setFileSystemType(HdfsFileSystemType fileSystemType) {
            this.fileSystemType = fileSystemType;
        }

        public HdfsFileType getFileType() {
            return fileType;
        }

        public void setFileType(HdfsFileType fileType) {
            this.fileType = fileType;
        }

        public WritableType getKeyType() {
            return keyType;
        }

        public void setKeyType(WritableType keyType) {
            this.keyType = keyType;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public WritableType getValueType() {
            return valueType;
        }

        public void setValueType(WritableType valueType) {
            this.valueType = valueType;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Long getBlockSize() {
            return blockSize;
        }

        public void setBlockSize(Long blockSize) {
            this.blockSize = blockSize;
        }

        public Integer getBufferSize() {
            return bufferSize;
        }

        public void setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
        }

        public Integer getCheckIdleInterval() {
            return checkIdleInterval;
        }

        public void setCheckIdleInterval(Integer checkIdleInterval) {
            this.checkIdleInterval = checkIdleInterval;
        }

        public Integer getChunkSize() {
            return chunkSize;
        }

        public void setChunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
        }

        public HdfsCompressionCodec getCompressionCodec() {
            return compressionCodec;
        }

        public void setCompressionCodec(HdfsCompressionCodec compressionCodec) {
            this.compressionCodec = compressionCodec;
        }

        public Object getCompressionType() {
            return compressionType;
        }

        public void setCompressionType(Object compressionType) {
            this.compressionType = compressionType;
        }

        public String getOpenedSuffix() {
            return openedSuffix;
        }

        public void setOpenedSuffix(String openedSuffix) {
            this.openedSuffix = openedSuffix;
        }

        public String getReadSuffix() {
            return readSuffix;
        }

        public void setReadSuffix(String readSuffix) {
            this.readSuffix = readSuffix;
        }

        public Short getReplication() {
            return replication;
        }

        public void setReplication(Short replication) {
            this.replication = replication;
        }

        public String getSplitStrategy() {
            return splitStrategy;
        }

        public void setSplitStrategy(String splitStrategy) {
            this.splitStrategy = splitStrategy;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }
    }

    public static class HdfsConsumer extends HdfsCommon {
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
         * The pattern used for scanning the directory. The option is a
         * java.lang.String type.
         */
        private String pattern;
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        private Boolean sendEmptyMessageWhenIdle;
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

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public Boolean getSendEmptyMessageWhenIdle() {
            return sendEmptyMessageWhenIdle;
        }

        public void setSendEmptyMessageWhenIdle(Boolean sendEmptyMessageWhenIdle) {
            this.sendEmptyMessageWhenIdle = sendEmptyMessageWhenIdle;
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

    public static class HdfsProducer extends HdfsCommon {
        /**
         * Append to existing file. Notice that not all HDFS file systems
         * support the append option. The option is a boolean type.
         */
        private Boolean append;
        /**
         * Whether to overwrite existing files with the same name. The option is
         * a boolean type.
         */
        private Boolean overwrite;

        public Boolean getAppend() {
            return append;
        }

        public void setAppend(Boolean append) {
            this.append = append;
        }

        public Boolean getOverwrite() {
            return overwrite;
        }

        public void setOverwrite(Boolean overwrite) {
            this.overwrite = overwrite;
        }
    }

    public static enum HdfsFileSystemType {
        LOCAL, HDFS;
    }

    public static enum HdfsFileType {
        NORMAL_FILE, SEQUENCE_FILE, MAP_FILE, BLOOMMAP_FILE, ARRAY_FILE;
    }

    public static enum WritableType {
        NULL, BOOLEAN, BYTE, INT, FLOAT, LONG, DOUBLE, TEXT, BYTES;
    }

    public static enum HdfsCompressionCodec {
        DEFAULT, GZIP, BZIP2;
    }
}