package Lab5;

enum Days{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};



public class Lab5Q4 {

	public static void main(String[] args) {
		Days d1 = Days.Monday;
		Days d2 = Days.Tuesday;
		Days d3 = Days.Wednesday;
		Days d4 = Days.Thursday;
		Days d5 = Days.Friday;
		Days d6 = Days.Saturday;
		Days d7 = Days.Sunday;
		
		System.out.println("Day1: " + d1.ordinal());
		System.out.println("Day2: " + d2.ordinal());
		System.out.println("Day3: " + d3.ordinal());
		System.out.println("Day4: " + d4.ordinal());
		System.out.println("Day5: " + d5.ordinal());
		System.out.println("Day6: " + d6.ordinal());
		System.out.println("Day7: " + d7.ordinal());
		

	}

}
