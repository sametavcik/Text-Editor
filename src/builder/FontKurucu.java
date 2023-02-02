/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
import java.awt.Font;
/**
 *
 * @author meliha
 */
public abstract class FontKurucu {
    	protected TextFont t;
	
	
	public void textFontKur() {
		this.t = new TextFont();
	}
	
	
	public TextFont TextFontAl() {
		return t;
	}
	
	public abstract void textFamilySec();
	public abstract void fontStyleSec();
	public abstract void fontSizeSec();
}
