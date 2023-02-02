package builder;

import java.awt.Font;

public class Yapici {

	protected FontKurucu f;
	
	public void fontKurucuAta(FontKurucu f) {
		
		this.f = f;
		
	}
	
	public Font fontAl() {
		
		TextFont t = f.TextFontAl();
		return new Font(t.textFamily,t.fontStyle,t.fontSize);
		
	}
	public void textiKur() {
		
		f.textFontKur();
		f.textFamilySec();
		f.fontStyleSec();
		f.fontSizeSec();
		
	}
	
}
