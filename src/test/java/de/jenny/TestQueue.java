package de.jenny;

import org.junit.Test;

import de.hfu.Queue;

import static org.junit.Assert.*;

public class TestQueue 
{	
	
	@Test
	public void enqueueDequeue()
	{
		Queue testQueue = new Queue(3);
		int tmp1 =1;
		int tmp2 = 0;
		testQueue.enqueue(1);
		tmp2 = testQueue.dequeue();
		try{
			assertEquals(tmp1, tmp2);
		}catch(Exception e)
		{
			System.err.println("Error: " + e);
		}
		
	}
	@Test(expected=IllegalStateException.class)
	public void dequeue()
	{
		Queue testQueue = new Queue(3);
			testQueue.dequeue();
	}
	
	@Test
	public void eineRundeRum()
	{
		Queue testQueue = new Queue(2);
		testQueue.enqueue(0);
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		assertEquals(0,testQueue.dequeue());
		assertEquals(2,testQueue.dequeue());
	}
}
