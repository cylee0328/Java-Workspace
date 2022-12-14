package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_CheckedException {

	/*
	 * CheckedException은 반드시 예외처리를 해줘야 되는 예외들
	 * (즉, 예측 불가능한 곳에서 발생하기 때문에 미리 예외처리구문을 작성해줘야함)
	 * => 주로 외부매체와 어떤 입출력 시 발생
	 */
	
	public void method1()  {
		method2();
	}
	
	public void method2() {
		
		//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체.(단, 문자열로만 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("아무 문자나 입력해주세요 : ");
		
		//1. try ~ catch문 : 여기서 바로 예외처리하기
//		try {
//			String str = br.readLine();
//			System.out.println("문자열의 길이 : " + str.length());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//2. throws : 지금 현재 메소드에서 예외를 처리하지 않고 현재 이 메소드를 호출한 곳(method1)으로 떠넘기겠다.
		//String str = br.readLine();
		
		//System.out.println("문자열의 길이는 " + str.length());
		
		/*
		 * 					예외 발생 시점							예외처리
		 * RutimeException	프로그램 실행시->런타임에러(컴파일 에러x)		필수아님->unchecked Exception(조건문 또는 예외처리구문 사용)
		 * IOException 그 외			   => 컴파일 에러				필수=> checked Exception(반드시 예외처리로 해결)
		 */
	}
}


















