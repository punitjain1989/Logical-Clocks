package com.cpsc471.logicalclock.events;

import com.cpsc471.logicalclock.process.Process;

public class Receive extends Event{

	public Receive(String message, int initialLcValue, Process process) {
		super(message, initialLcValue, process);
	}

}
