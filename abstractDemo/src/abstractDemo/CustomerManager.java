package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager;
	
	 
	
	public CustomerManager(BaseDatabaseManager databaseManager) {
		
		this.databaseManager = databaseManager;
	}



	public void getCustomers() {
		databaseManager.getData();
	}
	
}
