
public class ArraysSumForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]marks={38, 5, 22};
		//sum all values in arrays
		//print in console
//int result=10;
//System.out.println("result value: "+result);
//int testInt=90;
//result=200;
//System.out.println("result value: "+result);

	int sum = 0;
	for(int i=0;i<marks.length;i++){
		sum+=marks[i];
	}
		System.out.println("sum of marks:" +sum);
		int sumTest=0;
		sumTest=sumTest+200; //0+200
		sumTest=sumTest+220; //200+220=420
		sumTest=sumTest+240; // 420+240 =660
		
		//-= and how this operator works
		int subOperator =1000;
		subOperator -=200;
		subOperator=subOperator-200;
		subOperator-=200;
		
		System.out.println("Testing -= operator:"+subOperator);
		System.out.println("Testing += operator:"+sumTest);
	}

}
