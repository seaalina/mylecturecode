
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          char operatorMath ='+';
          double num1 = 20.0;
          double num2 = 24.5;
          double result;
          
          if(operatorMath=='+'){
        	result = num1+num2;
        	  System.out.println(result);
          }else if(operatorMath=='/'){
        	  result = num1/num2;
        	  System.out.println(num1/num2);
        
          }else if (operatorMath=='*'){
        	  result = num1*num2;
        	  System.out.println(num1*num2);
        	  
          }else if (operatorMath=='-'){
        	  result = num1-num2;
        	  System.out.println(num1-num2);
        	  
          }else if(operatorMath=='%'){
        	  if (num1>=num2){
        	  result=num1%num2;
        	  System.out.println(result);
          }else{
        	  System.out.println("If num1 less than num2" + " then result is num1: "+num1);
         
        	  
        	
        		  
        	  
        	  
        	  System.out.println("______________________");
        	  
        	  switch(operatorMath){
        	  case('+'):
        		  System.out.println(num1+num2);
        	  break;
        	  
        	  
        	  
        	  
        	  
        	  
        	  }
        	  }
        	  }
        	  }
}
