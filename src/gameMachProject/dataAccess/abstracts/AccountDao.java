package gameMachProject.dataAccess.abstracts;

import java.util.List;

import gameMachProject.entities.Account;

public interface AccountDao {
	void add(Account account);
	void edit(Account account);
	void remove(Account account);
	List<Account> getAll();
	List<Account> findByCustomerId(int id);
}
