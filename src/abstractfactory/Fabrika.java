/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

public class Fabrika {

	public EditorFabrika FabrikaAl(String tip) {
		
		if(tip.equals("turuncu")) {
			return new TuruncuFabrika();
		}else if(tip.equals("pembe")) {
			return new PembeFabrika();
		}
		return null;
		
	}

}
