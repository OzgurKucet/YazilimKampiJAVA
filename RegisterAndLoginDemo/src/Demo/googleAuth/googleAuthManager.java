package Demo.googleAuth;

import Demo.entities.concretes.User;

public class googleAuthManager {
	
	public void register(User user) {
		System.out.println("Kullan�c� kay�t yapt� : " + user.getAd() + " "  +  user.getSoyad());
	}
	

	public void login(User user) {
		System.out.println("Kullan�c� giri� yapt� : " + user.getAd() + " "  + user.getSoyad());
	}
	
	
}
