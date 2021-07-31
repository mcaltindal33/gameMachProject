package gameMachProject.dataAccess.concretes;

import java.util.List;

import gameMachProject.dataAccess.abstracts.SaleDao;
import gameMachProject.entities.Sale;

public class SaleProcess implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println("Sat�� eklendi");
		
	}

	@Override
	public void edit(Sale sale) {
		System.out.println("Sat�� d�zenlendi");
		
	}

	@Override
	public void remove(Sale sale) {
		System.out.println("Sat�� silindi");
		
	}

	@Override
	public List<Sale> getAll() {
		System.out.println("Sat�� listelendi");
		return null;
	}

	@Override
	public List<Sale> findByCustomerId(int id) {
		System.out.println("Sat�� listelendi");
		return null;
	}

}
