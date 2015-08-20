package chain;

import scanner.DigitState;
import scanner.Scanner;
import scanner.State;

public class DigitChainLink extends ChainLinkWithNext {

    public DigitChainLink(Scanner scanner) {
        super(scanner);
        this.setNextLink(new OperatorChainLink(this.getMyScanner()));
    }

    public State matchState(Character c) {
        if (Character.isDigit(c)) {
            return new DigitState(this.getMyScanner());
        } else {
            return this.getNextLink().matchState(c);
        }

    }

}
