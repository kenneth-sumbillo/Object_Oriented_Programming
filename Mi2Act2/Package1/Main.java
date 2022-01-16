package Package1;
import java.util.Scanner;
import Package2.Voter;
public class Main extends Voter {
	String Fullname;
	int Age, VoterId;
	
	public Main(String fullname, int age, int voterId) {
		super(fullname, age, voterId);
		// TODO Auto-generated constructor stub
		Fullname = fullname;
		Age = age;
		VoterId = voterId;
	}

	public static void main(String[] args) {
		String fullname;
		int age, voterId;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter full name: ");
		fullname = scan.nextLine();
		System.out.println("Enter age: ");
		age = scan.nextInt();
		System.out.println("Enter Voter ID: ");
		voterId = scan.nextInt();
		
		Main voter = new Main(fullname, age, voterId);
		
		System.out.println("\n[INFO]");
		System.out.println("Name: " + voter.Fullname);
		System.out.println("Age: " + voter.Age);
		System.out.println("Voter ID: " + voter.VoterId);
	}
}
