package com.ideas2it.ibook.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.Transaction; 
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;  
import org.springframework.beans.factory.annotation.Autowired;

//TODO exception handling

/**
 * <p> 
 * Performing the database related operations.
 * </p>
 *
 * @author Tharun
 * @date   19/06/2019
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
 	
    @Autowired
    private SessionFactory sessionFactory;
 
   /** 
    * <p>
    * Getting the employee detail by employee code
    * </p>
    *
    * @param employeeCode           - Code to retrieve employee detail. 
    * @exception HibernateException - Exception occurred while getting employee
                                      detail by employee code.
    */
    public List<Employee> retrieveEmployeeByEmployeeCode(String employeeCode) {
        Session session = null;
        try{ 
            session = sessionFactory.openSession();    
            Query query = session.createQuery("from Employee where EMPLOYEE_CODE = :employeeCode");
            query.setParameter("employeeCode", employeeCode);
            return (List<Employee>) query.list();
        } catch (HibernateException e) {
            System.out.println("Failed to create user");
        } finally {
           closeSession(session);
        }
    }

    /**
     * <p>
     * Closing the session with try-catch block.
     * </p>
     *
     * @param session - Session to be closed.
     */
    public void closeSession(Session session) {
        try { 
           session.close();
        } catch (HibernateException e) {
            System.out.println("Exception occured at session closing");
        }
    }
}

  

               

