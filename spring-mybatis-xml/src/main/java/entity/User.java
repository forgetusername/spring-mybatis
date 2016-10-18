package entity;

public class User {

	private long id;
	private String userName;
	private String city;

	public long getId() {
		return id;
	} 

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName; 
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", city=" + city + "]";
	}

}
