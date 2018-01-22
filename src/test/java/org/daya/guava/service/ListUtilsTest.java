package org.daya.guava.service;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListUtilsTest {

	private static final int DEFAULT_PARTITION_MIN_SIZE_1 = 1;
	private static final int DEFAULT_LIST_SIZE_5 = 5;
	private static final int SIZE_GREATER_THAN_LIST_SIZE_10 = 10;
	private static final int ZERO = 0;
	private ListUtils<Integer> listUtils = new ListUtils<>();

	@Test
	public void partition_whenTypical() {
		List<Integer> integerList = new ArrayList<>();
		for (int i = 0; i < DEFAULT_LIST_SIZE_5; i++) {
			integerList.add(i);
		}

		List<List<Integer>> partitionList = listUtils.partition(integerList, SIZE_GREATER_THAN_LIST_SIZE_10);

		assertThat(partitionList, hasSize(DEFAULT_PARTITION_MIN_SIZE_1));
		assertThat(partitionList.get(0), hasSize(DEFAULT_LIST_SIZE_5));
	}
	
	@Test
	public void partition_whenEmpty() {
		List<Integer> integerList = new ArrayList<>();

		List<List<Integer>> partitionList = listUtils.partition(integerList, SIZE_GREATER_THAN_LIST_SIZE_10);

		assertThat(partitionList, hasSize(ZERO));
	}	
}
