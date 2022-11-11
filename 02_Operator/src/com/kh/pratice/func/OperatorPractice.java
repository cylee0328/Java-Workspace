package com.kh.pratice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void pratice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		int result1 = (candy / person);
		int result2 = (candy % person);
		
		System.out.println("1인당 남은 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cla = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String result = (gender == 'M')  ?  "남학생" : "여학생";
		
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, cla, id, name, result, score);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age<=13) ? "어린이" : (age<=19) ? "청소년" : "성인";
		
		System.out.println(result);		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (kor+eng+math);
		int avg = (sum/3);
		
		String result = (kor>=40) && (eng>=40) && (math>=40) && (avg>=60) ? "합격" : "불합격";
		
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + avg );
		System.out.println(result);

	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력 : ");
		
		char id = sc.nextLine().charAt(7);
		String result = (id=='2' || id=='4') ? "여자" : "남자";
		
		System.out.println(result);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력  : ");
		int num3 = sc.nextInt();
		
		String result = (num3<=num1) || (num3>num2) ? "true" : "false";
		System.out.println(result);
	}	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1==num2) &&(num2==num3) ?  true : false;
		System.out.println(result);
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원 연봉 : ");
		int A = sc.nextInt();
		
		System.out.print("B사원 연봉 : ");
		int B = sc.nextInt();
		
		System.out.print("C사원 연봉 : ");
		int C = sc.nextInt();
		
		double bonusA = 0.4;
		double bonusB = 0.0;
		double bonusC = 0.15;
		
		double AA = A+(A*bonusA);
		double BB = B+(B*bonusB);
		double CC = C+(C*bonusC);
		
		String result1 = (AA>=3000)  ?  "3000이상" : "3000미만";
		String result2 = (BB>=3000)  ?  "3000이상" : "3000미만";
		String result3 = (CC>=3000)  ?  "3000이상" : "3000미만";
		
		System.out.println("A사원의 연봉/연봉+a : " + A + "/" + AA);
		System.out.println(result1);
		System.out.println("B사원의 연봉/연봉+a : " + B + "/" + BB);
		System.out.println(result2);
		System.out.println("C사원의 연봉/연봉+a : " + C + "/" + CC);
		System.out.println(result3);
	}		
}









