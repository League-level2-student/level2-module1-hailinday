package _00_intro_to_array_lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> string = new ArrayList<String>();
		//2. Add five Strings to your list
		string.add("Mom");
		string.add("Dad");
		string.add("Me");
		string.add("Unlce");
		string.add("Aunt");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < string.size(); i++) {
			String x = string.get(i);
			System.out.println(x);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for (String word : string) {
			System.out.println(word);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < string.size(); i++) {
			if (i % 2 == 0) {
				String x = string.get(i);
				System.out.println(x);
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for (int i = string.size()-1; i >= 0; i--) {
				System.out.println(string.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < string.size(); i++) {
			if (string.get(i).contains("e")) {
				String x = string.get(i);
				System.out.println(x);
			}
		}
	}
}
