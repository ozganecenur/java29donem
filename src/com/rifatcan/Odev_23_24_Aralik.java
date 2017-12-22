package com.rifatcan;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Odev_23_24_Aralik 
{
	static String ifade = "Bug�n-araba-ile-Ankaraya-gidece�im.";
	static String ifade1 = "Yar�n Bisiklet ile Okula Gidece�im.";
	static String ifade2 = "Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m.";
	
	public void y�lkriteri()
	{
        int yil = 0, nowyear, yas = 17;
        nowyear = YearMonth.now().getYear();

        do {
            try 
            {
                System.out.println("L�tfen Bir Y�l Giriniz.");
                Scanner sc = new Scanner(System.in);
               yil = sc.nextInt();
            } catch (InputMismatchException e) 
            {
                System.out.println("Yanl�� Bir Tarih Kriteri Girdiniz L�tfen Ge�erli Bir do�um tarihi giriniz. : ");
                yil = 0;
            }
        } while (yil <= 1900 || yil >= 2017);

        if (nowyear - yil <= yas) 
        {
            System.out.println("Kullanici resit degildir.");
        } else if (nowyear - yil >= yas)
        {
            System.out.println("Kullan�c� Re�ittir.");
        }
	}
		
	public void kelimeayir()
	{
		
		//"Bug�n-araba-ile-Ankaraya-gidece�im."
		//"Yar�n Bisiklet ile Okula Gidece�im."
		//"Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m."
		
		
		System.out.println("Zaman Zarf� : " + ifade.substring(0,5));
		System.out.println("Nesne : " + ifade.substring(6,11));
		System.out.println("Ba�la� : " + ifade.substring(12,15));
		System.out.println("Dolayl� T�mle� : " + ifade.substring(16,24));
		System.out.println("Y�klem : " + ifade.substring(25,35));
		
		System.out.println("Zaman Zarf� : " + ifade1.indexOf("Yar�n"));
		System.out.println("Nesne : " + ifade1.indexOf("Bisiklet"));
		System.out.println("Ba�la� : " + ifade1.indexOf("ile"));
		System.out.println("Dolayl� T�mle� : " + ifade1.indexOf("Okula"));
		System.out.println("Y�klem : " + ifade1.indexOf("Gidece�im."));
		
		System.out.println("Zaman Zarf� : " + ifade2.replaceAll("Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m.", "Ak�am"));
		System.out.println("Nesne : " + ifade2.replaceAll("Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m.", "Evde"));
		System.out.println("Ba�la� : " + ifade2.replaceAll("Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m.", "ve"));
		System.out.println("Dolayl� T�mle� : " + ifade2.replaceAll("Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m.", "Okulda"));
		System.out.println("Y�klem : " + ifade2.replaceAll("Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m.", "Kitap"));
		System.out.println("Y�klem : " + ifade2.replaceAll("Ak�am-evde-ve-Okulda-Kitap-Okuyaca��m.", "Okuyaca��m."));
	}
	
	public void bunumudemekistediniz()
	{
		
        System.out.println("Kac kelime girmek istiyorsunuz?");
        Scanner sc = new Scanner(System.in);

        int kelime_sayisi = sc.nextInt();

        String[] kelimeler = new String[kelime_sayisi];

        int[] masraflar = new int[kelime_sayisi];
        int en_dusuk_masraf = 0;

        for(int i = 0; i < kelime_sayisi; i++) 
        {

                System.out.println((i + 1) + ". kelimeyi giriniz: ");
                sc = new Scanner(System.in);

                kelimeler[i] = sc.nextLine();
        }

        System.out.println("Aradiginiz kelimeyi giriniz: ");
        sc = new Scanner(System.in);

        String aranan = sc.nextLine();

        for(int i = 0; i < kelime_sayisi; i++) 
        {

            String kelime = kelimeler[i];
            en_dusuk_masraf = 0;
            // ayni uzunlukta mi?
            if(aranan.length() == kelime.length())
            {

                for(int j = 0; j < aranan.length(); j++) 
                {
                    int c = 0;
                    c += Math.abs(aranan.charAt(j) - kelime.charAt(j));
                    masraflar[i] = c;
                }

            }

        }

        int c = masraflar[0];
        int s = 0;
        for(int i = 0; i < masraflar.length; i++) {
            System.out.println("Masraf " + i + ": " + masraflar[i]);
            if(masraflar[i] < c) {
                c = masraflar[i];
                s = i;
            }
        }

        System.out.println("Bunu mu aramak istediniz? " + kelimeler[s]);

    }
}
