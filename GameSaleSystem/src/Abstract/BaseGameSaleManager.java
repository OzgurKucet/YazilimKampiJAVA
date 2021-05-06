package Abstract;

import DataAccess.Abstract.GameDal;
import DataAccess.InMemory.InMemoryGameDal;
import Entities.Game;
import Entities.Player;

public abstract class BaseGameSaleManager implements GameSaleService{

	private GameDal games;
	

	public BaseGameSaleManager(GameDal games) {
		this.games = games;
	}


	@Override
	public void Sale(Player player, Game game) {
		games.Delete(game.getId());
		System.out.println("Sale to : "+ player.getFirstName() + " game : " + game.getName());
		
	}

}
