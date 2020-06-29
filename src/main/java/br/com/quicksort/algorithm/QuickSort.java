package br.com.quicksort.algorithm;

public class QuickSort {

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
	
	public static void sort(int[] array, int p, int r){
		if(p<r){
			int q = partition(array, p, r);
			sort(array, p, q-1);
			sort(array, q+1, r);
		}
	}
}
