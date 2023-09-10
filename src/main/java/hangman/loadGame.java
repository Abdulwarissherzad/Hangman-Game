 
package hangman;
import static hangman.HangMan.name;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.*;

public class loadGame extends JFrame implements ActionListener{
    JLabel label = new JLabel("Choose File:");
    JTextField fileField = new JTextField(20);
    JButton btnBrowse = new JButton("Browse...");
    JFileChooser fc=null;
    JTextArea fileTextArea = new JTextArea(3,30);
    JLabel la = new JLabel("The Directory which you choose the file");
    JButton Ok = new JButton("Ok");

public loadGame(){
    setLayout (new FlowLayout());
    setSize(450,220);
    setTitle("Choose a File");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   // setLocationRelativeTo(fr);
    setVisible(true);
    
    
    add(label);
    add(fileField);
    add(btnBrowse);
    add(la);
    la.setFont(new Font("Monotype Corsiva", 1, 20));
    add(fileTextArea);
    add(Ok);   
    Ok.setPreferredSize(new Dimension(300,26));
    Ok.addActionListener(this);
 
    
    fileField.setEditable(false);
    fileField.setBackground(Color.WHITE);
    btnBrowse.addActionListener(this);
}   
public void actionPerformed (ActionEvent ae){
            if (ae.getSource()==btnBrowse){
            
            if (fc == null)  fc = new JFileChooser();
            
            fc.setAcceptAllFileFilterUsed(false);
            fc.addChoosableFileFilter(new FileNameExtensionFilter("*.Sav", "txt"));

            int isFileChooserActivated = fc.showOpenDialog(this);
            
            if (isFileChooserActivated == JFileChooser.APPROVE_OPTION){
            
            File file = fc.getSelectedFile();
                
                
            fileField.setText(file.getPath());
            fileTextArea.setText(file.getPath());
                
            HangMan hm = new HangMan();   String line = "";
        ArrayList<String> word = new ArrayList<String>();
  
        try {
            FileReader fileReader = new FileReader(file.getPath());
            BufferedReader bufferedReader  = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) { word.add(line);}
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Don't reach the file");
        } catch (IOException ex) {
            System.out.println("Go");
        }
        name = new String[word.size()];
        for (int rt = 0; rt < word.size(); rt++) {
            name[rt] = word.get(rt);
        }    
            hm.initialize();
        }
        }
        if(ae.getSource() == Ok){
            dispose();
        }
    }

}

