
public class ControlFlowIf {
	
	

	public static void main(String[] args) {
	      int x = 10;
	      int y = 22;
	      
	      if(x>y){
	    	  System.out.println("the sun is shining");
	      }
	      
	      int numberCheck = 21;
	      
	      if(numberCheck%2 == 0){ //
	    	  System.out.println(numberCheck +" is even");
	}else{
		System.out.println(numberCheck + " is odd");
	}

	      int mark =50;
	      
	      if (mark>=50){
	    	  System.out.println("PASS");
	      }else{
	    	  System.out.println("FAIL");
	      }
	      System.out.println();
	      System.out.println("DONE");
	      
	}
}
