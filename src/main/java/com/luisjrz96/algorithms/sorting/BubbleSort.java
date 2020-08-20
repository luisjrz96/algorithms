package com.luisjrz96.algorithms.sorting;

public class BubbleSort implements ArraySorter{

	
	public <T extends Comparable<T>> T[] sort(T[] data) {
		T aux;
		for(int i = 0; i < data.length-1; i++) {
			for(int j=i+1; j < data.length; j++) {
				if(data[i].compareTo(data[j]) > 0) {
					aux = data[i];
					data[i] = data[j];
					data[j] = aux;
				}
			}
		}
		return data;
	}

	
}
