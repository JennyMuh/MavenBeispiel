package de.jenny;

import org.junit.Test;

import de.hfu.Util;

import static org.junit.Assert.*;

public class TestUtil
{
	@Test
	public void TestistErstesHalbjahr()
	{	
		for (int i = 1; i <=12; i++)
		{
		   if (i <= 6)
		       assertTrue(Util.istErstesHalbjahr(i));
		   else
		   {
			assertFalse(Util.istErstesHalbjahr(i));
		   }
		}
	}
}
