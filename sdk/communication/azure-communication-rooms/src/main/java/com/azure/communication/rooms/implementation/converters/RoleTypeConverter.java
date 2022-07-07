// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.rooms.implementation.converters;

import com.azure.communication.rooms.models.RoleType;

/**
 * A converter between {@link com.azure.communication.rooms.implementation.models.RoleType} and
 * {@link RoleType}.
 */
public final class RoleTypeConverter {
    /**
     * Maps from {com.azure.communication.rooms.implementation.models.RoleType} to {@link RoleType}.
     */
    public static RoleType convert(com.azure.communication.rooms.implementation.models.RoleType roleType) {
        if (roleType == null) {
            return null;
        }

        RoleType role = RoleType.ATTENDEE;

        switch (roleType.toString()) {
            case "ATTENDEE":
                role = RoleType.ATTENDEE;
                break;
             case "CONSUMER":
                role = RoleType.CONSUMER;
                break;
             case "PRESENTER":
                role = RoleType.PRESENTER;
                break;
        }
        return role;
    }

    /**
     * Maps from {@link RoleType} to {com.azure.communication.rooms.implementation.models.RoleType}.
    */
    public static com.azure.communication.rooms.implementation.models.RoleType convert(RoleType roleType) {
        if (roleType == null) {
            return null;
        }

        com.azure.communication.rooms.implementation.models.RoleType role = com.azure.communication.rooms.implementation.models.RoleType.ATTENDEE;

        switch (roleType.toString()) {
            case "ATTENDEE":
                role = com.azure.communication.rooms.implementation.models.RoleType.ATTENDEE;
                break;
             case "CONSUMER":
                role = com.azure.communication.rooms.implementation.models.RoleType.CONSUMER;
                break;
             case "PRESENTER":
                role = com.azure.communication.rooms.implementation.models.RoleType.PRESENTER;
                break;
        }
        return role;
    }

}
