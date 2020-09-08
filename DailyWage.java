import java.util.Random;

public class DailyWage {

	public static void main(String[] args) {

		int random, isAbsent = 0, dailyWage, wagePerHour = 20, hours = 8;
		Random rand = new Random();
		random = rand.nextInt(2);

		if(random == isAbsent) {
			System.out.println("User is absent");
			dailyWage = 0;
		} else {
			System.out.println("User is present");
			dailyWage = wagePerHour * hours;
		}

		System.out.println("Daily wage = " + dailyWage);

	}

}
