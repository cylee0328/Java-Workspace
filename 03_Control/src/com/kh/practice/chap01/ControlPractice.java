package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("입력 메뉴입니다.");
		} else if(num==2) {
			System.out.println("수정 메뉴입니다.");
		} else if(num==3) {
			System.out.println("조회 메뉴입니다.");
		} else if(num==4) {
			System.out.println("삭제 메뉴입니다.");
		} else if(num==7) {
			System.out.println("종료 메뉴입니다.");
			System.out.print("프로그램을 종료합니다.");
		} 	
	}
	
	public void practice2() {
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		//짝수가 아니면 “홀수다“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 ==0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = (kor+math+eng);
		int avg = (sum/3);
		
		if(kor>=40 && math >=40 && eng >=40 && avg>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평군 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
		case 2:
		case 12:
			System.out.println(num + "은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num + "은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "은 가을입니다.");
			break;

		default:
			System.out.println("해당하는 계절이 없습니다.");
			
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		String ID = "hosuk0328";
		String PW = "tjsghk1";
		if(id.equals(ID) && pw.equals(PW)) {
				System.out.println("로그인 성공");
			} else if(pw != PW && id.equals(ID) ) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else if( id != ID   && pw.equals(PW)) {
				System.out.println("아이디가 틀렸습니다.");
			} 
			
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String 등급 = sc.nextLine();

		switch (등급) {
		case "관리자":
			System.out.print("회원관리, ");
		case "회원":
			System.out.print("게시글 관리, 게시글 작성, 댓글작성, ");
		case "비회원":
			System.out.print("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 :");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		System.out.println("BMI 지수 : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		} else if(BMI < 23) {
			System.out.println("정상체중");
		} else if(BMI < 25)	{
			System.out.println("과체중");
		} else if(BMI < 30) {
			System.out.println("비만");
		} else if(BMI > 30) {
			System.out.println("고도비만");
		}
  }
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.print("연산자를 입력(+,-,*,/,%) :");
		char op = sc.nextLine().charAt(0);
		double result = 0;
		if (num1 < 0 && num2 < 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
			return;
		}
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / (double)num2;
			break;
		case '%':
			result = num1 % num2;
			break;

		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
			return;
		}
		System.out.printf("%d %c %d = %f", num1, op, num2, result);
	}
	
	public void practice9() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요. 평가 비율은 중간고사 20%, 기말고사 30%,
		 * 과제 30%, 출석 20%로 이루어져 있고 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로
		 * 계산하세요. 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int at = sc.nextInt();
		
		System.out.println("===========결과============");
		
		double midRate =  (mid*0.2);
		double finRate = (fin*0.3);
		double hwRate = (hw*0.3);
		double atRate =  at;
		
		double result = midRate + finRate + hwRate + atRate;
		
		if (result < 70 || at < 20 - (20 * 0.3)) {
			System.out.println("Fail [출석 회수 부족 ("+at+"/20)]");
		} else {
			if (result >= 70) {
				System.out.println("중간 고수 점수(20) : " + midRate);
				System.out.println("기말 고사 점수(30) : " + finRate);
				System.out.println("과제 점수    (30) : " + hwRate);
				System.out.println("출석 점수    (20) : " + atRate);
				System.out.println("총점 : " + result);
			} System.out.println("Pass");
		}

	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 홀수/짝수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
			
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		int num = sc.nextInt();
		
		String number = num + "";

		if (num > 999 && num < 10000) {
			char num1 = number.charAt(0);
			char num2 = number.charAt(1);
			char num3 = number.charAt(2);
			char num4 = number.charAt(3);
			if (num1 == num2 || num2 == num3 || num3 == num4 || num1 == num4 || num2 == num4) {
				System.out.println("중복값 있음");
			} else {
				System.out.println("생성 성공");
			}
		} else {
			System.out.println("자리 수 안맞음");
		}
	}
}












