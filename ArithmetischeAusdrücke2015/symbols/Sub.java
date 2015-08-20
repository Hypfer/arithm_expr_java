package symbols;

import basic.TextConstants;

public class Sub implements Symbol {

    private final String textualRepresentation = TextConstants.sub;

    public String toString() {
        return this.textualRepresentation;
    }

    public boolean equals(Object o) {
        return o.getClass().equals(getClass());
    }

}
