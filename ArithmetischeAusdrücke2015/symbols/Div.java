package symbols;

import basic.TextConstants;

public class Div implements Symbol {

    private final String textualRepresentation = TextConstants.div;

    public String toString() {
        return this.textualRepresentation;
    }

    public boolean equals(Object o) {
        return o.getClass().equals(getClass());
    }

}
