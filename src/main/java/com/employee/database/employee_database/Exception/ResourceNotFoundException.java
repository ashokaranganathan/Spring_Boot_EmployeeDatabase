package com.employee.database.employee_database.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public String SourceName;
    public String fieldName;
    public Long fieldValue;

    public ResourceNotFoundException(String SourceName,String fieldName, Long fieldValue){
        super(String.format("%s not found with %s : '%s",SourceName, fieldName, fieldValue));
        this.SourceName=SourceName;
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;
    }
    
}
