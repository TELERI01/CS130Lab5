package Lab5;
import java.text.NumberFormat;
import java.util.Locale;


public class Lab5Q2 {

	public static void main(String[] args) {
		NumberFormat n1 = NumberFormat.getCurrencyInstance();
		NumberFormat n2 = NumberFormat.getPercentInstance();
		
		double p1 = 2.99;
		double p2 = 0.1;
		
		System.out.println("Oil price of Kentucky is: " + n1.format(p1));
		System.out.println("The oil price increased by " + n2.format(p2).concat(" than last year."));

	}

}
