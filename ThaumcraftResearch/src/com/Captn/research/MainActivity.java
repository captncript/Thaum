package com.Captn.research;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.sql.*;
import java.io.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		try
		{
			File file = new File("/storage/emulated/0/AppProjects/Thaum/error");
			PrintStream ps = new PrintStream(file);
			System.setErr(ps);
		} catch (IOException e)
		{
			System.err.println("Error setting up reporting");
		}
    }
	
	public void pathing(View view)
	{
		System.err.println("Made it to pathing");
		//this will return the |path from one element to the last over a given number of steps
		Aspect currentAspect;
		String[] strElements = new String[51];
		FileWriter writer = null;
		
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
		
		for (int sizeOfPath=5; sizeOfPath<=12; sizeOfPath++)
		{
			try
			{
				if (sizeOfPath == 5)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects5");
				} else if (sizeOfPath == 6)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects6");
				} else if (sizeOfPath == 7)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects7");
				} else if (sizeOfPath == 8)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects8");
				} else if (sizeOfPath == 9)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects9");
				} else if (sizeOfPath == 10)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects10");
				} else if (sizeOfPath == 11)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects11");
				} else if (sizeOfPath == 12)
				{
					writer = new FileWriter("/storage/emulated/0/AppProjects/Thaum/Aspects12");
				}
				System.err.println("Made it this far");
				for (int j=0; j<=50; j++)
				{
					currentAspect = new Aspect(sizeOfPath);
					System.err.println("created an aspect");
					currentAspect.setPathStarter(strElements[j]);
					currentAspect.loadArray(writer);
				}
			} catch(IOException e)
			{
				System.err.println(e);
				//Put logging in here
			} finally
			{
				try
				{
					if (writer != null) 
					{
						writer.close();
					}
				} catch (IOException ex)
				{
					System.err.println(ex);
					//put some logging in here for practice
				}
			}
		}
	}
}


