package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {

//		FieldTest1 f1 = new FieldTest1(); // 객체 생성 시 global 전역변수가 할당
//		
//		f1.test(111); // test 메소드 호출시 num, local 변수 할당
//					  // test 메소드 종료시 num, local 변수 소멸
//		
//		f1 = null; // 객체 소멸 시 global 멤버변수 소멸
		
		FieldTest2 f2 = new FieldTest2();
		
		// public -> 어디서든 직접 접근 가능
		System.out.println(f2.pub);
		
		// protected -> 같은 패키지에서는  직접접근가능
		// 다른패키지에서는 직접접근불가
		//System.out.println(f2.pro);
		
		// default -> 같은 패키지에서만 직접접근가능
		//System.out.println(f2.df);
		
		//System.out.println(f2.pri);
	}

}
