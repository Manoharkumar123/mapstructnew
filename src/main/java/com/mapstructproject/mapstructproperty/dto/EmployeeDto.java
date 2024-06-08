package com.mapstructproject.mapstructproperty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	private String id;
	private String name;
	private String degignation;
	private String department;
	private String address;

}
