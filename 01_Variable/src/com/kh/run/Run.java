package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;
import com.kh.variable.D_printf;
public class Run {

	public static void main(String[] args) {
		A_Variable va = new A_Variable();

		// va.printVariable();

		// va.delclareVariable();
		// va.initVariable();
		// va.constantVariable();

		B_KeyboardInput bk = new B_KeyboardInput();
		// bk.inputTest1();
		//bk.inputTest2();
		
		C_Cast cc= new C_Cast(); 
		//cc.autoCasting();
		//cc.forceCasting();
		
		D_printf dp = new D_printf();
		dp.printfTest();
		}
	
	}


