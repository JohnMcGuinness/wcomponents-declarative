package com.github.johnmcguinness.wcomponents.declarative.property;

import java.util.Objects;

public abstract class NonNegativeIntegerProperty implements Property<Integer> {

	private final String name;
	private final int value;

	protected NonNegativeIntegerProperty(final String name, final int value) {
		this.name = name;
		this.value = Check.isGreaterOrEqual(0,value, name + " must be zero or positive.");
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
		
		if(obj instanceof NonNegativeIntegerProperty) {
			
			NonNegativeIntegerProperty p = (NonNegativeIntegerProperty) obj;

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
