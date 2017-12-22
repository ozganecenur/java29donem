package com.serkan;

import java.time.Year;
import java.util.Scanner;

public class Odevler_23_24_Aral�k {

	public void Soru1() {

		Scanner sc = new Scanner(System.in);

		int dogumYili = 0;
		int cariYil = Year.now().getValue();
		int yas;
		boolean dogumYiliGecerlilik = true;

		// int SayisalDizi[][]=new int[2][7];

		do {

			System.out.println("Do�um y�l�n�z� giriniz");

			try {
				dogumYili = sc.nextInt();

				yas = cariYil - dogumYili;
				dogumYiliGecerlilik = true;

				if (yas < 18) {

					System.out.println("Re�it de�ilsiniz.");

					dogumYiliGecerlilik = true;

				} else if (yas == 18) {

					System.out.println("Ya��n�z on sekiz.");
					dogumYiliGecerlilik = true;

				} else if (yas == 19) {

					System.out.println("Ya��n�z on dokuz.");
					dogumYiliGecerlilik = true;

				} else if (yas == 20) {

					System.out.println("Ya��n�z yirmi.");
					dogumYiliGecerlilik = true;

				} else if (yas == 21) {

					System.out.println("Ya��n�z yirmi bir.");
					dogumYiliGecerlilik = true;

				} else if (yas == 22) {

					System.out.println("Ya��n�z yirmi iki.");
					dogumYiliGecerlilik = true;

				} else if (yas == 23) {

					System.out.println("Ya��n�z yirmi ��.");
					dogumYiliGecerlilik = true;

				} else if (yas == 24) {

					System.out.println("Ya��n�z yirmi d�rt.");
					dogumYiliGecerlilik = true;

				} else if (yas < 150) {
					System.out.println("Ya��n�z " + yas);
					dogumYiliGecerlilik = true;

				} else {
					System.out.println("Ge�erli bir y�l girmediniz. Tekrar deneyin");

					dogumYiliGecerlilik = false;

				}

			} catch (Exception e) {
				System.out.println("Ge�erli bir y�l girmediniz. Tekrar deneyin");
				sc.next();
				dogumYiliGecerlilik = false;
			}

		} while (dogumYiliGecerlilik == false);

	}

	public void Soru2() {

		String ogeler[][] = new String[5][6];

		ogeler[0][0] = "bug�n";
		ogeler[0][1] = "Yar�n";
		ogeler[0][2] = "Ak�am �zeri";
		ogeler[0][3] = "1925 te";
		ogeler[0][4] = "d�n";
		ogeler[0][5] = "Zaman Zarflar�";
		// ogeler[0][6]="0";

		ogeler[1][0] = "masa";
		ogeler[1][1] = "sandalye";
		ogeler[1][2] = "kitap";
		ogeler[1][3] = "araba";
		ogeler[1][4] = "bisiklet";
		ogeler[1][5] = "Nesneler";
		// ogeler[1][6]="0";

		ogeler[2][0] = "ve";
		ogeler[2][1] = "ile";
		ogeler[2][2] = "veya";
		ogeler[2][3] = "";
		ogeler[2][4] = "";
		ogeler[2][5] = "Ba�la�lar";
		// ogeler[2][6]="0";

		ogeler[3][0] = "Burada";
		ogeler[3][1] = "Ankara";
		ogeler[3][2] = "Arabada";
		ogeler[3][3] = "okulda";
		ogeler[3][4] = "evde";
		ogeler[3][5] = "Dolayl� T�mle�";
		// ogeler[3][6]="0";

		ogeler[4][0] = "gidece�im";
		ogeler[4][1] = "gelmek";
		ogeler[4][2] = "y�klemek";
		ogeler[4][3] = "y�r�mek";
		ogeler[4][4] = "ko�mak";
		ogeler[4][5] = "Y�klem";
		// ogeler[4][6]="0";

		String cumle[] = new String[4];

		cumle = new String[] { "Bug�n", "araba", "ile", "Ankaraya", "gidece�im" };

		int sayac[][] = new int[5][6];

		int maxSayac = 0;

		int max[] = new int[6];

		int oge = 0;

		int uzunluk = 0;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				for (int k = 0; k < 5; k++) {

					if (cumle[i].length() < ogeler[j][k].length()) {

						uzunluk = cumle[i].length();

					} else {
						uzunluk = ogeler[j][k].length();

					}

					for (int l = 0; l < uzunluk; l++) {

						if (cumle[i].charAt(l) == ogeler[j][k].charAt(l)) {

							sayac[j][k]++;

						}

					}

				}

			}

		}

		for (int a = 0; a < 5; a++) {

			maxSayac = 0;
			for (int b = 0; b < 6; b++) {

				if (sayac[a][b] > maxSayac) {

					maxSayac = sayac[a][b];

					oge = b;

				}

			}

			System.out.println(ogeler[a][5] + " : " + ogeler[a][oge]);

		}

	}

	public void Soru3() {

		int maxSayac = 0;
		int sonuc = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("kac kelime gireceksiniz?");
		int kelimeSay�s� = sc.nextInt();

		int sayac[] = new int[kelimeSay�s�];

		String arananKelime;

		String arananKelimeDizi[] = new String[20];

		String kelime;

		int kelimeUzunlugu = 0;

		String kelimeler[][] = new String[kelimeSay�s�][20];

		for (int i = 0; i < kelimeSay�s�; i++) {

			System.out.println(i + 1 + ". kelimeyi giriniz");
			kelime = sc.next();
			kelimeUzunlugu = kelime.length();

			for (int j = 0; j < kelime.length(); j++) {

				kelimeler[i][j] = String.valueOf(kelime.charAt(j));

			}

		}

		System.out.println("arad���n�z kelimeyi girin");

		arananKelime = sc.next();

		for (int i = 0; i < arananKelime.length(); i++) {

			arananKelimeDizi[i] = String.valueOf(arananKelime.charAt(i));

		}

		for (int j = 0; j < kelimeSay�s�; j++) {

			for (int k = 0; k < 20; k++) {

				if (arananKelimeDizi[k] == kelimeler[j][k]) {

					sayac[j]++;

				}

			}

		}

		for (int a = 0; a < kelimeSay�s�; a++) {

			if (sayac[a] > maxSayac) {

				maxSayac = sayac[a];

				sonuc = a;

			}

		}

		System.out.println("bunu mu demek istediniz");

		for (int i = 0; i < 20; i++) {

			System.out.print(kelimeler[sonuc][i]);

		}

	}

}
