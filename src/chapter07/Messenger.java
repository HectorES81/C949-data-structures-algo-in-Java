package chapter07;

import java.util.HashMap;

public class Messenger {
	String messageLog;
	OneMessage oneMessage = new OneMessage();
	ChatConn chatConn = new ChatConn();
	HashMap<Character, String> validOptions = new HashMap<>();

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//start a chat 
		//you'll need a connection and to pick a contact
		//the chat should check to see if history exist and then open it
		//then each message received or sent will be tagged with:
		//sender ID, timestamp, message type, and char count
		//when closing the chat the message log should be saved in a text file
		while(true) {
			System.out.println("Please pick an option: ");
			
			break;
		}
	}

}
