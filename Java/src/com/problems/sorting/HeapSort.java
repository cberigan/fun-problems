package com.problems.sorting;

public class HeapSort implements ISort {
	
	private int heapSize;

	@Override
	public void sort(int[] arr) {
		if(arr == null || arr.length == 0){
			return;
		}
		this.heapSort(arr);
	}
	
	private void heapSort(int[] arr){
		this.buildMaxHeap(arr);
		for(int i = arr.length-1; i >=0;i--){
			this.exchange(arr, 0, i);
			this.heapSize -= 1;
			this.maxHeapify(arr, 0);
		}
	}
	
	private void exchange(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private void buildMaxHeap(int[] arr){
		this.heapSize = arr.length-1;
		for(int i = (int)Math.floor(this.heapSize / 2.0); i >= 0;i--){
			this.maxHeapify(arr,i);
		}
	}
	
	private void maxHeapify(int[] arr, int i){
		int largest = 0;
		int left = this.heapLeft(i);
		int right = this.heapRight(i);
		if(left <= this.heapSize && arr[left] > arr[i]){
			largest = left;
		}else{
			largest = i;
		}
		if(right <= this.heapSize && arr[right] > arr[largest]){
			largest = right;
		}
		if(largest != i){
			this.exchange(arr,i,largest);
			this.maxHeapify(arr, largest);
		}
	}
	
	private int heapLeft(int i){
		return 2 * i;
	}
	
	private int heapRight(int i){
		return 2 * i + 1;
	}

	@Override
	public String GetAlgorithm() {
		return "HeapSort";
	}

}
