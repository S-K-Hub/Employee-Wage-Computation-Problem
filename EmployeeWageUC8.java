import java.util.Scanner;

public class EmployeeWageUC8 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter wage per hour: ");
		int wagePerHour = scanner.nextInt();
		System.out.println("Enter total working days in a month: ");
		int totalDays = scanner.nextInt();
		System.out.println("Enter total working hours per month: ");
		int totalHours = scanner.nextInt();
		ComputeWage computeWage = new ComputeWage();
		System.out.println("Employee monthly wage is " + computeWage.computingWage(wagePerHour, totalDays, totalHours));

	}

}
