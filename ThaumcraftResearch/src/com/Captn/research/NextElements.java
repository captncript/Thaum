package com.Captn.research;

public class NextElements
{
	public String[] nextElement(String strElement)
	{
		String[] strElements = new String[10]; //The group of elements that can connect to a given element will be stored here.

		if (strElement == "aer")
		{
			strElements[0] = "lux";
			strElements[1] = "motus";
			strElements[2] = "vacuos";
			strElements[3] = "tempestas";
			strElements[4] = "volatus";
			strElements[5] = "arbor";
			strElements[6] = "auram";
			strElements[7] = "sensus";
		} else if (strElement == "terra")
		{
			strElements[0] = "victus";
			strElements[1] = "vitreus";
			strElements[2] = "herba";
			strElements[3] = "iter";
			strElements[4] = "metallum";
			strElements[5] = "cognitio";
			strElements[6] = "perfodio";
			strElements[7] = "tutamen";
		} else if (strElement == "aqua")
		{

		}


		return strElements;
	}
}
