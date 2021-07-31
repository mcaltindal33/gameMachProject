package gameMachProject.entities;

public class Sale {
	private int id;
	private int accountId;
	private int gameId;
	private int quantity;
	private double amount;
	private String detail;
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sale(int id, int accountId, int gameId, int quantity, double amount, String detail) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.gameId = gameId;
		this.quantity = quantity;
		this.amount = amount;
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
