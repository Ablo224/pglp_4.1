package uvsq21606235;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * crée les cas de test
     * 
     * @param testName nom du cas de test
     */
	public AppTest(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return  (Test) new TestSuite( AppTest.class);
	}
	
	
	public void testApp() {
		assertTrue(true);
	}
	
}