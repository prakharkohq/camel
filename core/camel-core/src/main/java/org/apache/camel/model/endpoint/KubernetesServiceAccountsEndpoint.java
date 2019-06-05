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
 * The Kubernetes Service Accounts component provides a producer to execute
 * service account operations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class KubernetesServiceAccountsEndpoint {


    public static class KubernetesServiceAccountsCommon
            extends
                EndpointConfiguration {
        /**
         * Kubernetes Master url. The option is a java.lang.String type.
         */
        private String masterUrl;
        /**
         * The Kubernetes API Version to use. The option is a java.lang.String
         * type.
         */
        private String apiVersion;
        /**
         * The dns domain, used for ServiceCall EIP. The option is a
         * java.lang.String type.
         */
        private String dnsDomain;
        /**
         * Default KubernetesClient to use if provided. The option is a
         * io.fabric8.kubernetes.client.KubernetesClient type.
         */
        private Object kubernetesClient;
        /**
         * The port name, used for ServiceCall EIP. The option is a
         * java.lang.String type.
         */
        private String portName;
        /**
         * The port protocol, used for ServiceCall EIP. The option is a
         * java.lang.String type.
         */
        private String portProtocol;
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        private Boolean basicPropertyBinding;
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server. The option is a java.lang.Integer type.
         */
        private Integer connectionTimeout;
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        private Boolean synchronous;
        /**
         * The CA Cert Data. The option is a java.lang.String type.
         */
        private String caCertData;
        /**
         * The CA Cert File. The option is a java.lang.String type.
         */
        private String caCertFile;
        /**
         * The Client Cert Data. The option is a java.lang.String type.
         */
        private String clientCertData;
        /**
         * The Client Cert File. The option is a java.lang.String type.
         */
        private String clientCertFile;
        /**
         * The Key Algorithm used by the client. The option is a
         * java.lang.String type.
         */
        private String clientKeyAlgo;
        /**
         * The Client Key data. The option is a java.lang.String type.
         */
        private String clientKeyData;
        /**
         * The Client Key file. The option is a java.lang.String type.
         */
        private String clientKeyFile;
        /**
         * The Client Key Passphrase. The option is a java.lang.String type.
         */
        private String clientKeyPassphrase;
        /**
         * The Auth Token. The option is a java.lang.String type.
         */
        private String oauthToken;
        /**
         * Password to connect to Kubernetes. The option is a java.lang.String
         * type.
         */
        private String password;
        /**
         * Define if the certs we used are trusted anyway or not. The option is
         * a java.lang.Boolean type.
         */
        private Boolean trustCerts;
        /**
         * Username to connect to Kubernetes. The option is a java.lang.String
         * type.
         */
        private String username;

        public String getMasterUrl() {
            return masterUrl;
        }

        public void setMasterUrl(String masterUrl) {
            this.masterUrl = masterUrl;
        }

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public String getDnsDomain() {
            return dnsDomain;
        }

        public void setDnsDomain(String dnsDomain) {
            this.dnsDomain = dnsDomain;
        }

        public Object getKubernetesClient() {
            return kubernetesClient;
        }

        public void setKubernetesClient(Object kubernetesClient) {
            this.kubernetesClient = kubernetesClient;
        }

        public String getPortName() {
            return portName;
        }

        public void setPortName(String portName) {
            this.portName = portName;
        }

        public String getPortProtocol() {
            return portProtocol;
        }

        public void setPortProtocol(String portProtocol) {
            this.portProtocol = portProtocol;
        }

        public Boolean getBasicPropertyBinding() {
            return basicPropertyBinding;
        }

        public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
            this.basicPropertyBinding = basicPropertyBinding;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public String getCaCertData() {
            return caCertData;
        }

        public void setCaCertData(String caCertData) {
            this.caCertData = caCertData;
        }

        public String getCaCertFile() {
            return caCertFile;
        }

        public void setCaCertFile(String caCertFile) {
            this.caCertFile = caCertFile;
        }

        public String getClientCertData() {
            return clientCertData;
        }

        public void setClientCertData(String clientCertData) {
            this.clientCertData = clientCertData;
        }

        public String getClientCertFile() {
            return clientCertFile;
        }

        public void setClientCertFile(String clientCertFile) {
            this.clientCertFile = clientCertFile;
        }

        public String getClientKeyAlgo() {
            return clientKeyAlgo;
        }

        public void setClientKeyAlgo(String clientKeyAlgo) {
            this.clientKeyAlgo = clientKeyAlgo;
        }

        public String getClientKeyData() {
            return clientKeyData;
        }

        public void setClientKeyData(String clientKeyData) {
            this.clientKeyData = clientKeyData;
        }

        public String getClientKeyFile() {
            return clientKeyFile;
        }

        public void setClientKeyFile(String clientKeyFile) {
            this.clientKeyFile = clientKeyFile;
        }

        public String getClientKeyPassphrase() {
            return clientKeyPassphrase;
        }

        public void setClientKeyPassphrase(String clientKeyPassphrase) {
            this.clientKeyPassphrase = clientKeyPassphrase;
        }

        public String getOauthToken() {
            return oauthToken;
        }

        public void setOauthToken(String oauthToken) {
            this.oauthToken = oauthToken;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getTrustCerts() {
            return trustCerts;
        }

        public void setTrustCerts(Boolean trustCerts) {
            this.trustCerts = trustCerts;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    public static class KubernetesServiceAccountsConsumer
            extends
                KubernetesServiceAccountsCommon {
    }

    public static class KubernetesServiceAccountsProducer
            extends
                KubernetesServiceAccountsCommon {
        /**
         * Producer operation to do on Kubernetes. The option is a
         * java.lang.String type.
         */
        private String operation;

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }
    }
}