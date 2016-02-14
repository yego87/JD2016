package by.it.novik.JD01_05;

import static java.lang.Math.*;


public class Math3 {

	
	public static void main(String[] args) {
		double x = 12.1;
		
		double deltaC = 0.5;
		double[] rangeOfC = {-10, 1};
		double c = rangeOfC[0];
		
		System.out.printf("%24s%24s%24s", "x", "c", "l");
		System.out.println("");
		
		while(c != rangeOfC[1] + deltaC) {
			double value = getValue(x, c);
			System.out.format("%24f%24f%24f", x, c, value);
			System.out.println("");
			c += deltaC;
		}
		
				
	}

	
	public static double getValue(double x, double c) {
		return pow(pow(abs(2 * x - c), 3), 1.0/5.0) + 0.567;
	}
}