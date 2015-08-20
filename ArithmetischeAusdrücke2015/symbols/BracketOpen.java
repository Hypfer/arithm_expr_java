package symbols;

import basic.TextConstants;

public class BracketOpen implements Symbol {
	
	private final String textualRepresentation = TextConstants.bracketOpen;
	
	public String toString () {
		return this.textualRepresentation;
	}
	
	public boolean equals (Object o) {
		return o.getClass().equals(getClass());
	}
	
}
