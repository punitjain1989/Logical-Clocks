package com.cpsc471.logicalclock.message;

/**
 * This class represents a message 
 * 
 * @author Puneet
 *
 */
public class Message {

	private String message;
	private int lcValue;

	public Message(String message, int initialLcValue) {
		this.message = message;
		this.lcValue = initialLcValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getLcValue() {
		return lcValue;
	}

	public void setLcValue(int lcValue) {
		this.lcValue = lcValue;
	}

	@Override
	public String toString() {
		return message;
	}

}
