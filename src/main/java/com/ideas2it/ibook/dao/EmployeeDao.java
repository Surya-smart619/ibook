package com.ideas2it.ibook.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session; 

import com.ideas2it.shopping.model.Role;
import com.ideas2it.shopping.common.ShopException;

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
    void getEmployeeByEmployeeCode(String employeeCode);

    /**
     * <p>
     * Closing the session with try-catch block.
     * </p>
     *
     * @param session - Session to be closed.
     */
    void closeSession(Session session);
}       



               

