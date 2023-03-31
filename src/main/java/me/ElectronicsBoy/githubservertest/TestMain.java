package me.ElectronicsBoy.githubservertest;

public class TestMain implements ServerHandler {
	public TestMain() {
		Server server = new Server(8080, this);
		server.startServer();
	}
	
	@Override
	public void messageReceivedServer(String message) {
		
	}
	
	public static void main(String[] args) {
		new TestMain();
	}
}
