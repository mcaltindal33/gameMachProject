package gameMachProject.dataAccess.abstracts;

import java.util.List;

import gameMachProject.entities.Sale;

public interface SaleDao {
	void add(Sale sale);
	void edit(Sale sale);
	void remove(Sale sale);
	List<Sale> getAll();
	List<Sale> findByCustomerId(int id);
	
}
