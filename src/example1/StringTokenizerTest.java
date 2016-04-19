package example1;

/*	StringTokenizer
 * 	@author		Abdurrahim Burak Tekin
 * 	@version	2016-04-06
 */

import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.junit.After;
import org.junit.Before;
import org.junit.*;

public class StringTokenizerTest {
	
	StringTokenizer st;
	
	
	@Before
	public void setUp() throws Exception {
		st = new StringTokenizer("Hallo Welt! Wir sind hier...");
	}
	
	
	
	@After
	public void tearDowm() throws Exception {
		
	}
	
	
	@Test
	public void testNextTokenWithSpaceDelimeter() {
		st = new StringTokenizer("Hallo Welt! Wir sind hier...");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenWithTabulatorDelimeter() {
		st = new StringTokenizer("Hallo\tWelt! Wir sind hier...");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenWithNewLineDelimeter() {
		st = new StringTokenizer("Hallo\nWelt! Wir sind hier...");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenWithCarriageDelimeter() {
		st = new StringTokenizer("Hallo\rWelt! Wir sind hier...");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenWithFormfeeDelimeter() {
		st = new StringTokenizer("Hallo\fWelt! Wir sind hier...");
		assertEquals("Hallo", st.nextToken());
	}
	
	
	
	
	@Test(expected=NoSuchElementException.class)
	public void testNextTokenWithNoExistingToken() {
		st = new StringTokenizer("");
		st.nextToken();
	}
	
	
	@Test
	public void testCountTokensOnlySpaceDelimeter() {
		st = new StringTokenizer("            ");
		st.countTokens();
	}
	
	@Test
	public void testNextTokenOnlyTabulatorDelimeter() {
		st = new StringTokenizer("\t\t\t\t");
		st.countTokens();
	}
	
	@Test
	public void testNextTokenOnlyFormFeeDelimeter() {
		st = new StringTokenizer("\f\f\f\f");
		st.countTokens();
	}
	
	
	/*	@Test
	 * 	public void testNextTokenTillLast() {
	 * 		String last;
	 * 		do {
	 * 			last = st.nextToken();
	 * 		} while(st.hasMoreElements());
	 * 		assertEquals("...", last);
	 * 	}
	*/
	
	
	//@Test
	//public void testNextToken
}