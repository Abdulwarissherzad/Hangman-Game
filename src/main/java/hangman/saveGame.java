 
package hangman;
import static hangman.HangMan.name;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javafx.stage.FileChooser;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class saveGame extends JFrame implements ActionListener{
    JLabel label = new JLabel("Choose File:");
    JTextField fileField = new JTextField(20);
    JButton btnBrowse = new JButton("Browse...");
    JFileChooser fc=null;
    JTextArea fileTextArea = new JTextArea(7,55);
    HangMan hm = new HangMan();
    JLabel la = new JLabel("Select The Directory Which you Want To Save The File");

public saveGame(){
    setLayout (new FlowLayout());
    setSize(600,350);
    setTitle("Using JFileChooser");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
    add(label);
    add(fileField);
    add(btnBrowse);
    add(fileTextArea);
    add(la);

    la.setFont(new Font("Monotype Corsiva", 1, 20));
    fileField.setEditable(false);
    fileField.setBackground(Color.WHITE);
    btnBrowse.addActionListener(this);
}   
public void actionPerformed (ActionEvent ae){
            if (ae.getSource()==btnBrowse){
            if (fc == null)  fc = new JFileChooser();
             HangMan hm = new HangMan();
            fc.setAcceptAllFileFilterUsed(false);
            fc.addChoosableFileFilter(new FileNameExtensionFilter("*.Sav", "txt"));

            int isFileChooserActivated = fc.showSaveDialog(this);
            
            if (isFileChooserActivated == JFileChooser.APPROVE_OPTION){
            
            File file = fc.getSelectedFile();
                
                
            String line = "";  ArrayList<String> word = new ArrayList<String>();
    
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader("Word.txt");

            BufferedReader bufferedReader  = new BufferedReader(fileReader);
            line = bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                
            fileTextArea.setText(fileTextArea.getText() + "\n" + line);
            line = bufferedReader.readLine();
            word.add(line);
                
            }

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
              //  fileField.setText(file.getPath());
               // fileTextArea.setText(file.getPath());
                FileChooser fc = new FileChooser();
                fc.setTitle("save file"); 
               
                 try {
                  FileWriter fw = new FileWriter(file);
                  BufferedWriter bw = new BufferedWriter(fw);
                  bw.write(System.lineSeparator());
                  String text =fileTextArea.getText();
                  bw.write(text);
                  bw.close();
                } catch (Exception e) {
                  System.out.println(e);
                }
                }
            JOptionPane.showMessageDialog(null, "You have saved the Game in a Path You Chose");
           System.exit(0);
            }
    
}
}
