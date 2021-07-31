package gameMachProject.dataAccess.concretes;

import java.util.List;

import gameMachProject.dataAccess.abstracts.SaleDao;
import gameMachProject.entities.Sale;

public class SaleProcess implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println("Satýþ eklendi");
		
	}

	@Override
	public void edit(Sale sale) {
		System.out.println("Satýþ düzenlendi");
		
	}

	@Override
	public void remove(Sale sale) {
		System.out.println("Satýþ silindi");
		
	}

	@Override
	public List<Sale> getAll() {
		System.out.println("Satýþ listelendi");
		return null;
	}

	@Override
	public List<Sale> findByCustomerId(int id) {
		System.out.println("Satýþ listelendi");
		return null;
	}

}
