package com.eda;

public class Soru2 {
	static String ifade = "Bug�n araba ile Ankaraya gidece�im.";

	public void OgelerineAyir() {
		String [] kelime=ifade.split(" ");
		String [] Zaman_Zarflari ={"bug�n","Yar�n","Ak�am �zeri","1925 te","d�n"};
	    String [] Nesneler 		={"masa","sandalye","kitap","araba","bisiklet"};
		String [] Baglaclar		= {"ve","ile","veya","",""};
		String [] Dolayl�_Tumlec ={"Burada","Ankara","Arabada","okulda","evde"};
		String [] Yuklem		= {"gitmek","gelmek","y�klemek","y�r�mek","ko�mak"};
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(kelime[i].equalsIgnoreCase(Zaman_Zarflari[j]))
				{System.out.println("Zaman Zarf�="+Zaman_Zarflari[j]);}
				if(kelime[i].equalsIgnoreCase(Nesneler[j]))
				{System.out.println("Nesne="+Nesneler[j]);}
				if(kelime[i].equalsIgnoreCase(Baglaclar[j]))
				{System.out.println("Ba�la�="+Baglaclar[j]);}

			}
		}
		int count=0;
		String bir=" ",iki=" ";
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				bir=kelime[i].substring(0,3);
				iki=Dolayl�_Tumlec[j].substring(0, 3);
				if(bir.equals(iki)) {
					System.out.println("Dolayli T�mlec="+kelime[i]);
				}
				bir=kelime[i].substring(0,2);
				iki=Yuklem[j].substring(0,2);
					if(bir.equals(iki)) {
					System.out.println("Y�klem="+kelime[i]);
				}
				
			}
		}
		
	}
}
