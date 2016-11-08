package com.problems.util;

public class DataGenerator {
	
	public static int[] GeneraterandomArray(int amount){
		
		int[] arr = new int[amount];
		
		for(int i = 0;i < amount;i++){
			arr[i] = (int)(Math.random() * 100.0);
		}
		return arr;
	}

}
