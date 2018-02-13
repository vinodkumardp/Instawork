package com.instawork.testcases;

import org.testng.annotations.Test;

import com.instawork.libraries.Baseclass;

public class Testcases extends Baseclass{
	
	
		@Test
		public void Instawork() throws Exception
		{
			browserInvoke();
			launchGoogle();
			searchForInstawork();
			
		}

	}

