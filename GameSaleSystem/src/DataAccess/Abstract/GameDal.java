package DataAccess.Abstract;

import java.util.ArrayList;
import java.util.List;

import Entities.Game;
import Entities.Player;

public interface GameDal {

	public ArrayList<Game> getAllGame(); 
	public void Add(Game game);
	public void Delete(int id);
	public void Update(int id);
	
}
