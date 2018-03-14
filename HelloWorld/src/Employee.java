import java.util.*;
import java.util.Date;

public class Employee {
	// designer
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}

	public Employee(double s) {
		// виклик конструктора Employee(String)
		this("Employee #" + nextId, s);
	}

	// конструктор по замовчуванню
	public Employee() {
	}

	// method 1
	public String getName() {
		return name;
	}

	// method 2
	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPersent) {
		double raise = salary * byPersent / 100;
		salary += raise;
	}

	public int getId() {
		return id;
	}

	// method 3
	public void setId() {
		id = nextId;
		nextId++;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}

	// instance fields
	private String name;
	private double salary;
	// private Date hireDay;
	private int id;
	private static int nextId = 1;

	// статичний блок ініціалізації
	static {
		Random generator = new Random();
		// задаєм nextId як випадкове число від 0 до 9999
		nextId = generator.nextInt(10000);
	}
	
	{
		id=nextId;
		nextId++;
	}
}