package com.cpsc471.logicalclock.events;

import com.cpsc471.logicalclock.process.Process;

public class Send extends Event{

	public Send(String message, int initialLcValue, Process process) {
		super(message, initialLcValue, process);
	}
}
