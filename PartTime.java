import java.util.Random;

public class PartTime {

	public static void main(String[] args) {

		int random, isAbsent = 0, dailyWage, isPartTime = 1, wagePerHour = 20, partTimeHours = 4, fullTimeHours = 8;
		Random rand = new Random();
		random = rand.nextInt(3);

		if(random == isAbsent) {
			System.out.println("User is absent");
			dailyWage = 0;
		} else if(random == isPartTime) {
			System.out.println("User is present");
			dailyWage = wagePerHour * partTimeHours;
		} else {
			System.out.println("User is pressnt");
			dailyWage = wagePerHour * fullTimeHours;
		}

		System.out.println("Daily wage = " + dailyWage);

	}

}
