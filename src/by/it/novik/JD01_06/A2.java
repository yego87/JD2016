package by.it.novik.JD01_06;

import java.util.ArrayList;
import java.util.Arrays;

public class A2 {

	public static void main(String[] args) {
		String s = ("Initially standing at a very squat 10 ounces " +
				"when debuted by Sherri Cup in 1965, the contemporary version, " +
				"sold by infamous red cup creator Solo (ironically now owned by Dart Container," +
				" the company started by the same William Dart who created the styrofoam cup " +
				"that Buck’s invention would overtake), is both taller and slimmer than the original," +
				" reflecting the aesthetic stereotype of the City" +
				" that the cup is most associated with. " +
				"Today, both 8-ounce and 10-ounce versions are available.");
		s = s.replace(":", "");
		s = s.replace(",", "");
		s = s.replace(".", "");
		s = s.replace("?", "");
		s = s.replace(")", "");
		s = s.replace("(", "");


		String[] s1 = s.split(" ");
		
		
		ArrayList<String> items = new ArrayList<String>();

		items.addAll(Arrays.asList(s1));

		int count = 0;

		for (int i = 0; i < items.size(); i++) {
			System.out.printf("%s: ", items.get(i));
			for (int j = 0; j < items.size(); j++) {
				if (items.get(i).equals(items.get(j)))
					count++;
				if (items.get(i).equals(items.get(j)) && count > 1)
					items.remove(j);
			}
			System.out.printf("%d\n", count);
			count = 0;
		}
	}
}
