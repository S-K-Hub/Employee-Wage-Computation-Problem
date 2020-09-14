import java.util.ArrayList;
public class CompanyInfoUC14 {
	
	String companyName;
	int wagePerHour, totalDays, totalHours, totalWages;
	ArrayList<Integer> dailyWages = new ArrayList<Integer>();
	
	public CompanyInfoUC14(String companyName, int wagePerHour, int totalDays, int totalHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.totalDays = totalDays;
		this.totalHours = totalHours;
	}
	
	public CompanyInfoUC14() {
		
	}
	
	public void setTotalWage(int totalWage) {
		totalWages = totalWage;
	}

}
