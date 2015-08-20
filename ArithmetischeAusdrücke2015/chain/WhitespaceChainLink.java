package chain;

import scanner.Scanner;
import scanner.State;
import scanner.WhitespaceState;

public class WhitespaceChainLink extends ChainLinkWithNext {

    public WhitespaceChainLink(Scanner scanner) {
        super(scanner);
        this.setNextLink(new DigitChainLink(this.getMyScanner()));
    }

    public State matchState(Character c) {
        if (Character.isWhitespace(c)) {
            return new WhitespaceState(this.getMyScanner());
        } else {
            return this.getNextLink().matchState(c);
        }
    }

}
