package Engine;

public class testEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ignition ignition = new Ignition();
		Engine engine = new Engine();
		EngineOffCommand engineOff = new EngineOffCommand(engine);
		EngineOnCommand engineOn = new EngineOnCommand(engine);
		
		
		System.out.println("De motor wordt gestart");
		ignition.setCommand(engineOn);
		ignition.ButtonPressed();
		
		System.out.println("\nDe motor wordt gestopt");
		ignition.setCommand(engineOff);
		ignition.ButtonPressed();

	}

}
