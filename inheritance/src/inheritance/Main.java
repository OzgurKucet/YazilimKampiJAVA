package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		
		engin.setCustomerNumber("123");
		hepsiBurada.setCustomerNumber("4125");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		
		engin.setId(0);
		
		
		
	}

}
