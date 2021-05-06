package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Player player) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		Long kimlik = Long.parseLong(player.getNationalityId(), 10);
		int dogumYili = player.getDateOfBirth().getYear();				
		 
		
		try {
			return client.TCKimlikNoDogrula(kimlik,player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(),dogumYili);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
}
