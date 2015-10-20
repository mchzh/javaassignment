import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FindMoreThreeLetterWordTest {

	private static FindMoreThreeLetterWord moreword=new FindMoreThreeLetterWord();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMorethanthreeletter() {
		//moreword.morethanthreeletter("Java is a cool OOP. It doesnt have multiple inheritance.");
		assertTrue(moreword.morethanthreeletter("Java is a cool OOP. It doesnt have multiple inheritance."));
		//fail("Not yet implemented");
	}

}
