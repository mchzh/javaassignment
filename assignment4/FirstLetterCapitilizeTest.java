import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FirstLetterCapitilizeTest {

	private static FirstLetterCapitilize capt=new FirstLetterCapitilize();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetsResult() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetsResult() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertfirstletter() {
		capt.setsResult("");
		System.out.println("test begin: "+capt.getsResult());
		capt.convertfirstletter("we love seattle and will live here for a long time.");
		System.out.println("test end: "+capt.getsResult());
		assertEquals("We Love Seattle And Will Live Here For A Long Time.",capt.getsResult());
		//fail("Not yet implemented");
	}

}
