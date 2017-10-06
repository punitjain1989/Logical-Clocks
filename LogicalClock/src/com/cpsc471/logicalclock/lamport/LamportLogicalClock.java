package com.cpsc471.logicalclock.lamport;
import com.cpsc471.logicalclock.process.Process;
import com.cpsc471.logicalclock.ILogicalClock;
import com.cpsc471.logicalclock.events.Event;
import com.cpsc471.logicalclock.events.EventManager;

public class LamportLogicalClock {

	public String[] computeLamport(EventManager manager) {
		int size = manager.getTotalActiveEvents();
		ILogicalClock lamport = new Lamport();
		String[] lamportValues = new String[size];
		for (int j = 0; j < size; j++) {
			Event event = manager.get(j);
			Process process = event.getAssociatedProcess();
			int lamportValue = lamport.calculateClock(event);
			lamportValues[j] = process.toString()+ " " +String.valueOf(lamportValue);
		}
		return lamportValues;
	}

}
