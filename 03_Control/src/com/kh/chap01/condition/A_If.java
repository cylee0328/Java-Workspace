package com.kh.chap01.condition;

import java.util.Scanner;



public class A_If {

	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행됨.
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 이용해서 직접 제어 가능.
	 * 
	 * 선택적으로 실행시키고자 할 때 => 제어문 
	 * 반복적으로 실행시키고자 할 때 => 반복문
	 * 그 외에는 -> 분기문
	 * 
	 * 조건문
	 * 조건식을 통해 참이냐 거짓이냐를 판단해서 그에 해당하는 코드를 실행
	 * 
	 * 조건식
	 * 반드시 결과는 true/false여야함.
	 * 보통의 조건식에는 비교연산자, 논리연산자를 주로 사용함. 
	 * 
	 * 조건문은 크게 if문(단독, if~else, if ~else if, 중복if) switch문으로 나뉨
	 * 
	 */
	// 삼항 연사자를 조건문으로 바꿔보기.
	
	public void method1() {
		/*
		 * 단독 if문
		 * 
		 * [표현법]
		 * if(조건식) {
		 * 		조건식이 true인 경우 실행할 코드
		 * }
		 * => 조건식의 결과가 참일 경우 중괄호 블록 안의 코드가 실행.
		 * => 조건식의 결과가 거짓일 경우 중괄호 안의 코ㅛ드가 무시되고 넘어감.
		 */
		
		// 사용자에게 정수값을 입력받은 후 "양수다", "양수가 아니다"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력하시오 : ");
		int num = sc.nextInt();
		
		// num > 0 ? "양수다" : "양수가 아니다";
		
		if(num > 0) {
			System.out.println("양수입니다."); //양수입니다. 출력먼저 적고 if블럭으로 감싼다.
		} else {
			System.out.println("양수가 아닙니다.");
		}		
	}
	
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수를 입력하시오 : ");
			int num = sc.nextInt();
			
			if(num > 0)	{
				System.out.println("양수입니다.");
			} else {
				System.out.println("양수가 아닙니다.");
			}	
		}
		
		public void method3() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하세요 : ");
			
			int num = sc.nextInt();
			
			if(0<num ) {
				System.out.println("양수입니다.");
			} else if(num==0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("음수입니다.");
			}		
		}
	
		public void method4() {
			// 사용자가 입력한 나이값을 가지고 어린이, 청소년, 성인 출력
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이를 입력하시오 : ");
			int age = sc.nextInt();
			
			if(age<=13) {
				System.out.println("어린이");
			} else if(age>19) {
				System.out.println("성인");
			} else {
				System.out.println("청소년");
			}
			
			// 다른 방법으로 풀어보기 -> 어린이, 청소년, 성인에 대한 값을 
			// 담아두고 마지막에 출력문으로 출력해보기
			
			String result; 
			
			if(age<=13) {
				 result = "어린이";
			} else if(age>19) {
				 result = "성인";
			} else {
				 result = "청소년";
			}
			System.out.println(result);
		}
	
		public void method5() {
			
			Scanner sc = new Scanner(System.in);
			// 사용자에게 이름,성별 입력받아 남자인지 여자인지 출력
			
			System.out.print("이름을 입력하시오 : ");
			String name = sc.nextLine();
			
			System.out.print("성별을 입력하시오 : ");
			char gender = sc.nextLine().charAt(0);
					
			String result = "";
			
			if(gender == 'M' || gender == 'm') {
				result = "남학생";
			} else if(gender == 'f' || gender == 'F') {
				result = "여학생";
			} else {
				System.out.println("잘못입력했습니다.");
				// 만약에 이 아래 코드를 실행시키고 싶지 않다면?
				// return 사용.
				return; // 해당 일반메서드를 빠져나감(메서드를 호출했던 곳으로 돌아감)
			}
				System.out.printf("%s님은 %s 입니다.", name, result);
				// -> 실행시 오류남. 위에 String result = "";로 초기화 한번해두는게 필수;
		}
		
		public void method6() {
			//특이케이스. 문자열 간의 동등비교 (문자열==문자열)
			//사용자에게 이름을 입력받아 민경민과 일치하는지 비교하기.
			
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력하시오 : ");
			
			String name = sc.nextLine();
			
			//String 참조자료형
			if(name == "민경민") {
				System.out.println("일치합니다.");
			} else {
				System.out.println("일치하지 않습니다.");
			}
			
			/*
			 * 기본자료형 : boolean, byte, short, int ,long, float, double, char
			 * 참조자료형 : String // 특이한녀석
			 * 
			 * 기본자료형간 비교시 == != 사용가능하지만, 참조자료형은 동등비교연산시 정상적으로 연산안됨.
			 * 따라서 문자열.equals() 라는 방법으로 비교함.
			 */
			
			
			
			if(name.equals("민경민")) { //즉 반환값이 true of false로 리턴해줌.
				System.out.println("일치합니다.");
			} else {
				System.out.println("일치하지 않습니다.");
			}
			
		}	
		public void method7() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수(양수)를 입력하시오 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				if(num % 2 ==0) {
					System.out.println("짝수입니다.");
				} else  {
				System.out.println("홀수입니다.");
				} 
				}else {
				System.out.println("잘못된 값입니다.");
			}
		}
			
		
		
		
		
		
		
		
	
	
	
	
	
}
