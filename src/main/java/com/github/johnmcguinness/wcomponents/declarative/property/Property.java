package com.github.johnmcguinness.wcomponents.declarative.property;

/**
 *
 * @author John McGuinness
 */
public interface Property<T> {
	
	String name();
	
	T value();
}
