package by.it.novik.JD01_05;


import static java.lang.Math.*;
import java.util.Scanner;


public class Exercise2 {

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter x >");
		double x = in.nextDouble();
		System.out.println("Now enter a >");
		double a = in.nextDouble();
		
		System.out.println("Here's the  answer >");
		
		/*double x = 3.24;
		double a = 5.8;*/
		
		double z = atan(pow(x,2)) +
				pow(cos(PI/2 - a),3) /
				abs(x-(pow(a, 1/5)));
		System.out.println(z);
	}

}
