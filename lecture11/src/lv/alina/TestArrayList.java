package lv.alina;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		String[] arr = new String[2];
		System.out.println(arr.length);
		arr[0]="element name";
		System.out.println(arr[0]);
		
		
		ArrayList<String> array = new ArrayList<>();
		System.out.println(array.size());
		array.add("Element2array");
		array.add("Element2arrayxxxxx");
System.out.println(array);
System.out.println(array.size()); //changed to 2, because we have added to elements
	}

}
