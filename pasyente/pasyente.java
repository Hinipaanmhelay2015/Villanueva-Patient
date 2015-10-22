
public class Patient {

private String firstname;
private String lastname;
private String address;
private int age;


public Patient (String firstname, String lastname, int age,String address) {

	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
	this.age = age;

}


public String getFullname(){

	return this.firstname + " " + this.lastname;
}

public String getAddress (){
 	return this.address;
}

public int getAge() {
	return this.age;
}

}