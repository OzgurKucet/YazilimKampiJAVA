package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		
		//loosly coupled
		Utils.RunLoggers(loggers, customer.getFirstName());
		
		//tighly coupled 
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName()+ " Veri tabanýna loglandý.");*/
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
		
		//loosly coupled
		Utils.RunLoggers(loggers, customer.getFirstName());
		
		//tighly coupled
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName()+ " Veri tabanýna loglandý.");*/
	
	}
	
}
