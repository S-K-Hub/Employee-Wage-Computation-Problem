import java.util.ArrayList;
public class CompanyInfoUC13 {
	
	String companyName;
	int wagePerHour, totalDays, totalHours, totalWage;
	ArrayList<Integer> dailyWages = new ArrayList<Integer>();
	
	public CompanyInfoUC13(String companyName, int wagePerHour, int totalDays, int totalHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.totalDays = totalDays;
		this.totalHours = totalHours;
	}
	
	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	

}
