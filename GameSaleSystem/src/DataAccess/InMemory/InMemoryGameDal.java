package DataAccess.InMemory;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.GameDal;
import Entities.Game;
import Entities.Player;

public class InMemoryGameDal implements GameDal{

	private ArrayList<Game> games; 
	
	
	public InMemoryGameDal() {
		
		this.games=new ArrayList<Game>();
		
		this.games.add(new Game(2,"NFS2",30));
		this.games.add(new Game(3,"GTA3",50));
		this.games.add(new Game(4,"Minecraft",25));
		this.games.add(new Game(5,"COD2",14));
		this.games.add(new Game(6,"AgeOfEmpires2",60));
		 
	}


	public ArrayList<Game> getAllGame() {
		
		return this.games;
	}


	
	public void Add(Game game) {
		this.games.add(game);
		
	}
	

	@Override
	public void Delete(int id) {
		
		
	}


	@Override
	public void Update(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
