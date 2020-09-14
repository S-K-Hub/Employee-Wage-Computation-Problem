public class CompanyTotalWageUC14 {

	public static void main(String[] args) {

		EmpWageBuilderArrayUC14 empWageArray = new EmpWageBuilderArrayUC14();
		empWageArray.addCompany("Google", 100, 10, 170);
		empWageArray.addCompany("Microsoft", 120, 5, 45);
		empWageArray.setWage();
		
	}

}
