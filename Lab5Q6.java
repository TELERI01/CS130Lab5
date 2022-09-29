package Lab5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab5Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat format1 = new DecimalFormat("0.##");
		
		double area, discriminant, s;
		
		System.out.println("A: ");
		double a = scan.nextDouble();
		System.out.println("B: ");
		double b = scan.nextDouble();
		System.out.println("C: ");
		double c = scan.nextDouble();
		
		s = (a+b+c)/2;
		
		discriminant = s*(s-a)*(s-b)*(s-c);
		
		area = Math.sqrt(discriminant);
		
		System.out.println("The result is " + format1.format(area));
		

	}

}
