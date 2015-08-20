package scanner;

import java.util.ArrayList;
import java.util.List;

import basic.OperatorMap;
//import symbols.Card;
import symbols.Symbol;

public class Scanner implements ScannerInterface {
	
	private State state;
	private String currentExpression;
	private List<Symbol> currentResult;
	private OperatorMap operatorMap;
	
	public Scanner () {
		this.operatorMap = new OperatorMap();
		this.state = new SelectionState(this);
		this.currentResult = new ArrayList<Symbol>();
	}
	
	public List<Symbol> toSymbolSequence (String expr) {
		this.currentExpression = expr;
		while (this.currentExpression.length() > 0) {
			this.state.scan(this.currentExpression.charAt(0));
		}  
		this.state.finish();
		return this.currentResult;
	}
	
	/**
	 * wechselt den aktuellen state zu newState
	 */
	public void setState (State newState) {
		this.state = newState;
	}
	
	public OperatorMap getOperatorMap() {
		return this.operatorMap;
	}
	
	/**
	 * entfernt das erste Zeichen der Zeichenkette currentExpression
	 */
	public void skip () {
//		if (currentExpression.length() > 0) {
			this.currentExpression = this.currentExpression.substring(1);
//		}
//		if (currentExpression.length() == 0 && this.state instanceof DigitState) {
//			addSymbol (new Card(Integer.parseInt(this.state.getCollected())));
//		}
	}
	
	/**
	 * f�gt das Symbol symbol zur Liste currentResult hinzu
	 */
	public void addSymbol (Symbol symbol) {
		currentResult.add(symbol);
	}
	
}
