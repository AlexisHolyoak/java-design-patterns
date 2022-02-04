package adapter.robot;

public class Client {
	public static void main(String[] args) {
		RobotAdapter robotAdaptado= new  RobotAdapter();
		robotAdaptado.Escanear("Yes");
		robotAdaptado.Volar("200");
		robotAdaptado.saltar("10");
		robotAdaptado.caminar("50");
		
		System.out.println("***************");
		NewRobot nuevo = new NewRobot();
		nuevo.Escanear("Yes");
		nuevo.Volar("200");
	}
}
