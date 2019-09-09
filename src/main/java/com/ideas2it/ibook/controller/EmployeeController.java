package com.ideas2it.ibook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ideas2it.ibook.service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    /**
     * <p>
     * Display the create form page.
     * </p>
     *
     * @param request        - To display the create form page.
     * @param response       - Display the create form page.
     * @return ModelAndView  - It returns to create role form page.
     */
    @Secured("ROLE_ADMIN")
    @RequestMapping(value="/createRole",method = RequestMethod.GET)
    public ModelAndView createRole(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return new ModelAndView("createrole", "role", new Role()); 
    }

}
