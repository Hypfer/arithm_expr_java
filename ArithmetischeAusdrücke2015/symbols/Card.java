package symbols;

/**
 * An object of this class represents Natural number
 * Dieser value darf sich nicht �ndern!!!
 */
public class Card implements Symbol {

    private Integer value;

    public Card(Integer value) {
//		if (value >= 0)
        this.value = value;
//		else
//			this.value = -value;
    }

    public Integer getValue() {
        return this.value;
    }

    public String toString() {
        return this.value.toString();
    }

    public boolean equals(Object o) {
        if (!o.getClass().equals(getClass())) {
            return false;
        }
        Card other = (Card) o;
        return this.value.equals(other.value);
    }
}
