package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate(); //mandatory field and everyone must implement it 
										//Zorunlu alan ve herkes bu alani implemente etmeli

	public final void gameOver() {
		System.out.println("Game over");
	}
}
