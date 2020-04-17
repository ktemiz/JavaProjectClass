package HomeWorks;

public class EncapSample {
	
	private String email;
	private String username;
	private String password;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("yahoo")) {
			this.email = email;
		}else
		 System.out.println("Please use yahoo email");
	}
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		if(!username.isEmpty() && username.length()>6 ) {
		  this.username = username;
		}
		else {
			System.out.println("your username can`t be empty or smaller than 6 char");
	}
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length()>6 && !password.contains(username)) {
			this.password = password;
			}
		else {
				System.out.println("your password can`t be empty or smaller than 6 char");	
		}	
	}

}
