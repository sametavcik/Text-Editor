/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author meliha
 */
public class OpenCommand implements Command{
    
    private Notepad notepad;

    public OpenCommand(Notepad notepad) {
    this.notepad = notepad;
    }

    @Override
    public void execute() {
    notepad.ac();
    }

    
}
