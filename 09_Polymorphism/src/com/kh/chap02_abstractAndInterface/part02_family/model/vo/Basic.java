package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public interface Basic {
	
	/*
	 * 인터페이스
	 * [표현법]
	 * [접근제한자] interface 인터페이스명 {}
	 * 
	 * - 상수필드와 추상메소드로만 이루어진 추상클래스의 변형체
	 * - 인터페이스에서 필드는 무조건 상수필드이다.
	 * - 인터페이스에서 메소드는 무조건 추상메소드이다.
	 * - 무조건 구현해야하는게 있을 때 인터페이스를 만들어서 상속하게 된다.
	 * - 인터페이스는 다중 상속을 허용한다.
	 * 	 (결국 메소드에 대한 정의만 하고 있어서 메소드가 겹치더라도 최종 구현 부분은 구현 클래스에서이루어 질 것이기 때문에
	 *    다중상속(구현)이 가능함.
	 * - 추상 클래스와 다르게 좀 더 강한 규칙성과 강제성을 가지는게 인터페이스이다.
	 * 
	 * 추상클래스와 인터페이스
	 * 
	 * 1. 공통점
	 * 	- 객체 생성은 안되나, 참조변수로서 사용이 가능하다.(즉 ,다형성을 적용할 수 있다)
	 * 	- 상속(구현)하는 클래스에 추상메소드를 구현하도록 강제한다.
	 * 
	 * 2. 차이점
	 * 	- 추상클래스는 클래스 내에 인스턴스 변수, 메소드를 생성이 가능하고, 추상메소드가 포함되었가나
	 * 	  abstract키워드로 클래스가 정의되어 있고
	 * 	  인터페이스는 인스턴스 변수, 메소드 생성이 불가능하며 모든 변수는 상수필드, 모든 메소드는 추상메소드로 정의되어있다.
	 * 
	 * 	- 존재하는 목적이 다르다.
	 * 	  추상클래스는 추상클래스를 상속받아서 기능을 이용하고, 클랫를 확장하는데 목적이 있다.
	 * 	  인터페이스는 클래스의 기능(함수) 구현을 강제하기 위해 사용된다. 즉 구현을 강제함으로써 구현객체의 동일한 동작을
	 * 	  보장할 수 있다.
	 * 
	 * 	  extends 와 implements
	 * 		- 클래스 간에 상속관계일 떄 : 클래스명 extends 부모클래스명
	 * 		- 클래스와 인터페이스의 구현 관계일 때 : 클래스명 implements 인터페이스명
	 * 		- 인터페이스간에 상속 관계일 때 : 인터페이슴ㅇ extends 인터페이스명, 인터페이스명
	 */
	
	
	/*public static final*/ int num = 10; // 기울임글꼴 == static변수
	// 인터페이스에서는 상수필드만 정의할 수 있기 때문에
	// 앞의 public static final 필드가 자동으로 붙어있게 됨.
	// num = 11; 상수라서 수정불가.
	
	
	/*public abstract*/ void eat();
	void sleep();
	// 인터페이스에서는 추상메소드만 정의할 수 있기 때문에 메소드의 몸통부 작성이 불가능하며
	// 자동으로 public abstract가 정의되어있음.
}
