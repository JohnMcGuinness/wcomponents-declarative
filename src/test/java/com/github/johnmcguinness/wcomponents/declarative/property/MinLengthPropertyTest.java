package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for MinLengthProperty.
 * 
 * @author John McGuinness
 */
public class MinLengthPropertyTest {

	private final Integer MIN_LENGTH = 5;

	/**
	 * Test of minLength method with valid argument.
	 */
	@Test
	public void validMinLengthTest() {

		MinLengthProperty value1 = MinLengthProperty.minLength(MIN_LENGTH);
		assertEquals(MIN_LENGTH, value1.value());
		
		MinLengthProperty value2 = MinLengthProperty.minLength(MIN_LENGTH);
		assertTrue(value1.equals(value2));
		assertTrue(value2.equals(value1));
	}

	/**
	 * Test of minLength method with invalid argument.
	 */
	@Test
	public void invalidMaxLengthTest() {

		MinLengthProperty value1 = MinLengthProperty.minLength(-1);

		assertEquals(Integer.valueOf(0), value1.value());
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {

		WTextField textfield = new WTextField();
		MinLengthProperty instance = MinLengthProperty.minLength(MIN_LENGTH);
		
		instance.apply(textfield);

		assertEquals(instance.value(), Integer.valueOf(textfield.getMinLength()));
	}
}
