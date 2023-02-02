/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

public class TuruncuFabrika implements EditorFabrika {

	
	@Override
	public MenuBarTasarim MenuBarTasarla() {
		
		return new TuruncuMenuBar();
		
	}

	@Override
	public TextAreaTasarim TextAreaTasarla() {
		
		return new TuruncuTextArea();
		
	}
	
	

}