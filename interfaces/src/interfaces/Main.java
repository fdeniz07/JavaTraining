package interfaces;

public class Main {

	public static void main(String[] args) {

		/*
		 * Solution 1: 
		 * ICustomerDal customerDal = new OracleCustomerDal();
		 * CustomerManager customerManager = new CustomerManager();
		 * customerManager.customerDal = new OracleCustomerDal();
		 * //customerManager.customerDal = new MySqlCustomerDal();
		 * //customerManager.customerDal = new SqlServerCustomerDal();
		 * customerManager.add();
		 */
		
		//Solution 2:
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal())
		//CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal())
		customerManager.add();
		
	}

}
