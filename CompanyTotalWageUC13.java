
public class CompanyTotalWageUC13 {

	public static void main(String[] args) {

		EmpWageBuilderArrayUC13 empWageArray = new EmpWageBuilderArrayUC13();
		empWageArray.addCompany("Google", 100, 10, 170);
		empWageArray.addCompany("Microsoft", 120, 5, 45);
		empWageArray.setWage();
		
	}

}
