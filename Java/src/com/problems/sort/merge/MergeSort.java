package com.problems.sort.merge;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int values = 20;
		
		int[] arr = new int[values];
		
		for(int i = 0;i < values;i++){
			arr[i] = (int)(Math.random() * 100.0);
		}
		
		System.out.println("Before: " + Arrays.toString(arr));
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr,0, arr.length-1);
		System.out.println("After: " + Arrays.toString(arr));
	}
	
	private void mergeSort(int[] arr, int start, int end){
		
		int mid = ( end + start ) / 2;
		
		if( start >= end ) return;
		
		mergeSort( arr, start, mid);
		mergeSort( arr, mid + 1, end);
		
		this.merge(arr, start, mid, end);
		
	}

	private void merge(int[] arr, int start, int middle, int end){
		
		//create temp arrays for two left and right arrays
		int sizeLeft = middle-start + 1;
		int sizeRight = end-middle;
		
		int[] left = new int[sizeLeft];
		int[] right = new int[sizeRight];
		
		//copy data from arrays
		for(int i = start;i <= middle;i++){
			left[i-start] = arr[i];
		}
		for(int i = middle+1;i <= end;i++){
			right[i-middle-1] = arr[i];
		}
		
		//set test pointers
		int i = 0;
		int j = 0;
		//merge them
		for(;i < sizeLeft && j < sizeRight;start++){
			if(left[i] <= right[j]){
				arr[start] = left[i];
				i++;
			}else{
				arr[start] = right[j];
				j++;
			}
		}
		while(i < sizeLeft){
			arr[start] = left[i];
			start++;
			i++;
		}
		
		while(j < sizeRight){
			arr[start] = right[j];
			start++;
			j++;
		}
	}
}
