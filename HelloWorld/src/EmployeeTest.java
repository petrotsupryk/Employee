
public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Roman", 12000);
		staff[1] = new Employee("Oksana", 4000);
		staff[2] = new Employee("Volodya", 1000);

		for (Employee e : staff) {
			e.setId();
		}

		for (Employee e : staff) {
			System.out.println("імя = " + e.getName() + " id= " + e.getName() + " зарплата = " + e.getSalary());
		}
		
		int n=Employee.getNextId(); //call a static field

	}

}
