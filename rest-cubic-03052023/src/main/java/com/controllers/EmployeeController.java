package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.EmployeeEntity;
import com.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/") // default page
	String displayRegistrationPage() {

		return "registration";

	}

	@PostMapping("/register")
	String doRegistration(@ModelAttribute EmployeeEntity employeeEntity) {

		// System.out.println(employeeEntity);

		employeeService.saveEmployee(employeeEntity);

		return "registration";

	}
	
	
	@GetMapping("/login") // default page
	String displayLogin() {
		return "login";

	}
	
	@PostMapping("/login")

	String doLogin(@RequestParam String email, @RequestParam String pswd, Model model) {

		EmployeeEntity employeeEntity = employeeService.authenticate(email, pswd);

		if (employeeEntity != null) {

			model.addAttribute("employee", employeeEntity);

			return "congrates";

		} else {
			model.addAttribute("loginMsg", "sorry..plz try again");

			return "login";
		}

	}
	
	@GetMapping("/findAllEmployee")
	String displayAllEmployee(Model model) {
		
		List<EmployeeEntity> employeeEntityList=employeeService.findAllEmployee();
		
		model.addAttribute("listOfEmployee", employeeEntityList);
		

		return "showAll";

	}
	
	@GetMapping("/deleteEmployee")
	String deleteEmployee(@RequestParam int employeeId,Model model) {
		
		employeeService.deleteEmp(employeeId);
		

		return "redirect:findAllEmployee";

	}
	
	@GetMapping("/showEditForm")
	String showEditForm(@RequestParam int employeeId,Model model) {
		
		EmployeeEntity employeeEntity=employeeService.findByEmployeeId(employeeId);
		model.addAttribute("employee", employeeEntity);	
		return "editForm";
	}
	
	@PostMapping("/UpdateEmployee")
	String doUpdate(@ModelAttribute EmployeeEntity employeeEntity) {

		employeeService.updateEmployee(employeeEntity);
		return "redirect:findAllEmployee";

	}

	
	
	
}
