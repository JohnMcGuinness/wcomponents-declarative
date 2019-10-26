package com.github.johnmcguinness.wcomponents.declarative.property;

import com.github.bordertech.wcomponents.AbstractInput;
import com.github.bordertech.wcomponents.WTextField;

public final class MandatoryProperty<C extends AbstractInput> 
	extends BooleanProperty 
	implements TextFieldProperty {

	public static MandatoryProperty mandatory(final boolean mandatory) {
		return new MandatoryProperty(mandatory);
	}

	public static MandatoryProperty mandatory() {
		return new MandatoryProperty(true);
	}
	
	public MandatoryProperty(final boolean value) {
		super("mandatory", value);
	}

	@Override
	public void apply(final WTextField input) {
		input.setMandatory(value());
	}
}
