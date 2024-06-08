package com.mapstructproject.mapstructproperty.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapstructproject.mapstructproperty.dto.EmployeeDto;
import com.mapstructproject.mapstructproperty.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@RestController
@RequestMapping("/employee")
public class MapstructpropertyController {
	private EmployeeService employeeservice;

	@GetMapping("/employee/{id}")
	public EmployeeDto getEmployee(@PathVariable String id) {
		EmployeeDto emp = employeeservice.getEmployee(id);
		System.out.println(emp.getAddress());
		return emp;
	}

	@GetMapping("/employees")
	public List<EmployeeDto> getEmployee() {
		List<EmployeeDto> emp = employeeservice.getEmployees();
		return emp;
	}
	

}
