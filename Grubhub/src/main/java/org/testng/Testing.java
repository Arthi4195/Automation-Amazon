package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing {
	
	
	@BeforeSuite
	public void BSuite() {
System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BTest() {
System.out.println("BeforeTest");
	}
	

	@BeforeClass
	public void Bclass() {
System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void Bmethod() {
System.out.println("BeforeMethod");
	}
	/*@Parameters({"username","password","URL"})
	@Test (groups = "para")
	public void login(@Optional("xyz")String username,@Optional("123")String password,String URL) {
System.out.println("username;"+username);
System.out.println("password;" +password);
System.out.println("URL");


}
*/
	
	

	/*@DataProvider(name="Credential")
	public Object[][]Credential(){
		return new Object[][] { {"abc","123"},{"dfg","456"},{"fgh","567"}};
		}
		@Test(dataProvider ="Credential",groups ="Data")
		public void login(String username,String password) {
			System.out.println("username;" +username);
			System.out.println("password;" +password);

		}
		
		*/
	
	@Test
	public void test1() {
System.out.println("test1");
	}
	
	@Test@Ignore
	public void test2() {
		System.out.println("test2");
			}
}
	
	/*@Test
	public void test2() {
		System.out.println(Thread.currentThread());
	}
		@Test(retryAnalyzer=RetryAnalyser.class)
		public void test3() {
			System.out.println(Thread.currentThread());
			Assert.fail();
				}
}
			
	*/
	
		
		
	
	
 	


@AfterMethod
				
public void Amethod() {
System.out.println("AfterMethod");
					
				}
@AfterClass
public void Aclass() {
System.out.println("AfterClass");
}

@AfterTest
public void ATest() {
System.out.println("AfterTest");
}

@AfterSuite
public void ASuite() {
System.out.println("AfterSuite");
				

	}
}
*/