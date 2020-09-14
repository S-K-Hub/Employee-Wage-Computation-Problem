import java.util.Random;

public class EmpWageBuilderArrayUC10 {

	CompanyInfoUC10[] computeWageArray;
	int count = 0;
	
	public EmpWageBuilderArrayUC10() {
		computeWageArray = new CompanyInfoUC10[2];
	}
	
	public void addCompany(String companyName, int wagePerHour, int totalDays, int totalHours) {
		computeWageArray[count] = new CompanyInfoUC10(companyName, wagePerHour, totalDays, totalHours);
		count++;
	}
	
	public void setWage() {
		for(int i = 0; i < count; i++) {
			this.computeWage(computeWageArray[i]);
		}
	}
	
	public void computeWage(CompanyInfoUC10 computeWage) {
		int random, day = 1, hour = 1, monthlyWage = 0, partTimeHours = 4, fullTimeHours = 8;
		Random rand = new Random();
		
		while(day < computeWage.totalDays && hour < computeWage.totalHours) {
			
			random = rand.nextInt(3);
			
			switch(random) {
		
			case 0: 
				monthlyWage += 0;
				break;
			
			case 1:
				monthlyWage += computeWage.wagePerHour * partTimeHours;
				hour += partTimeHours;
				break;
			
			default:
				monthlyWage += computeWage.wagePerHour * fullTimeHours;
				hour += fullTimeHours;
				break;
			
			}
			
			day++;
		
		}
		
		System.out.println("Employee wage of " + computeWage.companyName + " is " + monthlyWage);
				
	}
	
}
