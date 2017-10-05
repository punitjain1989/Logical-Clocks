package com.cpsc471.logicalclock;

import com.cpsc471.logicalclock.events.IEvents;
import com.cpsc471.logicalclock.message.Message;
import com.cpsc471.logicalclock.message.MessageUtility;
import com.cpsc471.logicalclock.process.Process;

public class LamportLogicalClock implements ILogicalClock, IEvents {


	public int[][] computeLamport(Message[][] input, Process... processes) {

		for (Message[] messageRows : input) {
		
			for (Message message : messageRows) {
				
			}
		}
		return null;
	}

	@Override
	public void send(Message message) {
		if(MessageUtility.isSend(message)){
			// do computation 
		}
	}

	@Override
	public void receive(Message message) {
		if(MessageUtility.isReceived(message)){
			// do computation 
		}
	}

}
