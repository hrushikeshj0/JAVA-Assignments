package assignment;

import java.util.ArrayList;

public class JoinTwoLists {
	public static void main(String args[]){
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Rohan");
		list1.add("Abhi");
		list1.add("Shree");
		System.out.println("Contents of list1 ::"+list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Hrushi");
		list2.add("Raj");
		list2.add("Dev");
		System.out.println("Contents of list2 ::"+list2);

		list1.addAll(list2);
		System.out.println("Contents of list1 after adding list2 to it ::"+list1);
	}
}
