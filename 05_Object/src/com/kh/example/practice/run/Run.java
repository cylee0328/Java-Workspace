package com.kh.example.practice.run;

import com.kh.example.practice3.model.vo.Circle;
import com.kh.example.practice4.model.vo.Student;
import com.kh.example.practice5.model.vo.Lotto;
import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Student lee = new Student();
		//lee.information();
		
		//new Lotto().information();
		
		//Circle cc = new Circle();
		//cc.incrementRadius();

		Book bk = new Book();
		Book bk1 = new Book("하하","호호","헤헤");
		Book bk2 = new Book("하하","호호","헤헤", 10000, 0.2);
		
		bk.inform();
		System.out.println();
		bk1.inform();
		System.out.println();
		bk2.inform();
	}

}
