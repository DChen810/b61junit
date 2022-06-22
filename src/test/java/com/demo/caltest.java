/**
 * 
 */
package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Dekun
 * @Date 22 Jun 2022	
 *
 */
public class caltest {
	Calculation c = new Calculation();
	@Test
	public void test1() {
		assertEquals(100,c.add(10, 90));
	}
	
	@Test
	public void test2() {
		assertEquals(101,c.add(10, 90));
	}
			
}
