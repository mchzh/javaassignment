import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import  org.junit.runners.Parameterized.Parameters;
import  java.util.Arrays;
import  java.util.Collection;

@RunWith (Parameterized.class)
public class StrMatchPatternTest {

	private   static  StrMatchPattern smp = new StrMatchPattern();
    private   String  model;
    private   String  express;
    private   boolean  flag;
    
    
	@Parameters
    public   static  Collection data()  {
        return  Arrays.asList( new  Object[][] {
                {"abccba","dog dog dog dog dog dog",false} ,
                {"abba","dog cat cat dog",true} ,
                {"abba","dog cat cat fish",false} ,
                {"aaaa","dog cat cat dog",false},
                {"abba","dog dog dog dog",false},
       } );
   } 
	
	public StrMatchPatternTest(String model, String express, boolean flag) {
		super();
		this.model = model;
		this.express = express;
		this.flag = flag;
	}
	@Test
	public void testWordPattern() {
		//fail("Not yet implemented");
		assertEquals(flag, smp.wordPattern(model, express));
	}

}
