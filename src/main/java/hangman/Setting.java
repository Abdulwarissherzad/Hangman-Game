 
package hangman;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static hangman.HangMan.frame;
import static hangman.HangMan.name;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Setting extends JFrame implements ActionListener {
    HangMan a = new HangMan();
    JLabel dbLabel = new JLabel("Word Database File");
    JTextField dbTfield = new JTextField(20);
    JButton changeBtn = new JButton("Change ...");
    JLabel bgroundColor = new JLabel("Background Color :");
    JComboBox<String> cb = new JComboBox<String>();
    JButton okBtn = new JButton("OK");
    JButton applyBtn =new JButton("Apply");
    JButton cancelBtn = new JButton("Cancel");
    JLabel empty = new JLabel("                             ");
    
    public Setting(){
    setLayout(new FlowLayout());
            setSize(500, 150);
            setLocationRelativeTo(null);
            setTitle("Game options");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            add(dbLabel); add(dbTfield); add(changeBtn); add(bgroundColor);
            add(cb); add(empty);
            cb.addItem("None"); cb.addItem("pink"); cb.addItem("green"); cb.addItem("red"); cb.addItem("yellow");
            add(okBtn);
            dbTfield.setText("C:\\Users\\Abdul Waris Sherzad\\OneDrive\\Documents\\NetBeansProjects\\HangMan\\HangMan.db");
            add(cancelBtn);
            setVisible(true);

            changeBtn.addActionListener(this);
            cb.addActionListener(this);
            okBtn.addActionListener(this);
            applyBtn.addActionListener(this);
            cancelBtn.addActionListener(this);
            dbTfield.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae) {
              
      
        if(ae.getSource()== okBtn) {
       
        if(cb.getSelectedItem()=="pink"){
            frame.getContentPane().setBackground(Color.pink);
        }
        if(cb.getSelectedItem()=="green"){
            frame.getContentPane().setBackground(Color.GREEN);
        }
       if(cb.getSelectedItem()=="red"){
            frame.getContentPane().setBackground(Color.RED);
        }
        if (cb.getSelectedItem()=="yellow"){
            frame.getContentPane().setBackground(Color.YELLOW);
            
        }
        }
        if(ae.getSource() == changeBtn){
             HangMan a = new HangMan();
           JFileChooser fc = new JFileChooser();
            
            fc.setAcceptAllFileFilterUsed(false);
            fc.addChoosableFileFilter(new FileNameExtensionFilter("*.db", "txt"));
            fc.addChoosableFileFilter(new FileNameExtensionFilter("*.SV", "txt"));

            int isFileChooserActivated = fc.showOpenDialog(this);
            
            if (isFileChooserActivated == JFileChooser.APPROVE_OPTION){
            
                File file = fc.getSelectedFile();
                dbTfield.setText(fc.getSelectedFile().toString());
                dbTfield.setText(file.getAbsolutePath());
           
                
               HangMan hm = new HangMan();   String line = "";
        ArrayList<String> word = new ArrayList<String>();
  
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(file.getPath());

            BufferedReader bufferedReader  = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                word.add(line);
            }

            bufferedReader.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Don't reach the file");
        }
        catch (IOException ex) {
            System.out.println("Go");
        }

        name = new String[word.size()];

        for (int rt = 0; rt < word.size(); rt++) {
            name[rt] = word.get(rt);
        }
        }
        }    
          if(ae.getSource()==cancelBtn){
          dispose();
          }
    }
    
public static void main(String [] args){
 
 Setting gg= new Setting();
    }

    
}
