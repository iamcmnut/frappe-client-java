/**
 * 
 */
package com.moonlight_academy.frappe_client_java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author iamcmnut
 *
 */
public class FrappeClientJavaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.moonlight_academy.frappe_client_java.FrappeClientJava#login(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLogin() {
		FrappeClientJava client = new FrappeClientJava("http://localhost", "username", "password");
	}

	/**
	 * Test method for {@link com.moonlight_academy.frappe_client_java.FrappeClientJava#getUrl()}.
	 */
	@Test
	public void testGetUrl() {
		FrappeClientJava client = new FrappeClientJava("http://localhost", "username", "password");
		assertEquals("http://localhost", client.getUrl());
	}

}
