package com.ideas2it.ibook.controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;   
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * Display to shop menu page from login page after authentication.
 * </p>
 */
@Controller
public class HomeController { 

    /**
     * <p>
     * Displays to online shopping main menu page.
     * </p>
     *
     * @param request           - To display shop page.
     * @param response          - Displays the shop page.
     * @return ModelAndView     - It returns to shop page.
     */
    @RequestMapping("/shop") 
    public String shop(HttpServletRequest request, HttpServletResponse response) 
                                                            throws IOException {
        return "shop";
    }

    /**
     * <p>
     * Displays to online shopping main menu page.
     * </p>
     *
     * @param request           - To display shop page.
     * @param response          - Displays the shop page.
     * @return ModelAndView     - It returns to shop page.
     */
    @RequestMapping("/accessdenied") 
    public ModelAndView accessdenied(HttpServletRequest request, HttpServletResponse response) 
                                                            throws IOException {
        return new ModelAndView("errorpage", "error", "Access Denied");
    }

    /**
     * <p>
     * Displays to online shopping main menu page.
     * </p>
     *
     * @param request           - To display shop page.
     * @param response          - Displays the shop page.
     * @return ModelAndView     - It returns to shop page.
     */
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) 
                                                            throws IOException {
        return "login";
    }
}

