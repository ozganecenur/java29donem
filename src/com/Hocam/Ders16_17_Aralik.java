package com.Hocam;

import java.util.Scanner;

public class Ders16_17_Aralik {

	// ��LENECEK KONULAR
	//01- Switch Case yap�s�
	//02- try-catch yap�s�
	//03- String ve Math s�n�flar�
	//04- Basit diziler ve �ok boyutlu diziler - Yeti�irse i�lenecek
	
	//
	
	
	public static void main(String[] args) {
		
	String StringRakam="";
	Scanner sc = new Scanner(System.in);
	TipDonusumleri tp = new TipDonusumleri();
	double CevrilenRakam=0;
	boolean hataDurumu=true;
	
	do {
		System.out.println("Tip D�n���m� i�in bir say� giriniz...: ");
		StringRakam = sc.nextLine();
		try {
			 CevrilenRakam = tp.DoublesayiyaCevir(StringRakam);
			 hataDurumu=false;
		} catch (Exception e) {
			System.out.println("Double say� bir ifade girmediniz. L�tfen double say� bir ifade girerek tekrar deneyiniz.");
			hataDurumu=true;
		}
	} while (hataDurumu==true);
		
	if(CevrilenRakam>20) System.out.println("Rakam 20 den b�y�kt�r.");
	sc.close();
	
	}
	
	
}
