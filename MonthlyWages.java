import java.util.Random;

public class MonthlyWages {

	public static void main(String[] args) {

		int random, day = 1, totalDays = 20, monthlyWage = 0, wagePerHour = 20, partTimeHours = 4, fullTimeHours = 8;
		Random rand = new Random();

		while(day <= totalDays) {

			random = rand.nextInt(3);

			switch(random) {

			case 0:
				monthlyWage += 0;
				break;

			case 1:
				monthlyWage += wagePerHour * partTimeHours;
				break;

			default:
				monthlyWage += wagePerHour * fullTimeHours;
				break;

			}

			day++;

		}

		System.out.println("Monthly wage = " + monthlyWage);

	}

}
