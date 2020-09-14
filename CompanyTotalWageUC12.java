
public class CompanyTotalWageUC12 {

	public static void main(String[] args) {

		EmpWageBuilderArrayUC12 empWageArray = new EmpWageBuilderArrayUC12();
		empWageArray.addCompany("Google", 100, 20, 100);
		empWageArray.addCompany("Microsoft", 120, 25, 150);
		empWageArray.setWage();
		
	}

}
