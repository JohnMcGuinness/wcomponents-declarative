package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.WTextField;

public final class ColumnsProperty extends PositiveIntegerProperty implements TextFieldProperty {
	
	public static ColumnsProperty columns(final int columns) {
		return new ColumnsProperty(columns);
	}
	
	private ColumnsProperty(final int columns) {
		super("columns", Check.isGreaterOrEqualElse(1, columns));
	}

	@Override
	public void apply(final WTextField textfield) {
		textfield.setColumns(value());
	}
}
