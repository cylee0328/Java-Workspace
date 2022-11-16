package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1+i;
			System.out.print(arr[i] + " ");
		}

	}
	
	public void practice4() {
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.

		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		char[] ch1 = new char[str.length()];

		int j = 0;
		for (int i = 0; i < ch1.length; i++) {
			ch1[i] = str.charAt(i);
			if (ch1[i] == ch) {
				System.out.print(i + " ");
				j++;
			}
		}
		System.out.printf("\n%c의 개수 : %d", ch, j);
	}
	
	public void practice6() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		String[] day = {"월","화","수","목","금","토","일"};
		
		System.out.print("0 ~ 6 까지의 숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<day.length; i++) {
			if(num<0 || num>6) {
				System.out.println("잘못 입력하셨습니다.");
				return;
			} else {
				System.out.println(day[num] + "요일");
				return;
			}
		}
	}
	
	public void practice7() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		
		int[] arr = new int[num1];
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int num2 = sc.nextInt();
			arr[i] = num2;
		}
		
		int sum =0;
		for(int i=0; i<num1; i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
			System.out.println("\n 총 합 : " + sum);
	}
	
	public void practice8() {
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		if(size<3 || size%2==0) {
			System.out.println("다시 입력하세요");
			practice8();
		} else {
			int[] arr = new int[size];
			for(int i=0; i<=size/2; i++) {
				arr[i] = 1+i;
				System.out.print(arr[i] + ", ");
			}
			
			int value = 1;
			for(int i=size/2+1; i<arr.length; i++) {
				arr[i] = size/2 + 1 - value;
				value++;
				System.out.print(arr[i] + (i == arr.length-1?  " " :", " ));
			}
		}
	}
	
	public void practice9() {
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		String[] food = { "양념", "후라이드", "순살" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();

		for (int i = 0; i < food.length; i++) {
			if (name.equals(food[i])) {
				System.out.printf("%s치킨 배달 가능", name);
				return;
			}
		}
		System.out.printf("%s치킨은 없는 메뉴입니다.", name);
	}
}
