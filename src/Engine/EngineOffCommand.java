package Engine;

public class EngineOffCommand implements Command{
	Engine engine;
	
	public EngineOffCommand(Engine engine){
		this.engine = engine;
	}
	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		engine.turnOff();
	}

}
