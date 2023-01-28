package com.example.model;

import com.example.dao.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    public List<Employee> findByEmpName(String empName);

    public Employee findByEmpContactNumber(long empContactNumber);
}
