package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class MinLengthProperty extends NonNegativeIntegerProperty implements TextFieldProperty {
	
	public static MinLengthProperty minLength(final int minLength) {
		return new MinLengthProperty(minLength);
	}
	
	private MinLengthProperty(final int minLength) {
		super("minLength", Check.isGreaterOrEqualElse(0, minLength));
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setMinLength(value());
	}
}
