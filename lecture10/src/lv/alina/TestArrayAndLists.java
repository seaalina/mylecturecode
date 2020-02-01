package lv.alina;

public class TestArrayAndLists {

	public static void main(String[] args) {
	String[]arr=new String[10];
	String []arrWith={"1","22", "3", "4", "7", "8", "0", "8", "9", "4"};
	arrToString(arr);
	System.out.println();
	arrToString(arrWith);
	addElementToArr(arr);
	
	
	//for(int i=0; i<arrWith.length; i++){
		//System.out.println("index number are " +i+" " +arrWith[i]);
			}
public static void arrToString(String[]arr){
	for(int i=0; i<arr.length; i++){
		System.out.println("index number are " +i+" " +arr[i]);
	}
}
	public static void addElementToArr(String[]arr){
		for(int i=0; i<arr.length; i++){
			System.out.println("index number are " +i+" " +arr[i]);
}
	}
}
