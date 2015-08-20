package symbols;

import basic.TextConstants;

public class Add implements Symbol {
	
	private final String textualRepresentation = TextConstants.add;

	public String toString () {
		return this.textualRepresentation;
		
	}
	
	public boolean equals (Object o) {
		return o.getClass().equals(getClass());
	}
	
}
