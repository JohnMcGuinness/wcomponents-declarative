package com.github.johnmcguinness.wcomponents.declarative.property;

public final class Check {

    private Check() {
    }

	public static <T> T notNull(final T arg) {
		
		if (arg == null) {
			throw new IllegalArgumentException("arg must not be null");
		}
		
		return arg;
	}

	public static int isGreaterThan(final int min, final int value) {
		return isGreaterThan(min, value, "value must be greater than " + min + ".");
	}

	public static int isGreaterThan(final int min, final int value, final String message) {
		if(value <= min) {
			throw new IllegalArgumentException(message); 
		}
		return value;
	}

	public static int isGreaterOrEqual(final int min, final int value) {
		return isGreaterOrEqual(min, value, "value must be greater than or equal to " + min + ".");
	}

	public static int isGreaterOrEqual(final int min, final int value, final String message) {
		if(value < min) {
			throw new IllegalArgumentException(message); 
		}
		return value;
	}

	public static int isGreaterOrEqualElse(final int min, final int value) {
		return (value < min) ? min : value;
	}
}
