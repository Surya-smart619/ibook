package com.ideas2it.ibook.service;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.ibook.model.Employee;

// TODO excpetion handling.

/**
 * <p> 
 * Performing employee logical operations.
 * </p>
 *
 * @author Tharun
 * @date   05/09/2019
 */
public interface EmployeeService {

    /**
     * <p>
     * Getting the Employee detail by their Employee code.
     * </p>
     *
     * @param employeeCode   - Employee Code to get employee detail.
     * @return               - It returns an employee detail.
     */
    Employee getEmployeeByEmployeeCode(String employeeCode);
}

























