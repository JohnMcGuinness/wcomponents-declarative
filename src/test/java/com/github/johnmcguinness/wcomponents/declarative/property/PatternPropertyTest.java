package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for PatternProperty.
 * 
 * @author John McGuinness
 */
public class PatternPropertyTest {

	private final String TEXT = "string";

	/**
	 * Test of pattern method with.
	 */
	@Test
	public void patternTest() {

		PatternProperty value1 = PatternProperty.pattern(TEXT);
		assertEquals(TEXT, value1.value());

		PatternProperty value2 = PatternProperty.pattern(TEXT);
		assertTrue(value1.equals(value2));
		assertTrue(value2.equals(value1));
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {

		WTextField textfield = new WTextField();
		PatternProperty instance = PatternProperty.pattern(TEXT);

		instance.apply(textfield);

		assertEquals(instance.value(), textfield.getPattern());
	}
}
