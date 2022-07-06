// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.rooms;

import com.azure.communication.rooms.implementation.AzureCommunicationRoomServiceImpl;
import com.azure.communication.rooms.implementation.RoomsImpl;
import com.azure.communication.rooms.implementation.models.RoomModel;
import com.azure.communication.rooms.implementation.models.RoomParticipant;
import com.azure.communication.rooms.implementation.models.RoomParticipantInternal;
import com.azure.communication.rooms.implementation.models.UpdateParticipantsRequest;
import com.azure.communication.rooms.implementation.models.UpdateRoomRequest;
import com.azure.communication.rooms.implementation.models.AddParticipantsRequest;
import com.azure.communication.rooms.implementation.models.CreateRoomRequest;
import com.azure.communication.rooms.models.CommunicationRoom;
import com.azure.communication.rooms.implementation.models.ParticipantsCollection;
import com.azure.communication.rooms.implementation.models.RemoveParticipantsRequest;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import reactor.core.publisher.Mono;

import static com.azure.core.util.FluxUtil.monoError;

/**
 * The Async client for create, update, get, delete room of Azure Communication Room Service.
 */
@ServiceClient(builder = RoomsClientBuilder.class, isAsync = true)
public class RoomsAsyncClient {
    private final RoomsImpl roomsClient;
    private final ClientLogger logger = new ClientLogger(RoomsAsyncClient.class);

    RoomsAsyncClient(AzureCommunicationRoomServiceImpl roomsServiceClient) {
        roomsClient = roomsServiceClient.getRooms();
    }

