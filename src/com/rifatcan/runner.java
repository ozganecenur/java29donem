package com.rifatcan;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) 
	{
		operatorler islem = new operatorler();
		kosullar gir = new kosullar();
		odevler yap = new odevler();
		denemeler dene = new denemeler();
		switchcaseYap�s� sc = new switchcaseYap�s�();
		diziler dc = new diziler();
		
		dc.tekboyutludiziler();
	
		/*islem.toplama();
		islem.toplamaDegiskenli(20, 40);
		System.out.println(islem.toplamaGeriDondurme());
		islem.c�kartma();
		islem.c�kartmaDegiskenli(50, 30);
		System.out.println(islem.c�kartmaGeriDondurme());
		islem.bolme();
		islem.bolmeDegiskenli(90, 20);
		System.out.println(islem.carpmaGeriDondurme());
		islem.modalma();
		islem.modalmaDegiskenli(90, 20);
		System.out.println(islem.modalmaGeriDondurme());*/
		//gir.sayiTahmin();
		//yap.kullanici();
		//yap.beserbser();
		//yap.negpoz();
		//yap.sayigir();
		//yap.tekcift();
		//yap.harfnotu();
		//dene.soru1();
		//dene.soru2();
		//dene.soru3();
		//dene.soru4();
		//yap.kareciz();
		//yap.sayisayfor();
		//yap.sayisaywhile();
		//yap.siyisaydowhile();
		//yap.AsalSayi();
		//sc.haftan�ngunleri();
		
		/*System.out.println(sc.haftan�ngununubulma());
		String kullaniciGirisMetni="";
		String computerCevabi="";
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Konu�ma Metni: ");
			kullaniciGirisMetni = scan.nextLine();
			computerCevabi = sc.KonusmaSimulasyonu(kullaniciGirisMetni);
			System.out.println(computerCevabi);			
		} while (!computerCevabi.equals("Computer: size de iyi g�nler dilerim."));*/
	}

}
