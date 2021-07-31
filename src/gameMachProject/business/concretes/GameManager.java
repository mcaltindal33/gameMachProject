package gameMachProject.business.concretes;

import java.util.List;

import gameMachProject.business.abstracts.GameService;
import gameMachProject.dataAccess.abstracts.GameDao;
import gameMachProject.entities.Game;

public class GameManager implements GameService {
	private GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		
	}

	@Override
	public void edit(Game game) {
		this.gameDao.edit(game);
		
	}

	@Override
	public void remove(Game game) {
		this.gameDao.remove(game);
		
	}

	@Override
	public List<Game> getAll() {
		
		return this.gameDao.getAll();
	}

}
