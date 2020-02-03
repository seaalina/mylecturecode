package lv.alina;

import java.util.Scanner;
import java.util.Arrays;
public class TestScannerInputArray {

	
	public static void main(String[] args) {
		String[] strArr=new String[3];
	    Scanner sc = new Scanner(System.in);
	    System.out.println(strArr.length+" users in array:");
	    for (int i = 0; i<strArr.length; ++i){
	    	strArr[i]=sc.nextLine();
	    }
	    

		System.out.println("Do you want print array?");
		System.out.println("Type (print)");
		System.out.println("Type (don't print)");
		String statusCheck=sc.nextLine();
		
		if(statusCheck.equals("print")){
			printArray(strArr);
		}else if(statusCheck.equals("don't print")){
			System.out.println("exit");
		}else{
			System.out.println("You enter it wrong");
		}
	}

	public static void printArray(String[] str) {
for (int i =0; i< str.length; i++){
System.out.println(str[i]+" this user is added to array");
	}
		
	}
}
		