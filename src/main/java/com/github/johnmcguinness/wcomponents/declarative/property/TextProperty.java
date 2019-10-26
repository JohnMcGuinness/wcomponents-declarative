package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class TextProperty extends StringProperty implements TextFieldProperty {

	public static TextProperty text(final String text) {
		return new TextProperty(text);
	}
	
	private TextProperty(final String text) {
		super("text", text);
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setText(value());
	}
}
