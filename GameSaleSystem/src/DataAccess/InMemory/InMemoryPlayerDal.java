package DataAccess.InMemory;

import java.time.LocalDate;
import java.util.List;

import DataAccess.Abstract.PlayerDal;
import Entities.Player;

public class InMemoryPlayerDal implements PlayerDal{

	List<Player> players;
	
	
	public InMemoryPlayerDal() {
		this.players.add(new Player(1,"engin","demiroð",LocalDate.of(1985,1,6),"28861499108"));
	}

	

	public List<Player> getAllPlayer() {
			
		return this.players;
		
		
	}

}
