package com.kh.chap04_field.model.vo;

public class Test {

	public static void main(String[] args) {
		
		FieldTest2 f2 = new FieldTest2();
		
		// protected -> 같은 패키지에서는  직접접근가능
		// 다른패키지에서는 직접접근불가
		//System.out.println(f2.pro);
		
		// default -> 같은 패키지에서만 직접접근가능
		//System.out.println(f2.df);
		
		//System.out.println(f2.pri);
		
		System.out.println(FieldTest2.sta);
	}

}
