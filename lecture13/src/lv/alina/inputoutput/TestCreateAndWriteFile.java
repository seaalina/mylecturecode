package lv.alina.inputoutput;

import java.io.File;
import java.io.FileWriter;

public class TestCreateAndWriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		File fileObj=new File("newfile.txt");
		FileWriter fw=new FileWriter(fileObj, true);
		
		fw.write("Check if it's working?hello");
		//fw.append("\n String next line");
		fw.close();

		
	}

}
