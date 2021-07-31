package gameMachProject.business.abstracts;

import java.util.List;

import gameMachProject.entities.Account;

public interface AccountService {
	void add(Account account);
	void edit(Account account);
	void remove(Account account);
	List<Account> getAll();
	List<Account> findByCustomerId(int id);
}
