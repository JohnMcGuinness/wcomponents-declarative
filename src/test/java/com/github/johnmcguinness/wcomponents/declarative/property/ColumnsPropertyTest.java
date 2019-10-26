package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for ColumnsProperty.
 * 
 * @author John McGuinness
 */
public class ColumnsPropertyTest {

	private final Integer COLUMNS = 5;

	/**
	 * Test of columns method with valid argument.
	 */
	@Test
	public void validColumnsTest() {

		ColumnsProperty value1 = ColumnsProperty.columns(COLUMNS);
		assertEquals(COLUMNS, value1.value());
		
		ColumnsProperty value2 = ColumnsProperty.columns(COLUMNS);
		assertTrue(value1.equals(value2));
		assertTrue(value2.equals(value1));
	}

	/**
	 * Test of columns method with invalid argument.
	 */
	@Test
	public void invalidColumnsTest() {

		assertEquals(Integer.valueOf(1), ColumnsProperty.columns(0).value());
		assertEquals(Integer.valueOf(1), ColumnsProperty.columns(-1).value());
	}

	/**
	 * Test of apply method.
	 */
	@Test
	public void applyTest() {

		WTextField textfield = new WTextField();
		ColumnsProperty instance = ColumnsProperty.columns(COLUMNS);
		
		instance.apply(textfield);

		assertEquals(instance.value(), Integer.valueOf(textfield.getColumns()));
	}
}
