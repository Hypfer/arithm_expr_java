package symbols;

import basic.TextConstants;

public class BracketClose implements Symbol {

    private final String textualRepresentation = TextConstants.bracketClose;

    public String toString() {
        return this.textualRepresentation;
    }

    public boolean equals(Object o) {
        return o.getClass().equals(getClass());
    }

}
