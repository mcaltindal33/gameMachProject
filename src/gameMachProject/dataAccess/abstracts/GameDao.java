package gameMachProject.dataAccess.abstracts;

import java.util.List;

import gameMachProject.entities.Game;

public interface GameDao {
	void add(Game game);
	void edit(Game game);
	void remove(Game game);
	List<Game> getAll();
	List<Game> findByCustomerId(int id);
}
