package org.daya.guava.service;

import java.util.List;

import com.google.common.collect.Lists;

public class ListUtils<T> {
	
	public List<List<T>> partition(List<T> list, int size) {
		return Lists.partition(list, size);
	}
}
