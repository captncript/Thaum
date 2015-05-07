package com.Captn.research;

public class NextElements
{
	public String[] nextElement(String strElement)
	{
		String[] strElements = new String[10]; //The group of elements that can connect to a given element will be stored here.
		
		switch (strElement) 
		{
			case "aer": 
				strElements[0] = "lux";
				strElements[1] = "motus";
				strElements[2] = "vacuos";
				strElements[3] = "tempestas";
				strElements[4] = "volatus";
				break;
		}
		
		
		return strElements;
	}
}
