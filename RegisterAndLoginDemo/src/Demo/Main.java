package Demo;

import Demo.business.concrates.UserManager;
import Demo.core.concrede.googleManagerAdapter;
import Demo.dataAccess.concretes.inMemory.InMemoryUserDao;
import Demo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User eklenecek = new User(6,"Ýsmail","Vanlý","ismail@gmail.com","333134511235");
		
		UserManager userManager = new UserManager(new InMemoryUserDao(), new googleManagerAdapter());
		
		userManager.register(eklenecek);
		
		System.out.println("Sistemdeki kiþilerin isimleri:");
		for (User kisi : userManager.getAll()) {
			System.out.println(kisi.getAd());
		}
		
		userManager.login(eklenecek);
		
	}
	
	

}
