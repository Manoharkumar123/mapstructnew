package com.mapstructproject.mapstructproperty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpAddress {
	private String village;
	private String postalpin;
	private String dist;
}
