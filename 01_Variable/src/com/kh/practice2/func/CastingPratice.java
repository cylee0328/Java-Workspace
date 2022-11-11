package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPratice {
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		
		int sum = (int)(a+b+c);
		int avg = sum/3;
		
		
		
		System.out.println("총점 : " + (int)(a+b+c)) ;
		System.out.println("평균 : " + (int)(a+b+c)/3);
		
	}
}
