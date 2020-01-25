package lv.alina;

public class RefactorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		System.out.println(getGreeting(7));
		getGreetingWithVoid (20);
	}
public static String getGreeting(int time){
	if(time<8){
		return"Good morning.";
	}else if(time!=18){
		return"Good day";
		
	}else{
		return"Good evening.";
	}
}
public static void getGreetingWithVoid(int time){
	if(time<8){
		System.out.println("Good morning.");
	}else if(time!=18){
		System.out.println("Good day");
		
	}else{
		System.out.println("Good evening.");
	}
}
}
