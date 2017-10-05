package com.cpsc471.logicalclock.message;

/**
 * This class serves as a utility class for a given Message
 * 
 * @author Puneet
 *
 */
public class MessageUtility {
	
	/**
	 * Checks if the message is a send message
	 * 
	 * @param message
	 * @return
	 */
	public static boolean isSend(Message message) {
		boolean isSend = false;;
		if (message.getMessage().matches("s\\d+")) {
			isSend = true;
		}
		return isSend;
	}

	/**
	 * Checks if the message is a receive message
	 * 
	 * @param message
	 * @return
	 */
	public static boolean isReceived(Message message) {
		boolean isReceived = false;
		if (message.getMessage().matches("r\\d+")) {
			isReceived = true;
		}
		return isReceived;
	}
}
