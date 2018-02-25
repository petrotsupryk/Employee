import java.util.*;
import java.util.Date;
public class Employee {
	// �����������
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay=calendar.getTime();
	}
//����� 1
	public String getName() {
		return name;
	}
		//����� 2
	public double getSalary()
	{
		return salary;
	}
	//����� 3
	public Date getHireDay()
	{
		return hireDay;
	}
	public void raiseSalary(double byPercent)
	{
		double raise=salary*byPercent/100;
		salary+=raise;
	}
		
		// ���� ����������
		private String name;
		private double salary;
		private Date hireDay;
	
	
}
