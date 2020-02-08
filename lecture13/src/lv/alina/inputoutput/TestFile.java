package lv.alina.inputoutput;

import java.io.File;


public class TestFile {

	
	public static void main(String[] args) {
		File myFile=new File("Data.txt");
		
		String path = myFile.getAbsolutePath();//road from root to file end
		
		System.out.println(path);

		if(myFile.exists()){
	System.out.println(myFile.getName()+" exists");
	System.out.println("The file is "+myFile.length()+" bytes long");
	
	if(myFile.canRead()){
		System.out.println(" ok to read");
	}else{
		System.out.println(" not ok to read");
	}
	
	if(myFile.canWrite()){
		System.out.println(" ok to write");
	}else{
		System.out.println(" not ok to write");
	}
	
}else{
	System.out.println("File not found");
}
	}

}
