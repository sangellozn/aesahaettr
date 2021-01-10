package aesahaettr.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import aesahaettr.exceptions.EntityNotFoundException;

@RestControllerAdvice
public class CustomeErrorHandler {

    @ExceptionHandler(Exception.class)
    public Map<String, String> handleException(HttpServletRequest request, Exception e) {
        Map<String, String> resultat = new HashMap<>();

        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        resultat.put("message", e.getMessage());
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                resultat.put("errorCode", "404");
                resultat.put("error", "The resource does not exist.");
            } else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                resultat.put("errorCode", "500");
                resultat.put("error", "Internal error, see log for more informations.");
            } else {
                resultat.put("errorCode", "unknown");
                resultat.put("error", "unknown");
            }
        } else if (e instanceof EntityNotFoundException){
            resultat.put("errorCode", "404");
            resultat.put("error", "The resource does not exist.");
        } else {
            resultat.put("errorCode", "unknown");
            resultat.put("error", "unknown");
        }

        return resultat;
    }

}
