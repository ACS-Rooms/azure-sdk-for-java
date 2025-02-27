// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module com.azure.communication.common {

    requires transitive com.azure.core;

    // public API surface area
    exports com.azure.communication.common;

    opens com.azure.communication.common
        to com.fasterxml.jackson.databind;

    exports com.azure.communication.common.implementation;
}
