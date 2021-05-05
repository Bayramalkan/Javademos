package abstractClasses;

public abstract class GameCalculator { // illaki operasyonu yazýlmalý þart
	public abstract void hesapla();
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
