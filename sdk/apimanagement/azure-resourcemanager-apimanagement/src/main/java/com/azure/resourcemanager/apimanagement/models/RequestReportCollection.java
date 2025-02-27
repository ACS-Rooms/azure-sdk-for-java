// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.RequestReportRecordContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged Report records list representation. */
@Fluent
public final class RequestReportCollection {
    /*
     * Page values.
     */
    @JsonProperty(value = "value")
    private List<RequestReportRecordContractInner> value;

    /*
     * Total record count number across all pages.
     */
    @JsonProperty(value = "count")
    private Long count;

    /**
     * Get the value property: Page values.
     *
     * @return the value value.
     */
    public List<RequestReportRecordContractInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Page values.
     *
     * @param value the value value to set.
     * @return the RequestReportCollection object itself.
     */
    public RequestReportCollection withValue(List<RequestReportRecordContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total record count number across all pages.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number across all pages.
     *
     * @param count the count value to set.
     * @return the RequestReportCollection object itself.
     */
    public RequestReportCollection withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
