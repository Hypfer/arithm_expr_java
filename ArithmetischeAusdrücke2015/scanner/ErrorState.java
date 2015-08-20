package scanner;

import symbols.ErrorToken;

public class ErrorState extends State {

    public ErrorState(Scanner scanner) {
        super(scanner);

        // TODO Auto-generated constructor stub
    }


    @Override
    public void scan(Character c) {
        // TODO Auto-generated method stub
        this.getMyScanner().addSymbol(new ErrorToken(c));
        this.getMyScanner().skip();
        this.getMyScanner().setState(new SelectionState(this.getMyScanner()));

    }


    @Override
    public void finish() {
        // TODO Auto-generated method stub

    }

}
