package abstractClasses;

public abstract class GameCalculator { // illaki operasyonu yaz�lmal� �art
	public abstract void hesapla();
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
