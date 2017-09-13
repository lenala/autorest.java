/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head.implementation;

import retrofit2.Retrofit;
import fixtures.head.HttpSuccess;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public class HttpSuccessImpl implements HttpSuccess {
    /** The Retrofit service to perform REST calls. */
    private HttpSuccessService service;
    /** The service client containing this operation class. */
    private AutoRestHeadTestServiceImpl client;

    /**
     * Initializes an instance of HttpSuccessImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HttpSuccessImpl(Retrofit retrofit, AutoRestHeadTestServiceImpl client) {
        this.service = retrofit.create(HttpSuccessService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpSuccess to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpSuccessService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.head.HttpSuccess head200" })
        @HEAD("http/success/200")
        Observable<Response<Void>> head200(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.head.HttpSuccess head204" })
        @HEAD("http/success/204")
        Observable<Response<Void>> head204(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.head.HttpSuccess head404" })
        @HEAD("http/success/404")
        Observable<Response<Void>> head404(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head200() {
        return head200WithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head200Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(head200WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> head200Async() {
        return head200WithServiceResponseAsync().map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> head200WithServiceResponseAsync() {
        return service.head200(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = head200Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> head200Delegate(Response<Void> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<Boolean, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head204() {
        return head204WithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head204Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(head204WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> head204Async() {
        return head204WithServiceResponseAsync().map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> head204WithServiceResponseAsync() {
        return service.head204(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = head204Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> head204Delegate(Response<Void> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<Boolean, CloudException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head404() {
        return head404WithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head404Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(head404WithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> head404Async() {
        return head404WithServiceResponseAsync().map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> head404WithServiceResponseAsync() {
        return service.head404(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = head404Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> head404Delegate(Response<Void> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<Boolean, CloudException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

}