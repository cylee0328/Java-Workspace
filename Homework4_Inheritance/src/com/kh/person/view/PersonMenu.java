package com.kh.person.view;

import java.util.Scanner;

import com.kh.person.controller.PersonController;
import com.kh.person.model.vo.Employee;
import com.kh.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	int[] personCount = pc.personCount();
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 "+ personCount[0] +"명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 "+ personCount[1] +"명입니다.");
		
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 : studentMenu(); break;
		case 2 : employeeMenu(); break;
		case 9 : System.out.println("종료합니다."); return;
		default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
		}
	  }
   }
	
	public void studentMenu() {
		while(true) {
		if(personCount[0] !=3) {
			System.out.println("1. 학생 추가 : ");
		}
			System.out.println("2. 학생 보기 : ");
			System.out.println("9. 메인으로 ");
			System.out.println("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 2 : printStudent(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); return;
			case 1 : 
				if(personCount[0] !=3) {
					insertStudent();
					break;
				}
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
	}

	public void employeeMenu() {
		
				System.out.print("1. 사원 추가 : ");
			
				System.out.print("2. 사원 보기 : ");
				System.out.print("9. 메인으로 ");
				System.out.print("메뉴 번호 : ");
				int num = Integer.parseInt(sc.nextLine());
				
				switch(num) {
				case 2 : printEmployee(); break;
				case 9 : System.out.println("메인으로 돌아갑니다."); return;
				case 1 : 
					if(personCount[1] !=10) {
						insertEmployee();
						break;
					}
				default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				}
			}
	
	
	public void insertStudent() {
		
		while(true) {
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		System.out.print("학생 나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("학생 키 : ");
		double height = sc.nextDouble();
		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("학생 학년 : ");
		int grade = sc.nextInt();
		System.out.print("학생 전공 : ");
		String major = sc.nextLine();
		pc.insertStudent(name, age, height, weight, grade, major);
		
		if(personCount[0] < 3) {
		System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요.");
		char ch  =sc.nextLine().charAt(0);

		if(ch=='N' || ch=='n') {
			return;
		}
		} 
		if(personCount[0] ==3 ) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
			break;
		}
		}
	}
	
	public void printStudent() {
		Student[] arr = pc.printStudent();
		for(Student s : arr ) {
			System.out.println(s);
	}
	}
	public void insertEmployee() {
		while(true) {
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("사원 급여 : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(personCount[1] < 10) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요.");
			char ch  =sc.nextLine().charAt(0);

			if(ch=='N' || ch=='n') {
				return;
			}
			} 
			if(personCount[1] ==3 ) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				break;
			}
			}
		}
	
	
	public void printEmployee() {
		Employee[] arr = pc.printEmployee();
		for(Employee e : arr) {
			System.out.println(e);
		}
	}
}
