package scanner;

import java.util.List;

import symbols.Symbol;

public interface ScannerInterface {

/**
 * Transforms a textual arithmetic expression
 * into a list of symbols
 * E.g. "(34 + 5)    * 9" ---> (, 34, +, 5, ), *, 9 
 */
	public List<Symbol> toSymbolSequence (String expr);
}
