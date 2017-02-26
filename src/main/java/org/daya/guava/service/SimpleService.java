package org.daya.guava.service;

import static com.google.common.base.Preconditions.checkArgument;

import org.daya.guava.model.Simple;

import com.google.common.base.Optional;

public class SimpleService {

	static final String TO_PERFORM_CALCUATION_ARGUMENT_MUST_BE_S_S_BUT_WAS_LESSER = "To perform calcuation argument must be %s > %s but was lesser";
	static final String TO_PERFORM_CALCUATION_ARGUMENT_SHOULD_NOT_BE_NULL = "To perform calcuation argument should not be null";
	static final int MIN_FOR_CALCULATION = 10;

	public Optional<Simple> getSimple(boolean returnNull) {
		Optional<Simple> nonNullRef = Optional.fromNullable(new Simple());
		Optional<Simple> nullRef = Optional.fromNullable(null);
		return returnNull ? nullRef : nonNullRef;
	}

	public Simple calculate(Integer i) {
		checkArgument(i != null, TO_PERFORM_CALCUATION_ARGUMENT_SHOULD_NOT_BE_NULL);
		checkArgument(i > MIN_FOR_CALCULATION, TO_PERFORM_CALCUATION_ARGUMENT_MUST_BE_S_S_BUT_WAS_LESSER, i, MIN_FOR_CALCULATION);	
		return new Simple();
	}
}
