package aesahaettr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import aesahaettr.exceptions.EntityNotFoundException;

@RestControllerAdvice
public class CustomeErrorHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public Map<String, String> handleException(HttpServletRequest request, Exception e) {
        Map<String, String> resultat = new HashMap<>();

        resultat.put("errorCode", "404");
        resultat.put("error", "The resource does not exist.");
        resultat.put("message", e.getMessage());

        return resultat;
    }

}
