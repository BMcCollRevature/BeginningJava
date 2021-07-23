package fixtures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Room extends Fixture {
	private Room[]exits;
	public List<String> directions = Arrays.asList("east", "west", "north", "south");
	
	private ArrayList<Items> items = new ArrayList<>();
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[directions.size()];
		}
	public Room[] getExits() {
		return exits;
		}
	public Room getExits(String direction) {
		return exits[directions.indexOf(direction)];
		}
	
	public List<String> getDirections(){
		return directions;
		}
	public void setExits(Room[] exits) {
		this.exits = exits;
		}
	
	public ArrayList<Items> getItems() {
		return items;
		}
	public void setItems(Items item) {
		items.add(item);
		}
	public void removeItem(Items item) {
		items.remove(item);
	}
	
	@Override
	public String toString() {
		String exit = "";
		for(String direction:this.directions) {
			if(getExits(direction)!= null) {
				exit +=(direction +": " + getExits(direction).getName()+ "\n");
			}
		}
		return this.getName() + "\n" + this.getshortDescription()+ " " + this.getlongDescription() + "\n" + 
		"\nExits:\n" + exit;
	}
}
