package org.junit;

public class SampleTest {
	
	@BeforeClass
	
	public static  void driver() {
System.out.println("beforeclass");
	}
	
@Before

public   void login() {
System.out.println("before");
	}
@After
public   void logout() {
System.out.println("after");
	}
@Test
public   void test1() {
System.out.println("testcase1");
	}
@Test
public   void test2() {
System.out.println("testcase2");
	}

@Test@Ignore
public   void test3() {
System.out.println("testcase3");
	}
@AfterClass

public static  void quit() {
System.out.println("aftercase");
	}
}
