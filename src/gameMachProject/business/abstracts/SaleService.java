package gameMachProject.business.abstracts;

import java.util.List;

import gameMachProject.entities.Sale;

public interface SaleService {
	void add(Sale sale);
	void edit(Sale sale);
	void remove(Sale sale);
	List<Sale> getAll();
	List<Sale> findByCustomerId(int id);
}
