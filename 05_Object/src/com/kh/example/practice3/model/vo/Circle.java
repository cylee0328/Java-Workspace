package com.kh.example.practice3.model.vo;

public class Circle {
	
	private static final double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		getAreaOfCircle();
		getSizeOfCircle(); 
	}

	
	

	public static double getPi() {
		return PI;
	}




	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		radius++;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	public void getAreaOfCircle() {//둘레
		System.out.println("둘레 : " + PI  * radius*2);
	}
	
	public void getSizeOfCircle() {//넓이
		System.out.println("원의 넓이 : "+ PI * (radius*radius));
	}
}
