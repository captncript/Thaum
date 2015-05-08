package com.Captn.research;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.sql.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void pathing()
	{
		//this will return the |path from one element to the last over a given number of steps
		Aspect currentAspect;
		String[] strElements = new String[51];
		
		//Establishing array of all elements
		strElements[0] = "aer";
		strElements[1] = "terra";
		strElements[2] = "aqua";
		strElements[3] = "ignis";
		strElements[4] = "ordo";
		strElements[5] = "perditio";
		strElements[6] = "gelum";
		strElements[7] = "lux";
		strElements[8] = "motus";
		strElements[9] = "potentia";
		strElements[10] = "saxum";
		strElements[11] = "vacuos";
		strElements[12] = "victus";
		strElements[13] = "bestia";
		strElements[14] = "fames";
		strElements[15] = "granum";
		strElements[16] = "iter";
		strElements[17] = "limus";
		strElements[18] = "metallum";
		strElements[19] = "mortuus";
		strElements[20] = "permutatio";
		strElements[21] = "praecantatio";
		strElements[22] = "sano";
		strElements[23] = "tempestas";
		strElements[24] = "tenebrae";
		strElements[25] = "vinculum";
		strElements[26] = "vitreus";
		strElements[27] = "volatus";
		strElements[28] = "tempus";
		strElements[29] = "alienus";
		strElements[30] = "aurum";
		strElements[31] = "corpus";
		strElements[32] = "exanimus";
		strElements[33] = "herba";
		strElements[34] = "spiritus";
		strElements[35] = "venenum";
		strElements[36] = "vitium";
		strElements[37] = "arbor";
		strElements[38] = "cognitio";
		strElements[39] = "sensus";
		strElements[40] = "humanus";
		strElements[41] = "instrumentum";
		strElements[42] = "lucrum";
		strElements[43] = "messis";
		strElements[44] = "perfodio";
		strElements[45] = "fabrico";
		strElements[46] = "machina";
		strElements[47] = "meto";
		strElements[48] = "pannus";
		strElements[49] = "telum";
		strElements[50] = "tutamen";
		//--------------------------------------
		
		for (int sizeOfPath=4; sizeOfPath<=12; sizeOfPath++)
		{
			for (int j=0; j<=50; j++)
			{
				currentAspect = new Aspect(strElements[j], sizeOfPath);
			}
		}
	}
}


