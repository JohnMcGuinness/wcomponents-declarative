package com.github.johnmcguinness.wcomponents.declarative;

import com.github.bordertech.wcomponents.WTextField;
import static com.github.johnmcguinness.wcomponents.declarative.TextField.textfield;
import static com.github.johnmcguinness.wcomponents.declarative.property.ColumnsProperty.columns;
import static com.github.johnmcguinness.wcomponents.declarative.property.DisabledProperty.disabled;
import static com.github.johnmcguinness.wcomponents.declarative.property.IdProperty.id;
import static com.github.johnmcguinness.wcomponents.declarative.property.MandatoryProperty.mandatory;
import static com.github.johnmcguinness.wcomponents.declarative.property.MaxLengthProperty.maxLength;
import static com.github.johnmcguinness.wcomponents.declarative.property.MinLengthProperty.minLength;
import static com.github.johnmcguinness.wcomponents.declarative.property.PlaceholderProperty.placeholder;
import static com.github.johnmcguinness.wcomponents.declarative.property.ReadOnlyProperty.readonly;
import static com.github.johnmcguinness.wcomponents.declarative.property.TextProperty.text;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author John McGuinness
 */
public class TextFieldTest {

	@Test
	public void textfield_NoProperties() {
		
		WTextField textField = TextField.textfield();

		assertEquals(0, textField.getColumns());
		assertEquals(false, textField.isDisabled());
		assertEquals(null, textField.getIdName());
		assertEquals(false, textField.isMandatory());
		assertEquals(0, textField.getMaxLength());
		assertEquals(0, textField.getMinLength());
		assertEquals(null, textField.getPlaceholder());
		assertEquals(false, textField.isReadOnly());
		assertEquals(null, textField.getText());
	}

	@Test
	public void textfield_AllProperties() {
		
		final String ID = "id";
		final int COLUMNS = 5;
		final boolean DISABLED = true;
		final boolean MANDATORY = true;
		final boolean READONLY = true;
		final int MAX_LENGTH = 10;
		final int MIN_LENGTH = 2;
		final String PLACEHOLDER = "placeholder";
		final String TEXT = "text";
		
		WTextField textField 
			= textfield(
				id(ID),
				columns(COLUMNS),
				disabled(),
				mandatory(),
				maxLength(MAX_LENGTH),
				minLength(MIN_LENGTH),
				placeholder(PLACEHOLDER),
				readonly(),
				text(TEXT)
			);

		assertEquals(COLUMNS, textField.getColumns());
		assertEquals(DISABLED, textField.isDisabled());
		assertEquals(ID, textField.getIdName());
		assertEquals(MANDATORY, textField.isMandatory());
		assertEquals(MAX_LENGTH, textField.getMaxLength());
		assertEquals(MIN_LENGTH, textField.getMinLength());
		assertEquals(PLACEHOLDER, textField.getPlaceholder());
		assertEquals(READONLY, textField.isReadOnly());
		assertEquals(TEXT, textField.getText());
	}
}
