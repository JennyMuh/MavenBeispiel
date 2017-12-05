package de.jenny;

import org.junit.Test;

import de.hfu.Util;

import static org.junit.Assert.*;

public class TestUtil
{
	@Test (expected=IllegalArgumentException.class)
	public static void TestistErstesHalbjahr(int monat)
	{	
		Util.istErstesHalbjahr(3);
	}
}
