package com.problems.sorting.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.problems.sorting.HeapSort;
import com.problems.sorting.ISort;
import com.problems.sorting.MergeSort;
import com.problems.sorting.QuickSort;
import com.problems.util.DataGenerator;

public class SortingTest {

	@Test
	public void test() {
		
		List<ISort> sorters = new ArrayList<ISort>();
		sorters.add(new MergeSort());
		sorters.add(new QuickSort());
		sorters.add(new HeapSort());
		
		int[] arr = DataGenerator.GeneraterandomArray(31);
		System.out.println("Before: " + Arrays.toString(arr));
		for(ISort s : sorters){
			
			int[] tempArr = Arrays.copyOf(arr, arr.length);
			System.out.println("--" + s.GetAlgorithm() + "--");
			MergeSort ms = new MergeSort();
			long startTime = System.nanoTime();
			ms.sort(tempArr);
			long endTime = System.nanoTime();
			
			System.out.println("After: " + Arrays.toString(tempArr));
			System.out.println("Time: " + (endTime - startTime) );
		}
		
	}

}
