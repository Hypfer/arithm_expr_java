package scanner;


/**
 * zust�ndig daf�r, Operatorsymbole und mathematische Symbole in ein entsprechendes Objekt vom Typ Symbol umzuwandeln
 */
public class OperatorState extends State {


    //	private HashMap<Character, Symbol> operators;
//	
    public OperatorState(Scanner scanner) {
        super(scanner);

//		operators = new HashMap<Character, Symbol>();
//		operators.put('+', new Add());
//		operators.put('-', new Sub());
//		operators.put('*', new Mult());
//		operators.put('/', new Div());
//		operators.put('(', new BracketOpen());
//		operators.put(')', new BracketClose());
    }

    @Override
    public void scan(Character c) {
        this.getMyScanner().skip();
        this.getMyScanner().addSymbol(this.getMyScanner().getOperatorMap().get(c));
//		this.getMyScanner().addSymbol((transfer(c)));
        this.getMyScanner().setState(new SelectionState(this.getMyScanner()));
    }

//	/**
//	 * wandelt einen Character c in ein entsprechendes Objekt vom Typ Symbol um
//	 * und gibt dieses zur�ck
//	 */
//	public Symbol transfer (Character c) {
//	Add add = new Add();
//	Sub sub = new Sub();
//	Mult mult = new Mult();
//	Div div = new Div();
//	BracketOpen open = new BracketOpen();
//	BracketClose close = new BracketClose();
//	if (c == '+')
//		return add;
//	if (c == '-')
//		return sub;
//	if (c == '*')
//		return mult;
//	if (c == '/')
//		return div;
//	if (c == '(')
//		return open;
//	if (c == ')')
//		return close;
//	else
//		throw new IllegalArgumentException ("Unerlaubtes Symbol eingegeben!");
//	}

    @Override
    public void finish() {
    }


//	@Override
//	public String getCollected() {
//		return null;
//	}

}
