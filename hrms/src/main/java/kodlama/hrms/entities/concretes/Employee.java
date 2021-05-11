package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userid;
	
	@Column(name="employee_position")
	private String employeePosition;
	
	public Employee() {}
	
	public Employee(int userid, String employeePosition) {
		super();
		this.userid = userid;
		this.employeePosition = employeePosition;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}
}
