package WebDemo.po;

public class Userpo {
	private String username;
	private String pass;
	private String sector;
	private String place;
	private String number;
	private String Id;

	public void setSector(String sector) {
		this.sector = sector;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getSector() {

		return sector;
	}

	public String getPlace() {
		return place;
	}

	public String getNumber() {
		return number;
	}

	public String getId() {
		return Id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
