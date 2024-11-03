package com.barsegyan.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import com.barsegyan.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
