package Entities;

public class RoomRental {
	
	public String Name;
	public String Email;
	public Integer Room;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getRoom() {
		return Room;
	}

	public void setRoom(Integer room) {

		Room = room;
	}

	public RoomRental() {
		
	}
	public RoomRental(String name, String email, Integer room) {
		super();
		Name = name;
		Email = email;
		Room = room;
	}

	@Override
	public String toString() {
		return Name + ", " + Email + ", " + "Room Rental: "+ Room;
	}
	
	
	
}
