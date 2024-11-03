package ru.barsegyan.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.barsegyan.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
