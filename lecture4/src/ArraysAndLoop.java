
class ArraysAndLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variable
		
		int[]marks={76, 25, 38, 5, 22};
		//make toString all elements of array
		//sysoprint in console
		//System.out.println in new line
		//System.out.print in one line
		for(int i=0; i<marks.length;i++){
			System.out.println(marks[i]);
		}
		System.out.print("[");
		for(int i=0; i<marks.length-1;i++){
			System.out.print(marks[i]+", ");
		
		}
	System.out.print(marks[marks.length-1]+"]");
	

	}

}
