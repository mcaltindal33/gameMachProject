package gameMachProject.business.concretes;

import java.util.List;

import gameMachProject.business.abstracts.SaleService;
import gameMachProject.dataAccess.abstracts.SaleDao;
import gameMachProject.entities.Sale;

public class SaleManager implements SaleService {
	 private SaleDao saleDao;

		public SaleManager(SaleDao saleDao) {
			super();
			this.saleDao = saleDao;
		}
	@Override
	public void add(Sale sale) {
		this.saleDao.add(sale);
		
	}

	@Override
	public void edit(Sale sale) {
		this.saleDao.edit(sale);
		
	}

	@Override
	public void remove(Sale sale) {
		this.saleDao.remove(sale);
		
	}

	@Override
	public List<Sale> getAll() {
		return this.saleDao.getAll();
	}

	@Override
	public List<Sale> findByCustomerId(int id) {
		return this.saleDao.findByCustomerId(id);
	}


}
