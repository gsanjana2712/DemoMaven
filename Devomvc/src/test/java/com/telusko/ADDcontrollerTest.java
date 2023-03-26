package com.telusko;

import org.junit.Test;

import com.telusko.service.Addservice;

import junit.framework.TestCase;

public class ADDcontrollerTest extends TestCase {
	@Test
	
	public void test(){
	Addservice as=new Addservice();
	int actual=as.operation(2,3,"+");
	int expected=5;
	assertEquals(expected,actual);
	}

	@Test
	public void test1() {
		Addservice as=new Addservice();
		int actual=as.operation(9,3,"-");
		int expected=6;
		assertEquals(expected,actual);
		
	}
	@Test
	public void test2() {
		Addservice as=new Addservice();
		int actual=as.operation(9,3,"*");
		int expected=27;
		assertEquals(expected,actual);
		
	}
	@Test
	public void test3() {
		Addservice as=new Addservice();
		int actual=as.operation(12,2,"/");
		int expected=6;
		assertEquals(expected,actual);
		
	}

}
