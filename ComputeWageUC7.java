import java.util.Random;

public class ComputeWageUC7 {

	public int computingWage() {

		int random, day = 1, totalDays = 20, hour = 1, totalHours = 100, monthlyWage = 0, wagePerHour = 20, partTimeHours = 4, fullTimeHours = 8;
		Random rand = new Random();

		while(day < totalDays && hour < totalHours) {

			random = rand.nextInt(3);

			switch(random) {

			case 0:
				monthlyWage += 0;
				break;

			case 1:
				monthlyWage += wagePerHour * partTimeHours;
				hour += partTimeHours;
				break;

			default:
				monthlyWage += wagePerHour * fullTimeHours;
				hour += fullTimeHours;
				break;

			}

			day++;

		}

		return monthlyWage;
	}

}
