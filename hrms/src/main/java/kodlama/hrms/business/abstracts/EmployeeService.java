package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}
