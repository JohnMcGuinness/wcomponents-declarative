package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class PatternProperty extends StringProperty implements TextFieldProperty {

	public static PatternProperty pattern(final String pattern) {
		return new PatternProperty(pattern);
	}

	private PatternProperty(final String pattern) {
		super("pattern", pattern);
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setPattern(value());
	}
}
