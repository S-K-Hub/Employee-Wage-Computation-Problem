import java.util.Random;

public class ComputeWage {

	public int computingWage(int wagePerHour, int totalDays, int totalHours) {
		
		int random, day = 1, hour = 1, monthlyWage = 0, partTimeHours = 4, fullTimeHours = 8;
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
