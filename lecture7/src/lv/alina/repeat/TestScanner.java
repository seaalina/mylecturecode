package lv.alina.repeat;

import java.util.Scanner;

public class TestScanner {

	
	

	public static void main(String[] args) {
	final double TAX_RATE_20K=0.1;
	final double TAX_RATE_30K=0.2;
	final double TAX_RATE_40K=0.3;
	final int SENTINEL=-1;
	
	
	int taxableIncome;
	double taxPayable;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter taxable income : $");
	taxableIncome=sc.nextInt();
	
	while(taxableIncome!=SENTINEL){
		
		if(taxableIncome>=40000){
			taxPayable=taxableIncome*TAX_RATE_40K;
		}else if((taxableIncome>=30000)&&(taxableIncome<40000)&&(taxableIncome!=40000)){
			taxPayable=taxableIncome*TAX_RATE_30K;//var tapat pierakstiit &&ierobezhojumus, lai buutu logiskaak
		}else if(taxableIncome>=20000){
			taxPayable=taxableIncome*TAX_RATE_20K;
	}else{
		taxPayable=0;
	}
		System.out.println("Tax needs to be paid "+taxPayable);
		taxableIncome = sc.nextInt();
		
		System.out.println("Enter taxable income:");
		//break;
		sc.close();
	}
	
	}

}