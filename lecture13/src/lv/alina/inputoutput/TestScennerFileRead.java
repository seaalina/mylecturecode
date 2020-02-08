package lv.alina.inputoutput;

import java.io.File;
import java.util.Scanner;

public class TestScennerFileRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	File file =new File("Data.txt");
	
	Scanner sc=new Scanner(file);
while(sc.hasNextLine()){
	System.out.println(sc.nextLine());
}
	}

}
