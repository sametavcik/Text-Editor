/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.*;

import texteditor.TextEditor;


/**
 *
 * @author meliha
 */
public class Notepad {
    JTextArea jTextArea;
    JFrame jFrame;
    public Notepad(JFrame f, JTextArea t){
        this.jTextArea = t;
        this.jFrame = f;
    }
  
    
    
    public void ac() {
        // Create an object of JFileChooser class
            JFileChooser j = new JFileChooser("f:");
 
            // Invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);
 
            // If the user selects a file
            if (r == JFileChooser.APPROVE_OPTION) {
                // Set the label to the path of the selected directory
                File fi = new File(j.getSelectedFile().getAbsolutePath());
 
                try {
                    // String
                    String s1 = "", sl = "";
 
                    // File reader
                    FileReader fr = new FileReader(fi);
 
                    // Buffered reader
                    BufferedReader br = new BufferedReader(fr);
 
                    // Initialize sl
                    sl = br.readLine();
 
                    // Take the input from the file
                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }
 
                    jFrame.setTitle(fi.getName()+" - Notepad");
                    // Set the text
                    jTextArea.setText(sl);
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(jFrame, evt.getMessage());
                }
            }
            // If the user cancelled the operation
            else
                JOptionPane.showMessageDialog(jFrame, "the user cancelled the operation");
    }
    
    public void kaydet() {
                          // Create an object of JFileChooser class
            JFileChooser j = new JFileChooser("f:");
 
            // Invoke the showsSaveDialog function to show the save dialog
            int r = j.showSaveDialog(null);
 
            if (r == JFileChooser.APPROVE_OPTION) {
 
                // Set the label to the path of the selected directory
                File fi = new File(j.getSelectedFile().getAbsolutePath());
 
                try {
                    // Create a file writer
                    FileWriter wr = new FileWriter(fi, false);
 
                    
                    // Create buffered writer to write
                    BufferedWriter w = new BufferedWriter(wr);
 
                    // Write
                    w.write(jTextArea.getText());
                    jFrame.setTitle(fi.getName()+" - Notepad");
                          
                    w.flush();
                    w.close();
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(jFrame, evt.getMessage());
                }
            }
            // If the user cancelled the operation
            else
                JOptionPane.showMessageDialog(jFrame, "the user cancelled the operation");
    }
    
    public void FarklıKaydet() {
        
    }
    
    public void yeni() {
        jFrame.setTitle("Untitled.txt-Notepad");
        jTextArea.setText("");
    }
    
    public void kapat() {
        System.exit(0);
    }
    
    public void geriAl() {
        TextEditor.a.undo();
    }
    
    public void Kes() {
        jTextArea.cut();
    }
    public void Kopyala() {        
        jTextArea.copy();
    }
    public void Yapistir() {
        jTextArea.paste();
    }
}
