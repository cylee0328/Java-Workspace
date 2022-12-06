package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}

	public String afterToken(String str) {
		 StringTokenizer stn = new StringTokenizer(str, " ");
		 
		 String result = "";
//		 // 방법1. String 클래스 이용
//		 while(stn.hasMoreTokens()) {
//			result += stn.nextToken();// J,a,v,a,P
//		 }
//		 return result;
		 
		 // 방법2. StringBuffer or StringBulide를 이용.
		StringBuilder sb = new StringBuilder();
		 while(stn.hasMoreTokens()) {
			 sb.append(stn.nextToken());
		 }
		 return sb.toString();
	}
	
	public String firstCap(String input) {
		// apple -> Apple
		// a, pple -> a(A)+pple
		// substring(0, 1);
		String upper = input.substring(0, 1).toUpperCase(); // 0이상 1미만의 인덱스범위를 짤라옴.
		return upper + input.substring(1);// 대문자로 변환한 문자+0번인덱스를 제외한 문자열을 합쳐서 반환
	}
	
	public int findChar(String str, char one) {
		// 매개변수의 문자가 문자열안에 몇개가 들어가있는지 반환
		int count = 0;
//		for(int i =0 ; i<str.length(); i++) {
//			if(str.charAt(i) == one) {
//				count++;
//			}
//		}
		
		// 방법2. toCharArray 활용
		char[] arr = str.toCharArray();
		for(char c : arr) {
			if(c==one) {
				count++;
			}
		}
		return count;
	}
	
	
}
