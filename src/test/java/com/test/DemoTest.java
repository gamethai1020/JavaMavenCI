package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void test() {
		Assert.assertTrue(true);
		System.out.println("Test");
	}

	@Test
	public void test2() {
		Assert.assertTrue(true);
		System.out.println("Test2");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
