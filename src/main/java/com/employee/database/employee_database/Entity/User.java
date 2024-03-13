package com.employee.database.employee_database.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "Employee_Database")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "Employee_ID")
    private Long ID;

    @Column(name= "First_Name")
    @NotNull
    private String firstName;

    @Column(name= "Last_Name")
    @NotNull
    private String lastName;
    
    @Column(name= "Base_Loaction")
    @NotNull
    private String baseLocation;
    
    @Column(name= "Phone_Number")
    @NotNull
    private String phoneNumber;
    
}
