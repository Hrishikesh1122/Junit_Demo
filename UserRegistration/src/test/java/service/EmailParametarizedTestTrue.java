/************************************************************************
 * Purpose : To test a set of inputs for Email id for true cases
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 19-06-2021
 *
 ***********************************************************************/
package service;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class EmailParametarizedTestTrue {
	private String input;
	private Boolean expectedResult;
	
	public EmailParametarizedTestTrue(String input,Boolean expectedResult) {
		this.input=input;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection myData() {
		return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},
			{"abc@gmail.com.com",true},{"abc+100@gmail.com",true}});
	}
	
	Registration emailtest = null;
	
	@Before
	public void setUp() {
		emailtest = new Registration();
	}
	
	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() {
		boolean result = emailtest.getEmail(input);
		Assert.assertEquals(expectedResult, result);
	}
	
	

}
