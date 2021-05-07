package Demo.business.abstracts;

import java.util.List;

import Demo.entities.concretes.User;

public interface userService {
	
	void register(User user);
	void login(User user);
	void delete(User user);
	List<User> getAll();
	
}
