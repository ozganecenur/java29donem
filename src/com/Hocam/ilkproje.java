package com.Hocam;

import java.util.Scanner;

public class ilkproje {
 	// YEN� �DEVLER 
	
	//KOLAY SORULAR
	//01- 20 den ba�layarak 10 a kadar olan say�lar� ekrana yazd�ran kod //for-while-do..while t�m d�ng� yap�lar�nda �al��t�r�n
	//02- Kulan�c�dan iki say� girmesini bekleyen program�n hangi say�n�n b�y�k oldu�unu bulmas� bekleniyor. Yani a>b ise ekrana a say�s�n� yazd�r�n�z.
	//03- 5 ten ba�layarak 3 er artarak 20 ye kadar olan say�lar� yazd�ran program.  5,8,11,14,17,20 yazacak.
	//04- girilen say�n�n nefatif mi pozitif mi oldu�unu bulan program.
	//05- girilen 3 say�dan hangisinin b�y�k oldu�unu bulan kod.
	
	
	//ZOR SORULAR
	//01- 9.000 den ba�layarak 10.000 e kadar olan say�lar�n i�inden tek ve �ift say�lar� bulup toplam�n� ekrana yazd�ran,
	//02- 1 den 1.000 e kadar olan say�lar�n i�indeki asal say�lar� bulan program.
	//03- ��renciden vize ve final notlar�n� alan ve ortalama notu hesaplay�p. harf kar���l���n� bulan program. AA,AB.....FF 
	//04- 3,1,33,12,6,90 say�lar�n� k���kten b�y��e s�ralay�n�z.
	//05- y�ld�z simgesi kullan�larak istenilen uzunlukta kare �iziniz. mesela: 5 y�ld�z olsun
	//  * * * * * 
	//  *       *
	//  *       *
	//  *       *
	//  * * * * *
	// Ba�ar�lar
	
	public static void main(String[] args) {
		
		TarihUygulamalari th = new TarihUygulamalari();
	//	System.out.println(th.HaftaninGununuGetir());
		String kullaniciGirisMetni="";
		String computerCevabi="";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Konu�ma Metni: ");
			kullaniciGirisMetni = sc.nextLine();
			computerCevabi = th.KonusmaSimulasyonu(kullaniciGirisMetni);
			System.out.println(computerCevabi);			
		} while (!computerCevabi.equals("Computer: size de iyi g�nler dilerim."));
		 
	}
	
	
	
	
}
