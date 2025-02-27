// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AccessControl model. */
@Fluent
public final class AccessControl {
    /*
     * The behavior for IP access control in Key Delivery.
     */
    @JsonProperty(value = "defaultAction")
    private DefaultAction defaultAction;

    /*
     * The IP allow list for access control in Key Delivery. If the default
     * action is set to 'Allow', the IP allow list must be empty.
     */
    @JsonProperty(value = "ipAllowList")
    private List<String> ipAllowList;

    /**
     * Get the defaultAction property: The behavior for IP access control in Key Delivery.
     *
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: The behavior for IP access control in Key Delivery.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the AccessControl object itself.
     */
    public AccessControl withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the ipAllowList property: The IP allow list for access control in Key Delivery. If the default action is set
     * to 'Allow', the IP allow list must be empty.
     *
     * @return the ipAllowList value.
     */
    public List<String> ipAllowList() {
        return this.ipAllowList;
    }

    /**
     * Set the ipAllowList property: The IP allow list for access control in Key Delivery. If the default action is set
     * to 'Allow', the IP allow list must be empty.
     *
     * @param ipAllowList the ipAllowList value to set.
     * @return the AccessControl object itself.
     */
    public AccessControl withIpAllowList(List<String> ipAllowList) {
        this.ipAllowList = ipAllowList;
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
