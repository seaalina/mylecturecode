package lv.alina;

import lv.alina.geometricfigures.Circle;

public class TestFigureClass {


	public static void main(String[] args) {
		Circle figure = new Circle();
		Circle figure1=new Circle(40.2);
		Circle figure2=new Circle(20.5, "blue");
		Circle figure3= new Circle(11);

		System.out.println(figure.getColor()+" "+figure.getRadius());
		System.out.println(figure1.getColor()+" "+figure1.getRadius());	
		System.out.println(figure2.getColor()+" "+figure2.getRadius());
		System.out.println("radius of figure is "+ figure3.getArea());
		System.out.println(figure3.toString());
		System.out.println(figure3.toString()+" and the area is "+figure.getArea());
	}

}
