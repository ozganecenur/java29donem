package com.rifatCan;

import java.util.Scanner;

public class denemeler 
{
			//01- 50 den ba�layarak 1 a kadar olan say�lar� ekrana yazd�ran kod //for-while-do..while t�m d�ng� yap�lar�nda �al��t�r�n
			//02- Kulan�c�dan iki say� girmesini bekleyen program�n hangi say�n�n b�y�k oldu�unu bulmas� bekleniyor. Yani a>b ise ekrana a say�s�n� yazd�r�n�z.
			//03- 5 ten ba�layarak 3 er artarak 20 ye kadar olan say�lar� yazd�ran program.  5,8,11,14,17,20 yazacak.
			//04- girilen say�n�n nefatif mi pozitif mi oldu�unu bulan program.
			//05- girilen 3 say�dan hangisinin b�y�k oldu�unu bulan kod.
	public void soru1()
	{
		for (int i = 50; i >= 1; i--) 
		{
			System.out.println(i);
		}
	}
	
	public void soru2()
	{
		Scanner sor = new Scanner(System.in);
		
		int sayi1 , sayi2;
		
		System.out.println("L�tfen 1.Say�y� Giriniz...");
		sayi1 = sor.nextInt();
		System.out.println("L�tfen 2.Say�y� Giriniz...");
		sayi2 = sor.nextInt();
		
		if(sayi1 < sayi2) 
		{
			System.out.println("Say�2 Say�1'den daha b�y�k.");
		}
		else
		{
			System.out.println("Say� 1 Say� 2'den daha b�y�k.");
		}
	}
	
	public void soru3()
	{
		for (int i = 5; i <= 50; i+=3) 
		{
			System.out.println(i);
		}
	}
	
	public void soru4()
	{
	
		Scanner scn = new Scanner(System.in);
		int girilensayi ;
		System.out.println("L�tfen Bir Say� Giriniz...");
		girilensayi = scn.nextInt();
		
		if(girilensayi < 0)
		{
			System.out.println("Girilen Say� Negatiftir.");
		}
		else if (girilensayi > 0)
		{
			System.out.println("Girilen Say� Pozitiftir.");
		}
		else
		{
			System.out.println("Girilen Say� S�f�rd�r.");
		}
	}
}
