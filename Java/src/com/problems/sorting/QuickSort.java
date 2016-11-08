package com.problems.sorting;

public class QuickSort implements ISort{
	
	public String GetAlgorithm() {
		return "QuickSort";
	}
	
	public void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
		this.quickSort(arr,0, arr.length-1);
	}
	
	private void quickSort(int[] arr, int start, int end){
		
		int pivot = ( start + end ) / 2;
		
		int i = start;
		int j = end;
		while( i < j ){
			
			//find item on left that should be on right
			while(arr[i] < arr[pivot]){
				i++;
			}
			//find item on right that should be on the left
			while(arr[j] > arr[pivot]){
				j--;
			}
			
			//switch them
			int temp=arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
			j--;
			i++;
			
		}
		
		this.quickSort(arr, start, pivot);
		this.quickSort(arr, pivot + 1, end);
		
	}
}
