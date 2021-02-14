package dto;

public class DtoUser {
	
	
	private int id;
	
	private String username;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String phone;
	
	private int userStatus;

	public DtoUser criarUser(String firstName, String lastName) {
		DtoUser userDto = new DtoUser();
		userDto.setId(1);
		
		userDto.setUsername(firstName.concat(lastName));
		userDto.setFirstName(firstName);
		userDto.setLastName(lastName);
		
		userDto.setEmail(firstName.toLowerCase()
				.concat(".")
				.concat(lastName.toLowerCase())
				.concat("@teste.com"));
		
		userDto.setPassword("123456");
		
		userDto.setPhone("11999999999");
		
		userDto.setUserStatus(1);
		
		return userDto;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

}
