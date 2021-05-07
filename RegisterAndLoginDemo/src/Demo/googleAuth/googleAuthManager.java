package Demo.googleAuth;

import Demo.entities.concretes.User;

public class googleAuthManager {
	
	public void register(User user) {
		System.out.println("Kullanýcý kayýt yaptý : " + user.getAd() + " "  +  user.getSoyad());
	}
	

	public void login(User user) {
		System.out.println("Kullanýcý giriþ yaptý : " + user.getAd() + " "  + user.getSoyad());
	}
	
	
}
