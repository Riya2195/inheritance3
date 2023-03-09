package hierarchialinheritance;

public class ContractEmployee extends Employee {

	private int salary;
	private String payrollcompany;

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setPayrollCompany(String payrollcompany) {

		this.payrollcompany = payrollcompany;
	}

	public int getSalary() {
		return salary;
	}

	public String getPayrollCompany() {
		return payrollcompany;
	}

	public void calaculateSalary() {
		salary = salary + 2000;
	}

}
