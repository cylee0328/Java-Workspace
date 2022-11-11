package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 변수에 기록하는 방법.
public class B_KeyboardInput {
	
	public void inputTest1() {
		/*
		 * 자바에서 이미 제공하고 있는 java.util.Scanner 클래스를 이용할 것.
		 * Scanner 클래서 안에 작성되어 있는 메소드를 호출해서 이용하.
		 */
		Scanner sc = new Scanner(System.in);
		// System.in 입력 받은 값을 바이트 단위로 받아들이겠다라는 의미
		// 출력시에는 System.out 구문을 썼었음.
		
		// 사용자의 인적사항 입력받기 ( 이름, 나이, 키)
		
		// 입력받고자 하는 내용을 먼저 출력문을 통해서 입력을 유도
		System.out.println("당신의 이름은 무엇입니까 ? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드
		// 변수 선언과 동시에 값을 입력받아 바로 대입.
		// String name = sc.next();
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지만 출력해줌.
		
		// String name = sc.next();
		
		String name = sc.nextLine(); // 사용자가 엔터까지 입력할 때까지 대기상태 
		//nextLine() : 사용자가 입력한 값 중 개행이 있을 경우 공백이 무관하게 개행 이전까지만 출력해준다.
		//			   특히 사용자가 입력한 값에 공백이 포함될 여지가 있는 경우 안전한게 nextLine()함수를 쓰자.
		
		System.out.println("당신의 나이는 몇 살 입니까 ? : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // 버퍼에 남아있는 엔터(\n)값을 비워주기 위해 실행
		
		System.out.println("당신의 사는 곳은 어디입니까 ? : ");
		String address = sc.nextLine();
		
		System.out.println("당신의 키는 몇 cm입니까  ? : " );
		double height = sc.nextDouble();
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "살 이며 키는 " + height + "cm 이고 사는 곳은 " + address + "입니다.");
		
 }
	
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		
			
		// 문자열을 뽑을 때 => sc.nextLine() / sc.next()
		// 정수값을 뽑을 때 => sc.nextInt() / sc.nextByte() / sc.nextShort() / sc.nextLong
		// 실수값을 뽑을 때 => sc.nextDouble() / sc.nextFloat
		
		// 문자를 뽑을 때 =>  sc.nextChar() 존재하지않음.
	
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		// "apple" 문자열 
		//  01234
		// "apple" 문자열에서 4번 인덱스의 문자는?
		// 'e'
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키(cm) : ");
		double height = sc.nextDouble();
		
		 ///000님의 개인정보 : 성별=0, 나이=00, 키=000.0cm
		System.out.println(name + "님의 개인정보 : 성별 = " + gender + "이고 나이는 " + age + "살 이며 키는 " + height + "입니다.");
		}
	
		/*
		 *  정리
		 *  1. 콘솔 창 (모니터)에 출력하기 위해 : System.out.print[ln]()메소드 이용
		 *  2. 콘솔 창 (키보드)로 입력받기 위해 : Scanner를 이용해서 (nextXXX()메소드 이용)
		 *  
		 *  > 주의사항
		 *  1) sc.nextXXX()메소드 뒤에 sc.nextLine()메소드가 와야할 경우
		 *  sc.nextLine()메소드를 한번 더 실행시켜줘서 버퍼에 남아있는 엔터를 빼줘야 한다.
		 *  
		 *  2) '문자'값을 입력받아야할 경우
		 *  	sc.nextLine()메소드를 통해 우선 문자열을 입력받고, 그 뒤에 .charAt(인덱스)메소드를 통해 문자를 하나만 추출한다
		 */
	




}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