    /**
     * Create a new Room, input fields are nullable.
     *
     * @param validFrom the validFrom value to set.
     * @param validUntil the validUntil value to set.
     * @param participants the participants value to set.
     * @return response for a successful create room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationRoom> createRoom(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants, UUID repeatabilityRequestId, OffsetDateTime repeatabilityFirstSent) {
        return createRoom(validFrom, validUntil, participants, repeatabilityRequestId, repeatabilityFirstSent);
    }

    Mono<CommunicationRoom> createRoom(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants, UUID repeatabilityRequestId, OffsetDateTime repeatabilityFirstSent, Context context) {
        context = context == null ? Context.NONE : context;

        repeatabilityRequestId = repeatabilityRequestId == null ? UUID.randomUUID() : repeatabilityRequestId;
        repeatabilityFirstSent = repeatabilityFirstSent == null ? OffsetDateTime.now(ZoneOffset.UTC) : repeatabilityFirstSent;

        try {
            return this.roomsClient
            .createRoomWithResponseAsync(toCreateRoomRequest(validFrom, validUntil, participants), repeatabilityRequestId, repeatabilityFirstSent)
            .flatMap((Response<RoomModel> response) -> {
                return Mono.just(getCommunicationRoomFromResponse(response.getValue()));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Create a new Room, input fields are nullable.
     *
     * @param validFrom the validFrom value to set.
     * @param validUntil the validUntil value to set.
     * @param participants the participants value to set.
     * @param repeatabilityRequestId repeatabilityRequestId.
     * @param repeatabilityFirstSent repeatabilityFirstSent.
     * @return response for a successful create room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationRoom>> createRoomWithResponse(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants, UUID repeatabilityRequestId, OffsetDateTime repeatabilityFirstSent) {
        return createRoomWithResponse(validFrom, validUntil, participants, repeatabilityRequestId, repeatabilityFirstSent);
    }

    Mono<Response<CommunicationRoom>> createRoomWithResponse(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants, UUID repeatabilityRequestId, OffsetDateTime repeatabilityFirstSent, Context context) {
        context = context == null ? Context.NONE : context;

        repeatabilityRequestId = repeatabilityRequestId == null ? UUID.randomUUID() : repeatabilityRequestId;
        repeatabilityFirstSent = repeatabilityFirstSent == null ? OffsetDateTime.now(ZoneOffset.UTC) : repeatabilityFirstSent;

        try {
            return this.roomsClient
            .createRoomWithResponseAsync(toCreateRoomRequest(validFrom, validUntil, participants), repeatabilityRequestId, repeatabilityFirstSent)
            .flatMap((Response<RoomModel> response) -> {
                CommunicationRoom communicationRoom = getCommunicationRoomFromResponse(response.getValue());
                return Mono.just(new SimpleResponse<CommunicationRoom>(response, communicationRoom));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
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
    public Mono<CommunicationRoom> updateRoom(String roomId, OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants) {
        return updateRoom(roomId, validFrom, validUntil, participants, null);
    }

    Mono<CommunicationRoom> updateRoom(String roomId, OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .updateRoomWithResponseAsync(roomId, toUpdateRoomRequest(validFrom, validUntil, participants), context)
            .flatMap((Response<RoomModel> response) -> {
                return Mono.just(getCommunicationRoomFromResponse(response.getValue()));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }

    }

    /**
     * Update an existing room with response.
     *
     * @param roomId The room id.
     * @param validFrom the validFrom value to set.
     * @param validUntil the validUntil value to set.
     * @return response for a successful update room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationRoom>> updateRoomWithResponse(String roomId, OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants) {
        return updateRoomWithResponse(roomId, validFrom, validUntil, participants, null);
    }

    Mono<Response<CommunicationRoom>> updateRoomWithResponse(String roomId, OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .updateRoomWithResponseAsync(roomId, toUpdateRoomRequest(validFrom, validUntil, participants), context)
            .flatMap((Response<RoomModel> response) -> {
                CommunicationRoom communicationRoom = getCommunicationRoomFromResponse(response.getValue());
                return Mono.just(new SimpleResponse<CommunicationRoom>(response, communicationRoom));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }

    }

    /**
     * Get an existing room.
     *
     * @param roomId The room Id.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationRoom> getRoom(String roomId) {
        return getRoom(roomId, null);
    }

    Mono<CommunicationRoom> getRoom(String roomId, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .getRoomWithResponseAsync(roomId, context)
            .flatMap(
                (Response<RoomModel> response) -> {
                    return Mono.just(getCommunicationRoomFromResponse(response.getValue()));
                }
            );
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }

    }

    /**
     * Get an existing room with response.
     *
     * @param roomId The room Id.
     * @return The existing room.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationRoom>> getRoomWithResponse(String roomId) {
        return getRoomWithResponse(roomId, null);
    }

    Mono<Response<CommunicationRoom>> getRoomWithResponse(String roomId, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .getRoomWithResponseAsync(roomId, context)
            .flatMap(
                (Response<RoomModel> response) -> {
                    CommunicationRoom communicationRoom = getCommunicationRoomFromResponse(response.getValue());
                    return Mono.just(new SimpleResponse<CommunicationRoom>(response, communicationRoom));
                }
            );
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }

    }

    /**
     * Delete a existing room.
     *
     * @param roomId The room Id.
     * @return The response with status code.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteRoomWithResponse(String roomId) {
        return deleteRoomWithResponse(roomId, null);
    }

    Mono<Response<Void>> deleteRoomWithResponse(String roomId, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .deleteRoomWithResponseAsync(roomId, context)
            .flatMap((Response<Void> response) -> {
                return Mono.just(response);
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Add participants to an existing Room.
     *
     * @param roomId The room id.
     * @param participants The participants list.
     * @return response for a successful add participants room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ParticipantsCollection> addParticipants(String roomId, List<RoomParticipant> participants) {
        return addParticipants(roomId, participants, null);
    }

    Mono<ParticipantsCollection> addParticipants(String roomId, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .addParticipantsWithResponseAsync(roomId, toAddParticipantsRequest(participants), context)
            .flatMap((Response<ParticipantsCollection> response) -> {
                return Mono.just(response.getValue());
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }

    }

    /**
     * Add participants to an existing room with response.
     *
     * @param roomId The room id.
     * @param participants The participant list.
     * @return response for a successful add participants to room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ParticipantsCollection>> addParticipantsWithResponse(String roomId, List<RoomParticipant> participants) {
        return addParticipantsWithResponse(roomId, participants, null);
    }

    Mono<Response<ParticipantsCollection>> addParticipantsWithResponse(String roomId, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .addParticipantsWithResponseAsync(roomId, toAddParticipantsRequest(participants), context)
            .flatMap((Response<ParticipantsCollection> response) -> {
                ParticipantsCollection participantsCollection = response.getValue();
                return Mono.just(new SimpleResponse<ParticipantsCollection>(response, participantsCollection));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Update participants to an existing Room.
     *
     * @param roomId The room id.
     * @param participants The participants list.
     * @return response for a successful update participants room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ParticipantsCollection> updateParticipants(String roomId, List<RoomParticipant> participants) {
        return addParticipants(roomId, participants, null);
    }

    Mono<ParticipantsCollection> updateParticipants(String roomId, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .updateParticipantsWithResponseAsync(roomId, toUpdateParticipantsRequest(participants), context)
            .flatMap((Response<ParticipantsCollection> response) -> {
                return Mono.just(response.getValue());
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }

    }

    /**
     * Update participants to an existing room with response.
     *
     * @param roomId The room id.
     * @param participants The participant list.
     * @return response for a successful update participants to room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ParticipantsCollection>> updateParticipantsWithResponse(String roomId, List<RoomParticipant> participants) {
        return updateParticipantsWithResponse(roomId, participants, null);
    }

    Mono<Response<ParticipantsCollection>> updateParticipantsWithResponse(String roomId, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .updateParticipantsWithResponseAsync(roomId, toUpdateParticipantsRequest(participants), context)
            .flatMap((Response<ParticipantsCollection> response) -> {
                ParticipantsCollection participantsCollection = response.getValue();
                return Mono.just(new SimpleResponse<ParticipantsCollection>(response, participantsCollection));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Remove participants from an existing Room.
     *
     * @param roomId The room id.
     * @param participants The participants list.
     * @return response for a successful remove participants room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ParticipantsCollection> removeParticipants(String roomId, List<RoomParticipant> participants) {
        return removeParticipants(roomId, participants, null);
    }

    Mono<ParticipantsCollection> removeParticipants(String roomId, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .removeParticipantsWithResponseAsync(roomId, toRemoveParticipantsRequest(participants), context)
            .flatMap((Response<ParticipantsCollection> response) -> {
                return Mono.just(response.getValue());
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }

    }

    /**
     * Add participants to an existing room with response.
     *
     * @param roomId The room id.
     * @param participants The participant list.
     * @return response for a successful remove participants to room request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ParticipantsCollection>> removeParticipantsWithResponse(String roomId, List<RoomParticipant> participants) {
        return removeParticipantsWithResponse(roomId, participants, null);
    }

    Mono<Response<ParticipantsCollection>> removeParticipantsWithResponse(String roomId, List<RoomParticipant> participants, Context context) {
        context = context == null ? Context.NONE : context;
        try {
            return this.roomsClient
            .removeParticipantsWithResponseAsync(roomId, toRemoveParticipantsRequest(participants), context)
            .flatMap((Response<ParticipantsCollection> response) -> {
                ParticipantsCollection participantsCollection = response.getValue();
                return Mono.just(new SimpleResponse<ParticipantsCollection>(response, participantsCollection));
            });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    private CommunicationRoom getCommunicationRoomFromResponse(RoomModel room) {
        List<com.azure.communication.rooms.models.RoomParticipant> participants = new ArrayList<>();



        return new CommunicationRoom(room.getId(),
            room.getValidFrom(),
            room.getValidUntil(),
            room.getCreatedDateTime(),
            participants);
    }

    /**
     * Translate to create room request.
     *
     * @return The create room request.
     */
    private CreateRoomRequest toCreateRoomRequest(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants) {
        CreateRoomRequest createRoomRequest = new CreateRoomRequest();
        if (validFrom != null) {
            createRoomRequest.setValidFrom(validFrom);
        }

        if (validUntil != null) {
            createRoomRequest.setValidUntil(validUntil);
        }

        if (participants != null) {
            createRoomRequest.setParticipants(participants);
        }

        return createRoomRequest;
    }

