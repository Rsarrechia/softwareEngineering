package Engine;

public class EngineOnCommand implements Command{
	Engine engine;
	
	
	public EngineOnCommand(Engine engine){
		this.engine = engine;
	}
	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		engine.turnOn();
	}

}
