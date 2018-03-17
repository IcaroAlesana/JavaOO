
public class LoginException extends Exception {
	
	private static final long serialVersionUID = 812031450030581991L;
	private String login;

	public LoginException(String message,String login) {
		super(message);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
	

}
