package com.kh.example.practice5.model.vo;

public class Lotto {
	
	private int[] lotto = new int[6];
	
	{
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45 + 1);
			lotto[i] = random;

			for (int j = 0; j < i; j++) {
				if (lotto[j] == random) {
					i--;
					break;
				}
			}
		}
	}
	public Lotto() {
		
	}

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public void information() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
