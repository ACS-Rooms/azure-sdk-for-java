// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.rooms;

import com.azure.communication.rooms.models.CommunicationRoom;
import com.azure.communication.rooms.models.ParticipantsCollection;
import com.azure.communication.rooms.models.RoomParticipant;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Client for rooms operations with Azure Communication Rooms Service
 */
@ServiceClient(builder = RoomsClientBuilder.class)
public class RoomsClient {
    private final RoomsAsyncClient roomsAsyncClient;

    RoomsClient(RoomsAsyncClient roomsAsyncClient) {
        this.roomsAsyncClient = roomsAsyncClient;
    }

    /**
     * Create a new room.
     *
     * @param validFrom the validFrom value to set.
     * @param validUntil the validUntil value to set.
     * @param participants the participants value to set.
     * @return response for a successful create room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationRoom createRoom(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants,  UUID repeatabilityRequestId, OffsetDateTime repeatabilityFirstSent) {
        return roomsAsyncClient.createRoom(validFrom, validUntil, participants, repeatabilityRequestId, repeatabilityFirstSent).block();
    }

    /**
     * Create a new Room with response.
     *
     * @param validFrom the validFrom value to set.
     * @param validUntil the validUntil value to set.
     * @param participants the participants value to set.
     * @param context The context of key value pairs for http request.
     * @return response for a successful create room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunicationRoom> createRoomWithResponse(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants,  UUID repeatabilityRequestId, OffsetDateTime repeatabilityFirstSent) {
        return roomsAsyncClient.createRoomWithResponse(validFrom, validUntil, participants, repeatabilityRequestId, repeatabilityFirstSent).block();
    }

    /**
     * Update an existing Room.
     *
     * @param roomId The room id.
     * @param validFrom the validFrom value to set.
     * @param validUntil the validUntil value to set.
     * @return response for a successful update room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationRoom updateRoom(String roomId, OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants) {
        return roomsAsyncClient.updateRoom(roomId, validFrom, validUntil, participants).block();
    }

    /**
     * Update an existing Room with response.
     *
     * @param roomId The room id.
     * @param validFrom the validFrom value to set.
     * @param validUntil the validUntil value to set.
     * @param context The context of key value pairs for http request.
     * @return response for a successful update room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunicationRoom> updateRoomWithResponse(String roomId, OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants) {
        return roomsAsyncClient.updateRoomWithResponse(roomId, validFrom, validUntil, participants).block();
    }

    /**
     * Get an existing room.
     *
     * @param roomId The room id.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationRoom getRoom(String roomId) {
        return roomsAsyncClient.getRoom(roomId).block();
    }

    /**
     * Get an existing room with response.
     *
     * @param roomId The room id.
     * @param context The context of key value pairs for http request.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunicationRoom> getRoomWithResponse(String roomId, Context context) {
        return roomsAsyncClient.getRoomWithResponse(roomId, context).block();
    }


    /**
     * Delete an existing room.
     *
     * @param roomId The room Id.
     * @param context The context of key value pairs for http request.
     * @return Response with status code only.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteRoomWithResponse(String roomId, Context context) {
        return roomsAsyncClient.deleteRoomWithResponse(roomId, context).block();
    }

    /**
     * Add participants to an existing room.
     *
     * @param roomId The room id.
     * @param participants The participants to add.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ParticipantsCollection addParticipants(String roomId, List<RoomParticipant> participants) {
        return roomsAsyncClient.addParticipants(roomId, participants).block();
    }

    /**
     * Add participants to an existing room with response.
     *
     * @param roomId The room id.
     * @param participants The participants to add.
     * @param context The context of key value pairs for http request.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ParticipantsCollection> addParticipantsWithResponse(String roomId, List<RoomParticipant> participants, Context context) {
        return roomsAsyncClient.addParticipantsWithResponse(roomId, participants, context).block();
    }

    /**
     * Update participants to an existing room.
     *
     * @param roomId The room id.
     * @param participants The participants to add.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ParticipantsCollection updateParticipants(String roomId, List<RoomParticipant> participants) {
        return roomsAsyncClient.updateParticipants(roomId, participants).block();
    }

    /**
     * Update participants to an existing room with response.
     *
     * @param roomId The room id.
     * @param participants The participants to add.
     * @param context The context of key value pairs for http request.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ParticipantsCollection> updateParticipantsWithResponse(String roomId, List<RoomParticipant> participants, Context context) {
        return roomsAsyncClient.updateParticipantsWithResponse(roomId, participants, context).block();
    }

    /**
     * Remove participants from an existing room.
     *
     * @param roomId The room id.
     * @param participants The participants to remove.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ParticipantsCollection removeParticipants(String roomId, List<RoomParticipant> participants) {
        return roomsAsyncClient.removeParticipants(roomId, participants).block();
    }

    /**
     * Remove participants from an existing room with response.
     *
     * @param roomId The room id.
     * @param participants The participants to remove.
     * @param context The context of key value pairs for http request.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ParticipantsCollection> removeParticipantsWithResponse(String roomId, List<RoomParticipant> participants, Context context) {
        return roomsAsyncClient.removeParticipantsWithResponse(roomId, participants, context).block();
    }
}
