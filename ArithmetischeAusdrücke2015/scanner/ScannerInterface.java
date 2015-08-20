package scanner;

import symbols.Symbol;

import java.util.List;

public interface ScannerInterface {

    /**
     * Transforms a textual arithmetic expression
     * into a list of symbols
     * E.g. "(34 + 5)    * 9" ---> (, 34, +, 5, ), *, 9
     */
    List<Symbol> toSymbolSequence(String expr);
}
