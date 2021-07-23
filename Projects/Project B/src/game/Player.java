package game;

import fixtures.Room;

public class Player {
	private Room currentRoom;
	
	
	public Player(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public Room getcurrentRoom() {
		return currentRoom;
	}
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

}
