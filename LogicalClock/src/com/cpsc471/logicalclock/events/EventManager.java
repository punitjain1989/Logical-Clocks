package com.cpsc471.logicalclock.events;

import java.util.LinkedList;
import java.util.List;

public class EventManager {
	private static List<Event> events = new LinkedList<Event>();
	private static Event firstEvent;

	public void addEvents(Event event) {
		if (isValidFirstEvent(event)) {
			firstEvent = event;
		}
		events.add(event);
	}

	public Event getPrevious(Event event) {
		int currentIndex = events.indexOf(event);
		return events.get(currentIndex - 1);
	}

	public boolean removeEvents(Event event) {
		return events.remove(event);
	}

	public Event getFirstEvent() {
		return firstEvent;
	}

	public Event get(int index) {
		return events.get(index);
	}

	public Event getMySender(Event event) {
		int receiveIndex = events.indexOf(event);
		Event mySender = null;
		for (int index = receiveIndex; index >= 0; index++){
			if(events.get(index) instanceof Send){
				mySender =  events.get(index);
			}
		}
		return mySender;
	}

	public int getTotalActiveEvents() {
		return events.size();
	}

	private boolean isEmpty() {
		return (firstEvent == null);
	}

	private boolean isValidFirstEvent(Event event) {
		return (!(event instanceof Receive) && (isEmpty()));
	}

}
