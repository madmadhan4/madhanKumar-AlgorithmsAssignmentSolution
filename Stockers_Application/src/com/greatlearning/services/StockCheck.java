package com.greatlearning.services;

public class StockCheck {
	public int stockCheck(boolean[] boolArr, boolean value) {
		int count = 0;
		for(int i = 0; i<boolArr.length; i++) {
			if(boolArr[i] == value) {
				count++;
			}
		}
		return count;
	}

}
