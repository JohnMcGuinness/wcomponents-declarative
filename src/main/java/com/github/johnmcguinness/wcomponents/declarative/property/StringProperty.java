package com.github.johnmcguinness.wcomponents.declarative.property;

import java.util.Objects;

public abstract class StringProperty implements Property<String> {

	private final String value;
	private final String name;
	
	protected StringProperty(final String name, final String value) {
		this.value = value;
		this.name = name;
	}

	@Override
	public String name() {
		return name;
	}
	
	@Override
	public String value() {
		return value;
	}
	
	@Override
	public boolean equals(final Object obj) {

		if (!(obj instanceof StringProperty)) {
			return false;
		}
		
		StringProperty prop = (StringProperty) obj;
		
		return prop.name.equals(this.name) && prop.value.equals(this.value);
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 59 * hash + Objects.hashCode(this.value);
		hash = 59 * hash + Objects.hashCode(this.name);
		return hash;
	}

	@Override
	public String toString() {
		return name + " = \"" + value + "\"";
	}
}
