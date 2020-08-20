package com.luisjrz96.algorithms.sorting;

public class QuickSort implements ArraySorter{

	public <T extends Comparable<T>> T[] sort(T[] data) {
		int first = 0;
		int last = data.length -1;
		return sort(data, first, last);
	}
	
	
	public <T extends Comparable<T>> T[] sort(T[] data, int first, int last) {
		if(first < last) {
			int i = first, j = last;
			T pivot = data[(first+last)/2];
			T temp;
			do {
				while(data[i].compareTo(pivot) < 0) i++;
				while(pivot.compareTo(data[j]) < 0) j--;
				if(i <= j) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
					i++;
					j--;
				}
			}while(i <= j);
			
			sort(data, first, j);
			sort(data, i, last);
			
		}
		
		return data;
	}


}
