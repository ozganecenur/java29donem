package com.rifatcan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchFinalyYap�s� 
{

	public static void main(String[] args) 
	{
		int a = 1;
		int ab=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz....: ");
	try {
		ab = sc.nextInt();
		a=ab/0;
	} 
	catch (InputMismatchException e) 
	{
	//System.out.println("Girmi� oldu�unuz say� ge�ersizdir. float yada String tipte ifade girdiniz.");
		a=25;	
	} 
	catch (Exception e) 
	{
		System.out.println("Beklenmeyen bir hat olu�tu sistem y�neticiniz ile g�r���rn�z.50");
	}
	finally 
	{
		System.out.println("Her hal�karda i�ler");
	}
		a=ab;
		System.out.println("sonu�.....: "+(a/5));
	}
}
