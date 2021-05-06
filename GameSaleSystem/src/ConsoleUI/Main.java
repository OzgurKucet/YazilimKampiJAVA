package ConsoleUI;

import java.time.LocalDate;
import java.util.ArrayList;
import Adapters.MernisServiceAdapter;
import Concrete.GameSaleManager;
import DataAccess.InMemory.InMemoryGameDal;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		GameSaleManager gameSaleManager = new GameSaleManager(new InMemoryGameDal(),new MernisServiceAdapter());
		
		InMemoryGameDal inMemoryGameDal = new InMemoryGameDal();
		ArrayList<Game> games = inMemoryGameDal.getAllGame();
		
		System.out.println(games);
		
		gameSaleManager.Sale(new Player(1,"engin","demiroð",LocalDate.of(1985,1,6),"28861499108"),games.get(1));
		

	}

}
