/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.fluent.gencode.parent_child_insame_opgroup.implementation;

import com.fluent.gencode.parent_child_insame_opgroup.ColorTypes;
import com.fluent.gencode.parent_child_insame_opgroup.CreationData;
import com.fluent.gencode.parent_child_insame_opgroup.Dog;
import com.fluent.gencode.parent_child_insame_opgroup.DogSku;
import com.fluent.gencode.parent_child_insame_opgroup.Pets;
import com.fluent.gencode.parent_child_insame_opgroup.Puppy;
import com.fluent.gencode.parent_child_insame_opgroup.PuppySku;
import com.fluent.gencode.parent_child_insame_opgroup.SkuNames;
import com.microsoft.azure.arm.core.TestBase;
import com.microsoft.rest.RestClient;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ParentChildInSameOpGroupTest extends TestBase {
    protected static Parent_Child_Insame_OpGroupManager petsManager;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        petsManager = Parent_Child_Insame_OpGroupManager
                .authenticate(restClient, defaultSubscription);
    }

    @Override
    protected void cleanUpResources() {
    }

    @Test
    public void ensureNoSpecializedCollectionTypes() {
        boolean cnfExceptionThrown = false;
        try {
            Class.forName("com.fluent.gencode.parent_child_insame_opgroup.Dogs");
        } catch (ClassNotFoundException e) {
            cnfExceptionThrown = true;
        }
        Assert.assertTrue("Dogs resource collection should not exists", cnfExceptionThrown);
        //
        cnfExceptionThrown = false;
        try {
            Class.forName("com.fluent.gencode.parent_child_insame_opgroup.Puppies");
        } catch (ClassNotFoundException e) {
            cnfExceptionThrown = true;
        }
        Assert.assertTrue("Puppies resource collection should not exists", cnfExceptionThrown);
    }

    @Test
    public void ensureGroupableResourceInheritance() {
        //
        HashSet<String> expectedExtends = new HashSet<>();
        expectedExtends.add("com.microsoft.azure.arm.model.HasInner");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.Resource");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.GroupableResourceCore");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.HasResourceGroup");
        expectedExtends.add("com.microsoft.azure.arm.model.Refreshable");
        expectedExtends.add("com.microsoft.azure.arm.model.Updatable");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.HasManager");
        //
        Class cls = Dog.class;
        Class[] eInterfaces = cls.getInterfaces();
        HashSet<String> currentExtends = new HashSet<>();
        for (Class eInterface : eInterfaces) {
            currentExtends.add(eInterface.getName());
        }
        //
        Assert.assertEquals(expectedExtends.size(), currentExtends.size());
        //
        for (String expectedExtend : expectedExtends) {
            if (!currentExtends.contains(expectedExtend)) {
                Assert.assertTrue("Expected interface '" + expectedExtend + "' is not implemented", false);
            }
        }

        for (String currentExtend : currentExtends) {
            if (!expectedExtends.contains(currentExtend)) {
                Assert.assertTrue("Groupable interface 'Dog' implements unexpected interface '" + currentExtend + "'", false);
            }
        }
    }

    @Test
    public void ensureNestedResourceInheritance() {
        //
        HashSet<String> expectedExtends = new HashSet<>();
        expectedExtends.add("com.microsoft.azure.arm.model.HasInner");
        expectedExtends.add("com.microsoft.azure.arm.model.Refreshable");
        expectedExtends.add("com.microsoft.azure.arm.model.Indexable");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.HasManager");
        expectedExtends.add("com.microsoft.azure.arm.model.Updatable");
        //
        Class cls = Puppy.class;
        Class[] eInterfaces = cls.getInterfaces();
        HashSet<String> currentExtends = new HashSet<>();
        for (Class eInterface : eInterfaces) {
            currentExtends.add(eInterface.getName());
        }
        //
        Assert.assertEquals(expectedExtends.size(), currentExtends.size());
        //
        for (String expectedExtend : expectedExtends) {
            if (!currentExtends.contains(expectedExtend)) {
                Assert.assertTrue("Expected interface '" + expectedExtend + "' is not implemented", false);
            }
        }
        //
        for (String currentExtend : currentExtends) {
            if (!expectedExtends.contains(currentExtend)) {
                Assert.assertTrue("Nested interface 'Puppy' implements unexpected interface '" + currentExtend + "'", false);
            }
        }
    }

    @Test
    public void ensureWrapperCollectionInheritance() {
        Class cls = Pets.class;
        Class[] eInterfaces = cls.getInterfaces();
        Assert.assertEquals("Wrapper collection should not extend any interface", 0, eInterfaces.length);
    }

    @Test
    public void ensureWrapperCollectionImplInheritance() {
        Class cls = PetsImpl.class;
        Class baseClass = cls.getSuperclass();
        Assert.assertEquals("com.microsoft.azure.arm.model.implementation.WrapperImpl", baseClass.getName());
        //
        Class[] eInterfaces = cls.getInterfaces();
        Assert.assertEquals("WrapperCollection should implement one interface", 1, eInterfaces.length);
        Class eInterface = eInterfaces[0];
        Assert.assertEquals("com.fluent.gencode.parent_child_insame_opgroup.Pets", eInterface.getName());
    }

    @Test
    public void ensureGeneralizedMethodsInWrapperCollection() {
        HashSet<String> methodSignatures = new HashSet<>();
        //
        methodSignatures.add("interface com.fluent.gencode.parent_child_insame_opgroup.Dog$DefinitionStages$Blank:defineDog");
        methodSignatures.add("interface com.fluent.gencode.parent_child_insame_opgroup.Puppy$DefinitionStages$Blank:definePuppy");
        //
        methodSignatures.add("rx.Observable<com.fluent.gencode.parent_child_insame_opgroup.Dog>:listAsync");
        methodSignatures.add("rx.Observable<com.fluent.gencode.parent_child_insame_opgroup.Dog>:getByResourceGroupAsync");
        methodSignatures.add("rx.Observable<com.fluent.gencode.parent_child_insame_opgroup.Dog>:listByResourceGroupAsync");
        methodSignatures.add("class rx.Completable:deleteDogAsync");
        methodSignatures.add("rx.Observable<com.fluent.gencode.parent_child_insame_opgroup.AccessUri>:grantAccessToDogAsync");
        methodSignatures.add("class rx.Completable:revokeAccessToDogAsync");

        methodSignatures.add("rx.Observable<com.fluent.gencode.parent_child_insame_opgroup.Puppy>:listPuppiesByDogAsync");
        methodSignatures.add("rx.Observable<com.fluent.gencode.parent_child_insame_opgroup.Puppy>:getPuppyAsync");
        methodSignatures.add("class rx.Completable:deletePuppyAsync");
        methodSignatures.add("rx.Observable<com.fluent.gencode.parent_child_insame_opgroup.AccessUri>:grantAccessToPuppyAsync");
        methodSignatures.add("class rx.Completable:revokeAccessToPuppyAsync");
        //
        Method[] declMethods = Pets.class.getMethods();
        for (String methodSignature : methodSignatures) {
            boolean found = false;
            for (Method method : declMethods) {
                String mSign = method.getGenericReturnType() + ":" + method.getName();
                if (methodSignature.equals(mSign)) {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("Standard Method '" + methodSignature + "' not found", found);
        }
    }

    @Test
    public void ensureWrapModelMethodsInWrapperCollectionImpl() {
        try {
            Class<?>[] parameters = new Class[]{String.class};
            PetsImpl.class.getDeclaredMethod("wrapPuppyModel", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized wrapModel 'wrapPuppyModel(String)' not found", false);
        }
        //
        try {
            Class<?>[] parameters = new Class[]{PuppyInner.class};
            PetsImpl.class.getDeclaredMethod("wrapPuppyModel", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized wrapModel 'wrapPuppyModel(PuppyInner)' not found", false);
        }
        //
        try {
            Class<?>[] parameters = new Class[]{String.class};
            PetsImpl.class.getDeclaredMethod("wrapDogModel", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized wrapModel 'wrapDogModel(String)' not found", false);
        }
        //
        try {
            Class<?>[] parameters = new Class[]{DogInner.class};
            PetsImpl.class.getDeclaredMethod("wrapDogModel", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized wrapModel 'wrapDogModel(PuppyInner)' not found", false);
        }
    }

    @Test
    public void ensureGetInnerMethodsInWrapperCollectionImpl() {
        try {
            Class<?>[] parameters = new Class[]{String.class};
            PetsImpl.class.getDeclaredMethod("getPuppyInnerUsingPetsInnerAsync", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized getInner 'getPuppyInnerUsingPetsInnerAsync(String)' not found", false);
        }
        //
        try {
            Class<?>[] parameters = new Class[]{String.class, String.class};
            PetsImpl.class.getDeclaredMethod("getDogInnerUsingPetsInnerAsync", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized getInner 'getDogInnerUsingPetsInnerAsync(String, String)' not found", false);
        }
    }

    @Test
    public void ensureGroupableResourceDefinitionFlow() {
        Dog.DefinitionStages.Blank afterName = this.petsManager.pets().defineDog("dog1");
        Dog.DefinitionStages.WithGroup afterRegion = afterName.withRegion("westus");
        Dog.DefinitionStages.WithCreationData afterRG = afterRegion.withExistingResourceGroup("rgname");
        Dog.DefinitionStages.WithCreate afterCreateData = afterRG.withCreationData(new CreationData());
        Dog.DefinitionStages.WithCreate withCreate = afterCreateData.withAnimalSizeGB(22);
        withCreate = withCreate.withOsType(ColorTypes.BLACK);
        withCreate = withCreate.withSku(new DogSku().withName(SkuNames.LARGE));
        withCreate = withCreate.withZones(new ArrayList<String>());
        withCreate = withCreate.withTag("a", "b");
        withCreate.withTags(new HashMap<String, String>());
    }

    @Test
    public void ensureNestedResourceDefinitionFlow() {
        Puppy.DefinitionStages.Blank blankStage = this.petsManager.pets().definePuppy("puppyname");
        Puppy.DefinitionStages.WithCreationData afterDog = blankStage.withExistingDog("rgName", "dogName");
        Puppy.DefinitionStages.WithLocation afterCreationDate = afterDog.withCreationData(new CreationData());
        Puppy.DefinitionStages.WithCreate withCreate = afterCreationDate.withLocation("westus");
        withCreate = withCreate.withAnimalSizeGB(33);
        withCreate = withCreate.withOsType(ColorTypes.BLACK);
        withCreate = withCreate.withSku(new PuppySku().withName(SkuNames.LARGE));
        withCreate.withTags(new HashMap<String, String>());
    }
}
