package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for ReadOnlyProperty.
 * 
 * @author John McGuinness
 */
public class ReadOnlyPropertyTest{

	/**
	 * Test of readonly method.
	 */
	@Test
	public void readonlyTest() {

		assertTrue(ReadOnlyProperty.readonly().value());
		assertTrue(ReadOnlyProperty.readonly(true).value());
		assertFalse(ReadOnlyProperty.readonly(false).value());
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {
		
		final WTextField textfield = new WTextField();

		ReadOnlyProperty instance = ReadOnlyProperty.readonly();
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isReadOnly());

		instance = ReadOnlyProperty.readonly(false);
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isReadOnly());

		instance = ReadOnlyProperty.readonly(true);
		instance.apply(textfield);
		assertEquals(instance.value(), textfield.isReadOnly());
	}
}
