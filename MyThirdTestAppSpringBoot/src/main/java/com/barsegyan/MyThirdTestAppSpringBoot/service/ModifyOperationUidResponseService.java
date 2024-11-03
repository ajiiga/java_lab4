package com.barsegyan.MyThirdTestAppSpringBoot.service;

import com.barsegyan.MyThirdTestAppSpringBoot.model.Response;

import java.util.UUID;

public class ModifyOperationUidResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();

        response.setOperationUid(uuid.toString());

        return response;
    }
}
