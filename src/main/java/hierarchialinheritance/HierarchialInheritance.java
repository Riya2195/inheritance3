package hierarchialinheritance;

public class HierarchialInheritance {

	public static void main(String[] args) {
		PermananentEmployee p = new PermananentEmployee();
		p.setEmployeeId(11);
		p.setEmployeeName("Riya");
		p.setSalary(39000);

		System.out.println("Name is " + p.getEmployeeId());
		System.out.println("Employee id is " + p.getEmployeeId());
		System.out.println("Salary is " + p.getSalary());
		p.calculateSalary();
		System.out.println("Salary is " + p.getSalary());

		ContractEmployee c = new ContractEmployee();
		c.setEmployeeId(23);
		c.setEmployeeName("Aibin");
		c.setPayrollCompany("Tech");
		c.setSalary(120000);

		System.out.println();
		
		System.out.println("Name  is " + c.getEmployeeName());
		System.out.println("Employee Id" + c.getEmployeeId());
		System.out.println("PayrollCompany is" + c.getPayrollCompany());
		System.out.println("Salary is " + c.getSalary());
		c.calaculateSalary();
		System.out.println("Salary is " + c.getSalary());

	}

}
