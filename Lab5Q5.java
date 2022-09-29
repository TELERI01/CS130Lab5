package Lab5;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Lab5Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double discriminant, d;
		
		System.out.println("X1: ");
		double x1 = scan.nextDouble();
		System.out.println("X2: ");
		double x2 = scan.nextDouble();
		System.out.println("Y1: ");
		double y1 = scan.nextDouble();
		System.out.println("Y2: ");
		double y2 = scan.nextDouble();
		
		discriminant = (Math.pow((x2-x1),2))+(Math.pow((y2-y1),2));
		
		d = (Math.sqrt(discriminant));
		
		DecimalFormat format1 = new DecimalFormat("0.##");
		
		System.out.println("The Distance between points 12.0, 24.0 and 67.0, 89.0 is " + format1.format(d));
		
		
		
		
		

	}

}
