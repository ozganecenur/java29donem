package com.rifatcan;

public class diziler 
{
	public void tekboyutludiziler()
	{
		int sayisaldizi[] = new int[5];
		
		sayisaldizi[0] = 1;
		sayisaldizi[1] = 2;
		sayisaldizi[2] = 3;
		sayisaldizi[3] = 4;
		sayisaldizi[4] = 5;
		
		String sozeldizi[] = new String[5];
		
		sozeldizi[0] = "De�er-1";
		sozeldizi[1] = "De�er-2";
		sozeldizi[2] = "De�er-3";
		sozeldizi[3] = "De�er-4";
		sozeldizi[4] = "De�er-5";
		
		System.out.println(sayisaldizi[0]);
		System.out.println(sozeldizi[0]);
		
		String siniflistesi[][] = new String[5][2];
		
		siniflistesi[0][0] = "1";
		siniflistesi[0][1] = "CAN";
		
		siniflistesi[1][0] = "2";
		siniflistesi[1][1] = "Mehmet";
		
		siniflistesi[2][0] = "3";
		siniflistesi[2][1] = "Hoca";
		
		sayisaldizi = new int[]{1,2,3,4,5};
		sozeldizi = new String[] {"De�er-1","De�er2"};
		
		
	
		
		for (int i = 0; i < 5; i++)
		{
					
					for (int j = 0; j < 2; j++) 
					{
						siniflistesi[i][j] = i+ " - "+ j;
					}
		
		}
		
	
		for (int i = 0; i < 5; i++) 
		{
			
			for (int j = 0; j < 2; j++) 
			{
				System.out.println(siniflistesi[i][j]);
			}
		}
	}	
}
