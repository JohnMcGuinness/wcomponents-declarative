package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for MandatoryProperty.
 * 
 * @author John McGuinness
 */
public class MandatoryPropertyTest {

	/**
	 * Test of mandatory method.
	 */
	@Test
	public void mandatoryTest() {

		assertTrue(MandatoryProperty.mandatory().value());
		assertTrue(MandatoryProperty.mandatory(true).value());
		assertFalse(MandatoryProperty.mandatory(false).value());
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {
		
		final WTextField textfield = new WTextField();

		MandatoryProperty instance = MandatoryProperty.mandatory();
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isMandatory());

		instance = MandatoryProperty.mandatory(false);
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isMandatory());

		instance = MandatoryProperty.mandatory(true);
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isMandatory());
	}
}
