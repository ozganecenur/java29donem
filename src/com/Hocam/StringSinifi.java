package com.Hocam;


public class StringSinifi {

	static String Girilenifade ="S�ra No:1,Ad�:Muhammet,Ders: Java";
	static String GirilenifadeSayisal ="6";
	static String girilenBuyuk ="Ali gel";
	static String girilenkucuk ="Ali Gel";
	
	//S�ra No:1
	//Ad�:Muhammet
	//Ders: Java
	static String Girilenifade2 ="bug�n g�nlerden cumartesi De�il";
	
	
	public void ifadeBul(String GirilenString, String arananIfade) {
					
	}
	
	
	
	public static void main(String[] args) {
		
		int girilenifadeninUzunlugu =  Girilenifade.trim().length();
		
		//System.out.println(Girilenifade.indexOf('6'));
		System.out.println(Girilenifade.indexOf("pazar"));
		System.out.println(Girilenifade.substring(0, 9));
		System.out.println(Girilenifade.replace(',', ' '));

		System.out.println(girilenBuyuk.equals(girilenkucuk));
		System.out.println(girilenBuyuk.equalsIgnoreCase(girilenkucuk));
		
		System.out.println(Girilenifade.toUpperCase());
		System.out.println(Girilenifade.toLowerCase());
		
		
		
		
	}
	
	
	public void ornek() {
		int say=0,kelime=1;
		for (int i = 0; i < Girilenifade.length(); i++) {
		if(' '!=Girilenifade.charAt(i))
			{
			say++;
			System.out.println(Girilenifade.charAt(i));
			}
		else
		{
		kelime++;
		System.out.println("Bo�luk Karakteri");
		}
		}
	System.out.println("Girlen yaz�n�n uzunlu�u...:"+ say);
		System.out.println("Girlen yaz�n�n Kelime say�s�...:"+ kelime);
		
	}
	
	
}
