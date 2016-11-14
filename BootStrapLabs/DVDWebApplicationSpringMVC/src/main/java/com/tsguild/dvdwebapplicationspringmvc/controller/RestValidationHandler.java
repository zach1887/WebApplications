/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.controller;

import com.tsguild.dvdwebapplicationspringmvc.validation.ValidationErrorContainer;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author ahill
 */
@ControllerAdvice
public class RestValidationHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class) // this is what makes it a 'catch' basically
    @ResponseBody @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationErrorContainer processValidationErrors(MethodArgumentNotValidException e){
        // Effectively kinda like a "Catch" for thrown Controller exceptions of type MethodArgumentNotValidException         
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        
        ValidationErrorContainer errors = new ValidationErrorContainer();
        for(FieldError fError : fieldErrors){
            errors.addValidationError(fError.getField(), fError.getDefaultMessage());
        }
        
        return errors;
    }
    
}
