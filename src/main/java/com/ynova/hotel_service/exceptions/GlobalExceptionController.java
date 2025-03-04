package com.ynova.hotel_service.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

    public ResponseEntity<Map<String, Object>> handlerResourceNotFoundException(
            ResourceNotFoudException resourceNotFoudException) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", resourceNotFoudException.getMessage());
        map.put("success", false);
        map.put("status", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }
}
