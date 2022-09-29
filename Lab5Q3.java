package Lab5;

import java.util.Random;

public class Lab5Q3 {

	public static void main(String[] args) {
		Random generator = new Random();
		
		int randNum = generator.nextInt(4, 20) + 1;
		
		System.out.println("The Random Number is: " + randNum);
		

	}

}
