package ru.barsegyan.MySecondTestAppSpringBoot.service;

import ru.barsegyan.MySecondTestAppSpringBoot.model.Response;

import java.util.UUID;

public class ModifyOperationUidResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();

        response.setOperationUid(uuid.toString());

        return response;
    }
}
