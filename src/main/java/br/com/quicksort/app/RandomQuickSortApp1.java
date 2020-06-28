package br.com.quicksort.app;

import br.com.quicksort.algorithm.RandomQuickSort;
import br.com.quicksort.util.ArrayUtil;

public class RandomQuickSortApp1 {
	
   private static int[] array;
	
	public static void sortArray(int n) {
		array = ArrayUtil.build(n);	
		RandomQuickSort rqs = new RandomQuickSort(array);
		rqs.sort(0, array.length-1);
	}
	
	public static void main(String[] args) {
		for(int i=1000; i <= 5000; i++) {
			long startTime = System.currentTimeMillis();
			sortArray(i);
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("Tempo (em ms): " + totalTime);
		}
	}


}
