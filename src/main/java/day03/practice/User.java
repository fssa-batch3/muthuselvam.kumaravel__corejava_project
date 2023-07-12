package day03.practice;

public class User {
	
	private String name;
	private String password;
	private String emailId;
	
	User(){
		this.name = null;
		this.password = null;
		this.emailId = null;
	}
	
	User(String name,String password, String emailId){
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
User user1 = new User("Muthu","007","Muthuselvam.kumaravel@fssa.freshworks.com");
System.out.println(user1.name+" "+user1.password+" "+user1.emailId);

User user2 = new User();
System.out.println(user2.name+" "+user2.password+" "+user2.emailId);
	}
	
}

	


