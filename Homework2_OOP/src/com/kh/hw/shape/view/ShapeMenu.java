package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.*;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private SquareController scr = new SquareController();
	
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("====== 도형 프로그램 ======");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		if(num!=3 && num!=4 && num!=9) {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			inputMenu();
		}
		if(num==3) {
			triangleMenu();
		}
	    if(num==4) {
			squareMenu();
		}
	     if(num==9) {
			System.out.println("프로그램을 종료합니다.");
		}
	}
	
	public void triangleMenu() {
		System.out.println("==== 삼각형 ====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		if(num==1) {
			System.out.print("높이 : ");
			int h = sc.nextInt();
			System.out.print("너비 : ");
			int w = sc.nextInt();
			System.out.println("삼각형 면적 : " + tc.calcArea(h, w));
			triangleMenu();
		} else if(num==2) {
			sc.nextLine();
			
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
			triangleMenu();
			
		} else if(num==3) {
			System.out.println(tc.print());
			triangleMenu();
		} else if(num==9) {
			inputMenu();
		}
	}
	
	public void squareMenu() {
		System.out.println("==== 사각형 ====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		if(num==1) {
			System.out.print("높이 : ");
			int h = sc.nextInt();
			System.out.print("너비 : ");
			int w = sc.nextInt();
			System.out.println("사각형 둘레 : " + scr.calcPerimeter(h, w));
			squareMenu();
		} else if(num==2) {
			System.out.print("높이 : ");
			int h = sc.nextInt();
			System.out.print("너비 : ");
			int w = sc.nextInt();
			System.out.println("사각형 면적 : " + scr.calcArea(h, w));
			squareMenu();
		} else if(num==3) {
			sc.nextLine();
			
			System.out.print("색깔 : ");
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
			squareMenu();
		} else if(num==9) {
			inputMenu();
		}
	}
	
	public void inputSize(int type, int menuNum) {
		if(type==3) {
			
		}
	}
	
	public void printInformation(int type) {
		
	}
}
