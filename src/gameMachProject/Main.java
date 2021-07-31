package gameMachProject;

import gameMachProject.business.abstracts.AccountService;
import gameMachProject.business.abstracts.GameService;
import gameMachProject.business.abstracts.SaleService;
import gameMachProject.business.concretes.AccountManager;
import gameMachProject.business.concretes.GameManager;
import gameMachProject.business.concretes.SaleManager;
import gameMachProject.core.abstracts.NationalityCheckService;
import gameMachProject.core.concretes.NationalityCheckManager;
import gameMachProject.dataAccess.concretes.AccountProcess;
import gameMachProject.dataAccess.concretes.GameProcess;
import gameMachProject.dataAccess.concretes.SaleProcess;
import gameMachProject.entities.Account;
import gameMachProject.entities.Game;
import gameMachProject.entities.Sale;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1, "Euro Truck Simulator 2", 49);
		
		Account cagri = new Account(1, "Çaðrý", "Altýndal", "mcaltindal@cagrialtindal.com.tr", "123456", 1985);
		
		Sale sale1 = new Sale(1, cagri.getId(), game1.getId(), 1, 49, "");
		
		GameService gameService = new GameManager(new GameProcess());
		gameService.add(game1);
		
		AccountService accountService = new AccountManager(new AccountProcess());
				
		NationalityCheckService nationalityCheckService = new NationalityCheckManager();
		
		if(nationalityCheckService.checkNationalityId(cagri)) {
			accountService.add(cagri);
		}
		
		SaleService saleService = new SaleManager(new SaleProcess());
		saleService.add(sale1);

	}

}
