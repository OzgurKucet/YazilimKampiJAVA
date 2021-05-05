package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{ //abstract 

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : "+ customer.getFirstName() + " Dogum Gunu " + customer.getDateOfBirth());
		
	}

}
