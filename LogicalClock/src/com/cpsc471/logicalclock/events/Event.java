package com.cpsc471.logicalclock.events;

import com.cpsc471.logicalclock.process.Process;

/**
 * This class represents a message
 * 
 * @author Puneet
 *
 */
public class Event {

	private String name;
	private int lamportClockValue;
	private Process process;

	public Event(String name, int initialLcValue, Process process) {
		this.name = name;
		this.lamportClockValue = initialLcValue;
		this.process = process;
	}

	public String getName() {
		return name;
	}

	public int getLamportClockValue() {
		return lamportClockValue;
	}

	public void setLamportClockValue(int lamportClockValue) {
		this.lamportClockValue = lamportClockValue;
	}

	public Process getAssociatedProcess() {
		return process;
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj){
		Event event = (Event) obj;
		return (this.getName() == event.getName());
	}

}
