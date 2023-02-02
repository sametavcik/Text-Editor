package builder;

import static org.junit.Assert.assertEquals;

import java.awt.Font;

import org.junit.Test;

public class JunitTest {
	
	@Test
	public void testTypeOne() {
		Yapici yapici = new Yapici();
        TextTypeOne typeOne = new TextTypeOne();

        yapici.fontKurucuAta(typeOne);
        yapici.textiKur();
		
		assertEquals("Comic Sans MS", yapici.fontAl().getFamily());
	}
	
	@Test
	public void testTypeTwo() {
		
		Yapici yapici = new Yapici();
        TextTypeTwo typeTwo = new TextTypeTwo();

        yapici.fontKurucuAta(typeTwo);
        yapici.textiKur();
		
		assertEquals("Times New Roman", yapici.fontAl().getFamily());
		
	}
	
}
