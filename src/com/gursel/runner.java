package com.gursel;

public class runner {

	public static void main(String[] args) {
	         
		 /* �ift ve tek say�lar�n karelerinin toplam�*/
		
		int Csonuc=0;
		int Tsonuc=0;
	  for(int i=1;i<=4;i++)
	  {
		  if(i%2==0)
		  {
			  Csonuc=Csonuc+(i*i);
			  System.out.println("�ift sy�lar�n karelerinin toplam� : "+ Csonuc);
		  }
		  else
		  {
			  Tsonuc=Tsonuc+(i*i);
			  System.out.println("Tek sy�lar�n karelerinin toplam� : "+ Tsonuc);
		  }
	  }
	  System.out.println("Csonuc ve Tsonuc toplam� : "+ (Csonuc+Tsonuc));

	}

}
