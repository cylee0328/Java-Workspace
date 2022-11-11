package com.kh.practice1.func;

import java.util.Scanner;




public class VariablePratice3 {
	
	public void variablePratice3() {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("가로 : ");
		float 가로 = sc.nextFloat();
		
		System.out.print("세로 : ");
		float 세로 = sc.nextFloat();
		
		System.out.println("면적 : " + (가로*세로));
		System.out.println("둘레 : " + ((가로+세로)*2));
	
	
}
}