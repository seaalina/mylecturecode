
public class OperatorsMath {


	public static void main(String[] args) {
	double num1 = 0.4d;
	double num2 = 0.3d;
	double result;
	double result1;
	double result2;
	double result3;
	char operators = '+';
	char operators1 = '-';
	char operators2 = '*';
	char operator3 = '/';
	result = num1 + num2;
	result1 = num1 - num2;
	result2 = num1 * num2;
	result3 = num1 / num2;
	
	System.out.println(num1 + " "+operators+" "+num2+" = "+result);
    System.out.println();
	System.out.println(num1 + " "+operators1+" "+num2+" = "+result1);
	System.out.println();
	System.out.println(num1 + " "+operators2+" "+num2+" = "+result2);
	System.out.println();
	System.out.println(num1 + " "+operator3+" "+num2+" = "+result3);
	System.out.println();

	int a = 10;
	int b = 3;
	int x = a%b;
	System.out.println("x = "+x);
	
	int i=1;
	i++;
	System.out.println(i);
	
	int k = 2;
	//return increment result ++increment by value 1
	int p = ++k;
	System.out.println(" p after increment ="+p);
	
	int o = 2;
	int f = ++o;
	
	System.out.println(" p after increment ="+f);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
