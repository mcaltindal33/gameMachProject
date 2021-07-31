package gameMachProject.dataAccess.concretes;

import java.util.List;

import gameMachProject.dataAccess.abstracts.GameDao;
import gameMachProject.entities.Game;

public class GameProcess implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi");
	}

	@Override
	public void edit(Game game) {
		System.out.println("Oyun güncellendi");
	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyun silindi");
	}

	@Override
	public List<Game> getAll() {
		System.out.println("Oyun listelendi");
		return null;
	}

	@Override
	public List<Game> findByCustomerId(int id) {
		System.out.println("Oyun listelendi");
		return null;
	}

}
