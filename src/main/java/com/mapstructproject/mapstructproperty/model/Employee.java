package com.mapstructproject.mapstructproperty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String id;
	private String name;
	private String degignation;
	private String department;
	private EmpAddress empaddress;
}
