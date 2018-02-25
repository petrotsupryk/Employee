import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);

		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		d.add(Calendar.DAY_OF_MONTH, 1);

		System.out.println("ом  бр яп вр ор яа мд");

		for (int i = Calendar.SUNDAY; i < weekday; i++)
			System.out.println(" ");
		do {
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			if (day == today)
				System.out.print("*");
			else
				System.out.print(" ");

			if (weekday == Calendar.SUNDAY)
				System.out.println();

			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		} while (d.get(Calendar.MONTH) == month);

		if (weekday != Calendar.SUNDAY)
			System.out.println();
	}

}
