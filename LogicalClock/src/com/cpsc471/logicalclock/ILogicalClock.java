package com.cpsc471.logicalclock;

import com.cpsc471.logicalclock.events.Event;

@FunctionalInterface
public interface ILogicalClock {
	public abstract int calculateClock(Event event);
}
