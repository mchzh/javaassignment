import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseWordOfSentenceTest {

	private static ReverseWordOfSentence reverse=new ReverseWordOfSentence();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReversewordofsentence() {
		reverse.setsOut("");
		System.out.println("test begin: "+reverse.getsOut());
		reverse.reversewordofsentence("I love the object oriented program course in NEU");
		System.out.println("test end: "+reverse.getsOut());
		assertEquals("NEU in course program oriented object the love I",reverse.getsOut());
		//fail("Not yet implemented");
	}

}
