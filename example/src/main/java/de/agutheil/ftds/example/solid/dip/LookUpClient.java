package de.agutheil.ftds.example.solid.dip;

public class LookUpClient {
	LookUpCopy lookUpCopy;
	public static void main(String[] args)  {
		LookUpClient lookUpClient = new LookUpClient();
		try {
			lookUpClient.run();
		} catch (InterruptedException e) {
			// do sth
		}
	}
	private void run() throws InterruptedException {
		lookUpCopy = new LookUpCopy();
		while(true){
			lookUpCopy.readAndPrint();
			Thread.sleep(1000);
		}
	}
}
