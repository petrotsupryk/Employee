
public class EmployeeTest {

	public static void main(String[] args) {
		Employee [] staff=new Employee[3];
		staff [0]=new Employee("Roman", 12000,2010,8,5);
		staff[1]=new Employee("Oksana", 4000, 2008, 1, 30);
		staff[2]=new Employee("Volodya", 1000, 2005, 3, 25);
		
		for(Employee e: staff)
		{
			e.raiseSalary(5);
		}
		
		for(Employee e: staff)
		{
			System.out.println("імя = "+e.getName()+" зарплата = "+e.getSalary()+" дата найму на роботу = "+e.getHireDay());
		}
System.out.println("Enter Change");
	}

}
