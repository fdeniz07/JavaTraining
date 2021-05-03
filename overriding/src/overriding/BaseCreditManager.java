package overriding;

public class BaseCreditManager {
	public double calculate(double amount) {
		return amount * 1.18;
	}
	
	/* Kimsenin bizim BaseCreditManager sinifimizi ezmemesini istiyorsak final anahtar sözcügü eklenir.
	 * 
	 * If we want no one to crush our BaseCreditManager class, the final keyword is added.
	 *  
	 * 	public final double calculate(double amount) {
		return amount * 1.18;
	    }
	 */
}
