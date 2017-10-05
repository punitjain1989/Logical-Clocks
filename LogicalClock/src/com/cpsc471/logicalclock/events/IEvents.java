package com.cpsc471.logicalclock.events;

import com.cpsc471.logicalclock.message.Message;

public interface IEvents {
	
	public void send(Message message);
	
	public void receive(Message message);

}
