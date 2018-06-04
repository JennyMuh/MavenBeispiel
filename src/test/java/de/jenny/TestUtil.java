package de.jenny;


import de.hfu.Util;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


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
