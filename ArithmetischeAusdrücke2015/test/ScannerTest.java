package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import scanner.Scanner;
import symbols.Add;
import symbols.BracketClose;
import symbols.BracketOpen;
import symbols.Card;
import symbols.Div;
import symbols.ErrorToken;
import symbols.Mult;
import symbols.Sub;
import symbols.Symbol;

public class ScannerTest {
	private Scanner scanner;
	private List<Symbol> expected;
	
	@Before
	public void setUp () {
		this.scanner = new Scanner ();
		expected = new ArrayList<Symbol> ();
	}
	
	@Test
	public void test1 () {
		assertEquals(new ArrayList<Symbol> (), scanner.toSymbolSequence(""));
	}
	
	@Test
	public void test2 () {
		assertEquals(new ArrayList<Symbol> (), scanner.toSymbolSequence(" \n \t"));
	}
	
	@Test
	public void test3 () {
		expected.add(new Card(34));
		assertEquals(expected, scanner.toSymbolSequence("34"));
	}
	
	@Test
	public void test4 () {
		expected.add(new Card(3456));
		assertEquals(expected, scanner.toSymbolSequence("3456"));
	}
	
	@Test
	public void test5 () {
		expected.add(new Add());
		assertEquals(expected, scanner.toSymbolSequence("+"));
	}
	
	@Test
	public void test6 () {
		expected.add(new Sub());
		assertEquals(expected, scanner.toSymbolSequence("-"));
	}
	
	@Test
	public void test7 () {
		expected.add(new Mult());
		assertEquals(expected, scanner.toSymbolSequence("*"));
	}
	
	@Test
	public void test8 () {
		expected.add(new Div());
		assertEquals(expected, scanner.toSymbolSequence("/"));
	}
	
	@Test
	public void test9 () {
		expected.add(new BracketClose());
		assertEquals(expected, scanner.toSymbolSequence(")"));
	}
	
	@Test
	public void test10 () {
		expected.add(new BracketOpen());
		assertEquals(expected, scanner.toSymbolSequence("("));
	}
	
	@Test
	public void test11 () {
		expected.add(new Add());
		expected.add(new Sub());
		expected.add(new Mult());
		expected.add(new Div());
		assertEquals(expected, scanner.toSymbolSequence(" + - * / "));
	}
	
	@Test
	public void test12 () {
		expected.add(new Add());
		expected.add(new Sub());
		expected.add(new Mult());
		expected.add(new Div());
		assertEquals(expected, scanner.toSymbolSequence("+-*/"));
	}
	
	@Test
	public void test13 () {
		expected.add(new Card(34));
		expected.add(new Add());
		expected.add(new Card(23));
		assertEquals(expected, scanner.toSymbolSequence(" 34 + 23"));
	}

	@Test
	public void test14 () {
		Card card1 = new Card(34);
		Card card2 = new Card(34);
		assertTrue(card1.equals(card2));
	}
	
	@Test
	public void test15 () {
		expected.add(new BracketOpen());
		expected.add(new Card(34));
		expected.add(new Add());
		expected.add(new Card(25));
		expected.add(new BracketClose());
		expected.add(new Mult());
		expected.add(new Card(11));
		assertEquals(expected, scanner.toSymbolSequence("(34+25)*11"));
	}
	
	@Test
	public void test16 () {
		expected.add(new BracketOpen());
		expected.add(new BracketOpen());
		expected.add(new Card(34));
		expected.add(new Add());
		expected.add(new Card(25));
		expected.add(new BracketClose());
		expected.add(new Add());
		expected.add(new Card(11));
		expected.add(new BracketClose());
		assertEquals(expected, scanner.toSymbolSequence("(  (34      +\n25)+\t11)"));
	}
	
	@Test
	public void test17 () {
		expected.add(new Card(34));
		expected.add(new Card(25));
		expected.add(new Card(11));
		assertEquals(expected, scanner.toSymbolSequence("34 25 11"));
	}
	
	@Test
	public void test18() {
		expected.add(new Card(3));
		expected.add(new Add());
		expected.add(new ErrorToken('X'));
		expected.add(new ErrorToken('X'));
		expected.add(new ErrorToken('X'));
		assertEquals(expected, scanner.toSymbolSequence("3+XXX"));
	}
	
	@Test
	public void test19() {
		expected.add(new ErrorToken('X'));
		assertEquals(expected, scanner.toSymbolSequence("X"));
	}
	
	@Test
	public void test20() {
		expected.add(new Card(123));
		expected.add(new ErrorToken('X'));
		expected.add(new Card(45));
		assertEquals(expected, scanner.toSymbolSequence("123X45"));
	}
	
	
	@Test
	public void test22 () {
		expected.add(new BracketOpen());
		expected.add(new Card(34));
		expected.add(new Sub());
		expected.add(new Card(25));
		expected.add(new BracketClose());
		expected.add(new Div());
		expected.add(new Card(11));
		assertEquals(expected, scanner.toSymbolSequence("(34-25)/11"));
	}
	
	@Test
	public void test23 () {
		expected.add(new Card(34));
		expected.add(new Sub());
		expected.add(new Card(23));
		assertEquals(expected, scanner.toSymbolSequence(" 34 - 23"));
	}
	
	@Test
	public void test24 () {
		expected.add(new Card(34));
		expected.add(new Div());
		expected.add(new Card(23));
		assertEquals(expected, scanner.toSymbolSequence(" 34 / 23"));
	}
	
	
}
