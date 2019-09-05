package com.ideas2it.ibook.security;

import java.util.Set;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;   
import org.springframework.stereotype.Component;   

import com.ideas2it.ibook.dao.impl.EmployeeServiceImpl;// TODO Location for user login
import com.ideas2it.ibook.dao.EmployeeService; // TODO Location for user login
import com.ideas2it.ibook.model.Employee; // TODO CHECK AVAILABLE
import com.ideas2it.ibook.model.Role; //TODO CHECK AVAILABLE
import com.ideas2it.ibook.model.UserLogin; //TODO CHECK AVAILABLE

/**
 * <p> 
 * Validation of employee code and employee password while logging in.
 * </p>
 *
 * @author Tharun
 * @date   05/09/2019
 */
@Component 
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private EmployeeDao employeeDao;

    /** 
     * <p>
     * Authenticate the user name and password. 
     * </p>
     *
     * @param authentication           - Authentication object which is used to 
                                         get username and password from login page. 
     * @throws AuthenticationException - Exception occurred while authentication fails.
     */
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String employeeCode = authentication.getName();
        String employeePassword = authentication.getCredentials().toString();

        System.out.println("===========================================");
        System.out.println("  employeeCode " + employeeCode + " employeePassword " + employeePassword);
        System.out.println("===========================================");

        Employee employee = employeeService.getEmployeeByEmployeeCode(employeeCode); //TODO CHECK THE METHOD NAME
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(employee.getUserLogin().getRole().getName()));

        System.out.println("===========================================");
        System.out.println(" ROLES " + employee.getUserLogin().getRole().getName() + " AUTHORITY " + grantedAuthorities);
        System.out.println("===========================================");

        if (!employee.getUserLogin().getPassword().equals(employeePassword)) {
            throw new BadCredentialsException("Login failed due to invalid EmpCode or Password");
        } 
        return new UsernamePasswordAuthenticationToken(employee, employeePassword, grantedAuthorities);
    }


    @Override
    public boolean supports(Class<? extends Object> authentication) {
        return true;
    }
}