    /**
     * Translate to Add participants request.
     *
     * @return The add participants room request.
     */
    private AddParticipantsRequest toAddParticipantsRequest(List<RoomParticipant> participants) {
        AddParticipantsRequest addParticipantsRequest = new AddParticipantsRequest();

        addParticipantsRequest.setParticipants(participants);
        return addParticipantsRequest;
    }

    /**
     * Translate to Remove participants request.
     *
     * @return The Remove participants room request.
     */
    private RemoveParticipantsRequest toRemoveParticipantsRequest(List<RoomParticipant> participants) {
        RemoveParticipantsRequest removeParticipantsRequest = new RemoveParticipantsRequest();

        removeParticipantsRequest.setParticipants(participants);
        return removeParticipantsRequest;
    }

    /**
     * Translate to Update participants request.
     *
     * @return The Update participants room request.
     */
    private UpdateParticipantsRequest toUpdateParticipantsRequest(List<RoomParticipant> participants) {
        UpdateParticipantsRequest updateParticipantsRequest = new UpdateParticipantsRequest();

        updateParticipantsRequest.setParticipants(participants);
        return updateParticipantsRequest;
    }

    /**
     * Translate to update room request.
     *
     * @return The update room request.
     */
    private UpdateRoomRequest toUpdateRoomRequest(OffsetDateTime validFrom, OffsetDateTime validUntil, List<RoomParticipant> participants) {
        UpdateRoomRequest updateRoomRequest = new UpdateRoomRequest();

        if (validFrom != null) {
            updateRoomRequest.setValidFrom(validFrom);
        }

        if (validUntil != null) {
            updateRoomRequest.setValidUntil(validUntil);
        }

        if (participants != null) {
            updateRoomRequest.setParticipants(participants);
        }

        return updateRoomRequest;
    }
}
