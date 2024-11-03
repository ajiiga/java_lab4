package com.barsegyan.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import com.barsegyan.MyThirdTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
