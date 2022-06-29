package TddAssign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

//	@Test
//	void test4()
//	{
//		assertEquals("Armstrong no", Que4.armstrong());
//	}
//	
//	@Test
//	void test7() 
//	{
//		assertEquals("palindrome number", Que7.palindrome());
//	}
//	
//
//	@Test
//	void test3()
//	{
//		assertEquals(true, Que3.PassEmail());
//	}
//	
//	@Test
//	void test9()
//	{
//		assertEquals(true, Que9.remove());
//	}
//	
//	@Test
//	void test5()
//	{
//		assertEquals(true, Que5.pythagoras());
//	}
	
//	@Test
//	void test6()
//	{
//		assertEquals(2, Que6.vowel());
//	}
//	
//	@Test
//	void test1()
//	{
//		assertEquals(4, Que1.HCF(16, 12));
//	}
	
//	@Test
//	void test8()
//	{
//		assertEquals(true, Que8.EvenOdd());
//	}
	
//	@Test
//	void test2()
//	{
//		assertEquals(false, Que2.palindrome2());
//	}
	
//	@Test
//	void test10()
//	{
//		assertEquals("apple-kiwi-graphes-mango-watermelon", Que10.concat_String());
//	}
	

	@Test
	void test12() throws CloneNotSupportedException
	{
		Que12 s1=new Que12(12, "hdyye");
		//Que12 s2=(Que12)s1.clone();
		Que12 s2=(Que12)s1.clone();
		assertEquals(true, Que12.method(s1, s2));
		
	}
}
