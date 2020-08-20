package com.luisjrz96.algorithms.sorting;

public class Sort {

	private ArraySorter sorter;

	public void setSorter(ArraySorter sorter) {
		this.sorter = sorter;
	}
	
	public ArraySorter getSorter() {
		return sorter;
	}
	
	public <T extends Comparable<T>> T[] sort(T data[]) {
		if(sorter == null) 
			sorter =  new QuickSort();
		return sorter.sort(data);
	}
}
