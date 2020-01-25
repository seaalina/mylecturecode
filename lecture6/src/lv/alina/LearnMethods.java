package lv.alina;

public class LearnMethods {

	/**
	 * @param args
	 */
	//void not return type
	//Static - nevajag veidot klases objektu lai izsaukt metodi
	public static void main(String[] args) {
		getMyName ();
		getMyName ();
		getMyName ();
		getMyName ();
		System.out.println("********************");
		getMyCity ();
		
		LearnMethods classObject=new LearnMethods();
		
		
		classObject.doIHaveADog();

	}
	public static void getMyName() {
		System.out.println("My name is Alina");
		
	}
	public static void getMyCity() {
		getMyName ();
		System.out.println("My city is Riga");
	}
	public void doIHaveADog() {
		System.out.println("No");
	}
}
