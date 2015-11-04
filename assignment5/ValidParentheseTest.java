import static org.junit.Assert.*;

import org.junit.Test;
import  org.junit.runner.RunWith;
import  org.junit.runners.Parameterized;
import  org.junit.runners.Parameterized.Parameters;
import  java.util.Arrays;
import  java.util.Collection;

@RunWith (Parameterized.class)
public class ValidParentheseTest {
	

	private   static  ValidParenthese vpt = new ValidParenthese();
    private   String  model;
    private   boolean  flag;
    
    @Parameters
    public   static  Collection data()  {
        return  Arrays.asList( new  Object[][] {
                {"()[]{}",true} ,
                {"()",false} ,
                {"((]",false} ,
                {"()[]o}",false},
       } );
   } 

    
    public ValidParentheseTest(String model, boolean flag) {
		super();
		this.model = model;
		this.flag = flag;
	}
	@Test(expected  =  StringIndexOutOfBoundsException.class)
	public void testIsValid() {
		//fail("Not yet implemented");
//		ValidParenthese vpt = new ValidParenthese();
//		String[] mode={"()[]{}","()","((]",
//				"(]","([)]","()[]o}"};
		//assertFalse(vpt.isValid(model));
//		for(int i=0; i<6; i++){
//			assertTrue(vpt.isValid(mode[i]));
//		}
		assertEquals(flag, vpt.isValid(model));
	}

}
