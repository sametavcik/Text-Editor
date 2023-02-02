package builder;

import java.awt.Font;

public class TextTypeOne extends FontKurucu{
	
	
	@Override
	public void textFamilySec() {
		
		t.textFamilySec("Comic Sans MS");
		
	}

	@Override
	public void fontStyleSec() {
		t.fontStyleSec(Font.BOLD);
		
	}

	@Override
	public void fontSizeSec() {
		t.fontSizeSec(20);
		
	}

	
	
}
