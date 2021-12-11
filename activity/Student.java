package activity;

public class Student {

	private String studentName;
	private String studentAddress;
	private String studentPhone;
	private double [] studentGrades = new double[5];
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	public double [] getStudentGrades() {
		return studentGrades;
	}
	public void setStudentGrades(double [] studentGrades) {
		this.studentGrades = studentGrades;
	}
}
