package com.ikn.rms.employee.VO;

import java.util.List;

import com.ikn.rms.employee.entity.Employee;

import lombok.Data;

@Data
public class EmployeeListVO {
	
	private List<Employee> employee;
	
}
