package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for TextProperty.
 * 
 * @author John McGuinness
 */
public class TextPropertyTest {

	private final String TEXT = "string";

	/**
	 * Test of text method with.
	 */
	@Test
	public void textTest() {

		TextProperty value1 = TextProperty.text(TEXT);
		assertEquals(TEXT, value1.value());

		TextProperty value2 = TextProperty.text(TEXT);
		assertTrue(value1.equals(value2));
		assertTrue(value2.equals(value1));
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {

		WTextField textfield = new WTextField();
		TextProperty instance = TextProperty.text(TEXT);

		instance.apply(textfield);

		assertEquals(instance.value(), textfield.getText());
	}
}
