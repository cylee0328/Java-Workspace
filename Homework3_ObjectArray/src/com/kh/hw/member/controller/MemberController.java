package com.kh.hw.member.controller;

import com.kh.hw.member.moder.vo.Member;

public class MemberController {
	public static final int Size = 10;
	private Member[]m = new Member[Size];
	
	public int existMemberNum() {
		int count = 0;
		for(Member mb : m) {
			if(mb != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i =0 ; i<m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		for(Member mb : m) {
			if(mb != null && mb.getId().equals(id)) {
				return mb.toString();
			}
		}
		return "";
	}
	public Member[] searchName(String name) {
		Member[] mb = new Member[Size];
		int index = 0;
		for(Member mb1 : m) {
			if(mb1 != null && mb1.getName().equals(name)) {
				mb[index++] = mb1;
			}
		}
		return mb;
	}
	
	public Member[] searchEmail(String email) {
		Member[] mb = new Member[Size];
		int index = 0;
		for(Member mb1 : m) {
			if(mb1 != null && mb1.getEmail().equals(email)) {
				mb[index++] = mb1;
			}
		}
		return mb;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean result  = false;
		for(Member member : m) {
			if(member != null && member.getId().equals(id) ) {
				member.setPassword(password);
				result = true;
			}
		}
		return result;
	}
	
	public boolean updateName(String id, String name) {
		boolean result  = false;
		for(Member member : m) {
			if(member != null && member.getId().equals(id) ) {
				member.setName(name);
				result = true;
			}
		}
		return result;
	}
	
	public boolean updateEmail(String id, String email) {
		boolean result  = false;
		for(Member member : m) {
			if(member != null && member.getId().equals(id) ) {
				member.setEmail(email);
				result = true;
			}
		}
		return result;
	}
	
	public boolean delete(String id) {
		boolean result = false;
		for(int i=0; i<Size; i++) {
			if(m[i] != null && m[i].getId().equals(id) ) {
				m[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}
	
	public void delete() {
		m = new Member[Size];
	}
	
	public Member[] printAll() {
		return m;
	}
}
