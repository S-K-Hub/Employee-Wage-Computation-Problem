
public class CompanyTotalWageUC9 {

	public static void main(String[] args) {

		ComputeWageUC9 google = new ComputeWageUC9("Google", 100, 25, 140);
		System.out.println(google.computingWage());
		
		ComputeWageUC9 microsoft = new ComputeWageUC9("Microsoft", 90, 20, 110);
		System.out.println(microsoft.computingWage());
		
	}

}
