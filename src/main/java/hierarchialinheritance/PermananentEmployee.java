package hierarchialinheritance;

public class PermananentEmployee extends Employee {

	private int salary;

	public void setSalary(int sal) {
		salary = sal;
	}

	public int getSalary() {
		return salary;
	}

	public void calculateSalary() {
		salary = salary + 5000;
	}
}
