package game;

import java.util.List;
import fixtures.Room;
import fixtures.Items;

public class RoomManager {
	Room startingRoom;
	Room[] rooms;
	
	
	// descriptions of rooms
	public void init() {
		Room Foyer = new Room("The Foyer","\n    A small room","that leads to the rest of the house and that holds the coats for the guests of the house. \nThe room is slowly deteriorating"
				+ " since the wallpaper has been slowly ripping of the wall and have now \nbecome the home to many spiders. There are also some stairs that have been so deteriorated \nthat"
				+ " it is unsafe to walk upstairs.");
		
	
		Room Dinning = new Room("The Dinning Room","\n    A room with a large broken table in the center", "that has been tarnished by termites and the sun \nhowever it still smells like wood but"
				+ " with all the water damage it looks like it would break very easily. \nThe constant wind and rain coming in from the broken window probably didn't help its condition.");
				
		Room Living = new Room("The Living Room", "\n    A large room made for conversation", "that has two couches on both sides and a fireplace that is slowly rotting over time. \nThere is also a small table"
				+ " that used to hold drinks, but it now covered in dust and cobwebs and the curtains \nare so torn up it lets in a lot of light but unfortunately it is destroying all the paintings"
				+ " on the walls.");
		
		Room Kitchen = new Room("The Kitchen", "\n    A room where cooking used to happen", "that has many utensils to help a person cook. It's sad that the \nutensils are all rusted, and it smells like "
				+ "mildew that can be seen growing in the corner of the room. \nThe constant rain has helped it grow and is now dripping through the ceiling over the oven.");
		
		Room Library = new Room("The Library", "\n    A room filled with books", "and a large desk near some bookshelves. The desk doesn't seem to be in poor condition \nas this side of the house hasn't"
				+ " had a lot of rain damage but the amount of spiders is exponentially larger in this room. \nAll of them are scattered across the room in their own places.The books"
						+ " in this room are in a decent condition \nbut time hasn't been good to them. All of them are fragile and just need care if we wanted to open one \nplus "
						+ "there are various kinds of books like dictionaries, to poetry, and even novels.");
		
		Room Porch = new Room("The Porch","\n    Once a spacious place","but now since the roof has caved in has drastically shortened the porch so\nwe can only reach the front door. It smells"
				+ " really nice out since it just recently rained earlier today, \nand the smell of wet wood and grass is just wonderful.");
		
		
		
		//Description of Items
		Items Coat = new Items("Coat","\n    A brown coat", "that is covered in dust, cobwebs and is hanging on a hook. \nWho knows what kind of bugs now live inside this coat given the state of the foyer?");
		
		Items Cabinet = new Items("Cabinet","\n    An empty china cabinet", "that used to be full with tableware. It looks like it was broken into \nto retrieve the tableware sine there is no more glass in the"
				+ "cabinet doors.");
		
		Items Couch = new Items("Couch","\n    Two worn down couches", "that are across from each other and have been ripped to shreds. Having many open \ncracks in the walls probably led to animals"
				+ " coming inside and seeking shelter and possibly some in the couch.");
		
		Items Fridge = new Items("Fridge","\n    It looks like it is from the 1950s", "and the color of the fridge has faded but can still see the original red \ncolor peeking through. It is empty but "
				+ "has a horrific smell of mildew inside from being closed for so long.");
		 
		Items Book = new Items("Book","\tRomeo and Juliet - by William Shakespeare:\n", "\t       'O Romeo, Romeo,\n" + "\t\twherefore art thou Romeo?\n" + "\t\tDeny thy father and refuse thy name,\n"
				+ "\t\tOr if thou wilt not, be but sworn my love,\n" + "\t\tAnd I’ll no longer be a Capulet.'");
		
		Items Door = new Items("Door","\n    A very old door", "that can be kicked down to get into the house");
		
		Foyer.setItems(Coat);
		Dinning.setItems(Cabinet);
		Living.setItems(Couch);
		Kitchen.setItems(Fridge);
		Library.setItems(Book);
		Porch.setItems(Door);
		
		List<String>directions= Foyer.getDirections();
		rooms = new Room[directions.size()];
		//making foyer starting room
		this.startingRoom = Porch;
		
		//directions for rooms
		//foyer
		rooms[directions.indexOf("north")] = Dinning;
		rooms[directions.indexOf("east")] = Library;
		rooms[directions.indexOf("west")] = Living;
		rooms[directions.indexOf("south")] = Porch;
		Foyer.setExits(rooms);
		//Dining room
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("south")] = Foyer;
		rooms[directions.indexOf("west")] = Kitchen;
		Dinning.setExits(rooms);
		
		//kitchen
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("south")] = Living;
		rooms[directions.indexOf("east")] = Dinning;
		Kitchen.setExits(rooms);
		
		//living room
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("east")] = Foyer;
		rooms[directions.indexOf("north")] = Kitchen;
		Living.setExits(rooms);
		
		//library
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("west")] = Foyer;
		Library.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("north")] = Foyer;
		Porch.setExits(rooms);
	}
}
