package symbols;

/**
 * Symbols like natural numbers, operator symbols etc
 */
public interface Symbol {

//	/**
//	 * equals Funktion f�r den Vergleich von Objekten vom Typ Symbol
//	 */
//	public boolean equals (Object o) {
//		if (o == null)
//			return false;
//		if (!(o instanceof Symbol))
//			return false;
//	    if (!o.getClass().equals(getClass()))
//	        return false;
//		if (o == this)
//			return true;
//		Symbol that = (Symbol) o;
//		return this.toString().equals(that.toString());	
//	}
//	
//	/**
//	 * equals Funktion f�r den Vergleich von zwei Listen mit Objekten vom Typ Symbol als Inhalt
//	 */
//	public static boolean equals (List<Symbol> one, List<Symbol> two) {
//		
//	    if (one == null && two == null)
//	        return true;
//	        
//	    if((one == null && two != null) || one != null && two == null || one.size() != two.size())
//	        return false;
//	    
//	    one = new ArrayList<Symbol>(one);
//	    two = new ArrayList<Symbol>(two);
//	    
//	    return one.toString().equals(two.toString());
//	    
//	}

}
