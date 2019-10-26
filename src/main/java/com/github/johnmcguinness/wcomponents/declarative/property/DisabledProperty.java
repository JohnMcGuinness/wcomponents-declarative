package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class DisabledProperty extends BooleanProperty implements TextFieldProperty {

	public static DisabledProperty disabled(final boolean disabled) {
		return new DisabledProperty(disabled);
	}

	public static DisabledProperty disabled() {
		return disabled(true);
	}
	
	public DisabledProperty(final boolean value) {
		super("disabled", value);
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setDisabled(value());
	}
}
