package lv.alina;

import lv.alina.encapsulation.Student;


public class TestEncapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("Toms");
		System.out.println(student.getName());

	}

}
