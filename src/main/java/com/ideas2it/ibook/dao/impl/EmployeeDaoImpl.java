package com.ideas2it.ibook.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.Transaction; 
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.ideas2it.ibook.util.IBookException;

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
    public List<Employee> retrieveEmployeeByEmployeeCode(String employeeCode)
                                                         throws IBookException {
        try(Session session = sessionFactory.openSession()) { 
            Query query = session.createQuery("from Employee where EMPLOYEE_CODE = :employeeCode");
            query.setParameter("employeeCode", employeeCode);
            return (List<Employee>)query.list();
        } catch(HibernateException exception) {
            throw new IBookException("Failed to retrive employee", exception);
        }
    }

    @Override
    public Employee insertEmployee(Employee employee) throws IBookException {
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            return employee;
        } catch(HibernateException exception) {
            throw new IBookException("Failed to create employee", exception);
        }
    }

    @Override
    public Employee updateEmployee(Employee employee) throws IBookException {
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
            return employee;
        } catch(HibernateException exception) {
            throw new IBookException(
                    String.Format("Failed to Update employee, Employee Code: %s", employee.getEmployeeCode()),
                    exception
            );
        }
    }

    @Override
    public List<Employee> retrieveEmployeesByAttribute(String columnName,
                                       String attribute) throws IBookException {
        try(Session session = sessionFactory.openSession()) {
            Criteria criteria = session.createCriteria(Employee.class);
            criteria
                .add(Restrictions.like(columnName, attribute,
                                                           MatchMode.ANYWHERE));
            return (List<Employee>)criteria.list();
        catch(HibernateException exception) {
            throw new IBookException(
                    String.Format("Failed to fetch Employee's : %s", name),
                    exception
            );
        }
    }
}

  

               

