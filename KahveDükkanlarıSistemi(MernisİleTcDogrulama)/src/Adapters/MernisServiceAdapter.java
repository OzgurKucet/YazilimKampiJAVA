package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		Long kimlik = Long.parseLong(customer.getNationalityId(), 10);
		int dogumYili = customer.getDateOfBirth().getYear();				
		
		
		try {
			return client.TCKimlikNoDogrula(kimlik,customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),dogumYili);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
		
		
	
	}

}
