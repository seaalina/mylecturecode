import java.util.Scanner;


public class ScannerCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Input operator /+-% :");
		String operatorS = sc.nextLine();
		
		
		int result = 0;
		result = num1+num2;
		if (operatorS=="+"){
			result = num1+num2;
		}else if(operatorS.equals("/")){
			result = num1/num2;
		}else if(operatorS.equals("*")){
			result = num1*num2;
		}
		//System.out.println("test out: "+result);
		System.out.println(result +" = "+ num1 +" "+operatorS+" " + num2);

	}

}
