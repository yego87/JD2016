package by.it.novik.JD01_05;

import static java.lang.Math.*;

public class Math1 {
	public static void main(String[] args) {

		double a = -3.45;
		double b = 349.1;
		
		double y1 = pow((cos(PI / 4)),4);
		double y2 = pow(a + 15, 1/5);
		double y3 = a * pow(b, 8);
		double y4 = b / log10(pow((abs(a)), 2));
		
		double y = y1 + y2 + y3 +- y4;
		
		System.out.println(y);
}
}