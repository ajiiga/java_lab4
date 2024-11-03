package com.barsegyan.MyThirdTestAppSpringBoot.service;

import com.barsegyan.MyThirdTestAppSpringBoot.model.Response;
import com.barsegyan.MyThirdTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }
}
