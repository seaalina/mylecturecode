package lv.alina.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestChangeStringToFile {

	public static void main(String[] args) throws Exception {
//     String defaultStr = "Hello user userName";
//     String lastString = defaultStr.replace("userName", "");
//     System.out.println(lastString+"Alina");
//     
		File file = new File("DefaultText.txt");
		
		Scanner sc=new Scanner(file);
		String stringFromTextFile = "";
		while(sc.hasNextLine()){
			stringFromTextFile=sc.nextLine();
		}
		
//		System.out.println("Check: "+stringFromTextFile);
	
	 String lastString = stringFromTextFile.replace("userName", "");
	 String userName="Alina Alina";
	 File fileForUser=new File(userName+".txt");
		FileWriter fw=new FileWriter(fileForUser, true);
		
		fw.write(lastString+userName);
		fw.close();
	}

}
