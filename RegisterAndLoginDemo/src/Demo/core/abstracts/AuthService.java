package Demo.core.abstracts;

import Demo.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
}
