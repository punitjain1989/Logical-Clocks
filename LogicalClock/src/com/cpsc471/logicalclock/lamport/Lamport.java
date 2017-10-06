package com.cpsc471.logicalclock.lamport;

import com.cpsc471.logicalclock.ILogicalClock;
import com.cpsc471.logicalclock.events.Event;
import com.cpsc471.logicalclock.events.EventManager;
import com.cpsc471.logicalclock.events.Receive;
import com.cpsc471.logicalclock.events.Send;

public class Lamport implements ILogicalClock {

	EventManager eventManager = new EventManager();

	@Override
	public int calculateClock(Event event) {
		if (eventManager.getFirstEvent().equals(event)) {
			event.setLamportClockValue(1);
			return event.getLamportClockValue();
		}
		
		else if (event instanceof Send || event instanceof Event){
			Event previousEvent = eventManager.getPrevious(event);
			event.setLamportClockValue(previousEvent.getLamportClockValue() + 1);
			return event.getLamportClockValue();
		}

		else if (event instanceof Receive) {
			Event previousEvent = eventManager.getPrevious(event);
			Event mySender = eventManager.getMySender(event);
			int maxLamport = Math.max(mySender.getLamportClockValue(), previousEvent.getLamportClockValue());
			event.setLamportClockValue(maxLamport + 1);
			return event.getLamportClockValue();
		}

		else {
			return 0;
		}
	}
}
