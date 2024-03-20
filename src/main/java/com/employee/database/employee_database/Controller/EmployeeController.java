package com.employee.database.employee_database.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.database.employee_database.DTO.UserDto;
import com.employee.database.employee_database.Service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Tag(
    name = "CURD REST APIs for User Resource",
    description = "Create User, Update User, Delete User, Get User"
)
@RestController
public class EmployeeController {

    @Autowired
    private UserService userService;
    
    @Operation(
        summary = "Create User REST API",
        description = "Used to Save the User"
    )
    @ApiResponse(
        responseCode = "201",
        description = "HTTP Status 201 CREATED"
    )
    @PostMapping("/create")
    public ResponseEntity<UserDto> postMapping(@Valid @RequestBody UserDto user){
        UserDto savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @Operation(
        summary = "Get User REST API",
        description = "Used to Get all the Users"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 SUCCESSFULL"
    )
    @GetMapping("/read")
    public ResponseEntity<List<UserDto>> getMapping() {
        List<UserDto> readUser = userService.readUser();
        return new ResponseEntity<>(readUser, HttpStatus.OK);
    }

    @Operation(
        summary = "Update User REST API",
        description = "Used to Update the Existing User by ID"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 SUCCESSFULL"
    )
    @PutMapping("/update/{id}")
    public ResponseEntity<UserDto> putMapping(@PathVariable("id") Long ID, @Valid @RequestBody UserDto user) {
        UserDto updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.CREATED);
    }

    @Operation(
        summary = "Delete User REST API",
        description = "Used to Delete the User by ID"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 SUCCESSFULL"
    )
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam Long ID){
        return new ResponseEntity<>("The User is deleted", HttpStatus.OK);
    }

    @Operation(
        summary = "Get User REST API",
        description = "Used to Get User By ID"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 SUCCESSFULL"
    )
    @GetMapping("/getUserById")
    public ResponseEntity<UserDto> getMethodName(@RequestParam Long ID) {
        UserDto findById = userService.getUserById(ID);
        return new ResponseEntity<>(findById,HttpStatus.OK);
    }
    
}