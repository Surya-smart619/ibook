package com.ideas2it.ibook.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.Transaction; 
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;  
import org.springframework.beans.factory.annotation.Autowired;

import com.ideas2it.ibook.dao.EmployeeDao;
import com.ideas2it.ibook.model.Employee;

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
        List<Employee> employeeDetail = new ArrayList<>(); 
        try{ 
            session = sessionFactory.openSession(); 
            System.out.println("********************DAO REACHED*****************************");   
            Query query = session.createQuery("from Employee where employee_code = :employeeCode");
            System.out.println("********************DAO REACHED*****************************");   
            query.setParameter("employeeCode", employeeCode);
            employeeDetail = (List<Employee>) query.list();
        } catch (Exception e) {
            System.out.println("+++++++++++++++" + e);
        } finally {
           closeSession(session);
        }
        return employeeDetail;
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

  

               

