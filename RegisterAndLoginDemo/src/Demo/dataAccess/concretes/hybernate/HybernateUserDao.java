package Demo.dataAccess.concretes.hybernate;

import java.util.List;

import Demo.dataAccess.abstracts.UserDao;
import Demo.entities.concretes.User;

public class HybernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hybernate ile db e eklendi.");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
