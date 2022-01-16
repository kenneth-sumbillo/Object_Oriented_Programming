package activity;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		int choice;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- Area of Geometry Shapes ---");
		System.out.println("[1] Triangle");
		System.out.println("[2] Rectangle");
		System.out.println("[3] Parallelogram");
		System.out.println("[4] Circle");
		System.out.println("Choice: ");
		choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("[Solving Area of Triangle]\n");
			System.out.println("Enter base: ");
			int base = scan.nextInt();
			System.out.println("Enter height: ");
			int height = scan.nextInt();
			
			Triangle tri = new Triangle();
			tri.setBase(base);
			tri.setHeight(height);
			
			System.out.println("Area: " + calc.areaOfTriangle(tri.getBase(), tri.getHeight()));
			break;
		case 2:
			System.out.println("[Solving Area of Rectangle]\n");
			System.out.println("Enter width: ");
			int width = scan.nextInt();
			System.out.println("Enter length: ");
			int length = scan.nextInt();
			
			Rectangle rect = new Rectangle();
			rect.setWidth(width);
			rect.setLength(length);
			
			System.out.println("Area: " + calc.areaOfRectangle(rect.getLength(), rect.getWidth()));
			break;
		case 3:
			System.out.println("[Solving Area of Parallelogram]\n");
			System.out.println("Enter base: ");
			int base1 = scan.nextInt();
			System.out.println("Enter height: ");
			int height1 = scan.nextInt();
			
			Parallelogram par = new Parallelogram();
			par.setBase(base1);
			par.setHeight(height1);
			
			System.out.println("Area: " + calc.areaOfParallelogram(par.getBase(), par.getHeight()));
			break;
		case 4:
			System.out.println("[Solving Area of Circle]\n");
			System.out.println("Enter radius: ");
			int radius = scan.nextInt();
			
			Circle cir = new Circle();
			cir.setRadius(radius);
			
			System.out.println("Area: " + calc.areaOfCircle(cir.getRadius()));
			break;
		default: 
			break;
		}
	}
}
