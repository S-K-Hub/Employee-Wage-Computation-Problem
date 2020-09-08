import java.util.Random;

public class SwitchCase {

	public static void main(String[] args) {

		int random, isAbsent = 0, dailyWage, isPartTime = 1, wagePerHour = 20, partTimeHours = 4, fullTimeHours = 8;
		Random rand = new Random();
		random = rand.nextInt(3);

		switch(random) {
		case 0:
			System.out.println("Employee is absent");
			dailyWage = 0;
			break;

		case 1:
			System.out.println("Employee is present");
			dailyWage = wagePerHour * partTimeHours;
			break;

		default:
			System.out.println("Employee is present");
			dailyWage = wagePerHour * fullTimeHours;
			break;

		}

		System.out.println("Daily wage = " + dailyWage);

	}

}
