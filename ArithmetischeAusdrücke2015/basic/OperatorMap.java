package basic;

import java.util.HashMap;
import java.util.Map;

import symbols.Add;
import symbols.BracketClose;
import symbols.BracketOpen;
import symbols.Div;
import symbols.Mult;
import symbols.Sub;
import symbols.Symbol;

public class OperatorMap {
	
	private Map<Character, Symbol> operators;
	
	public OperatorMap () {	
		operators = new HashMap<Character, Symbol>();
		operators.put('+', new Add());
		operators.put('-', new Sub());
		operators.put('*', new Mult());
		operators.put('/', new Div());
		operators.put('(', new BracketOpen());
		operators.put(')', new BracketClose());
	}
	
	public boolean isOperator(Character c) {
		return operators.keySet().contains(c);
	}
	
	public Symbol get(Character c) {
		return operators.get(c);
	}
}
