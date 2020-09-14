
public class CompanyTotalWageUC11 {

	public static void main(String[] args) {

		EmpWageBuilderArrayUC11 empWageArray = new EmpWageBuilderArrayUC11();
		empWageArray.addCompany("Google", 100, 20, 100);
		empWageArray.addCompany("Microsoft", 120, 25, 150);
		empWageArray.setWage();
		
	}

}
