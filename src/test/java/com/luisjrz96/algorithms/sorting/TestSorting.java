package com.luisjrz96.algorithms.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestSorting {

	private User userList[];
	@Before
	public void setup() {
		User user1 = User.builder().name("luis").age(24).phoneNumber("1111111111").build();
		User user2 = User.builder().name("miguel").age(21).phoneNumber("222222222").build();
		User user3 = User.builder().name("andres").age(26).phoneNumber("3333333333").build();
		User user4 = User.builder().name("maria").age(20).phoneNumber("4444444444").build();
		User user5 = User.builder().name("gabriela").age(22).phoneNumber("5555555555").build();
		
		userList = new User[] {user1, user2, user3, user4, user5};
	}
	
	
	@Test
	public void testBubleSort() {
		User expected[] = {userList[3], userList[1], userList[4], userList[0], userList[2]};
		User input[] = (userList).clone();
		ArraySorter arraySorter = new BubbleSort();
		User result[] = arraySorter.sort(input);		
		Assert.assertArrayEquals(expected, result);
		
	}
	
	@Test
	public void testQuickSort() {
		User expected[] = {userList[3], userList[1], userList[4], userList[0], userList[2]};
		User input[] = (userList).clone();
		ArraySorter arraySorter = new QuickSort();
		User result[] = arraySorter.sort(input);		
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void testStrategyBubbleSort() {
		Sort sorter = new Sort();
		ArraySorter arraySorter = new BubbleSort();
		sorter.setSorter(arraySorter);
		User expected[] = {userList[3], userList[1], userList[4], userList[0], userList[2]};
		User input[] = (userList).clone();
		User result[] = sorter.sort(input);		
		Assert.assertArrayEquals(expected, result);
		Assert.assertEquals(arraySorter.getClass().getName(), BubbleSort.class.getName());
	}
	
	@Test
	public void testStrategyQuickSort() {
		Sort sorter = new Sort();
		ArraySorter arraySorter = new QuickSort();
		sorter.setSorter(arraySorter);
		User expected[] = {userList[3], userList[1], userList[4], userList[0], userList[2]};
		User input[] = (userList).clone();
		User result[] = sorter.sort(input);		
		Assert.assertArrayEquals(expected, result);
		Assert.assertEquals(arraySorter.getClass().getName(), QuickSort.class.getName());
	}
	
	@Test
	public void testDefaultStrategyQuickSort() {
		Sort sorter = new Sort();
		User expected[] = {userList[3], userList[1], userList[4], userList[0], userList[2]};
		User input[] = (userList).clone();
		User result[] = sorter.sort(input);		
		Assert.assertArrayEquals(expected, result);
		Assert.assertEquals(sorter.getSorter().getClass().getName(), QuickSort.class.getName());
	}
}
