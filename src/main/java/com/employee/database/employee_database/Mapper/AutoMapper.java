package com.employee.database.employee_database.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.employee.database.employee_database.DTO.UserDto;
import com.employee.database.employee_database.Entity.User;

@Mapper
public interface AutoMapper{

    AutoMapper MAPPER = Mappers.getMapper(AutoMapper.class);

    UserDto mapUserDto(User user);

    User mapUser(UserDto userDto);
}