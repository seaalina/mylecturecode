import java.util.Arrays;


public class ArraysInitialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]numberOfArrays={33,45,23,56};
		
int lengthOfArrays = numberOfArrays.length;
System.out.println(lengthOfArrays);

numberOfArrays[3]=20;
System.out.println(Arrays.toString(numberOfArrays));
	}

}
