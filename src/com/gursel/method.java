package com.gursel;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void tekrarswitch()
	{
		String[] g�nler= {"pazartesi","Sal�","�ar�amba","per�embe","cuma","cumartesi","pazar"};
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		for(int i=0;i<g�nler.length;i++)
		{
			System.out.print(" "+g�nler[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.print("g�n numaras�n� giriniz :");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: System.out.println(g�nler[0]); break;
		case 2: System.out.println(g�nler[1]); break;
		case 3: System.out.println(g�nler[2]); break;
		case 4: System.out.println(g�nler[3]); break;
		case 5: System.out.println(g�nler[4]); break;
		case 6: System.out.println(g�nler[5]); break;
		case 7: System.out.println(g�nler[6]); break;
		default : System.out.println("error message"); break;
		}
		
	}

}
