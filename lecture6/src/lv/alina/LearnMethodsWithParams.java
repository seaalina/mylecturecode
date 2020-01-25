package lv.alina;

public class LearnMethodsWithParams {
	
	
	//cast 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 30.2;
		String color = "red";
		
		int resultWithCastInt=getArea(radius);//this method cast double
		double result = getAreaForCircle(radius);
		System.out.println("circle area :"+result);
		System.out.println("circle area :"+resultWithCastInt);
		System.out.println(getColorAndArea(color, result));
	}
//int result =getArea(30.2);
//System.out.println("area of circle :"+result);
	
public static int getArea(double radius){
	double result = Math.PI*radius*radius;
	return (int)result;

}
public static double getAreaForCircle(double radius){
	double result = Math.PI*(radius*radius);
	return result;
	
}
public static String getColorAndArea(String color, double area){
	return "Color: "+ color+" and area "+area;
}
}
