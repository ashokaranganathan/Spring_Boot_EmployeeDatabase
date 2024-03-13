package com.employee.database.employee_database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.database.employee_database.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
