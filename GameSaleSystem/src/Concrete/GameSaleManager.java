package Concrete;

import Abstract.BaseGameSaleManager;
import Abstract.PlayerCheckService;
import DataAccess.Abstract.GameDal;
import DataAccess.InMemory.InMemoryGameDal;
import Entities.Game;
import Entities.Player;

public class GameSaleManager extends BaseGameSaleManager{
	

 
	private PlayerCheckService playerCheckService;
	
	public GameSaleManager(GameDal games, PlayerCheckService playerCheckService) {
		super(games);
		this.playerCheckService = playerCheckService;
	}

	
	public void Sale(Player player, Game game) {
		
		if(playerCheckService.CheckIfRealPerson(player)) {
			super.Sale(player,game);
		}
		else {
			throw new RuntimeException("Not a valid person");
		}
		
		
	}
}
