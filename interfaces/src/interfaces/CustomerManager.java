package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		//loosly coupled
		Utils.RunLoggers(loggers, customer.getFirstName());
		
		//tighly coupled 
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName()+ " Veri taban�na logland�.");*/
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
		
		//loosly coupled
		Utils.RunLoggers(loggers, customer.getFirstName());
		
		//tighly coupled
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName()+ " Veri taban�na logland�.");*/
	
	}
	
}
