// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.DatabaseInner;
import com.azure.resourcemanager.synapse.fluent.models.ReadWriteDatabaseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Class representing a read write database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ReadWrite")
@Fluent
public final class ReadWriteDatabase extends DatabaseInner {
    /*
     * The database properties.
     */
    @JsonProperty(value = "properties")
    private ReadWriteDatabaseProperties innerProperties;

    /**
     * Get the innerProperties property: The database properties.
     *
     * @return the innerProperties value.
     */
    private ReadWriteDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ReadWriteDatabase withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the softDeletePeriod property: The time the data should be kept before it stops being accessible to queries
     * in TimeSpan.
     *
     * @return the softDeletePeriod value.
     */
    public Duration softDeletePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().softDeletePeriod();
    }

    /**
     * Set the softDeletePeriod property: The time the data should be kept before it stops being accessible to queries
     * in TimeSpan.
     *
     * @param softDeletePeriod the softDeletePeriod value to set.
     * @return the ReadWriteDatabase object itself.
     */
    public ReadWriteDatabase withSoftDeletePeriod(Duration softDeletePeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReadWriteDatabaseProperties();
        }
        this.innerProperties().withSoftDeletePeriod(softDeletePeriod);
        return this;
    }

    /**
     * Get the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @return the hotCachePeriod value.
     */
    public Duration hotCachePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().hotCachePeriod();
    }

    /**
     * Set the hotCachePeriod property: The time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @param hotCachePeriod the hotCachePeriod value to set.
     * @return the ReadWriteDatabase object itself.
     */
    public ReadWriteDatabase withHotCachePeriod(Duration hotCachePeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReadWriteDatabaseProperties();
        }
        this.innerProperties().withHotCachePeriod(hotCachePeriod);
        return this;
    }

    /**
     * Get the statistics property: The statistics of the database.
     *
     * @return the statistics value.
     */
    public DatabaseStatistics statistics() {
        return this.innerProperties() == null ? null : this.innerProperties().statistics();
    }

    /**
     * Get the isFollowed property: Indicates whether the database is followed.
     *
     * @return the isFollowed value.
     */
    public Boolean isFollowed() {
        return this.innerProperties() == null ? null : this.innerProperties().isFollowed();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
