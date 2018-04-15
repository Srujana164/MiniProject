package miniproject;

import java.util.*;
import java.lang.*;
import java.io.*;
import org.junit.*;
import org.junit.Assert;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//import junit.framework.Assert;
//import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Unit test for simple App.
 */
/*public class AppTest 
    extends TestCase
{
    
    public AppTest( String testName )
    {
        super( testName );
    }

       public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

  
    public void testApp()
    {
        assertTrue( true );
    }
    
    
}*/

//import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;
//import org.junit.Assert;
public class AppTest{
	
	@Test
	public void getmodeltest(){
		Car c = new Car("maruthi","800","good car");
		String result = c.getModel();
		Assert.assertEquals("800",result);
		
	}	
}
