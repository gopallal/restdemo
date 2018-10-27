/**
 * 
 */
package com.gopal.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.models.Address;
import com.gopal.models.Employee;

/**
 * @author LUCK
 *
 */
@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public List<Employee> greeting() {
    	System.out.println("starting controller");
    	List<Employee> employees = new ArrayList<>();
    	Employee e = new Employee();
    	e.setFirstName("Gopal");
    	e.setId(1);
    	e.setAddress(new Address(1, "BRM College", "Nayatola, Raiser"));
    	employees.add(e);
    	System.out.println("ending controller");
        return employees;
    }
}
