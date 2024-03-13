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

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EmployeeController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/create")
    public ResponseEntity<UserDto> postMapping(@RequestBody UserDto user){
        UserDto savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<UserDto>> getMapping() {
        List<UserDto> readUser = userService.readUser();
        return new ResponseEntity<>(readUser, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserDto> putMapping(@PathVariable("id") Long ID, @RequestBody UserDto user) {
        UserDto updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam Long ID){
        return new ResponseEntity<>("The User is deleted", HttpStatus.OK);
    }
    
    @GetMapping("/getUserById")
    public ResponseEntity<UserDto> getMethodName(@RequestParam Long ID) {
        UserDto findById = userService.getUserById(ID);
        return new ResponseEntity<>(findById,HttpStatus.OK);
    }
    
}