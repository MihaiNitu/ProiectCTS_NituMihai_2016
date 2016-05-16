package Teste;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Suite extends TestCase {
	public static Test suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new TestSetteri("test_model1"));
		suite.addTest(new TestSetteri("test_model2"));
		suite.addTestSuite(TestSetteri.class);
		
		return suite;
	}
}
