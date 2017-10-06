import com.cpsc471.logicalclock.events.Event;
import com.cpsc471.logicalclock.events.EventManager;
import com.cpsc471.logicalclock.events.Receive;
import com.cpsc471.logicalclock.events.Send;
import com.cpsc471.logicalclock.lamport.LamportLogicalClock;
import com.cpsc471.logicalclock.process.Process;

public class TemporaryTest {
	EventManager eventManager = new EventManager();

	public static void main(String[] args) {
		TemporaryTest tt = new TemporaryTest();
		LamportLogicalClock llc = new LamportLogicalClock();
		tt.createData();
		String[] lamport = llc.computeLamport(tt.eventManager);
		for (int i=0;i<lamport.length;i++){
			System.out.println(lamport[i]);
		}
	}
	
	public void createData(){
		Process process1 = new Process("process_1", "5");
		Process process2 = new Process("process_2", "6");
		Process process3 = new Process("process_3", "7");
		
		Event message1 = new Event("a", 0, process1);
		Event message2 = new Send("s1", 0, process1);
		Event message3 = new Receive("r3", 0, process1);
		Event message4 = new Event("b", 0, process1);
		Event message5 = new Event("c", 0, process2);
		Event message6 = new Receive("r2", 0, process2);
		Event message7 = new Send("s3", 0, process2);
		Event message8 = new Event("", 0, process2);
		Event message9 = new Receive("r1", 0, process3);
		Event message10 = new Event("d", 0, process3);
		Event message11 = new Send("s2", 0, process3);
		Event message12 = new Event("e", 0, process3);
		eventManager.addEvents(message1);
		eventManager.addEvents(message2);
		eventManager.addEvents(message3);
		eventManager.addEvents(message4);
		eventManager.addEvents(message5);
		eventManager.addEvents(message6);
		eventManager.addEvents(message7);
		eventManager.addEvents(message8);
		eventManager.addEvents(message9);
		eventManager.addEvents(message10);
		eventManager.addEvents(message11);
		eventManager.addEvents(message12);
	}
}
	