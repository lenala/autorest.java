/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodyduration.AutoRestDurationTestService;
import fixtures.bodyduration.Durations;

/**
 * Initializes a new instance of the AutoRestDurationTestService class.
 */
public class AutoRestDurationTestServiceImpl extends ServiceClient implements AutoRestDurationTestService {

    /**
     * The HTTP pipeline to send requests through.
     */
    private Durations durations;

    /**
     * Gets the Durations object to access its operations.
     *
     * @return the Durations object.
     */
    public Durations durations() {
        return this.durations;
    }

    /**
     * Initializes an instance of AutoRestDurationTestService client.
     */
    public AutoRestDurationTestServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestDurationTestService client.
     *
     * @param httpPipeline the HTTP pipeline that requests will be sent through
     */
    public AutoRestDurationTestServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);

        this.durations = new DurationsImpl(this);
    }
}
