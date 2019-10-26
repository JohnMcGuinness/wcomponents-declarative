package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for IdProperty.
 * 
 * @author John McGuinness
 */
public class IdPropertyTest {

	private final String TEXT = "string";

	/**
	 * Test of id method with.
	 */
	@Test
	public void idTest() {

		IdProperty value1 = IdProperty.id(TEXT);
		assertEquals(TEXT, value1.value());

		IdProperty value2 = IdProperty.id(TEXT);
		assertTrue(value1.equals(value2));
		assertTrue(value2.equals(value1));
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {

		WTextField textfield = new WTextField();
		IdProperty instance = IdProperty.id(TEXT);

		instance.apply(textfield);

		assertEquals(instance.value(), textfield.getIdName());
	}
}
