package de.agutheil.ftds.example.solid.dip;

public class FactoryClient {
	CopyApplication copy;
	CopyApplicationFactory factory;
	public static void main(String[] args)  {
		FactoryClient client = new FactoryClient();
		try {
			client.run();
		} catch (InterruptedException e) {
			// do sth
		}
	}
	private void run() throws InterruptedException {
		factory = new CopyApplicationFactory();
		copy = factory.getApplication();
		while(true){
			copy.readAndPrint();
			Thread.sleep(1000);
		}
	}
}
