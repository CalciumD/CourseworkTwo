package coursrworktwo;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	
	private String name;
	private double pay;
	
	
	List<Employee> employee = new ArrayList<>();
	
	public Employee(String name, double pay) {
		this.name = name;
		this.pay = pay;
	}

	
	public double calculateTotalPay() {
		return pay;
	}

	
	public void add(Employee e) {
		employee.add(e);
	}
	
	public void remove(Employee e) {
		employee.remove(e);
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}

	
}
