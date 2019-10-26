package com.github.johnmcguinness.wcomponents.declarative.property;

import java.util.Objects;

public abstract class BooleanProperty implements Property<Boolean> {

	private final boolean value;
	private final String name;
	
	protected BooleanProperty(final String name, final boolean value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public final String name() {
		return name;
	}

	@Override
	public final Boolean value() {
		return value;
	}

	@Override
	public boolean equals(final Object obj) {
		
		if (obj == null || !(obj instanceof BooleanProperty)) {
			return false;
		}

		final BooleanProperty prop = (BooleanProperty) obj;
		
		return prop.name.equals(this.name) && prop.value == this.value;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 23 * hash + (this.value ? 1 : 0);
		hash = 23 * hash + Objects.hashCode(this.name);
		return hash;
	}
	
}
