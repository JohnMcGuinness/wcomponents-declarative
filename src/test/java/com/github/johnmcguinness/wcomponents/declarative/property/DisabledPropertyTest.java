package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for DisabledProperty.
 * 
 * @author John McGuinness
 */
public class DisabledPropertyTest {

	/**
	 * Test of disabled method.
	 */
	@Test
	public void disabledTest() {

		assertTrue(DisabledProperty.disabled().value());
		assertTrue(DisabledProperty.disabled(true).value());
		assertFalse(DisabledProperty.disabled(false).value());
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {
		
		final WTextField textfield = new WTextField();

		DisabledProperty instance = DisabledProperty.disabled();
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isDisabled());

		instance = DisabledProperty.disabled(false);
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isDisabled());

		instance = DisabledProperty.disabled(true);
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isDisabled());
	}
}
