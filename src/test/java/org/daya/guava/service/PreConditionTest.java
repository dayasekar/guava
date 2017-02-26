package org.daya.guava.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PreConditionTest {

	private SimpleService testObject = new SimpleService();

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void calculate_whenNull() {
		try {
			testObject.calculate(null);
		} finally {
			expectedException.expect(IllegalArgumentException.class);
			expectedException.expectMessage(SimpleService.TO_PERFORM_CALCUATION_ARGUMENT_SHOULD_NOT_BE_NULL);
		}
	}

	@Test
	public void calculate_whenValueIsSmallerThanMinValue() {
		int input = 1;
		try {
			testObject.calculate(input);
		} finally {
			expectedException.expect(IllegalArgumentException.class);
			expectedException.expectMessage(
					String.format(SimpleService.TO_PERFORM_CALCUATION_ARGUMENT_MUST_BE_S_S_BUT_WAS_LESSER, input,
							SimpleService.MIN_FOR_CALCULATION));
		}
	}
}
