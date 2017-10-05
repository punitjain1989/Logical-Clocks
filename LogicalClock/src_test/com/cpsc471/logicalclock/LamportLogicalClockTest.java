package com.cpsc471.logicalclock;

import org.junit.Assert;
import org.junit.Test;

import com.cpsc471.logicalclock.message.Message;
import com.cpsc471.logicalclock.process.Process;

public class LamportLogicalClockTest {

	@Test
	public void testUseCase1() {
		Process process1 = new Process("process_1", "5");
		Process process2 = new Process("process_2", "6");
		Process process3 = new Process("process_3", "7");
		
		Message message1 = new Message("a", 0);
		Message message2 = new Message("s1", 0);
		Message message3 = new Message("r3", 0);
		Message message4 = new Message("b", 0);
		Message message5 = new Message("c", 0);
		Message message6 = new Message("r2", 0);
		Message message7 = new Message("s3", 0);
		Message message8 = new Message("", 0);
		Message message9 = new Message("r1", 0);
		Message message10 = new Message("d", 0);
		Message message11 = new Message("s2", 0);
		Message message12 = new Message("e", 0);

		LamportLogicalClock lc = new LamportLogicalClock();

		Message[][] input = new Message[][] { { message1, message2, message3, message4 },
				{ message5, message6, message7, message8 }, { message9, message10, message11, message12 } };

		int[][] expected = new int[][] { { 1, 2, 8, 9 }, { 1, 6, 7, }, { 3, 4, 5, 6 } };

		int[][] actual = lc.computeLamport(input, new Process[]{process1, process2, process3});

		Assert.assertArrayEquals(expected, actual);
	}

}
