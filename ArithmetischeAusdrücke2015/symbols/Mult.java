package symbols;

import basic.TextConstants;

public class Mult implements Symbol {

    private final String textualRepresentation = TextConstants.mult;

    public String toString() {
        return this.textualRepresentation;
    }

    public boolean equals(Object o) {
        return o.getClass().equals(getClass());
    }

}
