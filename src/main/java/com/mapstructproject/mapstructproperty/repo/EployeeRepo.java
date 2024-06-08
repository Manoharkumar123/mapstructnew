package com.mapstructproject.mapstructproperty.repo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.mapstructproject.mapstructproperty.model.EmpAddress;
import com.mapstructproject.mapstructproperty.model.Employee;

@Component
public class EployeeRepo {
	   EmpAddress address1=new EmpAddress("sudamdih","828126","Dhanbad");
	   EmpAddress address2=new EmpAddress("kamrajnager","6000666","Chennai");
	   Employee emp1=new Employee("1","sanjay","clork","vechile",address1);
	   Employee emp2=new Employee("2","manoj","teacher","arts",address2);
	   List<Employee> employeelist= Arrays.asList(emp1,emp2);
  
   public  Employee getEmployee(String id) {
	   
	   
	   Optional<Employee> emp= employeelist.stream().filter(i->i.getId().equals(id)).findFirst();
			   
	   return emp.get();
	
   }
   
   public List<Employee> getEmployees(){
	   return employeelist;
	   
   }
   
	
	}


