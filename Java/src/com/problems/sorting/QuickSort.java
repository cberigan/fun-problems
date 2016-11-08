package com.problems.sorting;

public class QuickSort implements ISort{
	
	@Override
	public String GetAlgorithm() {
		return "QuickSort";
	}
	
	@Override
	public void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
		this.quickSort(arr,0, arr.length-1);
	}
	
	private void quickSort(int[] arr, int start, int end){
		
		if(end <= start) return;
		
		int divider = this.partition(arr, start, end);
		this.quickSort(arr, start, divider-1);
		this.quickSort(arr, divider + 1, end);
		
	}
	
	private void exchange(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	private int partition(int[] arr, int start,int end){
		
		int pivot = arr[end];
		int divider = start;
		
		for(int test = start; test <= end-1;test++){
			if(arr[test] <= pivot){
				this.exchange(arr, divider, test);
				divider++;
			}
		}
		this.exchange(arr, divider, end);
		return divider;
	}
}
