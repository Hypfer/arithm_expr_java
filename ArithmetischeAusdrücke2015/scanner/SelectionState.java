package scanner;

import chain.Chain;

/**
 * Responsible for selecting next state depending
 * on current character
 */
public class SelectionState extends State {

    private Chain stateChain;

    public SelectionState(Scanner scanner) {
        super(scanner);
        this.stateChain = new Chain(this.getMyScanner());
    }

    @Override
    public void scan(Character c) {
//		if (Character.isWhitespace(c))
//			this.getMyScanner().setState(new WhitespaceState(this.getMyScanner()));
//		else if (Character.isDigit(c))
//			this.getMyScanner().setState(new DigitState(this.getMyScanner()));
//		else if (this.getMyScanner().getOperatorMap().isOperator(c))
//			this.getMyScanner().setState(new OperatorState(this.getMyScanner()));
//		else {
//			this.getMyScanner().addSymbol(new ErrorToken(c));
//			this.getMyScanner().skip();
//		}
        this.getMyScanner().setState(this.stateChain.matchState(c));

    }

    @Override
    public void finish() {
    }

//	@Override
//	public String getCollected() {
//		return null;
//	}
}
