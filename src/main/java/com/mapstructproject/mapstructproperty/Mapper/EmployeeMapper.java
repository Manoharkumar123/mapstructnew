package com.mapstructproject.mapstructproperty.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.mapstructproject.mapstructproperty.dto.EmployeeDto;
import com.mapstructproject.mapstructproperty.model.EmpAddress;
import com.mapstructproject.mapstructproperty.model.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);

	@Mapping(source = "empaddress", target = "address", qualifiedBy = villegeToaddressMapper.class)
	EmployeeDto EmployeeTOEmployeeDto(Employee employee);

	@villegeToaddressMapper
	public default String villegeToaddress(EmpAddress empaddress) {
		return empaddress.getVillage() + empaddress.getDist() + empaddress.getPostalpin() + empaddress.getPostalpin();

	}

}
