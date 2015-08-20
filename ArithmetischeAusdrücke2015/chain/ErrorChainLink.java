package chain;

import scanner.ErrorState;
import scanner.Scanner;
import scanner.State;

public class ErrorChainLink extends ChainLink {

    public ErrorChainLink(Scanner scanner) {
        super(scanner);
    }

    public State matchState(Character c) {
        return new ErrorState(this.getMyScanner());
    }

}
