package com.employee.database.employee_database.Service;

import java.util.List;

import com.employee.database.employee_database.DTO.UserDto;

public interface UserService {
    
    //Create User Service
    UserDto createUser(UserDto user);
    //Read User Service
    List<UserDto> readUser();
    //Read User By ID Service
    UserDto getUserById(Long ID);
    //Update User Service
    UserDto updateUser(UserDto user);
    //Delete User Service
    void deleteUser(Long ID);    
}
