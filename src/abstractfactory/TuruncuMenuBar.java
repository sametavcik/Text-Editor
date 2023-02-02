/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.awt.Color;

import javax.swing.JMenuBar;

public class TuruncuMenuBar implements MenuBarTasarim {

	@Override
	public JMenuBar boya() {
		JMenuBar mb = new JMenuBar();
		mb.setBackground(Color.ORANGE);
		return mb;
	}

}
