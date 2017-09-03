package com.metacube.testSort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.sort.BubbleSort;
import com.metacube.sort.CountingSort;
import com.metacube.sort.QuickSort;
import com.metacube.sort.RadixSort;

public class TestSort {
	private int[] resultArray;	//actual array
	private int[] expectedArray;	//expected array
	private static int[] array;	//array to be sort
	
	//initializing array Before Class
	@BeforeClass
	public static void setup() {
		array = new int[]{120,145,854,263,475,21,1,152};
	}
	
	//Positive Test-Case
	@Test
	public void testBubbleSort() {
		resultArray = BubbleSort.sort(array);
		expectedArray = new int[]{1,21,120,145,152,263,475,854};
		assertArrayEquals(resultArray, expectedArray);
	}
	
	//Positive Test-Case
	@Test
	public void testQuickSort() {
		resultArray = QuickSort.sort(array);
		expectedArray = new int[]{1,21,120,145,152,263,475,854};
		assertArrayEquals(resultArray, expectedArray);
	}
	
	//Positive Test-Case
	@Test
	public void testRadixSort() {
		resultArray = RadixSort.sort(array);
		expectedArray = new int[]{1,21,120,145,152,263,475,854};
		assertArrayEquals(resultArray, expectedArray);
	}
	
	//Positive Test-Case
	@Test
	public void testCountingSort() {
		resultArray = CountingSort.sort(array);
		expectedArray = new int[]{1,21,120,145,152,263,475,854};
		assertArrayEquals(resultArray, expectedArray);
	}
	
	//Negative Test-Case
	@Test
	public void testBubbleSortNegative() {
		resultArray = BubbleSort.sort(array);
		expectedArray = new int[]{21,1,120,145,152,263,475,854};
		assertFalse(resultArray == expectedArray);
	}
	
	//Negative Test-Case
	@Test
	public void testQuickSortNegative() {
		resultArray = QuickSort.sort(array);
		expectedArray = new int[]{1,854,21,120,145,152,263,475};
		assertFalse(resultArray == expectedArray);
	}
	
	//Negative Test-Case
	@Test
	public void testRadixSortNegative() {
		resultArray = RadixSort.sort(array);
		expectedArray = new int[]{21,1,120,145,152,263,475,854};
		assertFalse(resultArray == expectedArray);
	}
	
	//Negative Test-Case
	@Test
	public void testCountingSortNegative() {
		resultArray = CountingSort.sort(array);
		expectedArray = new int[]{21,1,120,145,152,263,475,854};
		assertFalse(resultArray == expectedArray);
	}
	
	//Null-Valued Test-Case
	@Test
	public void testBubbleSortNullCase() {
		try {
			resultArray = BubbleSort.sort(null);
			assertArrayEquals(resultArray, expectedArray);
		} catch(NullPointerException e) {
			System.out.println("Exception caught in junit");
		}
	}
	
	//Null-Valued Test-Case
	@Test
	public void testQuickSortNullCase() {
		try {	
			resultArray = QuickSort.sort(null);
			assertArrayEquals(resultArray, expectedArray);
		} catch(NullPointerException e) {
			System.out.println("Exception caught in junit");
		}
	}
	
	//Null-Valued Test-Case
	@Test
	public void testRadixSortNullCase() {
		try {
			resultArray = RadixSort.sort(null);
		} catch(NullPointerException e) {
			assertEquals(e.getMessage(),"NULL array");
		}
	}
	
	//Null-Valued Test-Case
	@Test
	public void testCountingSortNullCase() {
		try {
			resultArray = CountingSort.sort(null);
			assertArrayEquals(resultArray, expectedArray);
		} catch(NullPointerException e) {
			System.out.println("Exception caught in junit");
		}
	}
}
