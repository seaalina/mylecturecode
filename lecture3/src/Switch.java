
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char operatorMath ='=';
        double num1 = 33.6;
        double num2 = 24.5;
        double result;
        
		
		switch(operatorMath){
  	  case('+'):
  		  result = num1+num2;
  		  System.out.println(result);
  	break;
  	case('-'):
  		result = num1-num2;
		  System.out.println(result);
  	break;
  	case('/'):
  		result=num1/num2;
		  System.out.println(result);
  	break;
  	case('*'):
  		result=num1*num2;
		  System.out.println(result);
	  break;
  	case('%'):
  		 if (num1>=num2){
       	  result=num1%num2;
       	  System.out.println(result);
         }else{
       	  System.out.println("If num1 less than num2" + " then result is num1: "+num1);
         }
	  break;
	  default:
		  System.out.println("No such operator");

		}
  		  
  	  }

}