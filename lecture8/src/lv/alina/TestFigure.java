package lv.alina;

import lv.alina.figure.Rectangle;

public class TestFigure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toString());
		Rectangle rectangle2 =new Rectangle (0.0f, 0.0f);
		System.out.println(rectangle2.toString());
		Rectangle rectangle3 =new Rectangle (2.0f);
		System.out.println(rectangle3);
	}

}
