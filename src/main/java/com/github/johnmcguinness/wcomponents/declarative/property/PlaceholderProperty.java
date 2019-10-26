package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class PlaceholderProperty extends StringProperty implements TextFieldProperty {

	public static PlaceholderProperty placeholder(final String placeholder) {
		return new PlaceholderProperty(placeholder);
	}
	
	private PlaceholderProperty(final String placeholder) {
		super("placeholder", placeholder);
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setPlaceholder(value());
	}
}
