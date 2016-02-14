package by.it.novik.JD01_05;

import static java.lang.Math.*;


public class Math5 {

	public static void main(String[] args) {
		double x = -3;
		
		System.out.printf("%20s%20s", "y", "x");
		System.out.println("");		
	while(x<0.3) {
		System.out.printf("%20f%20f",getValue(x), x);
		System.out.println("");
		x = x + 0.2;
		}
	}
	
	public static double getValue(double x) {
		double lambda = getLambda(x);
		return (lambda / 3) + sqrt(lambda);
	}
	
	public static double getLambda(double x) {
		if (x > -2 && x <= -1) {
			return asin(pow(x, 2));
		} else if(x > -1 && x < 0.2) {
			return acos(pow(x, 2));
		} else if(x == 0.2) {
			return atan(pow(x, 2));
		} else {
			return 0.0;
		}
	}

}
