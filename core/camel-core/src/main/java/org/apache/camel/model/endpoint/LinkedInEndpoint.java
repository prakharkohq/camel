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
 * The linkedin component is used for retrieving LinkedIn user profiles,
 * connections, companies, groups, posts, etc.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class LinkedInEndpoint {


    public static class LinkedInCommon extends EndpointConfiguration {
        /**
         * What kind of operation to perform. The option is a
         * org.apache.camel.component.linkedin.internal.LinkedInApiName type.
         */
        private LinkedInApiName apiName;
        /**
         * What sub operation to use for the selected operation. The option is a
         * java.lang.String type.
         */
        private String methodName;
        /**
         * LinkedIn access token to avoid username and password login procedure.
         * LinkedIn responds to login forms by using a CAPTCHA. This makes it
         * impossible for a standalone, headless process to log in to LinkedIn
         * by specifying a username and password. To work around this, obtain a
         * LinkedIn access token and provide the token as the setting of the
         * accessToken parameter. Obtaining a LinkedIn access token is a
         * multi-step procedure. You must configure your LinkedIn application,
         * obtain a LinkedIn authorization code, and exchange that code for the
         * LinkedIn access token. For details, see:
         * https://developer.linkedin.com/docs/oauth2 The default behavior is
         * that the access token expires after 60 days. To change this, specify
         * a value for the expiryTime paramter. If the access token expires, the
         * LinkedIn component tries to log in to LinkedIn by providing a
         * username and password, which results in a CAPTCHA so the login fails.
         * The LinkedIn component cannot refresh the access token. You must
         * manually obtain a new access token each time an access token expires.
         * When you update the access token you must restart the application so
         * that it uses the new token. The option is a java.lang.String type.
         */
        private String accessToken;
        /**
         * LinkedIn application client ID. The option is a java.lang.String
         * type.
         */
        private String clientId;
        /**
         * LinkedIn application client secret. The option is a java.lang.String
         * type.
         */
        private String clientSecret;
        /**
         * A number of milliseconds since the UNIX Epoch. The default is 60
         * days. A LinkedIn access token expires when this amount of time
         * elapses after the token is in use. The option is a java.lang.Long
         * type.
         */
        private Long expiryTime;
        /**
         * Custom HTTP parameters, for example, proxy host and port. Use
         * constants from AllClientPNames. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        private Map<String, Object> httpParams;
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a java.lang.String type.
         */
        private String inBody;
        /**
         * Flag to enable/disable lazy OAuth, default is true. When enabled,
         * OAuth token retrieval or generation is not done until the first REST
         * call. The option is a boolean type.
         */
        private Boolean lazyAuth;
        /**
         * Application redirect URI, although the component never redirects to
         * this page to avoid having to have a functioning redirect server. For
         * testing, one could use https://localhost. The option is a
         * java.lang.String type.
         */
        private String redirectUri;
        /**
         * List of LinkedIn scopes as specified at
         * https://developer.linkedin.com/documents/authentication#granting. The
         * option is a org.apache.camel.component.linkedin.api.OAuthScope[]
         * type.
         */
        private Object[] scopes;
        /**
         * Callback interface for providing an OAuth token or to store the token
         * generated by the component. The callback should return null on the
         * first call and then save the created token in the saveToken()
         * callback. If the callback returns null the first time, a userPassword
         * MUST be provided. The option is a
         * org.apache.camel.component.linkedin.api.OAuthSecureStorage type.
         */
        private Object secureStorage;
        /**
         * LinkedIn user account name, MUST be provided. The option is a
         * java.lang.String type.
         */
        private String userName;
        /**
         * LinkedIn account password. The option is a java.lang.String type.
         */
        private String userPassword;
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

        public LinkedInApiName getApiName() {
            return apiName;
        }

        public void setApiName(LinkedInApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public Long getExpiryTime() {
            return expiryTime;
        }

        public void setExpiryTime(Long expiryTime) {
            this.expiryTime = expiryTime;
        }

        public Map<String, Object> getHttpParams() {
            return httpParams;
        }

        public void setHttpParams(Map<String, Object> httpParams) {
            this.httpParams = httpParams;
        }

        public String getInBody() {
            return inBody;
        }

        public void setInBody(String inBody) {
            this.inBody = inBody;
        }

        public Boolean getLazyAuth() {
            return lazyAuth;
        }

        public void setLazyAuth(Boolean lazyAuth) {
            this.lazyAuth = lazyAuth;
        }

        public String getRedirectUri() {
            return redirectUri;
        }

        public void setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
        }

        public Object[] getScopes() {
            return scopes;
        }

        public void setScopes(Object[] scopes) {
            this.scopes = scopes;
        }

        public Object getSecureStorage() {
            return secureStorage;
        }

        public void setSecureStorage(Object secureStorage) {
            this.secureStorage = secureStorage;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
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

    public static class LinkedInConsumer extends LinkedInCommon {
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

    public static class LinkedInProducer extends LinkedInCommon {
    }

    public static enum LinkedInApiName {
        comments, companies, groups, jobs, people, posts, search;
    }
}