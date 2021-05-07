package Demo.core.concrede;

import Demo.core.abstracts.AuthService;
import Demo.entities.concretes.User;
import Demo.googleAuth.googleAuthManager;

public class googleManagerAdapter implements AuthService{

	@Override
	public void register(User user) {
		googleAuthManager auth = new googleAuthManager();
		auth.register(user);
		
	}

	@Override
	public void login(User user) {
		googleAuthManager auth = new googleAuthManager();
		auth.login(user);
		
	}

}
