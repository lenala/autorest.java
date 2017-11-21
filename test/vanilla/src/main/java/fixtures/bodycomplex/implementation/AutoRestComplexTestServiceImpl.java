/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodycomplex.Arrays;
import fixtures.bodycomplex.AutoRestComplexTestService;
import fixtures.bodycomplex.Basics;
import fixtures.bodycomplex.Dictionarys;
import fixtures.bodycomplex.Inheritances;
import fixtures.bodycomplex.Polymorphicrecursives;
import fixtures.bodycomplex.Polymorphisms;
import fixtures.bodycomplex.Primitives;
import fixtures.bodycomplex.Readonlypropertys;

/**
 * Initializes a new instance of the AutoRestComplexTestService class.
 */
public class AutoRestComplexTestServiceImpl extends ServiceClient implements AutoRestComplexTestService {

    /**
     * API ID.
     */
    private String apiVersion;

    /**
     * Gets API ID.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets API ID.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself
     */
    public AutoRestComplexTestServiceImpl withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Basics basics;

    /**
     * Gets the Basics object to access its operations.
     *
     * @return the Basics object.
     */
    public Basics basics() {
        return this.basics;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Primitives primitives;

    /**
     * Gets the Primitives object to access its operations.
     *
     * @return the Primitives object.
     */
    public Primitives primitives() {
        return this.primitives;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Arrays arrays;

    /**
     * Gets the Arrays object to access its operations.
     *
     * @return the Arrays object.
     */
    public Arrays arrays() {
        return this.arrays;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Dictionarys dictionarys;

    /**
     * Gets the Dictionarys object to access its operations.
     *
     * @return the Dictionarys object.
     */
    public Dictionarys dictionarys() {
        return this.dictionarys;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Inheritances inheritances;

    /**
     * Gets the Inheritances object to access its operations.
     *
     * @return the Inheritances object.
     */
    public Inheritances inheritances() {
        return this.inheritances;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Polymorphisms polymorphisms;

    /**
     * Gets the Polymorphisms object to access its operations.
     *
     * @return the Polymorphisms object.
     */
    public Polymorphisms polymorphisms() {
        return this.polymorphisms;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Polymorphicrecursives polymorphicrecursives;

    /**
     * Gets the Polymorphicrecursives object to access its operations.
     *
     * @return the Polymorphicrecursives object.
     */
    public Polymorphicrecursives polymorphicrecursives() {
        return this.polymorphicrecursives;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private Readonlypropertys readonlypropertys;

    /**
     * Gets the Readonlypropertys object to access its operations.
     *
     * @return the Readonlypropertys object.
     */
    public Readonlypropertys readonlypropertys() {
        return this.readonlypropertys;
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     */
    public AutoRestComplexTestServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     *
     * @param httpPipeline the HTTP pipeline that requests will be sent through
     */
    public AutoRestComplexTestServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);

        this.apiVersion = "2014-04-01-preview";
        this.basics = new BasicsImpl(this);
        this.primitives = new PrimitivesImpl(this);
        this.arrays = new ArraysImpl(this);
        this.dictionarys = new DictionarysImpl(this);
        this.inheritances = new InheritancesImpl(this);
        this.polymorphisms = new PolymorphismsImpl(this);
        this.polymorphicrecursives = new PolymorphicrecursivesImpl(this);
        this.readonlypropertys = new ReadonlypropertysImpl(this);
    }
}
