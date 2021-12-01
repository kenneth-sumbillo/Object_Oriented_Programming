package ImageViewer;
import java.util.Scanner;
public class Constructor {

	String Employee1;
	int ID1;
	double Salary1;
	
	
	public Constructor(String name1,int id1, double salary1) {
		Employee1=name1;
		ID1=id1;
		Salary1=salary1;

	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1;
		int id1;
		double salary1,Taxedsalary1,Tax1;
		
		Scanner scan = new Scanner(System.in);
	
	    System.out.print("Enter first employee: ");
	    name1 = scan.nextLine();
	    System.out.print("Enter ID: ");
	    id1 = scan.nextInt();
	    System.out.print("Enter Salary: ");
	    salary1 = scan.nextDouble();

	    Tax1=salary1 * .10;
	    Taxedsalary1 = salary1 - Tax1;
	
	    Constructor myObj = new Constructor(name1,id1,Taxedsalary1);
	    System.out.println("\nData of first employee");
	    System.out.println("Name: " + myObj.Employee1);
	    System.out.println("ID: " + myObj.ID1);
	    System.out.println("Salary less tax 10%: " + myObj.Salary1);
	    
	    System.out.println("========================================");
	    System.out.print("\nEnter second employee: ");
	    name1 = scan.next();
	    System.out.print("Enter ID: ");
	    id1 = scan.nextInt();
	    System.out.print("Enter Salary: ");
	    salary1 = scan.nextDouble();

	    Tax1=salary1 * .10;
	    Taxedsalary1 = salary1 - Tax1;
	
	    Constructor myObj2 = new Constructor(name1,id1,Taxedsalary1);
	    
	    System.out.println("\nData of second employee");
	    System.out.println("Name: " + myObj2.Employee1);
	    System.out.println("ID: " + myObj2.ID1);
	    System.out.println("Salary less tax 10%: " + myObj2.Salary1);
	 
	    
	}

}
