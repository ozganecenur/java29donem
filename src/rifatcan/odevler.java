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
		for (int k = 5; k <= 20; k+=5) 
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
		
		int sayi1 , sayi2 , sayi3;
		System.out.println("L�tfen Birinci Say�y� Giriniz...");
		sayi1 = sgir.nextInt();
		System.out.println("L�tfen �kinci Say�y� Giriniz...");
		sayi2 = sgir.nextInt();
		System.out.println("L�tfen ���nc� Say�y� Giriniz...");
		sayi3 = sgir.nextInt();
		
		if(sayi1 < sayi2 )
		{
			System.out.println("Sayi1 Sayi2'den K���kt�r.");
		}
		else if (sayi1 < sayi3)
		{
			System.out.println("Sayi1 Sayi3'ten K���kt�r.");
		}
		else if (sayi2 < sayi1)
		{
			System.out.println("Sayi2 Sayi1'den K���kt�r.");
		}
		else if (sayi2 < sayi3)
		{
			System.out.println("Sayi2 Sayi3'den K���kt�r.");
		}
		else if (sayi3 < sayi1)
		{
			System.out.println("Sayi3 Sayi1'den K���kt�r.");
		}
		else if (sayi3 < sayi2)
		{
			System.out.println("Sayi3 Sayi2'den K���kt�r.");
		}
		else if(sayi1 > sayi2 )
		{
			System.out.println("Sayi1 Sayi2'den B�y�kt�r.");
		}
		else if (sayi1 > sayi3)
		{
			System.out.println("Sayi1 Sayi3'ten B�y�kt�r.");
		}
		else if (sayi2 > sayi1)
		{
			System.out.println("Sayi2 Sayi1'den B�y�kt�r.");
		}
		else if (sayi2 > sayi3)
		{
			System.out.println("Sayi2 Sayi3'den B�y�kt�r.");
		}
		else if (sayi3 > sayi1)
		{
			System.out.println("Sayi3 Sayi1'den B�y�kt�r.");
		}
		else if (sayi3 > sayi1)
		{
			System.out.println("Sayi3 Sayi2'den B�y�kt�r.");
		}
	}
}
