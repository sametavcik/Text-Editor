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
public class CutCommand implements Command{
   
    private Notepad notepad;

    public CutCommand(Notepad notepad) {
    this.notepad = notepad;
    }

    @Override
    public void execute() {
    notepad.Kes();
    }
}
