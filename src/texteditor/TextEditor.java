/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;
import builder.TextTypeOne;
import builder.TextTypeTwo;
import builder.Yapici;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

import Command.Buton;
import Command.Notepad;
import Command.NewCommand;
import Command.OpenCommand;
import Command.CloseCommand;
import Command.CopyCommand;
import Command.CutCommand;
import Command.PasteCommand;
import Command.SaveCommand;
import Command.UndoCommand;
import abstractfactory.EditorFabrika;
import abstractfactory.Fabrika;
import abstractfactory.MenuBarTasarim;
import abstractfactory.TextAreaTasarim;


        
public class TextEditor extends JFrame implements ActionListener
{
    JTextArea t;
    JFrame f;
    JMenuBar mb;  
    JSpinner spinner;
    Buton file;
    Buton edit;
    public static UndoManager a;
    Notepad notepad;
    
   
         
    public TextEditor() {
        

    	a = new UndoManager();
        
        Container con = getContentPane();  
        f = new JFrame("editor");
        t = new JTextArea();
        
        
        //Buton buton = new Buton();
       // buton.setCommand(new NotepadCommand (notepad)); 
                
                
                
        EditorFabrika fabrika2 = new Fabrika().FabrikaAl("turuncu");
        TextAreaTasarim t1= fabrika2.TextAreaTasarla();
        t = t1.boya();

        Yapici yapici = new Yapici();
        TextTypeOne typeOne = new TextTypeOne();
        TextTypeTwo typeTwo = new TextTypeTwo();

        yapici.fontKurucuAta(typeOne);
        yapici.textiKur();
        Font font = yapici.fontAl();

        t.setFont(font);



        EditorFabrika fabrika = new Fabrika().FabrikaAl("pembe");
        MenuBarTasarim mb1 = fabrika.MenuBarTasarla();
        mb = mb1.boya();
        
        
        JMenu jmfile = new JMenu("File");
        JMenu jmedit = new JMenu("Edit");
        
        con.setLayout(new BorderLayout());
        JScrollPane sbrText = new JScrollPane(t);
        sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sbrText.setVisible(true);
        
        con.add(sbrText);
        
        // Create menu items
        createMenuItem(jmfile,"New");
        createMenuItem(jmfile,"Open");
        createMenuItem(jmfile,"Save");
        //createMenuItem(jmfile,"Save As");
        jmfile.addSeparator();
        createMenuItem(jmfile,"Close");
        
        createMenuItem(jmedit,"Undo");
        //createMenuItem(jmedit,"Redo");
        jmedit.addSeparator();
        createMenuItem(jmedit,"Cut"); 
        createMenuItem(jmedit,"Copy");
        createMenuItem(jmedit,"Paste");


        spinner = new JSpinner();
        spinner.setEditor(new JSpinner.DefaultEditor(spinner)); 
        spinner.setValue(20);
        
        spinner.addChangeListener(new ChangeListener(){
            
        @Override
        public void stateChanged(ChangeEvent e) {
        t.setFont(new Font(font.getFamily(),font.getStyle(),(int) spinner.getValue()));
        }
        
        });

        mb.add(jmfile);
        mb.add(jmedit);
        mb.add(spinner);
        
        JScrollPane scrollPane = new JScrollPane(t);
        scrollPane.setPreferredSize(new Dimension(500, 500));

        f.setJMenuBar(mb);
        f.add(scrollPane);
        f.setSize(500, 500);
        f.setTitle("Untitled.txt-Notepad");;
        f.setVisible(true);
        
		 
		 
        
        notepad = new Notepad(f,t);
        NewCommand yeniButonu = new NewCommand(notepad);
        OpenCommand acButonu = new OpenCommand(notepad);
        CloseCommand kapatButonu = new CloseCommand(notepad);
        CopyCommand kopyalaButonu = new CopyCommand(notepad);
        CutCommand kesButonu = new CutCommand(notepad);
        PasteCommand yapistirButonu = new PasteCommand(notepad);
        SaveCommand kaydetButonu = new SaveCommand(notepad);
        UndoCommand geriAlButonu = new UndoCommand(notepad);
        
        
        file = new Buton(yeniButonu,acButonu,kapatButonu,kaydetButonu);
        edit = new Buton(kopyalaButonu,kesButonu,yapistirButonu,geriAlButonu,"a");
        
        t.getDocument().addUndoableEditListener(
        		
        		new UndoableEditListener() {
					
					@Override
					public void undoableEditHappened(UndoableEditEvent e) {
						a.addEdit(e.getEdit());
						
					}
				});
       
        		
        		
        
    }
    
    private void createMenuItem(JMenu jm, String txt) {
        
        JMenuItem jmi = new JMenuItem(txt);
        jmi.addActionListener(this);
        jm.add(jmi);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        

        
        if(s.equals("New")) {    
            file.NotepadYeni();
        }
        else if(s.equals("Open")) {
            file.NotepadAc();
        
        }
        else if(s.equals("Save")) {
            file.NotepadKaydet();
        }
        
        
        else if(s.equals("Close")) {
           file.NotepadKapat();

        }
        
        else if(s.equals("Copy")) {
            edit.NotepadKopyala();
        }
        else if (s.equals("Paste")) {
            edit.NotepadYapistir();
        }
        else if (s.equals("Cut")) {
            edit.NotepadKes();
        }
        
        else if (s.equals("Undo")) {
        	edit.NotepadGeriAl();
        }
                        
                
    }
    
}
