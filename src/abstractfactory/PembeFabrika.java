/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

public class PembeFabrika implements EditorFabrika {

	@Override
	public MenuBarTasarim MenuBarTasarla() {
		return new PembeMenuBar(); // menubar tasarlanınca doğrudan ilgili renkteki menubar'ın oluşturulması
	}

	@Override
	public TextAreaTasarim TextAreaTasarla() { 
		return new PembeTextArea();
	}

}
