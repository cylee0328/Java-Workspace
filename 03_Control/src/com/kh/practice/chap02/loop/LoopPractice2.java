package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice2 {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.print("1이상의 숫자를 입력하세요");
			practice1();
		} else {
			for (int i = 1; i < num + 1; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.print("1 이상의 숫자를 입력하세요.");
		} else {
			for(int i=num; i>0; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i < num + 1; i++) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.printf(" + %d", i);
			}
			sum += i;
		}
		System.out.print(" = " + sum);
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
			practice4();
			return;
		} else {
			if (num1 > num2) {
				for (int i = 1; i < num1 + 1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = 1; i < num2 + 1; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
			practice5();
			return;
		} else {
			for(int i=num; i<10; i++) {
					System.out.printf("============== %d 단 =========== \n", i);
				for(int j=1; j<10; j++) {
					System.out.printf("%d x %d = %d \n", i, j, i*j);
				}
				System.out.println();
			}
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int op = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(num + " ");
			num += op;
		}
	}
	
	public void practice8() {
//		*
//		**
//		***
//		****
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
//		****
//		***
//		**
//		*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
//		    *
//		   **
//		  ***
//		 ****
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num - i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice11() {
//		****
//		 ***
//		  **
//		   *
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice12() {
//		   *
//		  ***
//		 *****
//		*******
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num - (1 + i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<1+2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		} 
		int count = 0;
		
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i % j==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("2부터 %d까지의 소수의 개수는 %d개 입니다.", num, count);
	}
	
	public void practice18() {
//		   *
//		  ***
//		 *****
//		  ***
//		   *
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - (1 + i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1 + 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < num-1; i++) {
			for (int j = 0; j < 1+i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (num-i) *2 -3 ; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
}
}