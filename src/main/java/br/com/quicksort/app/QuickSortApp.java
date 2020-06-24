package br.com.quicksort.app;

import br.com.quicksort.algorithm.QuickSort;
import br.com.quicksort.algorithm.RandomQuickSort;
import br.com.quicksort.util.ArrayUtil;

public class QuickSortApp {

	private static int[] array;
	
	public static void main(String[] args) {
		int n = 100;
		array = ArrayUtil.makeUnsorted(n);
		
		System.out.println("*********quicksort**********");
		System.out.println();
		
		System.out.println("original array: ");
		ArrayUtil.print(array);
		System.out.println();
		
		QuickSort qs = new QuickSort(array);
		qs.sort(0, array.length-1);
		
		System.out.println("sorted array: ");
		ArrayUtil.print(array);
		
		System.out.println();
		
		array = ArrayUtil.makeUnsorted(n);
		
		System.out.println("*********random quicksort**********");
		System.out.println();
		
		System.out.println("original array: ");
		ArrayUtil.print(array);
		System.out.println();
		
		RandomQuickSort rqs = new RandomQuickSort(array);
		rqs.sort(0, array.length-1);
		
		System.out.println("sorted array: ");
		ArrayUtil.print(array);

	}

}
