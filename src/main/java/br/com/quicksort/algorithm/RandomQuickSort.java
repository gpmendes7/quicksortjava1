package br.com.quicksort.algorithm;

import java.util.Random;

public class RandomQuickSort {

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static int partition(int[] array, int p, int r){
		int x = array[r];
		int i = p-1;
		
		for(int j=p; j<r; j++){
			if(array[j] <= x) {
				i++;
				swap(array, i, j);
			}
		}
		
		swap(array, i+1, r);
		
		return i+1;
	}
	
	private static int rpartition(int[] array, int p, int r) {
		Random rand = new Random(); 
        int i = rand.nextInt(r-p+1) + p; 
		swap(array, i, r);
		return partition(array, p, r);
	}
	
	public static void sort(int[] array, int p, int r){
		if(p<r){
			int q = rpartition(array, p, r);
			sort(array, p, q-1);
			sort(array, q+1, r);
		}
	}
}
