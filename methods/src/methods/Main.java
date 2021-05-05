package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj = "";
		if (varMi) {
			mesaj = "say� dizi i�inde var: "+aranacak;
			mesajVer(mesaj);

		} else {
			mesajVer("say� dizi i�inde yok: "+aranacak);

		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
