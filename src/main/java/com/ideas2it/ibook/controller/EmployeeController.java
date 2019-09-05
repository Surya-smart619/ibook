package com.ideas2it.ibook.controller;

/**
 *
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * <p>
     * Saves Employee
     * </p>
     *
     * @param employee - New employee to be created.
     * @param model    - To add employee as attribute.
     *
     * @return String  - which is used to dispatch to Employee Profile Page. 
     */
    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee,
                                                                  Model model) {
        model.addAttribute("employee", employeeService.saveEmployee(employee));
        return "employeeProfile";
    }

}
