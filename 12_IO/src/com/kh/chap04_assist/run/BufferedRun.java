package com.kh.chap04_assist.run;

import com.kh.chap04_assist.model.dao.BufferdDao;

public class BufferedRun {

	public static void main(String[] args) {

		BufferdDao bd = new BufferdDao();
		bd.fileSave();
		bd.fileRead();
	}

}
