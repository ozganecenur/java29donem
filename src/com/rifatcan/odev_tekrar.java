package com.rifatcan;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class odev_tekrar 
{
	static String kelime1 = "Ben bug�n ders tekrar� yapaca��m.";
	static String kelime2 = "Bug�n bisiklet ile i�e gidece�im.";
	static String kelime3 = "Yar�n ak�am arkada��m ile yeme�e ��kaca��m.";
	
	public void yilbulanprogram()
	{
		int yil=0 , suankiyil , yas = 17;
		suankiyil = YearMonth.now().getYear();
		
		do 
		{
			try 
			{
				System.out.println("L�tfen Bir Yil Giriniz");
				Scanner sc = new Scanner(System.in);
				yil = sc.nextInt();
			} 
			catch (Exception e) 
			{
				System.out.println("Yanlis Bir Tarih Kriteri Girdiniz. L�tfen Y�l Baz�ndan Bir Deger Giriniz.");
			}
			
			
		} while (yil <= 1900 || yil >= 2017);
		
		if(suankiyil - yil <= yas)
		{
			System.out.println("Kullanici Yasi Resit Degildir.");
		}
		else if (suankiyil - yil == yas + 1 )
		{
			System.out.println("Kullanici 18 Yasindadir");
		}
		else if (suankiyil - yil == yas + 2)
		{
			System.out.println("Kullanici 19 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 3)
		{
			System.out.println("Kullanici 20 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 4)
		{
			System.out.println("Kullanici 21 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 5)
		{
			System.out.println("Kullanici 22 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 6)
		{
			System.out.println("Kullanici 23 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 7)
		{
			System.out.println("Kullanici 24 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 8)
		{
			System.out.println("Kullanici 25 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 9)
		{
			System.out.println("Kullanici 26 Yasindadir");
		}
		else if (suankiyil - yil == yas + 10)
		{
			System.out.println("Kullanici 27 Yasindadir.");
		}
		else if (suankiyil - yil == yas + 11)
		{
			System.out.println("Kullanici 28 Yasindadir.");
		}
	}
	
	public void cumlelereayirma()
	{
		String zaman_zarflar� [] = {"Bug�n","Yar�n","Ak�am �zeri","1925 te","d�n"};
		String nesneler       [] = {"masa","sandalye","kitap","araba","bisiklet"};
		String baglaclar      [] = {"ve","ile","veya","",""};
		String dolayl�_t�mlec [] = {"Burada","Ankara'ya","Araba","okulda","evde"};
		String yuklem         [] = {"gidece�im.","gelmek","y�klemek","y�r�mek","ko�mak"};
		
		
		System.out.println("Zaman Zarflar� : " + zaman_zarflar�[0]);
		System.out.println("Zaman Zarflar� : " + zaman_zarflar�[1]);
		System.out.println("Zaman Zarflar� : " + zaman_zarflar�[2]);
		System.out.println("Zaman Zarflar� : " + zaman_zarflar�[3]);
		System.out.println("Zaman Zarflar� : " + zaman_zarflar�[4]);
		
		
		System.out.println("Nesneler : " + nesneler[0]);
		System.out.println("Nesneler : " + nesneler[1]);
		System.out.println("Nesneler : " + nesneler[2]);
		System.out.println("Nesneler : " + nesneler[3]);
		System.out.println("Nesneler : " + nesneler[4]);
		
		System.out.println("Ba�la�lar : " + baglaclar[0]);
		System.out.println("Ba�la�lar : " + baglaclar[1]);
		System.out.println("Ba�la�lar : " + baglaclar[2]);
		
		System.out.println("Dolayl� T�mle� : " + dolayl�_t�mlec[0]);
		System.out.println("Dolayl� T�mle� : " + dolayl�_t�mlec[1]);
		System.out.println("Dolayl� T�mle� : " + dolayl�_t�mlec[2]);
		System.out.println("Dolayl� T�mle� : " + dolayl�_t�mlec[3]);
		System.out.println("Dolayl� T�mle� : " + dolayl�_t�mlec[4]);
		
		System.out.println("Y�klem : " + yuklem[0]);
		System.out.println("Y�klem : " + yuklem[1]);
		System.out.println("Y�klem : " + yuklem[2]);
		System.out.println("Y�klem : " + yuklem[3]);
		System.out.println("Y�klem : " + yuklem[4]);
		
		System.out.println("Kelime Birle�mi� Hali : " + zaman_zarflar�[0] + " " + nesneler[4] + " " + baglaclar[1] + " " + dolayl�_t�mlec[1] + " " + yuklem[0]);
		
		System.out.println("�zne :" + kelime1.substring(0,4));
		System.out.println("Zaman Zarf�: " + kelime1.substring(4,9));
		System.out.println("Nesne :" + kelime1.substring(10,14));
		System.out.println("Dolay�l� T�mle�: " + kelime1.substring(15,22));
		System.out.println("Y�klem :" + kelime1.substring(23,33));
		
		System.out.println("�zne :" + kelime2.replaceAll(kelime2, "Bug�n"));
		System.out.println("Zaman Zarf�: " + kelime2.replaceAll(kelime2,"bisiklet"));
		System.out.println("Nesne :" + kelime2.replaceAll(kelime2, "ile"));
		System.out.println("Dolay�l� T�mle�: " + kelime2.replaceAll(kelime2, "i�e"));
		System.out.println("Y�klem :" + kelime2.replaceAll(kelime2, "gidece�im."));	
	}
	
	public void bunumudemekistediniz()
	{
		
	}
}
