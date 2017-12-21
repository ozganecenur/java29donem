package com.rifatcan;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Odev_23_24_Aralik 
{
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

        if (nowyear - yil <= 17) 
        {
            System.out.println("Kullanici resit degildir.");
        } else if (nowyear - yil == 18)
        {
            System.out.println("");
        }
	}
		
}
