package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests for MaxLengthProperty.
 * 
 * @author John McGuinness
 */
public class MaxLengthPropertyTest {

	private final Integer MAX_LENGTH = 100;

	/**
	 * Test of maxLength method with valid argument.
	 */
	@Test
	public void validMaxLengthTest() {

		MaxLengthProperty value1 = MaxLengthProperty.maxLength(MAX_LENGTH);
		assertEquals(MAX_LENGTH, value1.value());
		
		MaxLengthProperty value2 = MaxLengthProperty.maxLength(MAX_LENGTH);
		assertTrue(value1.equals(value2));
		assertTrue(value2.equals(value1));
	}

	/**
	 * Test of maxLength method with invalid argument.
	 */
	@Test
	public void invalidMaxLengthTest() {

		try{
			MaxLengthProperty.maxLength(0);
			fail("Expected IllegalArgumentException");
		}
		catch(IllegalArgumentException e) {
			assertEquals("maxLength must be greater than 0", e.getMessage());
		}
		
		try{
			MaxLengthProperty.maxLength(-1);
			fail("Expected IllegalArgumentException");
		}
		catch(IllegalArgumentException e) {
			assertEquals("maxLength must be greater than 0", e.getMessage());
		}
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {

		WTextField textfield = new WTextField();
		MaxLengthProperty instance = MaxLengthProperty.maxLength(MAX_LENGTH);
		
		instance.apply(textfield);

		assertEquals(instance.value(), Integer.valueOf(textfield.getMaxLength()));
	}
}
