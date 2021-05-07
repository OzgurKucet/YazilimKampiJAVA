package Demo.business.concrates;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

import Demo.business.abstracts.userService;
import Demo.core.abstracts.AuthService;
import Demo.dataAccess.abstracts.UserDao;
import Demo.entities.concretes.User;

public class UserManager implements userService{

	private UserDao userDao;
	private AuthService authService;
	
	public UserManager(UserDao userDao,AuthService authService) {
		
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
		
		if(!CheckIfEmailExists(user.getePosta()) && CheckIfEpostaValid(user.getePosta()) && 
				CheckIfNameLengthValid(user.getAd(), user.getSoyad()) && CheckIfPasswordValid(user.getParola())) {
			
			authService.register(user);
			userDao.add(user);
			
		}
		else {
			throw new RuntimeException("Register fail!");
		}
		
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	@Override
	public void login(User user) {
		
		authService.login(user);
		
	}

	@Override
	public void delete(User user) {
		
		userDao.delete(user);
		
	}
	
	
	
	public boolean CheckIfPasswordValid(String password) {
				
		if(password.length()<=6)return false;
		else {return true;}
		
	}
	
	public boolean CheckIfEpostaValid(String eposta) {
		
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher(eposta);
		return matcher.matches();
		
	}
	
	
	public boolean CheckIfEmailExists(String eposta) {
		List<User> users = userDao.getAll();
		
		int x = 0;
		for (User user : users) {			
			if(user.getePosta() == eposta) {
				
				x = 1;
			}
		}
		if(x==1)return true;
		else return false;		

	}
	
	public boolean CheckIfNameLengthValid(String firstName,String lastName) {
		if(firstName.length() >=2 && lastName.length() >= 2){
			return true;
		}
		return false;
	}
	

}
