package by.it.novik.JD01_05;

import static java.lang.Math.*;

public class Math4 {

	public static void main(String[] args) {
		double t = 2;
		double deltaT = 0.1;
		
		System.out.printf("%16s%16s", "t", "m");
		System.out.println("");
		
		while(t <= 3) {
			System.out.printf("%16f%16f", t, getValue(t));
			System.out.println("");
			
			t += deltaT;
		}
	}
	
	public static double getValue(double t) {
		int d = 23;
		double product = 1;
		
		while (d < 40) {
			product *= log10(abs(d - t));
			d++;
		}
		
		return product;
	}

}
