import java.util.Random;

public class Attendance {

	public static void main(String[] args) {

		int isAbsent=0;
		Random rand = new Random();
		int random = rand.nextInt(2);

		if(random == isAbsent) {
			System.out.println("User is absent");
		} else {
			System.out.println("User is present");
		}

	}

}
