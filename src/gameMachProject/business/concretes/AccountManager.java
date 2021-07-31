package gameMachProject.business.concretes;

import java.util.List;

import gameMachProject.business.abstracts.AccountService;
import gameMachProject.dataAccess.abstracts.AccountDao;
import gameMachProject.entities.Account;

public class AccountManager implements AccountService{

	private AccountDao accountDao;
	
	public AccountManager(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	@Override
	public void add(Account account) {
		this.accountDao.add(account);
	}

	@Override
	public void edit(Account account) {
		this.accountDao.edit(account);
		
	}

	@Override
	public void remove(Account account) {
		this.accountDao.remove(account);
		
	}

	@Override
	public List<Account> getAll() {
		
		return this.accountDao.getAll();
	}

	@Override
	public List<Account> findByCustomerId(int id) {
		return this.accountDao.findByCustomerId(id);
	}

}
