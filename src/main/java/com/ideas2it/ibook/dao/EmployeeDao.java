package com.ideas2it.ibook.dao;

import java.util.List;

import org.hibernate.Session; 

import com.ideas2it.ibook.model.Employee;
import com.ideas2it.ibook.util.IBookException;

//TODO exception handling

/**
 * <p> 
 * Performing the database related operations.
 * </p>
 *
 * @author Tharun
 * @date   21/06/2019
 */
public interface EmployeeDao {

   /** 
    * <p>
    * Creating the new role.
    * </p>
    *
    * @param role                   - It contains the role details to create 
                                      new role.  
    * @exception HibernateException - Exception occurred while role creation.
    * @throws ShopException         - Exception occurred while role creation.
    */
    List<Employee> getEmployeeByEmployeeCode(String employeeCode)
                                                          throws IBookException;

    /**
     * <p>
     * Inserts Employee
     * </p>
     *
     * @param employee  - Employee to be create.
     *
     * @return employee - Created employee with employee code.
     *
     * @return //TODO
     */
    Employee insertEmployee(Employee employee) throws IBookException;

    /**
     * <p>
     * Updates Employee
     * </p>
     *
     * @param employee  - Employee to be update.
     *
     * @return employee - Updated employee with employee code.
     *
     * @throws //TODO
     */
    Employee updateEmployee(Employee employee) throws IBookException;

    /**
     * <p>
     * Retrieves employees by given column name, attribute.
     * </p>
     *
     * @param columnName      - //TODO 
     *
     * @param attributeName   - //TODO
     *
     * @return List<Employee> - Retrived Employees from Database.
     *
     * @throws //TODO
     */
    List<Employee> retrieveEmployeesByAttribute(String columnName,
                                        String attribute) throws IBookException;
}       



               

