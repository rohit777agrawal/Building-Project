
public class Building {

	private String name;
	private int numberOfRooms;
	
	public Building(){
		name = "";
		numberOfRooms = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		if(numberOfRooms>0){
		this.numberOfRooms = numberOfRooms;
		}
	}
	
	
	
	
}
