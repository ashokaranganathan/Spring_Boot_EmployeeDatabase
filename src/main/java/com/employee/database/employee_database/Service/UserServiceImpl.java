package com.employee.database.employee_database.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.database.employee_database.DTO.UserDto;
import com.employee.database.employee_database.Entity.User;
import com.employee.database.employee_database.Exception.ResourceNotFoundException;
import com.employee.database.employee_database.Mapper.AutoMapper;
import com.employee.database.employee_database.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
        User create = AutoMapper.MAPPER.mapUser(user);
        @SuppressWarnings("null")
        User saveUser = userRepository.save(create);
        UserDto createDto = AutoMapper.MAPPER.mapUserDto(saveUser);
        return createDto;
       
    }

    @Override
    public List<UserDto> readUser() {
        List<User> read = userRepository.findAll();
        return read.stream().map((user)->AutoMapper.MAPPER.mapUserDto(user)).collect(Collectors.toList()); 
    }

  
    @Override
    public UserDto updateUser(UserDto user) {
        @SuppressWarnings("null")
        User updateUser = userRepository.findById(user.getID()).orElseThrow(
            ()->new ResourceNotFoundException("User", "id", user.getID())
        );
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setBaseLocation(user.getBaseLocation());
        updateUser.setPhoneNumber(user.getPhoneNumber());
        return user;
       
    }

    @SuppressWarnings("null")
    @Override
    public void deleteUser(Long ID) {
        @SuppressWarnings("unused")
        User updateUser = userRepository.findById(ID).orElseThrow(
            ()->new ResourceNotFoundException("User", "id", ID)
        );
       userRepository.deleteById(ID);

    }

    @Override
    public UserDto getUserById(Long ID) {
        @SuppressWarnings("null")
        User user = userRepository.findById(ID).orElseThrow(
            ()->new ResourceNotFoundException("User", "id", ID)
        );
        return AutoMapper.MAPPER.mapUserDto(user);
    }
    
}
