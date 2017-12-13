package rifatcan;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class odevler 
{

		//01- 20 den ba�layarak 10 a kadar olan say�lar� ekrana yazd�ran kod //for-while-do..while t�m d�ng� yap�lar�nda �al��t�r�n
		//02- Kulan�c�dan iki say� girmesini bekleyen program�n hangi say�n�n b�y�k oldu�unu bulmas� bekleniyor. Yani a>b ise ekrana a say�s�n� yazd�r�n�z.
		//03- 5 ten ba�layarak 3 er artarak 20 ye kadar olan say�lar� yazd�ran program.  5,8,11,14,17,20 yazacak.
		//04- girilen say�n�n nefatif mi pozitif mi oldu�unu bulan program.
		//05- girilen 3 say�dan hangisinin b�y�k oldu�unu bulan kod.
	
	public void say�say()
	{
		for (int i = 20; i >=10; i--) 
		{
			System.out.println(i);
		}
	}
	
	public void kullanici()
	{
		Scanner sc = new Scanner(System.in);
		
		int sayi1 , sayi2;
		
		System.out.println("L�tfen Birinci Say� Giriniz...");
		sayi1 = sc.nextInt();
		System.out.println("L�tfen �kinci Say�y� Giriniz...");
		sayi2 = sc.nextInt();
		if (sayi1 < sayi2) 
		{
			System.out.println("Say� 2 Say� 1'den daha b�y�k.");
		}
		else
		{
			System.out.println("Say� 1 Say� 2'den daha b�y�k.");
		}
	}
	
	
	//5 ten ba�lam�� ama �cer artacak
	public void beserbser()
	{
		for (int k = 5; k <= 20; k+=3) 
		{
			System.out.println(k);
		}
	}
	
	public void negpoz()
	{
		Scanner sayi = new Scanner(System.in);
		
		System.out.println("L�tfen Bir Say� Giriniz.");
		int girilensayi;
		girilensayi = sayi.nextInt();
		
		if(girilensayi > 0)
		{
			System.out.println("Girdi�iniz Say� Pozitiftir.");
		}
		else if(girilensayi < 0)
		{
			System.out.println("Girdi�iniz Say� Negatifdir.");
		}
		else 
		{
			System.out.println("Say� 0'd�r.");
		}
	}
	
	// Hangi say�n�n b�y�k oldu�unu bulacak. yani en b�y�k say� �udur diyecek. bunu �zerinde biraz daha �al��
	public void sayigir()

	
	{
		Scanner sgir = new Scanner(System.in);
		
		
		System.out.println("L�tfen 1. Say�y� Giriniz...");
		int sayi1 = sgir.nextInt();
		System.out.println("L�tfen 2. Say�y� Giriniz...");
		int sayi2 = sgir.nextInt();
		System.out.println("L�tfen 3. Say�y� Giriniz...");
		int sayi3 = sgir.nextInt();
		
		int buyuksayi;
		
		if(sayi1 > sayi2 && sayi1 > sayi3)
		{
			buyuksayi = sayi1;
		}
		else if (sayi2 > sayi1 && sayi2 > sayi3)
		{
			buyuksayi = sayi2;	
		}
		else
		{
			buyuksayi = sayi3;
		}
		System.out.println("En B�y�k Say� : " + buyuksayi);
	}
	
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
	
	public void tekcift()
	{
		
		int tek = 0 , cift = 0;
		
		
		for (int i = 9000; i <= 10000; i++) 
		{
			if(i%2==0)
			{
				cift = cift + i;
				System.out.println("�ift Say�lar�n Toplam� : " + cift);
				
			}
			else
			{
				tek = tek + i;
				System.out.println("Tek Say�lar�n Toplam� : " + tek);
			}
			
			
		}
	}
	
	public void harfnotu()
	{
		Scanner vf = new Scanner(System.in);
		int vize , fnl , ortalama = 0 ;
		
		System.out.println("L�ften Vize Notunu Giriniz...");
		vize = vf.nextInt();
		System.out.println("L�tfen Final Notunu Giriniz...");
		fnl = vf.nextInt();
		
		ortalama = (vize + fnl) / 2;
		
		if(ortalama >= 85)
		{
			System.out.println("Harf Notu Aral��� : AA ");
		}
		else if (85 > ortalama && ortalama >= 70)
		{
			System.out.println("Harf Notu Aral��� : BA ");
		}
		else if (70 > ortalama && ortalama >= 60)
		{
			System.out.println("Harf Notu Aral��� : BB");
		}
	}
	
	
}
