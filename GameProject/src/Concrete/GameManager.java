package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " silindi.");
		
	}

}
