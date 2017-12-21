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
		Scanner bul = new Scanner(System.in);
		
		String birincideger = "ekmek";
		String ikincideger  = "portakal";
		String ucuncudeger = "hayat";
		String dorduncudeger = "program";
		String besincideger = "robot";
		
		System.out.println("Ka� Kelime Girmek �stiyorsunuz.");
		bul.nextInt();
		
		birincideger =bul.nextLine();
		System.out.println("L�ften Birinci Kelimeyi Giriniz.");
		ikincideger = bul.nextLine();
		System.out.println("L�ften �kinci Kelimeyi Giriniz.");
		ucuncudeger = bul.nextLine();
		System.out.println("L�tfen ���nc� Kelimeyi Giriniz.");
		dorduncudeger = bul.nextLine();
		System.out.println("L�tfen D�rd�nc� Kelimeyi Giriniz.");
		besincideger = bul.nextLine();
		System.out.println("L�tfen Be�inci Kelimeyi Giriniz.");
		besincideger = bul.nextLine();
		/*String dizi [] = new String[5];
		dizi [0] = "greyfurt" ;
		dizi [1] = "mandalina" ;
		dizi [2] = "nar" ;
		dizi [3] = "erik" ;
		dizi [4] = "ananas" ;*/
	}
}
