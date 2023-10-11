package com.sorting;

import java.util.Comparator;

public class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {

		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;

		return -I1.compareTo(I2);
	}

}
