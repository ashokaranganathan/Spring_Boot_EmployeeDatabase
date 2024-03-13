package com.employee.database.employee_database.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long ID;
    private String firstName;
    private String lastName;
    private String baseLocation;
    private String phoneNumber;
    
}
