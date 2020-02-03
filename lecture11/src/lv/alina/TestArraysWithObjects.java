package lv.alina;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraysWithObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer intObj=49;
		Double doubleObj=49.94;
		System.out.println(intObj);
		ArrayList<Integer> intArrays = new ArrayList<>();
		intArrays.add(40);
		intArrays.add(23);
		intArrays.add(25);
		intArrays.add(31);
		
		System.out.println(intArrays);

		Collections.sort(intArrays);
		
		System.out.println(intArrays);
	}

}
