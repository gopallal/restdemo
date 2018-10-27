package com.gopal.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gopal.models.Address;
import com.gopal.models.Employee;


@Controller
public class EmployeeMvcController {

	public EmployeeMvcController() {

	}

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String getEmployeeList(ModelMap modelMap) {
    	System.out.println("starting controller");
    	List<Employee> employees = new ArrayList<>();
    	Employee e = new Employee();
    	e.setFirstName("Gopal");
    	e.setId(1);
    	e.setAddress(new Address(1, "BRM College", "Nayatola, Raiser"));
    	employees.add(e);
    	modelMap.put("employee", e);
    	System.out.println("ending controller");
        return "welcome.jsp";
    }
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
    public String getEmployeeLis(ModelMap modelMap) {
    	System.out.println("starting controller");
    	List<Employee> employees = new ArrayList<>();
    	Employee e = new Employee();
    	e.setFirstName("Gopal");
    	e.setId(1);
    	e.setAddress(new Address(1, "BRM College", "Nayatola, Raiser"));
    	employees.add(e);
    	modelMap.put("employee", e);
    	System.out.println("ending controller");
        return "welcome.jsp";
    }
}
