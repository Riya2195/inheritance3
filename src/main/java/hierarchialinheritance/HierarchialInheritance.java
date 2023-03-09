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
		
		

	}

}
