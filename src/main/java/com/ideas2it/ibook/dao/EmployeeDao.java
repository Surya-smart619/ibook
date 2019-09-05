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
     * Inserts Employee
     *
     * @param employee  - Employee to be created.
     *
     * @return employee - Created employee with employee code.
     *
     * @return //TODO
     */
    Employee insertEmployee(Employee employee) throws IBookException;
}       



               

