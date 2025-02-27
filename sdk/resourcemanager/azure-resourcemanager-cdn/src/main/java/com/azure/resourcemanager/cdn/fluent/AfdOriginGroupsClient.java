// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cdn.fluent.models.AfdOriginGroupInner;
import com.azure.resourcemanager.cdn.fluent.models.UsageInner;
import com.azure.resourcemanager.cdn.models.AfdOriginGroupUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AfdOriginGroupsClient. */
public interface AfdOriginGroupsClient {
    /**
     * Lists all of the existing origin groups within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list origin groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AfdOriginGroupInner> listByProfileAsync(String resourceGroupName, String profileName);

    /**
     * Lists all of the existing origin groups within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list origin groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AfdOriginGroupInner> listByProfile(String resourceGroupName, String profileName);

    /**
     * Lists all of the existing origin groups within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list origin groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AfdOriginGroupInner> listByProfile(String resourceGroupName, String profileName, Context context);

    /**
     * Gets an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing origin group within a profile along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AfdOriginGroupInner>> getWithResponseAsync(
        String resourceGroupName, String profileName, String originGroupName);

    /**
     * Gets an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing origin group within a profile on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AfdOriginGroupInner> getAsync(String resourceGroupName, String profileName, String originGroupName);

    /**
     * Gets an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing origin group within a profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdOriginGroupInner get(String resourceGroupName, String profileName, String originGroupName);

    /**
     * Gets an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing origin group within a profile along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AfdOriginGroupInner> getWithResponse(
        String resourceGroupName, String profileName, String originGroupName, Context context);

    /**
     * Creates a new origin group within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param originGroup Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String profileName, String originGroupName, AfdOriginGroupInner originGroup);

    /**
     * Creates a new origin group within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param originGroup Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of aFDOrigin group comprising of origins is used for load balancing to
     *     origins when the content cannot be served from CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<AfdOriginGroupInner>, AfdOriginGroupInner> beginCreateAsync(
        String resourceGroupName, String profileName, String originGroupName, AfdOriginGroupInner originGroup);

    /**
     * Creates a new origin group within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param originGroup Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aFDOrigin group comprising of origins is used for load balancing to
     *     origins when the content cannot be served from CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AfdOriginGroupInner>, AfdOriginGroupInner> beginCreate(
        String resourceGroupName, String profileName, String originGroupName, AfdOriginGroupInner originGroup);

    /**
     * Creates a new origin group within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param originGroup Origin group properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aFDOrigin group comprising of origins is used for load balancing to
     *     origins when the content cannot be served from CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AfdOriginGroupInner>, AfdOriginGroupInner> beginCreate(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupInner originGroup,
        Context context);

    /**
     * Creates a new origin group within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param originGroup Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AfdOriginGroupInner> createAsync(
        String resourceGroupName, String profileName, String originGroupName, AfdOriginGroupInner originGroup);

    /**
     * Creates a new origin group within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param originGroup Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdOriginGroupInner create(
        String resourceGroupName, String profileName, String originGroupName, AfdOriginGroupInner originGroup);

    /**
     * Creates a new origin group within the specified profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param originGroup Origin group properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdOriginGroupInner create(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupInner originGroup,
        Context context);

    /**
     * Updates an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param originGroupUpdateProperties Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupUpdateParameters originGroupUpdateProperties);

    /**
     * Updates an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param originGroupUpdateProperties Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of aFDOrigin group comprising of origins is used for load balancing to
     *     origins when the content cannot be served from CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<AfdOriginGroupInner>, AfdOriginGroupInner> beginUpdateAsync(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupUpdateParameters originGroupUpdateProperties);

    /**
     * Updates an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param originGroupUpdateProperties Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aFDOrigin group comprising of origins is used for load balancing to
     *     origins when the content cannot be served from CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AfdOriginGroupInner>, AfdOriginGroupInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupUpdateParameters originGroupUpdateProperties);

    /**
     * Updates an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param originGroupUpdateProperties Origin group properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of aFDOrigin group comprising of origins is used for load balancing to
     *     origins when the content cannot be served from CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AfdOriginGroupInner>, AfdOriginGroupInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupUpdateParameters originGroupUpdateProperties,
        Context context);

    /**
     * Updates an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param originGroupUpdateProperties Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AfdOriginGroupInner> updateAsync(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupUpdateParameters originGroupUpdateProperties);

    /**
     * Updates an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param originGroupUpdateProperties Origin group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdOriginGroupInner update(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupUpdateParameters originGroupUpdateProperties);

    /**
     * Updates an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param originGroupUpdateProperties Origin group properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be
     *     served from CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdOriginGroupInner update(
        String resourceGroupName,
        String profileName,
        String originGroupName,
        AfdOriginGroupUpdateParameters originGroupUpdateProperties,
        Context context);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String profileName, String originGroupName);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String profileName, String originGroupName);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String originGroupName);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String originGroupName, Context context);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String profileName, String originGroupName);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String originGroupName);

    /**
     * Deletes an existing origin group within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String originGroupName, Context context);

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<UsageInner> listResourceUsageAsync(String resourceGroupName, String profileName, String originGroupName);

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listResourceUsage(String resourceGroupName, String profileName, String originGroupName);

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param originGroupName Name of the origin group which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listResourceUsage(
        String resourceGroupName, String profileName, String originGroupName, Context context);
}
