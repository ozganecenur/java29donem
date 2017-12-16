package com.rifatcan;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class switchcaseYap�s� 
{
	public void haftan�ngunleri()
	{
		Scanner sc = new Scanner(System.in);
		
		int gun;
		System.out.println("L�tfen Rakam Baz�nda Bir G�n Giriniz.");
		gun = sc.nextInt();
		
		switch (gun) 
		{
		case 1 :
			 System.out.println("Haftan�n G�n� Pazartesi");
			break;
		case 2 :
			 System.out.println("Haftan�n G�n� Sal�");
			break;
		case 3 :
			 System.out.println("Hatfan�n G�n� �ar�amba");
		    break;
		case 4 :
			 System.out.println("Haftan�n G�n� Per�embe");
	        break;
		case 5 : 
			 System.out.println("Haftan�n G�n� Cuma");
			break;
		case 6 :
			 System.out.println("Haftan�n G�n� Cumartesi");
			break;
		case 7 :
			 System.out.println("Haftan�n G�n� PAzar");
			break;
		default:
			break;
		}
	}
	
	public String haftan�ngununubulma()
	{
		 
		 ZonedDateTime now = ZonedDateTime.now();
		 DayOfWeek gun = now.getDayOfWeek();
		 int Igun = gun.getValue();
		
		 String result="";
		
	     switch (Igun) 
	     {
	     case 1 : 
	    	 result="Pazartesi"; 
	     break;
	     case 2 : 
	    	 result="Sal�"; 
	     break;
	     case 3 : 
	    	 result="�ar�amba"; 
	     break;
	     case 4 : 
	    	 result="Per�embe"; 
	     break;
	     case 5 : 
	    	 result="Cuma"; 
	     break;
	     case 6 : 
	    	 result="Cumartesi"; 
	     break;
	     default : 
	    	 result="Pazar"; 
	     break;
  
	     }
	    
	    return result;
	     
	}// HaftaninGununuGetir() Metot Sonu

	
	/**
	 * a�a��da bulunan sorulara cevap verir
	 * 1- Selam
	 * 2- Nas�ls�n
	 * 3- �yiyim
	 * 4- Nerelisin
	 * 5- Sen bir program m�s�n
	 * 6- �yi g�nler o zaman
	 * Finish Cevab� : size de iyi g�nler dilerim.
	 * @param ifade : konu�ma metnini girebilisiniz
	 * @return : ilgili sorulara gerekli cevaplar� verir
	 */
	public String KonusmaSimulasyonu(String ifade) 
	{
		String result="";
		switch (ifade) 
		{
		
		case "Selam" : 
			result="Computer: Selam";	
		break;
		case "Nas�ls�n" : 
			result="Computer: �yiyim, siz nas�ls�n�z?";	
		break;
		case "�yiyim" : 
			result="Computer: ";	
		break;
		case "Nerelisin" : 
			result="Computer:  Ankaral�, siz nerelisiniz?";	
		break;
		case "Sen bir program m�s�n" : 
			result="Computer: Evet, sizinle konu�mak �zere programland�m";	
		break;
		case "�yi g�nler o zaman" : 
			result="Computer: size de iyi g�nler dilerim.";	
		break;
		default: 
			result="Computer: ";		
		break;
		}		
		return result;		
	}
}
