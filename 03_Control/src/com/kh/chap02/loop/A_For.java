package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌.
	 * 
	 * 크게 두종류로 나뉨(for문 , while(do-while))
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식) {// ;을 통해 구분. 무조건 있어야됨(;)
	 * 		반복적으로 실행시키고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문이 시작될 때 "초기에 딱 한번만 실행"되는 구문
	 * 			(반복문에서 사용할 변수를 선언 및 초기화 할때 사용)
	 * 
	 * - 조건식 : 반복문이 수행될 조건을 작성하는 구문
	 *    		조건식의 결과가 true이면 반복문 실행
	 *    		조건식의 결과가 false이면 반목문 멈추고, 빠져나옴
	 *    		(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 * 			ex) i++ , i+=1
	 * 
	 * for문을 만나는 순간 
	 * 초기식 -> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *  	-> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *  	-> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *  	.....
	 *  	-> 조건식(조건검사) -> false일 경우 실행할 코드 실행x
	 *  매번 조건식의 조건검사 결과값을 가지고 조건이 true일 경우만 반복해서 실행한다.
	 *  
	 *  알아둘 것 : 
	 *  for문 안에 초기식, 조건식, 증감식 각각 생략이 가능하긴함. 단, 반드시 ;은 작성해줘야함.
	 *   
	 */
	
	public void method1() {
		//"안녕하세요"를 5번 반복해서 출력
		
		for(int i = 0; i<4; i++) {
			System.out.println("안녕하세요");
		}
		
		
//		for(;; ) { //초기식,조건식,증감식이 없더라도 문법적 오류는 아님. 다만 무한반복으로 실행됨.
//			System.out.println("야호");
//		}
	
		for(int i=1; i<=5; i++) {
			System.out.println("야호");
		}
		
		for(int i=1; i<10; i+=2) {
			System.out.println("반갑습니다.");
		}
	}
	
	public void method2() {
		// 1~5 출력
		// i값이 1~6보다 작을떄까지 1씩 증가할동안 반복 수행
		
		for(int i=1; i<6; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=5; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// i 값이 1~10 사이의 홀수만 출력
		
		for(int i=1; i<11; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=1; i<11; i++) {
			if(i % 2 ==1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void method4() {
		// 1 2 3 4 5 6 7 8 9 10
		for(int i=0; i<=9; i++) {
			System.out.print((i+1) + " ");
		}
	}
	
	//산술연산 + 반복문
	public void method5() {
		// 1~ 10까지의 총 합계
		
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum += i;
		} 
		System.out.println("1부터 10까지의 총 합계 : " + sum);
	}
	
	public void method6() {
		//1에서부터 사용자기 입력한 숫자까지 모두 더해서 출력
		
		Scanner sc= new Scanner(System.in);
		System.out.print("양수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			int sum = 0;
			for(int i=1; i<=num; i++) {
				sum += i;
			}
			System.out.println("1부터" + num + "까지의 총 합계 : " + sum);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}	
	}
	
	public void method7() {
		//1부터 매번 달라지는 랜덤값(1~10사이의 랜덤한 정수) 까지의 총합계
		
		/*
		 * java.lang.Math 클래스에 이미 정의되어있는 random() 메소드를 호출하여
		 * 매번 다른 랜덤값을 얻어올 수 있음.
		 * 
		 * static
		 * 
		 */
		
		//int random = (int)Math.random();
		
		// 0.0 <= 랜덤값 <1.0
		// 우선 10을 곱해보기
		// 0.0 <= 랜덤값 < 10.0
		// 1을 더해보자
		// 1.0 <= 랜덤값 < 11.0
		// 소수점만 버리면, 원하는 범위의 정수 랜덤값을 가져올 수 있음.
		
		// [표현법]
		// Math.random() * 출력하고자하는 갯수 + 시작하고싶은 수
		// 시작수 ~ (시작수 + 출력을하고자하는 갯수)
		
		int random = (int) (Math.random() * 10 +1);
		System.out.println(random);
		
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		} System.out.printf("1부터 %d 까지의 총 합은 %d 입니다.", random, sum);
	}
	
	public void method8() {
		//반목문 + String
		String str = "hello";
		
		/*
		 * h => str.charAt(0);
		 * e => str.charAt(1);
		 * l => str.charAt(2);
		 * l => str.charAt(3);
		 * 0 => str.charAt(4);
		 * 
		 * 규칙을 찾기, 우선 반복적으로 str.charAt을 호출함
		 * 인덱스에 해당하는 숫자만 0부터 1씩 4까지 증가함.
		 */
		
		for(int i=0; i<=4; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method9() {
		// 사용자에게 문자열 입력받아
		// 각 인덱스별로 문자를 하나씩 뽑아 출력
		
		// 마지막 인덱스는 문자열의 길이 -1
		// 추출하고자하는 인덱스의 값의 범위는
		// 0 ~ (문자열의 길이 -1)까지 매번 1씩 증가
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 문자열의 길이를 알려주는 메소드
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i=0; i <str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method10() {
		// 구구단 출력(2단)
		
		for(int i=2; i<=2; i++) {
			for(int a=1; a<=9; a++) {
				System.out.printf("%d x %d = %d \n",i,a,i*a);
			}
		}
	}
	
	public void method11() {
		// 사용자가 입력한 단을 출력
		
		// 단수가 2단~9단까지의 범위가 아니라면 
		// 잘못입력했습니다(2~9사이의 정수 입력)
		
		// 제대로 입력했다면 해당 단수를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<2 || num>9) {
			System.out.println("잘못입력했습니다.(2 ~ 9 사이의 정수 입력)");
		} else {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d \n", num,i, i*num);
			}
		}
	}
	//중첩 반복문
	public void method12() {
		// 1 ~ 5 까지 연이어서 출력
		// 1 2 3 4 5 출력되도록 반문 x3
	   for(int i=1; i<=3; i++) {
		for(int a=1; a<6; a++) {
			System.out.print(a + " ");
			// 1 2 3 4 5
		} System.out.println();
	}
 }
	
	public void method13() {
		//****
		//****
		//****
		//****
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print("*");
			} System.out.println();
		} 
	}
	
	public void method14() {
		//1*** ==> 1행 1열때 숫자1표시
		//*2** ==> 2행 2열때 숫자2표시
		//**3* ==> 3행 3열때 숫자3표시
		//***4 ==> 4행 4열때 숫자4표시
		
		//1***
		for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 5; i++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}
		
		
	}
	
	public void method15() {
		//2단부터 9단까지 모두 출력
		
		for(int i=2; i<=9; i++) {
			System.out.printf("======%d  단======= \n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d \n", i,j,i*j);
			}
		}
	}
}




















