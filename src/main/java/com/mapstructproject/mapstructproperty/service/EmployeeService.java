package com.mapstructproject.mapstructproperty.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mapstructproject.mapstructproperty.Mapper.EmployeeMapper;
import com.mapstructproject.mapstructproperty.dto.EmployeeDto;
import com.mapstructproject.mapstructproperty.model.Employee;
import com.mapstructproject.mapstructproperty.repo.EployeeRepo;

@Service
public class EmployeeService {

	private EployeeRepo employeerepo;
	private EmployeeMapper employeemapper;

	EmployeeService(EployeeRepo employeerepo, EmployeeMapper employeemapper) {
		this.employeerepo = employeerepo;
		this.employeemapper = employeemapper;
	}

	public EmployeeDto getEmployee(String id) {
		Employee emp = employeerepo.getEmployee(id);
		return employeemapper.EmployeeTOEmployeeDto(emp);

	}

	public List<EmployeeDto> getEmployees() {
		List<Employee> emplist = employeerepo.getEmployees();
		List<EmployeeDto> empp = emplist.stream().map(this::MapEmployeeTODto).toList();
		return empp;
	}

	private EmployeeDto MapEmployeeTODto(Employee employee) {

		EmployeeDto empdto = employeemapper.EmployeeTOEmployeeDto(employee);

		return empdto;
	}

}
