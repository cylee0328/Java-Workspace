package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	Scanner sc = new Scanner(System.in);

	public void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice1() {
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.

		String[][] arr = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
	}

	public void practice2() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];

		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += a++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];

		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += 16 - a++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
//		4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//		아래의 내용처럼 처리하세요.

		int[][] arr = new int[4][4];
		int sum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);

				arr[i][3] += arr[i][j]; // 각 행의 모든 값의 합

				arr[3][j] += arr[i][j]; // 각 열의 모든 값의 합

				arr[3][3] += arr[i][j] * 2; // 가로 세로의 총합

			}
		}
		printArray(arr);
	}

	public void practice5() {
		/*
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.”
		 * 출력 후 다시 정수를 받게 하세요. 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요. (char형은
		 * 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		 */
		while (true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();

			System.out.print("열 크기 : ");
			int col = sc.nextInt();

			if (!(row >= 1 && row <= 10 && col >= 1 && col <= 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력하세요.");
				continue;
			}

			char[][] arr = new char[row][col];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char) (int) (Math.random() * 26 + 65);
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%2c ", arr[i][j]);
				}
				System.out.println();
			}
			break;
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.printf("%s ", strArr[i][j]);
				}
				System.out.println();
			}
	}

	public void practice7() {
//	사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
//	문자형 가변 배열을 선언 및 할당하세요.
//	그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		char[][] arr = new char[row][];

		for (int i = 0; i < row; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			int col = sc.nextInt();
			arr[i] = new char[col];

		}
		char ch = 'a';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch;
				if (ch == 'z') {
					ch = 'a';
				} else {
					ch++;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2c ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice8() {
//		1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
//		2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
//		1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
//		<출석부>
//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		System.out.println("=== 1분단 ===");
		
		int a= 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr[a++];
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=== 2분단 ===");
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[a++];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public void practice9() {
		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];

		System.out.println("=== 1분단 ===");

		int a = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr[a++];
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=== 2분단 ===");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[a++];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		char[] line = {'첫', '두', '세'};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (name.equals(arr1[i][j])) {
					System.out.printf("검색하신 %s 학생은 1분단 %c 번째 줄 %s에 있습니다.", name, line[i], 
							j==0 ? "왼쪽" : "오른쪽");
				}
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (name.equals(arr2[i][j])) {
					System.out.printf("검색하신 %s 학생은 2분단 %c 번째 줄 %s에 있습니다.", name, line[i], j == 0 ? "왼쪽" : "오른쪽");
				}
			}
		}
	}
}