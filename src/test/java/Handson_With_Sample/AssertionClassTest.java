package Handson_With_Sample;




import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionClassTest {

	
	
	
	@Test(priority=1)
	public void Hard_AssertEqualTest(){
	String Exp_Name1 ="Mahesh";
	String Act_Name2 ="Mahesh";
	Assert.assertEquals(Exp_Name1, Act_Name2,"Name is not correct");
	}
	
	
	@Test(priority=2)
	public void Hard_AssertTrueAndFalseTest(){
	Boolean bool1 =true;
	Boolean bool2 =true;
	String location1 ="Chennai";
	String location2="Chennai";
	if (bool1==bool2){
		Assert.assertTrue(bool1, "We got Boolean value is True");
		Assert.assertSame(location1,location2, "Both Location values are Not Same");
		}else if (bool1!=bool2){
		Assert.assertFalse(bool2, "We got Boolean value is False");
		Assert.assertNotSame(location1,location2, "Both Location values are Different");
		}
	
	}
	
	@Test(priority=3)
	public void Hard_AssertSameTest(){
	String location1 ="Chennai";
	String location2="Chennai";
	Assert.assertSame(location1,location2, "Both Location values are Different");
	//Assert.assertNotSame(location1,location2, "Both Location values are Different");
	}
	
	
	@Test(priority=4)
	public void Hard_AssertNotSameTest(){
	String location1 ="Chennai";
	String location2="Madural";
	//Assert.assertSame(location1,location2, "Both Location values are Not Same");
	Assert.assertNotSame(location1,location2, "Both Location values are Same");
	}
	



	@Test(priority=5)
	public void Soft_AssertEqualTest(){
	SoftAssert	Assertion = new SoftAssert();
	String Exp_Name1 ="Mahesh";
	String Act_Name2 ="Mahesh1";
	Assertion.assertEquals(Exp_Name1, Act_Name2,"Name is not correct");
	}
	
	
	@Test(priority=6)
	public void Soft_AssertTrueAndFalseTest(){
		SoftAssert	Assertion = new SoftAssert();
	Boolean bool1 =true;
	Boolean bool2 =true;
	String location1 ="Chennai";
	String location2="Chennai1";
	if (bool1==bool2){
		Assertion.assertTrue(bool1, "We got Boolean value is True");
		Assertion.assertSame(location1,location2, "Both Location values are Not Same");
	}else if (bool1!=bool2){
		Assertion.assertFalse(bool1, "We got Boolean value is False");
		Assertion.assertNotSame(location1,location2, "Both Location values are Different");
	}
	
	//Assert.assertEquals(Exp_Name1, Act_Name2,"Name is not correct");
	}
	
	@Test(priority=7)
	public void Soft_AssertSameTest(){
		SoftAssert	Assertion = new SoftAssert();
	String location1 ="Chennai";
	String location2="Chennai1";
	Assertion.assertSame(location1,location2, "Both Location values are Different");
	Assertion.assertNotSame(location1,location2, "Both Location values are Different");
	}
	
	
	@Test(priority=8)
	public void Soft_AssertNotSameTest(){
		SoftAssert	Assertion = new SoftAssert();
	String location1 ="Chennai";
	String location2="Madural1";
	Assertion.assertSame(location1,location2, "Both Location values are Not Same");
	Assertion.assertNotSame(location1,location2, "Both Location values are Same");
	}
	
}
