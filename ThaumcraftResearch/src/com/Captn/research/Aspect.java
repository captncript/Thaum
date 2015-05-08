package com.Captn.research;

public class Aspect
{
	String strElement = new String("");
	String[] strPath;
	String[] arrayOfConnections;
	int sizeOfPath = 0;
	int pathLevel = 0;
	
	public Aspect(String strElement, int sizeOfPath)
	{
		this.strElement = strElement;
		this.sizeOfPath = sizeOfPath;
		this.strPath = new String[sizeOfPath];
	}
	
	public String[] nextElement()
	{
		String[] strElements = new String[10]; //The group of elements that can connect to a given element will be stored here.
		String strElement = this.strElement;
		
		if (strElement.equals("aer"))
		{
			strElements[0] = "lux";
			strElements[1] = "motus";
			strElements[2] = "vacuos";
			strElements[3] = "tempestas";
			strElements[4] = "volatus";
			strElements[5] = "arbor";
			strElements[6] = "auram";
			strElements[7] = "sensus";
		} else if (strElement.equals("terra"))
		{
			strElements[0] = "victus";
			strElements[1] = "vitreus";
			strElements[2] = "herba";
			strElements[3] = "iter";
			strElements[4] = "metallum";
			strElements[5] = "cognitio";
			strElements[6] = "perfodio";
			strElements[7] = "tutamen";
		} else if (strElement.equals("aqua"))
		{
   			strElements[0] = "gelum";
			strElements[1] = "motus";
			strElements[2] = "victus";
			strElements[3] = "limus";
			strElements[4] = "permutatio";
			strElements[5] = "tempestas";
			strElements[6] = "vitreus";
			strElements[7] = "venenum";
		} else if (strElement.equals("ignis"))
		{
			strElements[0] = "gelum";
			strElements[1] = "lux";
			strElements[2] = "potentia";
		} else if (strElement.equals("ordo"))
		{
			strElements[0] = "gelum";
			strElements[1] = "motus";
			strElements[2] = "potentia";
			strElements[3] = "granum";
			strElements[4] = "metallum";
			strElements[5] = "permutatio";
			strElements[6] = "vitreus";
			strElements[7] = "tempus";
			strElements[8] = "instrumentum";
		} else if (strElement.equals("perditio"))
		{
			strElements[0] = "gelum";
			strElements[1] = "vacuos";
			strElements[2] = "mortuus";
			strElements[3] = "permutatio";
			strElements[4] = "vinculum";
			strElements[5] = "vitium";
			strElements[6] = "telum";
		} else if (strElement.equals("gelum")) 
		{
			strElements[0] = "aqua";
			strElements[1] = "ordo";
			strElements[2] = "ignis";
			strElements[3] = "perditio";
			strElements[4] = "tempestas";
		} else if (strElement.equals("lux"))
		{
			strElements[0] = "aer";
			strElements[1] = "ignis";
			strElements[2] = "tenebrae";
		} else if (strElement.equals("motus"))
		{
			strElements[0] = "aer";
			strElements[1] = "ordo";
			strElements[2] = "aqua";
			strElements[3] = "bestia";
			strElements[4] = "iter";
			strElements[5] = "tempestas";
			strElements[6] = "vinculum";
			strElements[7] = "volatus";
			strElements[8] = "exanimis";
			strElements[9] = "machina";
		} else if (strElement.equals("potentia"))
		{
			strElements[0] = "ordo";
			strElements[1] = "ignis";
			strElements[2] = "praecantatio";
		} else if (strElement.equals("saxum"))
		{
			strElements[0] = "terra";
			strElements[1] = "metallum";
			strElements[2] = "vitreus";
			strElements[3] = "perfodio";
		} else if (strElement.equals("vacuos"))
		{
			strElements[0] = "aer";
			strElements[1] = "perditio";
			strElements[2] = "fames";
			strElements[3] = "praecantatio";
			strElements[4] = "tenebrae";
			strElements[5] = "tempus";
			strElements[6] = "alienis";
		} else if (strElement.equals("victus"))
		{
			strElements[0] = "aqua";
			strElements[1] = "terra";
			strElements[2] = "bestia";
			strElements[3] = "fames";
			strElements[4] = "granum";
			strElements[5] = "limus";
			strElements[6] = "mortuus";
			strElements[7] = "sano";
			strElements[8] = "herba";
			strElements[9] = "spiritus";
		} else if (strElement.equals("bestia"))
		{
			strElements[0] = "motus";
			strElements[1] = "victus";
			strElements[2] = "corpus";
			strElements[3] = "humanus";
			strElements[4] = "pannus";
		} else if ( strElement.equals("fames"))
		{
			strElements[0] = "victus";
			strElements[1] = "vacuos";
			strElements[2] = "lucrum";
		} else if (strElement.equals("granum"))
		{
			strElements[0] = "victus";
			strElements[1] = "terra";
			strElements[2] = "ordo";
			strElements[3] = "herba";
			strElements[4] = "messis";
		} else if (strElement.equals("iter"))
		{
			strElements[0] = "motus";
			strElements[1] = "terra";
		} else if (strElement.equals("limus"))
		{
			strElements[0] = "victus";
			strElements[1] = "aqua";
		} else if (strElement.equals("metallum"))
		{
			strElements[0] = "saxum";
			strElements[1] = "ordo";
			strElements[2] = "instrumentum";
		} else if (strElement.equals("mortuus"))
		{
			strElements[0] = "victus";
			strElements[1] = "perditio";
			strElements[2] = "corpus";
			strElements[3] = "exanimis";
			strElements[4] = "spiritus";
			strElements[5] = "venenum";
		} else if (strElement.equals("permutatio"))
		{
			strElements[0] = "motus";
			strElements[1] = "aqua";
			strElements[2] = "perditio";
			strElements[3] = "ordo";
		} else if (strElement.equals("praecantatio"))
		{
			strElements[0] = "vacuos";
			strElements[1] = "potentia";
			strElements[2] = "auram";
			strElements[3] = "vitium";
		} else if (strElement.equals("sano"))
		{
			strElements[0] = "victus";
		} else if (strElement.equals("tempestas"))
		{
			strElements[0] = "aer";
			strElements[1] = "aqua";
			strElements[2] = "motus";
			strElements[3] = "gelum";
		} else if (strElement.equals("tenebrae"))
		{
			strElements[0] = "vacuos";
			strElements[1] = "lux";
			strElements[2] = "alienis";
		} else if (strElement.equals("vinculum"))
		{
			strElements[0] = "motus";
			strElements[1] = "perditio";
		} else if (strElement.equals("vitreus"))
		{
			strElements[0] = "saxum";
			strElements[1] = "aqua";
			strElements[2] = "terra";
			strElements[3] = "ordo";
		} else if (strElement.equals("volatus"))
		{
			strElements[0] = "aer";
			strElements[1] = "motus";
		} else if (strElement.equals("tempus"))
		{
			strElements[0] = "vacuos";
			strElements[1] = "ordo";
		} else if (strElement.equals("alienis"))
		{
			strElements[0] = "vacuos";
			strElements[1] = "tenebrae";
		} else if (strElement.equals("auram"))
		{
			strElements[0] = "praecantatio";
			strElements[1] = "aer";
		} else if (strElement.equals("corpus"))
		{
			strElements[0] = "mortuus";
			strElements[1] = "bestia";
		} else if (strElement.equals("exanimis"))
		{
			strElements[0] = "motus";
			strElements[1] = "mortuus";
		} else if (strElement.equals("herba"))
		{
			strElements[0] = "granum";
			strElements[1] = "terra";
			strElements[2] = "victus";
			strElements[3] = "arbor";
			strElements[4] = "messis";
		} else if (strElement.equals("spiritus"))
		{
			strElements[0] = "victus";
			strElements[1] = "mortuus";
			strElements[2] = "cognitio";
			strElements[3] = "sensus";
		} else if (strElement.equals("venenum"))
		{
			strElements[0] = "aqua";
			strElements[1] = "mortuus";
		} else if (strElement.equals("vitium"))
		{
			strElements[0] = "praecantatio";
			strElements[1] = "perditio";
		} else if (strElement.equals("arbor"))
		{
			strElements[0] = "terra";
			strElements[1] = "herba";
			strElements[2] = "aer";
		} else if (strElement.equals("cognitio"))
		{
			strElements[0] = "terra";
			strElements[1] = "spiritus";
			strElements[2] = "humanus";
		} else if (strElement.equals("sensus"))
		{
			strElements[0] = "aer";
			strElements[1] = "spiritus";
		} else if (strElement.equals("humanus"))
		{
			strElements[0] = "bestia";
			strElements[1] = "cognitio";
			strElements[2] = "instrumentum";
			strElements[3] = "lucrum";
			strElements[4] = "messis";
			strElements[5] = "perfodio";
			strElements[6] = "fabrico";
			strElements[7] = "meto";
		} else if (strElement.equals("instrumentum"))
		{
			strElements[0] = "humanus";
			strElements[1] = "metallum";
			strElements[2] = "ordo";
			strElements[3] = "fabrico";
			strElements[4] = "machina";
			strElements[5] = "meto";
			strElements[6] = "pannus";
			strElements[7] = "telum";
			strElements[8] = "tutamen";
		} else if (strElement.equals("lucrum"))
		{
			strElements[0] = "humanus";
			strElements[1] = "fames";
		} else if (strElement.equals("messis"))
		{
			strElements[0] = "granum";
			strElements[1] = "humanus";
			strElements[2] = "herba";
			strElements[3] = "meto";
		} else if (strElement.equals("perfodio"))
		{
			strElements[0] = "humanus";
			strElements[1] = "saxum";
			strElements[2] = "terra";
		} else if (strElement.equals("fabrico"))
		{
			strElements[0] = "humanus";
			strElements[1] = "instrumentum";
		} else if (strElement.equals("machina"))
		{
			strElements[0] = "motus";
			strElements[1] = "instrumentum";
		} else if (strElement.equals("meto"))
		{
			strElements[0] = "messis";
			strElements[1] = "humanus";
			strElements[2] = "instrumentum";
		} else if (strElement.equals("pannus"))
		{
			strElements[0] = "instrumentum";
			strElements[1] = "bestia";
		} else if (strElement.equals("telum"))
		{
			strElements[0] = "instrumentum";
			strElements[1] = "perditio";
		} else if (strElement.equals("tutamen"))
		{
			strElements[0] = "instrumentum";
			strElements[0] = "terra";
		}

		return strElements;
	}

	public void writeArray()
	{
		
	}
	
	public void loadArray()
	{
		//this will get called with the assigned values above
		arrayOfConnections = nextElement();
		pathLevel += 1;
		
		for (int j=0; j < arrayOfConnections.length; j++)
		{
			strPath[pathLevel] = arrayOfConnections[j];
        	if (pathLevel == (sizeOfPath - 1))
			{
				writeArray();
        	} else
			{
				loadArray();
			}
		}
		pathLevel -= 1;
	}
}
