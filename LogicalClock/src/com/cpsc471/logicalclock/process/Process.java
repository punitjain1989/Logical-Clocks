package com.cpsc471.logicalclock.process;

/**
 * This class is a <i>representation</i> of Process/Node in distributed system.
 * 
 * @author Puneet
 *
 */

public class Process {

	private String processName;
	private String processId;
	private static int activeProcess;

	public Process(String processName, String processId) {
		activeProcess++;
		if (activeProcess > 5)
			throw new IllegalArgumentException("You can not have more than 5 process");
		this.processName = processName;
		this.processId = processId;
	}

	public static int getActiveProcess() {
		return activeProcess;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	@Override
	public String toString() {
		return processName;
	}
}
