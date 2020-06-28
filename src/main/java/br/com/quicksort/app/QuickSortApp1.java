package br.com.quicksort.app;

import br.com.quicksort.algorithm.QuickSort;
import br.com.quicksort.util.ArrayUtil;

public class QuickSortApp1 {

	 private static int[] array;
		
		public static void sortArray(int n) {
			array = ArrayUtil.build(n);
			QuickSort qs = new QuickSort(array);
			qs.sort(0, array.length-1);
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
