package com.hello;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloTest extends HelloWorldApplicationTests {
	@Test
	public void Hello()
	{
		HelloWorldController hello=new HelloWorldController();
//		System.out.println(hello.helloWorld());
		assertEquals(hello.helloWorld(),"HelloWorld");
		
	}
}
