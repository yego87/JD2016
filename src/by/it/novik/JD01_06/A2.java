package by.it.novik.JD01_06;

import java.util.ArrayList;
import java.util.Arrays;

public class A2 {

	public static void main(String[] args) {
		String s = ("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");

		s = s.replace(":", "");
		s = s.replace(",", "");
		s = s.replace(".", "");
		s = s.replace("?", "");

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
