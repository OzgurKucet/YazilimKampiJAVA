package abstractDemo;

public class Main {// M��terinin vertaban�na kaydedilmesini istiyoruz.

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.getCustomers();
		
	}

}
