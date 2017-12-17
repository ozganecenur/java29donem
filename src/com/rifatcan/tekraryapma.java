package com.rifatcan;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class tekraryapma 
{
	public void toplama()
	{
		int a = 10 , b = 20 , sonuc;
		sonuc = a + b;
		System.out.println("A ile B'nin toplam Sonucu : " + sonuc);
	}
	
	public void toplamdegiskenli(int a , int b)
	{
		int sonuc1;
		sonuc1 = a + b;
		System.out.println("A ile B'nin Toplam De�i�kenli Sonucu : " + sonuc1);
	}
	
	public int toplamageridondurme(int a , int b)
	{
		int sonuc2;
		sonuc2 = a + b;
		return sonuc2;
	}
	
	public void c�kartma()
	{
		int a = 90 , b = 45 , sonuc3;
		sonuc3 = a - b;
		System.out.println("A'dan B de�erini ��kartt���m�zda sonu� : " + sonuc3);		
	}
	
	public void c�kartmedegiskenli(int a , int b)
	{
		int sonuc4;
		sonuc4 = a - b;
		System.out.println("A ile B'nin De�i�kenli ��kartma De�eri Sonucu : " + sonuc4);
	}
	
	public int c�kartmageridondurme(int a , int b)
	{
		int sonuc5;
		sonuc5 = a - b;
		return sonuc5;
	}
	
	public void carpma()
	{
		int a = 9 , b = 88 , sonuc6;
		sonuc6 = a * b;
		System.out.println("A ile B'nin �arp�m De�eri : " + sonuc6);
	}
	
	public void carpmadegiskenli(int a , int b)
	{
		int sonuc7;
		sonuc7 = a * b;
		System.out.println("A ile B'nin De�i�kenli �arp�m Sonucu : " + sonuc7);
	}
	
	public int carpmageridondurme(int a , int b)
	{
		int sonuc8;
		sonuc8 = a * b;
		return sonuc8;
	}
	
	public void bolme()
	{
		int a = 60 , b = 20 , sonuc9;
		sonuc9 = a / b;
		System.out.println("A'y� B'ye b�ld���m�zdeki de�er : " + sonuc9);
	}
	
	public void bolmedegiskenli(int a , int b)
	{
		int sonuc10;
		sonuc10 = a / b;
		System.out.println("A'y� B'ye b�ld���m�zdeki De�i�kenli Sonucu : " + sonuc10);
	}
	
	public int bolmegeridondurme(int a , int b)
	{
		int sonuc11;
		sonuc11 = a / b;
		return sonuc11;
	}
	
	public void mod()
	{
		int a = 30 , b = 50 , sonuc12;
		sonuc12 = a % b;
		System.out.println("A ile B'nin Modunu alma : " + sonuc12);
	}
	
	public void moddegiskenli(int a , int b)
	{
		int sonuc13;
		sonuc13 = a % b;
		System.out.println("A ile B'nin De�i�kenli Mod Alma Sonucu : " + sonuc13);
	}
	
	public int modgeridondurme(int a , int b)
	{
		int sonuc14;
		sonuc14 = a % b;
		return sonuc14;
	}
	
	public void kosullarfor()
	{
		for (int i = 0; i <= 100; i+=3) 
		{
			System.out.println("0'dan Ba�lay�p 100'e kadar 3'er 3'er sayma : " + i);
		}
	}
	
	public void dowwhilekullan�m�()
	{
		int r = 100;
		do 
		{
			System.out.println("100'den Geriye Do�ru Sayma : " + r);
			r--;
		} 
		while (r >= 0);
	}
	
	public void  whilekullan�m�()
	{
		int k = 500;
		while (k >= 0) 
		{
			System.out.println("500'den 0'a kadar geri sayan program : " + k);
			k--;
		}
	}
	
	public void buyukkucuk()
	{
		Scanner sc = new Scanner(System.in);
		int sayi1 , sayi2;
		System.out.println("L�tfen 1.Say�y� Giriniz.");
		sayi1 = sc.nextInt();
		System.out.println("L�tfen 2.Say�y� Giriniz.");
		sayi2 = sc.nextInt();
		
		if(sayi1 > sayi2)
		{
			System.out.println("Say�1 Say�2'den B�y�kt�r.");
		}
		else if (sayi2 > sayi1)
		{
			System.out.println("Say�2 Say�1'den B�y�kt�r.");
		}		
	}
	
	public void negpoz()
	{
		Scanner scan = new Scanner(System.in);
		int sayi;
		System.out.println("L�ften Bir Say� Giriniz.");
		sayi = scan.nextInt();
		
		if(sayi < 0)
		{
			System.out.println("Say� Negatiftir.");
		}
		else if(sayi > 0)
		{
			System.out.println("Say� Pozitiftir.");
		}
		else
		{
			System.out.println("Say� S�f�rd�r.");
		}
	}
	
	public void buyuksay�y�bul()
	{
		Scanner sayigir = new Scanner(System.in);
		System.out.println("L�tfen 1. Say�y� Giriniz...");
		int sayi1 = sayigir.nextInt();
		System.out.println("L�tfen 2. Say�y� Giriniz...");
		int sayi2 = sayigir.nextInt();
		System.out.println("L�tfen 3. Say�y� Giriniz...");
		int sayi3 = sayigir.nextInt();
		
		int buyuksayi;
		
		if(sayi1 > sayi2 && sayi1 > sayi3)
		{
			buyuksayi = sayi1;
		}
		else if (sayi2 > sayi1 && sayi2 > sayi3)
		{
			buyuksayi = sayi2;	
		}
		else
		{
			buyuksayi = sayi3;
		}
		System.out.println("En B�y�k Say� : " + buyuksayi);
	}
}
