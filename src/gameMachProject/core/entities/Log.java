package gameMachProject.core.entities;

import java.util.Date;

public class Log {
	private long id;
	private Date date;
	private byte types;
	private String message;

	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Log(long id, Date date, byte types, String message) {
		super();
		this.id = id;
		this.date = date;
		this.types = types;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte getTypes() {
		return types;
	}

	public void setTypes(byte types) {
		this.types = types;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
