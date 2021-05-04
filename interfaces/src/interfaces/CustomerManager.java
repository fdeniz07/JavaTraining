package interfaces;

public class CustomerManager {

	/*
	 * Solution 1 :
	 * 
	 * ICustomerDal customerDal;
	 * 
	 * public void add() {
	 * 
	 * //Business codes customerDal.add(); }
	 *
	 */

	
	
	// Solution 2:
	
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
		
	}
	
	public void add() {
		// Business codes
		customerDal.add();
	}
}
