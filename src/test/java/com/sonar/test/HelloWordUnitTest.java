package com.sonar.test;

import org.junit.Test;

import com.sonar.hello.HelloWord;

public class HelloWordUnitTest {

	@Test
	public void test() {
		new HelloWord().coveredByUnitTest();
	}
	
	@Test
	public void test2() {
		new HelloWord().coveredByIntegrationTest();
	}
}
