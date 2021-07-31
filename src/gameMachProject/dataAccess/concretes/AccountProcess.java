package gameMachProject.dataAccess.concretes;

import java.util.List;

import gameMachProject.dataAccess.abstracts.AccountDao;
import gameMachProject.entities.Account;

public class AccountProcess implements AccountDao{

	@Override
	public void add(Account account) {
		System.out.println("Hesap eklendi");
	}

	@Override
	public void edit(Account account) {
		System.out.println("Hesap güncellendi");
	}

	@Override
	public void remove(Account account) {
		System.out.println("Hesap silindi");
	}

	@Override
	public List<Account> getAll() {
		System.out.println("Hesap listelendi");
		return null;
	}

	@Override
	public List<Account> findByCustomerId(int id) {
		System.out.println("Hesap listelendi");
		return null;
	}

}
