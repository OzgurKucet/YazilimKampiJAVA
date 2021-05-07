package Demo.dataAccess.concretes.inMemory;

import java.util.ArrayList;
import java.util.List;

import Demo.dataAccess.abstracts.UserDao;
import Demo.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	List<User> users;
	
	
	public InMemoryUserDao() {
		
		this.users = new ArrayList<User>();
		this.users.add(new User(1,"Özgür","Küçet","ozgur@gmail.com","123"));
		this.users.add(new User(2,"Engin","Demiroð","engin@gmail.com","1234"));
		this.users.add(new User(3,"Ali","Kara","ali@gmail.com","1235"));
		this.users.add(new User(4,"Zeynep","Alacalý","zeynep@gmail.com","1245"));
		
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		
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
		return this.users;
	}

}
