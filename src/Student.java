
public class Student extends User{

	int ID;

	
	public Student(String firstName,String lastName,int ID,String username,String password){
		super(firstName,lastName,username,password);
		
		this.ID = ID;

	}
	
	/* set and get methods */
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;

	}
	
	public int getID(){
		return ID;
	}
	public void setID(int id){
		ID = id;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String pass){
		password = pass;
	}
}
