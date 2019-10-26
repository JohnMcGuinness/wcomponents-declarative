package com.github.johnmcguinness.wcomponents.declarative;

import com.github.bordertech.wcomponents.WTextField;
import com.github.johnmcguinness.wcomponents.declarative.property.TextFieldProperty;

/**
 *
 * @author John McGuinness
 */
public final class TextField {

	private TextField() {
        // No instances for you.
    }

	public static WTextField textfield(final TextFieldProperty... props) {
		
		final WTextField textField = new WTextField();
		
		for (TextFieldProperty prop : props) {
            prop.apply(textField);
        }
				
        return textField;
	}
}
