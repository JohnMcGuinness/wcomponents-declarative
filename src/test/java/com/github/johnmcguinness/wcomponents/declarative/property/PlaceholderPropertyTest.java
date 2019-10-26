package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for PlaceholderProperty.
 * 
 * @author John McGuinness
 */
public class PlaceholderPropertyTest {

	private final String TEXT = "string";

	/**
	 * Test of placeholder method with.
	 */
	@Test
	public void placeholderTest() {

		PlaceholderProperty value1 = PlaceholderProperty.placeholder(TEXT);
		assertEquals(TEXT, value1.value());

		PlaceholderProperty value2 = PlaceholderProperty.placeholder(TEXT);
		assertTrue(value1.equals(value2));
		assertTrue(value2.equals(value1));
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {

		WTextField textfield = new WTextField();
		PlaceholderProperty instance = PlaceholderProperty.placeholder(TEXT);

		instance.apply(textfield);

		assertEquals(instance.value(), textfield.getPlaceholder());
	}
}
