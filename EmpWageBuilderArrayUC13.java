import java.util.ArrayList;
import java.util.Random;

public class EmpWageBuilderArrayUC13 implements ComputeWageInterfaceUC13 {

	ArrayList<CompanyInfoUC13> computeWageArray;
	ArrayList<Integer> dailyWageArray;
	int count = 0;
	
	public EmpWageBuilderArrayUC13() {
		computeWageArray = new ArrayList<CompanyInfoUC13>();
	}
	
	public void addCompany(String companyName, int wagePerHour, int totalDays, int totalHours) {
		computeWageArray.add(new CompanyInfoUC13(companyName, wagePerHour, totalDays, totalHours));
		count++;
	}
	
	public void setWage() {
		for(int i = 0; i < count; i++) {
			computeWageArray.get(i).setTotalWage(this.computeWage(computeWageArray.get(i)));
		}
	}
	
	public int computeWage(CompanyInfoUC13 computeWage) {
		int random, day = 1, hour = 1, monthlyWage = 0, partTimeHours = 4, fullTimeHours = 8, dailyWage;
		Random rand = new Random();
		
		while(day <= computeWage.totalDays && hour <= computeWage.totalHours) {
			
			random = rand.nextInt(3);
			
			switch(random) {
		
			case 0: 
				monthlyWage += 0;
				dailyWage = 0;
				break;
			
			case 1:
				monthlyWage += computeWage.wagePerHour * partTimeHours;
				dailyWage = computeWage.wagePerHour * partTimeHours;
				hour += partTimeHours;
				break;
			
			default:
				monthlyWage += computeWage.wagePerHour * fullTimeHours;
				dailyWage = computeWage.wagePerHour * fullTimeHours;
				hour += fullTimeHours;
				break;
			
			}
			
			System.out.println("Wage of day " + day + " of " + computeWage.companyName + " is " + dailyWage);
			day++;
		
		}
		
		System.out.println("Monthly wage of " + computeWage.companyName + " is " + monthlyWage);
		return monthlyWage;
				
	}
	
}
