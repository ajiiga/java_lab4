package ru.barsegyan.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.barsegyan.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
