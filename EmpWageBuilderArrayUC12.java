import java.util.ArrayList;
import java.util.Random;

public class EmpWageBuilderArrayUC12 implements ComputeWageInterfaceUC12 {

	ArrayList<CompanyInfoUC12> computeWageArray;
	int count = 0;
	
	public EmpWageBuilderArrayUC12() {
		computeWageArray = new ArrayList<CompanyInfoUC12>();
	}
	
	public void addCompany(String companyName, int wagePerHour, int totalDays, int totalHours) {
		computeWageArray.add(new CompanyInfoUC12(companyName, wagePerHour, totalDays, totalHours));
		count++;
	}
	
	public void setWage() {
		for(int i = 0; i < count; i++) {
			this.computeWage(computeWageArray.get(i));
		}
	}
	
	public void computeWage(CompanyInfoUC12 computeWage) {
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
