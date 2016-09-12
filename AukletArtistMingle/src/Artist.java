
public class Artist {//basic framework for the main Artist class expect 
	//there to be lots of changes as time goes on. This is supposed to be
	//just a sort of first idea setup sort of thing

	final private String ANON = "Anonymous";
	final private String NA = "Not Applicable"; //in case there is an Artist 
	//that doesn't have one or all of these fields NA can be used instead
	private String name; // name of the artist blank entries will cause the
	//constructor to store the name as anon
	private String type; //kind of artist as in painter or sculptor
	private int birthDate; //artist's birthday (should this be 
	//something else like a Gregorian Calendar Object or something?)
	private String nationality; //artist's nationality
	private String address; //artist's address as in city or country
	
	public Artist(){ //blank constructor, sets everything to NA,ANON or 0
		//for birthDate
		this.name = ANON;
		this.type = NA;
		this.birthDate = 0;//probably gonna wanna change this 
		//later so it's not just 0
		this.nationality = NA;
		this.address = NA;
		
	}
	//regular constructor where the user actually inputs everything
	public Artist(String name, String type, String nation, int birth, String add){
		this.name = name;
		this.type = type;
		this.nationality = nation;
		this.birthDate = birth;
		this.address = add;
	}
	
	//set methods for the various fields
	public void setName(String newName){
		this.name = newName;
	}
	public void setType(String newType){
		this.type = newType;
	}
	public void setNation(String newNation){
		this.nationality = newNation;
	}
	public void setBirth(int newBirth){
		this.birthDate = newBirth;
	}
	public void setAddress(String newAddress){
		this.address = newAddress;
	}
	
	//accessor methods for the various fields
	public String getName(){
		return this.name;
	}
	public String getType(){
		return this.type;
	}
	public String getNation(){
		return this.nationality;
	}
	public int getBirthDate(){
		return this.birthDate;
	}
	public String getAddress(){
		return this.address;
	}
	
}
