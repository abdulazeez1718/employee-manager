package com.azeez.repository;

import com.azeez.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {


    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

}
