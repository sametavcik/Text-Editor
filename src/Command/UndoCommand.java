package Command;

public class UndoCommand implements Command {
	private Notepad notepad;
	
	  public UndoCommand(Notepad notepad) {
	    	this.notepad = notepad;
	    }

	    @Override
	    public void execute() {
	    	notepad.geriAl();
	    }
	


}
