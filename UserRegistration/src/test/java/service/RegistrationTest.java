/************************************************************
 * Purpose : To test input for First name , Last name, phone,
 *           and password.
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 19-06-2021
 *
 ************************************************************/
package service;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class RegistrationTest {
	Registration registration = null;
	
	@Before
	public void setUp() {
		registration = new Registration();
	}
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = registration.getFirstName("Hrishikesh");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenFirstName_WhenItsNotProper_ShouldReturnFalse() {
		boolean result = registration.getFirstName("hrishi");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = registration.getLastName("Ugavekar");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLasttName_WhenItsNotProper_ShouldReturnFalse() {
		boolean result = registration.getLastName("ugavekar123");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenPhoneNumber_WhenItsProper_ShouldReturnTrue() {
		boolean result = registration.getPhoneNumber("91 7418529635");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenPhoneNumber_WhenItsNotProper_ShouldReturnFalse() {
		boolean result = registration.getPhoneNumber("85425");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = registration.getPassword("ABcd$12ijk");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenItsNotProper_ShouldReturnFalse() {
		boolean result = registration.getPassword("123");
		Assert.assertEquals(false, result);
	}
}
