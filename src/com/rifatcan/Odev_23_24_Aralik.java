package com.rifatcan;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Odev_23_24_Aralik 
{
	public void y�lkriteri()
	{
		Scanner sc = new Scanner(System.in);
		int yil;
		System.out.println("L�tfen Do�um Tarihinizi Y�l Baz�nda Giriniz.");
		yil = sc.nextInt();
		
		SimpleDateFormat bicim = new SimpleDateFormat("YYYY");
		Date tarih = new Date(yil);
		System.out.println(bicim.format(yil));
		
	
	}
}
