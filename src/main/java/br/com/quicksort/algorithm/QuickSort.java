package br.com.quicksort.algorithm;

public class QuickSort {

	protected int[] array;
	
	public QuickSort(int[] array) {
		this.array = array;
	}
	
	protected void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	protected int partition(int p, int r){
		int x = array[r];
		int i = p-1;
		
		for(int j=p; j<r; j++){
			if(array[j] <= x) {
				i++;
				swap(i, j);
			}
		}
		
		swap(i+1, r);
		
		return i+1;
	}
	
	public void sort(int p, int r){
		if(p<r){
			int q = partition(p, r);
			sort(p, q-1);
			sort(q+1, r);
		}
	}
}
