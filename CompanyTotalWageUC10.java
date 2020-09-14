
public class CompanyTotalWageUC10 {

	public static void main(String[] args) {

		EmpWageBuilderArrayUC10 empWageArray = new EmpWageBuilderArrayUC10();
		empWageArray.addCompany("Google", 100, 20, 100);
		empWageArray.addCompany("Microsoft", 120, 25, 150);
		empWageArray.setWage();
		
	}

}
