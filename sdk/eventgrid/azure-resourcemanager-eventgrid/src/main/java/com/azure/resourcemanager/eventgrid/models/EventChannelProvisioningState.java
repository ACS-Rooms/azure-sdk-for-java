// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventChannelProvisioningState. */
public final class EventChannelProvisioningState extends ExpandableStringEnum<EventChannelProvisioningState> {
    /** Static value Creating for EventChannelProvisioningState. */
    public static final EventChannelProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for EventChannelProvisioningState. */
    public static final EventChannelProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for EventChannelProvisioningState. */
    public static final EventChannelProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for EventChannelProvisioningState. */
    public static final EventChannelProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for EventChannelProvisioningState. */
    public static final EventChannelProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for EventChannelProvisioningState. */
    public static final EventChannelProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a EventChannelProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventChannelProvisioningState.
     */
    @JsonCreator
    public static EventChannelProvisioningState fromString(String name) {
        return fromString(name, EventChannelProvisioningState.class);
    }

    /**
     * Gets known EventChannelProvisioningState values.
     *
     * @return known EventChannelProvisioningState values.
     */
    public static Collection<EventChannelProvisioningState> values() {
        return values(EventChannelProvisioningState.class);
    }
}
