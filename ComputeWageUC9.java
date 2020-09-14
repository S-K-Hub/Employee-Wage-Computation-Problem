import java.util.Random;

public class ComputeWageUC9 {
	
	String companyName;
	int wagePerHour, totalDays, totalHours;
	
	public ComputeWageUC9(String companyName, int wagePerHour, int totalDays, int totalHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.totalDays = totalDays;
		this.totalHours = totalHours;
	}

	public String computingWage() {
		
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
				
		return "The employee wage for " + companyName + " is " + monthlyWage;
	}

}
