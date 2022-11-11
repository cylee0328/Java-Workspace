package com.kh.operator;

public class A_Arithmetic {
	
	public void method() {
		int a = 10;
		int b = 20;
		
		System.out.println("a x b = " + a*b);
		System.out.println("a / b = " + a/b);
		System.out.println("a % b = " + a%b);
		
		//System.out.println(10%0);
		//java.lang.ArithmeticException : /by zero 라는 오류발생
		//수학과 마찬가지로 0은 계산안됨
		System.out.println("===================");
		double i = 35; //35.0
		double j = 10; //10.0
		
		System.out.println(i / j);
		System.out.println(i % j); // 몫 = 3.0, 나머지 = 5.0
	}
}
