package Engine;

public class Ignition {

	Command comm;
	
	public void setCommand(Command command){
		comm = command;
	}
	
	public void ButtonPressed(){
		comm.Execute();
	}
}
