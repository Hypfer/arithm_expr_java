package symbols;

/**
 * An object of this class represents an invalid Character (neither operator or number)
 */
public class ErrorToken implements Symbol {

    private Character offendingChar;

    public ErrorToken(Character offendingChar) {
        this.offendingChar = offendingChar;
    }

    public String toString() {
        return this.offendingChar.toString();
    }

    public boolean equals(Object o) {
        if (!o.getClass().equals(getClass())) {
            return false;
        }
        ErrorToken other = (ErrorToken) o;
        return this.offendingChar.equals(other.offendingChar);
    }

}
