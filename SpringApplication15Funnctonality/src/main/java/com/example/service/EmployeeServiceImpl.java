package com.example.service;

import com.example.dao.Employee;
import com.example.model.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {


    @Autowired
    EmployeeDao employeeDaoImpl;

    public Employee saveData(Employee employee){
        return employeeDaoImpl.save(employee);
    }

    public List<Employee> getAllData(){
        return employeeDaoImpl.findAll();
    }

    public Optional<Employee> getDataById(int empId){
        return employeeDaoImpl.findById(empId);
    }

    public List<Employee> getDataByName(String empName){
        return employeeDaoImpl.findByEmpName(empName);
    }

    public Employee updateData(Employee employee){
        return employeeDaoImpl.save(employee);
    }

    public Employee getDataByContactNumber(long empContactNumber){
        return employeeDaoImpl.findByEmpContactNumber(empContactNumber);
    }

    public void deleteDataById(int empId){
        employeeDaoImpl.deleteById(empId);
    }

    public void deleteAllData(){
        employeeDaoImpl.deleteAll();
    }
}
