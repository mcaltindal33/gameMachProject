package gameMachProject.business.abstracts;

import java.util.List;

import gameMachProject.entities.Game;

public interface GameService {
	void add(Game game);
	void edit(Game game);
	void remove(Game game);
	List<Game> getAll();
}
