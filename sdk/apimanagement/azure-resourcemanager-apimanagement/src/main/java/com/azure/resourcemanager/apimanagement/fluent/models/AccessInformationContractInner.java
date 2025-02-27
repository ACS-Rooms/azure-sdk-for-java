// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tenant Settings. */
@Fluent
public final class AccessInformationContractInner extends ProxyResource {
    /*
     * AccessInformation entity contract properties.
     */
    @JsonProperty(value = "properties")
    private AccessInformationContractProperties innerProperties;

    /**
     * Get the innerProperties property: AccessInformation entity contract properties.
     *
     * @return the innerProperties value.
     */
    private AccessInformationContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Access Information type ('access' or 'gitAccess').
     *
     * @return the id value.
     */
    public String idPropertiesId() {
        return this.innerProperties() == null ? null : this.innerProperties().id();
    }

    /**
     * Set the id property: Access Information type ('access' or 'gitAccess').
     *
     * @param id the id value to set.
     * @return the AccessInformationContractInner object itself.
     */
    public AccessInformationContractInner withIdPropertiesId(String id) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessInformationContractProperties();
        }
        this.innerProperties().withId(id);
        return this;
    }

    /**
     * Get the principalId property: Principal (User) Identifier.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: Principal (User) Identifier.
     *
     * @param principalId the principalId value to set.
     * @return the AccessInformationContractInner object itself.
     */
    public AccessInformationContractInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessInformationContractProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the enabled property: Determines whether direct access is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Determines whether direct access is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the AccessInformationContractInner object itself.
     */
    public AccessInformationContractInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessInformationContractProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
