package variables;

public class Main {

	public static void main(String[] args) {
		
	/*	int ogrenciSayisi = 12;
		String mesaj = "��renci sayisi : ";
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println(mesaj+ogrenciSayisi);
		System.out.println("��renci sayisi : "+ogrenciSayisi);
		System.out.println("��renci sayisi : "+ogrenciSayisi);
*/
/*		int sayi1 = 266;
		int sayi2 = 25;
		int sayi3 = 26;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		
		
		System.out.println("En b�y�k sayi = "+enBuyuk);
	*/
		
		
		/*Switch bloklar�
	
		
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�tiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz");
				
		
		
		}
		*/
		
		/*
		// for
		
		for(int i=2; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For D�ng�s� Bitti");
		
		
		
		//While d�ng�s�
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While D�ng�s� Bitti");
		
		// do-while
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10);
		System.out.println("Do-While D�ng�s� Bitti");
		
		*/
		/*
		// Arrays
		
		String ogrenci1 = "Bayram";
		String ogrenci2 = "Mehmet";
		String ogrenci3 = "Erkan";
		String ogrenci4 = "Fadime";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Bayram";
		ogrenciler[1]="Mehmet";
		ogrenciler[2]="Erkan";
		ogrenciler[3]="Fadime";
		
		for(int i =0 ; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		*/
		/* recap 2
		//double[] myList = new double[4]
		double [] myList = {1.2,6.3,4.3,5.6};
		double total = 0;
		
		double max = myList[0];
		
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total =total + number;
			System.out.println(number);
			
		}
		System.out.println("Toplam = "+total);	
		System.out.println("En b�y�k = "+max);	
		*/
		/* 2boyutlu diziler
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";
		
		
		for(int i = 0; i<=2; i++) {
			System.out.println("-------------------");
			for(int j = 0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
		*/
		
		/*
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s� : "+mesaj.length());
		System.out.println("5. eleman : " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		*/
		
		/*
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		System.out.println(mesaj.replace(' ', '-'));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());	
		
		
		String mesaj1 = "           Bug�n hava �ok g�zel.            ";
		
		System.out.println(mesaj1.trim()); // trim ba�tan ve sondan bo�luk atma
		*/		
		
		
		/*
		// mini-proje asal say�
		
		int number = 3;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayi asal de�ilir.");
			return;
		}
		if(number<1) {
			System.out.println("Ge�ersiz say�.");
			return;
		}
		
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
			
		}
		
		if(isPrime == true) {
			System.out.println("Sayi asald�r.");

		}else {
			System.out.println("Sayi asal de�ildir.");

		}
		*/
		
		/*
		
		// mini-proje-2 sesli harfler
		
		char harf = 'A';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(harf+" kal�n bir harftir.");
				break;
			case 'E':
			case '�':
			case '�':
			case '�':
				System.out.println(harf+" ince bir harftir.");
				break;
			default:
				System.out.println("Ge�ersiz harf!");
		}
		
		*/
		
		
		
		/*
		// mini-proje-3 m�kemmel say�
		// 6 --> 1,2,3 toplam�na da tam b�l�n�yor.
		
		
		int number = 28;
		int total = 0;
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
			
		}
		
		if(total == number) {
			System.out.println(number+" say�s� m�kemmel say�d�r.");
		}
		else {
			System.out.println(number+" say�s� m�kemmel say� de�ildir.");

		}
		
		*/
		
		
		/*
		// mini-proje-4 arkada� say�lar
		int num1 = 220;
		int num2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for(int i =1; i<num1; i++) {
			if(num1 % i == 0) {
				total1 = total1 + i;	
			}
		}
		for(int i =1; i<num2; i++) {
			if(num2 % i == 0) {
				total2 = total2 + i;
			}
		}
		
		if(num1 == total2 && num2 == total1) {
			System.out.println(num1+" ve " +num2+ " arkada� say�lard�r." );
		}
		else {
			System.out.println(num1+" ve " +num2+ " arkada� say� de�iller." );
		}
		
		*/
		
		
		/*
		// dizi i�inde sayi bulma
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi ==aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("say� dizi i�inde var");

		}else {
			System.out.println("say� dizi i�inde yok");

		}
		
		*/		
	}	
}
