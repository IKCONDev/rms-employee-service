package com.ikn.rms.employee.service;

import java.util.List;

import com.ikn.rms.employee.VO.EmployeeVO;
import com.ikn.rms.employee.entity.Employee;

public interface EmployeeService {
	
	EmployeeVO fetchEmployeeDetailsWithDepartment(String email);
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Integer employeeId);
	EmployeeVO getEmployeeWithDepartment(Integer employeeId);
	//get all UMS employee profiles
	List<Employee> getAllEmployees();
	//save all users by fetching details from organization azure active directory
//	Integer saveAzureUsers();
	//save single user from azure
//	String saveAzureUser(String azureUserPrincipalName);
	//search employee count by their username
//	Integer searchEmployeeByEmail(String email);
	boolean checkIfEmployeeExists(String employeeEmailId);
	boolean deleteAllEmployeesById(List<Integer> employeeIds);
	List<Employee> getEmployeeReporteesData(String emailId);
	List<Employee> getAllEmployeesWithUserStatus(boolean isUser);
	void updateEmployeeStatus(String email);
	void updateEmployeeStatustoFalse(String email);
	List<Employee> getAllEmployeesByEmailIds(List<String> emailIds);
	boolean getEmployeesByEmployeeOrgId(String employeeOrgId);
	
}
