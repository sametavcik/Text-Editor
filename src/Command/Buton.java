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
public class Buton {
    
private Command yeniKomutu;
private Command acKomutu;
private Command kapatKomutu;
private Command kopyalaKomutu;
private Command kesKomutu;
private Command yapistirKomutu;
private Command kaydetKomutu;
private Command geriAlKomutu;



//File butonu
public Buton(Command yeniKomutu, Command acKomutu,Command kapatKomutu,Command kaydetKomutu) {
this.yeniKomutu = yeniKomutu;
this.acKomutu = acKomutu;
this.kapatKomutu = kapatKomutu;
this.kaydetKomutu = kaydetKomutu;

}
// Edit butonu
public Buton(Command kopyalaKomutu,Command kesKomutu,Command yapistirKomutu,Command gerial,String a) {

this.kopyalaKomutu = kopyalaKomutu;
this.kesKomutu = kesKomutu;
this.yapistirKomutu = yapistirKomutu;
this.geriAlKomutu = gerial;

}

public void NotepadGeriAl() {
	geriAlKomutu.execute();
}

public void NotepadYeni() {
yeniKomutu.execute();
}

public void NotepadAc() {
    acKomutu.execute();
}

public void NotepadKapat() {
    kapatKomutu.execute();
}
public void NotepadKopyala() {
    kopyalaKomutu.execute();
}

public void NotepadKes() {
    kesKomutu.execute();
}

public void NotepadYapistir() {
    yapistirKomutu.execute();
    
}
public void NotepadKaydet() {
    kaydetKomutu.execute();
}
}


