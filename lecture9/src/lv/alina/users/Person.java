package lv.alina.users;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		
		
	}
	public String toString() {
		return this.name+"( "+this.address+")";
	}

}
