package com.github.johnmcguinness.wcomponents.declarative.property;

import java.util.Objects;

public abstract class PositiveIntegerProperty implements Property<Integer> {

	private final String name;
	private final int value;

	protected PositiveIntegerProperty(final String name, final int value) {
		Check.isGreaterThan(0,value, name + " must be greater than 0");
		this.name = name;
		this.value = value;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Integer value() {
		return this.value;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof PositiveIntegerProperty) {
			
			PositiveIntegerProperty p = (PositiveIntegerProperty) obj;

			return this.name.equals(p.name) && this.value == p.value;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 47 * hash + Objects.hashCode(this.name);
		hash = 47 * hash + this.value;
		return hash;
	}
}
