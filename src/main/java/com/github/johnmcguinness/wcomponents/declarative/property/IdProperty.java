package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public class IdProperty extends StringProperty implements CommonProperty {
	
	public static IdProperty id(final String id) {
		return new IdProperty(id);
	}
	
	public IdProperty(final String value) {
		super("id", value);
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setIdName(value());
	}
}
