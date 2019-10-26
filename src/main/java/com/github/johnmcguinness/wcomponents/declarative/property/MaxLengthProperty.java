package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class MaxLengthProperty extends PositiveIntegerProperty implements TextFieldProperty {
	
	public static MaxLengthProperty maxLength(final int maxLength) {
		return new MaxLengthProperty(maxLength);
	}
	
	private MaxLengthProperty(final int maxLength) {
		super("maxLength", maxLength);
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setMaxLength(value());
	}
}
