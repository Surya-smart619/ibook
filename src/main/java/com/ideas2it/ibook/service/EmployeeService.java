package com.ideas2it.ibook.service;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.ibook.model.Employee;
import com.ideas2it.ibook.util.IBookException;

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
     *
     * @return               - It returns an employee detail.
     *
     * @throws //TODO
     */
    Employee getEmployeeByEmployeeCode(String employeeCode)
                                                          throws IBookException;

    /**
     * <p>
     * Saves New Employee.
     * </p>
     *
     * @param employee  - Employee to be create.
     *
     * @return employee - Created Employee.
     *
     * @throws //TODO
     */
    Employee saveEmployee(Employee employee) throws IBookException;

    /**
     * <p>
     * Updates Employee.
     * </p>
     *
     * @param employee  - Employee to be update.
     *
     * @return employee - Updated Employee.
     *
     * @throws //TODO
     */
    Employee updateEmployee(Employee employee) throws IBookException;
}

