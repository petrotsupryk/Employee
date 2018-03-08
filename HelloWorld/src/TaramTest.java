
public class TaramTest {

	public static void main(String[] args) {
		/*
		 * Test 1: Methods can not change the parameters of the variables
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent = " + percent);
		tripleValue(percent);
		System.out.println("After: percent = " + percent);

		/*
		 * Methods can change the state of objects that are passed as parameters
		 */
		System.out.println("\nTesting tripleSalary");
		Employee harry = new Employee("Harry", 50000);
		System.out.println("Before: salary = " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary = " + harry.getSalary());

		/*
		 * Methods can not attribute new objects to parameters that are references to
		 * objects
		 */
		System.out.println("\nTesting swap");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("Before: a= " + a.getName());
		System.out.println("Before: b= " + b.getName());
		swap(a, b);
		System.out.println("After: a= " + a.getName());
		System.out.println("After: b= " + b.getName());
	}

	public static void tripleValue(double x) // does not work
	{
		x = x * 3;
		System.out.println("End of Method: x= " + x);
	}

	public static void tripleSalary(Employee x) // work 
	{
		x.raiseSalary(200);
		System.out.println("End of Method: salary= " + x.getSalary());
	}

	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of meyhod: x= " + x.getName());
		System.out.println("End of meyhod: y= " + y.getName());

	}

}
