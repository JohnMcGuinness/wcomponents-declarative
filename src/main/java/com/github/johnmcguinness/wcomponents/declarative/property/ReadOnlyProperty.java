package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class ReadOnlyProperty extends BooleanProperty implements TextFieldProperty {

	public static ReadOnlyProperty readonly(final boolean readonly) {
		return new ReadOnlyProperty(readonly);
	}

	public static ReadOnlyProperty readonly() {
		return readonly(true);
	}
	
	public ReadOnlyProperty(final boolean value) {
		super("readOnly", value);
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setReadOnly(value());
	}
}
