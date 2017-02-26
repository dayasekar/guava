package org.daya.guava.service;

import org.daya.guava.model.Simple;

import com.google.common.base.Optional;

public class SimpleService {

	public Optional<Simple> getSimple(boolean returnNull) {
		Optional<Simple> nonNullRef = Optional.fromNullable(new Simple());
		Optional<Simple> nullRef = Optional.fromNullable(null);
		return returnNull ? nullRef : nonNullRef;
	}
}
