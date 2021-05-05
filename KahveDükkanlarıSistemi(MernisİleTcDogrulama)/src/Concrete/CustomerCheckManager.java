package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
			return true;		
	
	}

}
