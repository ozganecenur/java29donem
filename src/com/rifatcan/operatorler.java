package com.rifatcan;

public class operatorler {
	
	public void toplama()
	{
		int a = 5 , b = 20 , sonuc;
		sonuc = a + b;
		System.out.println("A ile B'nin toplam Sonucu : " + sonuc);
	}
	
	public void toplamaDegiskenli(int a1 , int b1)
	{
		int sonuc1;
		sonuc1 = a1 + b1;
		System.out.println("A1 ile B1'in De�i�kenli Toplam Sonucu : " + sonuc1);
	}
	
	public int toplamaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc2;
		sonuc2 = a2 + b2;
		return sonuc2;
	}
	
	public void c�kartma()
	{
		int a = 5 , b = 20 , sonuc3;
		sonuc3 = a - b;
		System.out.println("A'dan B'yi ��kartt���m�zdaki sonu� : " + sonuc3);
	}
	
	public void c�kartmaDegiskenli(int a1 , int b1)
	{
		int sonuc4;
		sonuc4 = a1 - b1;
		System.out.println("A'dan B'yi ��kartt���m�zdaki De�i�kenli sonu� : " + sonuc4);
	}
	
	public int c�kartmaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc5;
		sonuc5 = a2 - b2;
		return sonuc5;
	}
	
	public void carpma()
	{
		int a = 5 , b = 20 , sonuc6;
		sonuc6 = a * b;
		System.out.println("A ile B'nin �arp�m Sonucu : " + sonuc6);
	}
	
	public void carpmaDegiskenli(int a1 , int b1)
	{
		int sonuc7;
		sonuc7 = a1 * b1;
		System.out.println("A1 ile B1'in De�i�kenli �arp�m Sonucu : " + sonuc7);
	}
	
	public int carpmaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc8;
		sonuc8 = a2 * b2;
		return sonuc8;
	}
	
	public void bolme()
	{
		int a = 5 , b = 20 , sonuc9;
		sonuc9 = a / b;
		System.out.println("A'n�n B'ye b�l�m Sonucu : " + sonuc9);
	}
	
	public void bolmeDegiskenli(int a1 , int b1)
	{
		int sonuc10;
		sonuc10 = a1 * b1;
		System.out.println("A1'in B1'e  De�i�kenli b�l�m Sonucu : " + sonuc10);
	}
	
	public int bolmeGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc11;
		sonuc11 = a2 * b2;
		return sonuc11;
	}

	public void modalma()
	{
		int a = 5 , b = 20 , sonuc12;
		sonuc12 = a % b;
		System.out.println("A ile B'nin mod al�m sonucu : " + sonuc12);
	}
	
	public void modalmaDegiskenli(int a1 , int b1)
	{
		int sonuc13;
		sonuc13 = a1 % b1;
		System.out.println("A1 ile B1'in De�i�kenli Mod Alma Sonucu : " + sonuc13);
	}
	
	public int modalmaGeriDondurme()
	{
		int a2 = 10 , b2 = 35 , sonuc14;
		sonuc14 = a2 % b2;
		return sonuc14;
	}

}
