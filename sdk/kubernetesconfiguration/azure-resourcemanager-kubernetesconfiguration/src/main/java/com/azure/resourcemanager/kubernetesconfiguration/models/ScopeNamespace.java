// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies that the scope of the extension is Namespace. */
@Fluent
public final class ScopeNamespace {
    /*
     * Namespace where the extension will be created for an Namespace scoped
     * extension.  If this namespace does not exist, it will be created
     */
    @JsonProperty(value = "targetNamespace")
    private String targetNamespace;

    /**
     * Get the targetNamespace property: Namespace where the extension will be created for an Namespace scoped
     * extension. If this namespace does not exist, it will be created.
     *
     * @return the targetNamespace value.
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set the targetNamespace property: Namespace where the extension will be created for an Namespace scoped
     * extension. If this namespace does not exist, it will be created.
     *
     * @param targetNamespace the targetNamespace value to set.
     * @return the ScopeNamespace object itself.
     */
    public ScopeNamespace withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
