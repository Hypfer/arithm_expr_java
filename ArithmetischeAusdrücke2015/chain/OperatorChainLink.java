package chain;

import scanner.OperatorState;
import scanner.Scanner;
import scanner.State;

public class OperatorChainLink extends ChainLinkWithNext {

    public OperatorChainLink(Scanner scanner) {
        super(scanner);
        this.setNextLink(new ErrorChainLink(this.getMyScanner()));
    }

    public State matchState(Character c) {
        if (this.getMyScanner().getOperatorMap().isOperator(c)) { //TODO: Match with HashMap
            return new OperatorState(this.getMyScanner());
        } else {
            return this.getNextLink().matchState(c);
        }

    }

}
