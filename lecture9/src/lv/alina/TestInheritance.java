package lv.alina;

import lv.alina.graph.Point2D;
import lv.alina.graph.Point3D;
import lv.alina.graph.Point4D;

public class TestInheritance {

	
	public static void main(String[] args) {
		Point2D point=new Point2D(); //deklarejam instanci
System.out.println(point.toString());
Point2D pointXY=new Point2D(10,-2);
System.out.println(pointXY);



pointXY.setX(8);
pointXY.setY(5);
System.out.println(pointXY);


System.out.println("x is: "+pointXY.getX());


Point3D pointXYZ = new Point3D(3,1,10);
System.out.println(pointXYZ);

pointXYZ.setY(-99);
System.out.println(pointXYZ);

Point4D pointXYZT=new Point4D(9,5,6,7);
System.out.println(pointXYZT);
System.out.println(pointXYZT.getX());









	}

}
