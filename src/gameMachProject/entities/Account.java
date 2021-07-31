package gameMachProject.entities;

public class Account {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String nationationId;
	private int birthOfYear;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String firstName, String lastName, String email, String nationationId, int birthOfYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nationationId = nationationId;
		this.birthOfYear = birthOfYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNationationId() {
		return nationationId;
	}
	public void setNationationId(String nationationId) {
		this.nationationId = nationationId;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	
}
