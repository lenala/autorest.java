/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurereport.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurereport.AutoRestReportServiceForAzure;
import fixtures.azurereport.models.ErrorException;
import java.io.IOException;
import java.util.Map;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

/**
 * Initializes a new instance of the AutoRestReportServiceForAzureImpl class.
 */
public class AutoRestReportServiceForAzureImpl extends AzureServiceClient implements AutoRestReportServiceForAzure {
    /** The RestProxy service to perform REST calls. */
    private AutoRestReportServiceForAzureService service;


    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestReportServiceForAzureImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestReportServiceForAzureImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestReportServiceForAzureImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestReportServiceForAzureImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestReportServiceForAzureImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportServiceForAzure client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestReportServiceForAzureImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "AutoRestReportServiceForAzure", "1.0.0");
    }

    private void initializeService() {
        service = AzureProxy.create(AutoRestReportServiceForAzureService.class, restClient().baseURL(), httpClient(), serializerAdapter());
    }

    /**
     * The interface defining all the services for
     * AutoRestReportServiceForAzure to be used by RestProxy to perform REST
     * calls.
     */
    @Host("http://localhost")
    interface AutoRestReportServiceForAzureService {
        @Headers({ "x-ms-logging-context: fixtures.azurereport.AutoRestReportServiceForAzure getReport" })
        @GET("report/azure")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Map<String, Integer>>> getReport(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    public Map<String, Integer> getReport() {
        return getReportAsync().toBlocking().value();
    }

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Map<String, Integer>> getReportAsync(ServiceCallback<Map<String, Integer>> serviceCallback) {
        return ServiceFuture.fromBody(getReportAsync(), serviceCallback);
    }

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Map<String, Integer>> object
     */
    public Single<RestResponse<Void, Map<String, Integer>>> getReportWithRestResponseAsync() {
        return service.getReport(this.acceptLanguage(), this.userAgent());
    }

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Map<String, Integer>> object
     */
    public Single<Map<String, Integer>> getReportAsync() {
        return getReportWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Map<String, Integer>>, Map<String, Integer>>() { public Map<String, Integer> call(RestResponse<Void, Map<String, Integer>> restResponse) { return restResponse.body(); } });
        }


}
