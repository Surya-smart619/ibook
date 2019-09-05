package com.ideas2it.ibook.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service; 

import com.ideas2it.ibook.model.Employee;
import com.ideas2it.ibook.dao.EmployeeDao;
import com.ideas2it.ibook.dao.impl.EmployeeDaoImpl;

// TODO exception Handling

/**
 * <p> 
 * Performing the database related operations.
 * </p>
 *
 * @author Tharun
 * @date   19/06/2019
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
   
    @Override
    public Employee getEmployeeByEmployeeCode(String employeeCode) {
        List<Employee> employeeDetail = employeeDao.retrieveEmployeeByEmployeeCode(employeeCode);
        if (0 == employeeDetail.size()) {
            System.out.println("Invalid Employee Code")
        }
        return employeeDetail.get(0);
    }
}





















