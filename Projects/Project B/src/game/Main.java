package game;

import java.util.Scanner;

import fixtures.Items;

public class Main {

	public static void main(String[] args) {
		Main menu = new Main();
		menu.startingmenu();

		RoomManager manager = new RoomManager();
		manager.init();
		Player player = new Player(manager.startingRoom);
		while (true) {
			printRoom(player);
			parse(collectInput(), player);
		}
	}

	public static void printRoom(Player player) {
		System.out.println(player.getcurrentRoom().toString());
		
		for( int i = 0; i<player.getcurrentRoom().getItems().size();i++)
		{
			Items item = player.getcurrentRoom().getItems().get(i);
			System.out.println("Items: " + item.getName());
		}
	}

	public static String[] collectInput() {
		Scanner input = new Scanner(System.in);

		return input.nextLine().toLowerCase().split(" ");

	}
	public static void removeItem(Player player, Items item) {
		player.getcurrentRoom().removeItem(item);
	}

	private static void parse(String[] command, Player player) {
		switch (command[0]) {
		case "go": case "move": 
			player.setCurrentRoom(player.getcurrentRoom().getExits(command[1]));
			break;
		case "inspect": case "look":
			System.out.println(player.getcurrentRoom().getItems().toString().replace("[", "").replace("]",""));
						removeItem(player, player.getcurrentRoom().getItems().get(0));
			break;
		case "instructions" : instructions();
			break;
		case "quit": case "leave":
			System.exit(0);
		default:
			System.out.println("Invalid input \n");
			break;
		}
	}

	public void startingmenu() {
		String menu;
		String title = "\t\t\t\t\t\t     1950s House Tour";
		menu = " \n     Welcome to this 1950s Style House that was abandoned 50 years ago, and the elements have not been kind to it. Please be careful\n "
				+ " when you step inside as the floorboard are a bit weak due to the rain. Some rooms will be better than other since a tree fell on \n"
				+ " half the house, it allowed more rain to go into that house. Also please be careful of any glass that could have broken. You also can’t go\n"
				+ " upstairs since the stairs have deteriorated so much no one can walk up them safely.\n\n "
				+ "     Now please see below instruction on how to navigate the house:\n\n"
				+ " You will have the option to go into rooms by saying 'go' or 'move' and then the direction desired being: \"north, south, east, or west.\n"
				+ " Other than these directions you will be able to interact with certain items which can we be interacted with by saying 'look at' or 'inspect'\n"
				+ " and then the item name. If you need help with what to input you can also type 'instructions' and it will display the instructions. If you would\n"
				+ " like to end the tour you can type 'quit' to leave the house. Hope you enjoy your stay!\n";
		System.out.println(title);
		System.out.println(menu);
	}
	public static void instructions() {
		String instruction = "\tgo / move + (north, south, east, west): Go into a different room\r\n"
				+ "\tinspect / look at (item): Look at an item in the room\r\n"
				+ "\tinstructions: displays game rules and valid inputs\n\n";
		System.out.println(instruction);
	}

}
