package activity;

import java.util.*;

public class Main {

	static String studentName, studentPhone, studentAddress = "";		
	static double studentMathGrade, studentEnglishGrade, studentScienceGrade, studentFilipinoGrade, studentTLEGrade = 0.00;
	static String [] studentSubjects = {"Math", "English", "Science", "Filipino", "TLE"};
	static double [] studentGrades =  new double[5];
	
	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n------Enter Student Data -------");
		System.out.println("\nEnter Student Name : ");
		studentName = input.nextLine();
		
		System.out.println("\nEnter Student Phone : ");
		studentPhone = input.nextLine();
		
		System.out.println("\nEnter Student Address : ");
		studentAddress = input.nextLine();
		
		System.out.println("\nEnter Student Grade for Math :");
		studentMathGrade = input.nextDouble();
		
		System.out.println("\nEnter Student Grade for English :");
		studentEnglishGrade = input.nextDouble();
		
		System.out.println("\nEnter Student Grade for Science :");
		studentScienceGrade = input.nextDouble();
		
		System.out.println("Enter Student Grade for Filipino :");
		studentFilipinoGrade = input.nextDouble();
		
		System.out.println("Enter Student Grade for TLE :");
		studentTLEGrade = input.nextDouble();
		
		input.close();
		
		studentGrades[0] = studentMathGrade;
		studentGrades[1] = studentEnglishGrade;
		studentGrades[2] = studentScienceGrade;
		studentGrades[3] = studentFilipinoGrade;
		studentGrades[4] = studentTLEGrade;
		
		student.setStudentName(studentName);
		student.setStudentPhone(studentPhone);
		student.setStudentAddress(studentAddress);
		student.setStudentGrades(studentGrades);
		
		printStudentGrade(student);
	}

	public static void printStudentGrade(Student student) {
		
		System.out.println("\n\n------ Student Data -------");
		
		System.out.println("Student Name : " + student.getStudentName());
		System.out.println("Student Phone Number : " + student.getStudentPhone());
		System.out.println("Student Address : " + student.getStudentAddress());
		
		double [] studentGrades = student.getStudentGrades();
		
		System.out.println("Student Grades");
		for(int gradeCounter = 0 ; gradeCounter < studentGrades.length ; gradeCounter++)
		{
			System.out.println(studentSubjects[gradeCounter] + " : " + studentGrades[gradeCounter]);
		}
	}
}
