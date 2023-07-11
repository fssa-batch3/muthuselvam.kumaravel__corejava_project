package day02.practice;

public class User {
	private int id ;
	private String name;
	private String password;
	private String emailId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int a) {
		this.id = a;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String a) {
		this.name = a;	
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String a) {
		this.password = a;	
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String a) {
		this.emailId = a;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setId(1);
		user.setName("Muthu Selvam");
		user.setPassword("007");
		user.setEmailId("007@gmail.com");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getEmailId());

	}

}
