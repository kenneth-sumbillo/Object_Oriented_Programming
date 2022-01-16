package Package2;

public class Voter {
	public Voter(String fullname, int age, int voterId) {
		if(age >= 18) {
			System.out.println("You are eligible for voting!, Have a great Day!");
		} else {
			System.out.println("You are not eligible for voting!");
		}
	}
}
