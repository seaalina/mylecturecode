
public class IfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]number={1, 2, 3, 4, 5, 2, 22, 7};
         //find in arry number 2
		//and print its name in console
		int checkNumber = 3;
		for(int i = 0; i < number.length; i++) {
		    if(number[i]==checkNumber){
		   System.out.println(number[i]);
		   break;
		    }else{
		   
		System.out.println("two");
		   System.out.println(number[i]);
		   
		    }
		}
	}

}
