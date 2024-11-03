package ru.barsegyan.MySecondTestAppSpringBoot.service;

import jakarta.validation.ValidationException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.barsegyan.MySecondTestAppSpringBoot.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult result) throws ValidationFailedException;
}
