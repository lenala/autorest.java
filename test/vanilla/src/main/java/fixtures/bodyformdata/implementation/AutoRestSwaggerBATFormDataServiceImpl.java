/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodyformdata.AutoRestSwaggerBATFormDataService;
import fixtures.bodyformdata.Formdatas;

/**
 * Initializes a new instance of the AutoRestSwaggerBATFormDataService class.
 */
public class AutoRestSwaggerBATFormDataServiceImpl extends ServiceClient implements AutoRestSwaggerBATFormDataService {

    /**
     * The HTTP pipeline to send requests through.
     */
    private Formdatas formdatas;

    /**
     * Gets the Formdatas object to access its operations.
     *
     * @return the Formdatas object.
     */
    public Formdatas formdatas() {
        return this.formdatas;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFormDataService client.
     */
    public AutoRestSwaggerBATFormDataServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFormDataService client.
     *
     * @param httpPipeline the HTTP pipeline that requests will be sent through
     */
    public AutoRestSwaggerBATFormDataServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);

        this.formdatas = new FormdatasImpl(this);
    }
}
