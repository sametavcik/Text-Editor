package builder;

import java.awt.Font;

public class TextTypeTwo extends FontKurucu {

	@Override
	public void textFamilySec() {
		
		t.textFamilySec("Times New Roman");
		
	}

	@Override
	public void fontStyleSec() {
		t.fontStyleSec(Font.ITALIC);
		
	}

	@Override
	public void fontSizeSec() {
		t.fontSizeSec(20);
		
	}

}
