package org.daya.guava.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.daya.guava.model.Simple;
import org.daya.guava.service.SimpleService;
import org.junit.Test;

import com.google.common.base.Optional;

public class UsingAndAvoidingNullTest {

	private SimpleService testObject = new SimpleService();
	
	@Test
	public void sampleImpl_whenNull() {
		Optional<Simple> toVerify = testObject.getSimple(true);
		
		assertFalse(toVerify.isPresent());
	}
	
	@Test
	public void sampleImpl_whenNotNull() {
		Optional<Simple> toVerify = testObject.getSimple(false);
		
		assertTrue(toVerify.isPresent());
	}	
}
