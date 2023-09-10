package hangman;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.*;


public class HangMan extends JComponent implements ActionListener {

    public static JFrame frame;
    JButton [] buttons = new JButton[26];
    JCheckBox help = new JCheckBox();
    JTextField helptxt = new JTextField(35);
    JButton G = new JButton("Geuss");
    JTextField guesstxt = new JTextField(25); 
    public static JButton button, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    public static JLabel JL, JL1, JL2;
    static String name[];
    static Random r2;
    static int s2;
    static String select = "";
    static LinkedList st;
    static int[] num;
    static int check;
    HangMan x1;
    
    JMenuBar navigationBar = new JMenuBar();
    JMenu formMenu = new JMenu("File");
    JMenu forsetting = new JMenu("Option");


    JMenuItem menuItem1 = new JMenuItem(" New Game");
    JMenuItem menuItem2 = new JMenuItem(" Save Game");
    JMenuItem menuItem3 = new JMenuItem(" Load Game");
    JMenuItem menuItem4 = new JMenuItem("  Exit");

    JMenuItem setting = new JMenuItem(" Setting");

    ImageIcon newIcon = new ImageIcon("C:\\Users\\Abdul Waris Sherzad\\OneDrive\\Documents\\NetBeansProjects\\HangMan\\src\\main\\java\\images\\new.png");
    ImageIcon saveIcon = new ImageIcon("C:\\Users\\Abdul Waris Sherzad\\OneDrive\\Documents\\NetBeansProjects\\HangMan\\src\\main\\java\\images\\save.png");
    ImageIcon loadIcon = new ImageIcon("C:\\Users\\Abdul Waris Sherzad\\OneDrive\\Documents\\NetBeansProjects\\HangMan\\src\\main\\java\\images\\load.png");
    ImageIcon exitIcon = new ImageIcon("C:\\Users\\Abdul Waris Sherzad\\OneDrive\\Documents\\NetBeansProjects\\HangMan\\src\\main\\java\\images\\exit.png");
    ImageIcon optionIcon = new ImageIcon("C:\\Users\\Abdul Waris Sherzad\\OneDrive\\Documents\\NetBeansProjects\\HangMan\\src\\main\\java\\images\\option.png");

    public static void main(String args[]) {
        HangMan hm = new HangMan();
        String line = "";
        ArrayList<String> word = new ArrayList<String>();
    
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader("Word.txt");

            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
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
        
        hm.initialize();

    }

    public static boolean badGuess(String c5) {
        if (st.contains(c5.charAt(0))) {
            st.removeFirstOccurrence(c5.charAt(0));
            return true;
        }

        return false;
    }

    public void initialize() {
        x1 = new HangMan();
        x1.setBackground(Color.WHITE);
        frame = new JFrame("Hangman Game");

        st = new LinkedList();
        check = -1;
        num = new int[10];
        for (int y2 = 0; y2 < 10; y2++) {
            num[y2] = 0;
        }

        r2 = new Random();
        s2 = r2.nextInt(name.length);
        String star = "";
        select = name[s2].toLowerCase();
        for (int k2 = 0; k2 < name[s2].length(); k2++) {
            star += "-";
            st.add(select.charAt(k2));    
        }
        
        //Creating Of button in a for Loop
        
        for(char alphabit = 'a';alphabit <='z';alphabit ++){
            JButton but = new JButton(""+alphabit);
        }
        
        
        
        
        a = new JButton("a");
        a.setActionCommand("a");
        a.addActionListener(this);
        b = new JButton("b");
        b.setActionCommand("b");
        b.addActionListener(this);
        c = new JButton("c");
        c.setActionCommand("c");
        d = new JButton("d");
        d.setActionCommand("d");
        e = new JButton("e");
        e.setActionCommand("e");
        f = new JButton("f");
        f.setActionCommand("f");
        g = new JButton("g");
        g.setActionCommand("g");
        h = new JButton("h");
        h.setActionCommand("h");
        i = new JButton("i");
        i.setActionCommand("i");
        j = new JButton("j");
        j.setActionCommand("j");
        k = new JButton("k");
        k.setActionCommand("k");
        l = new JButton("l");
        l.setActionCommand("l");
        m = new JButton("m");
        m.setActionCommand("m");
        n = new JButton("n");
        n.setActionCommand("n");
        o = new JButton("o");
        o.setActionCommand("o");
        p = new JButton("p");
        p.setActionCommand("p");
        q = new JButton("q");
        q.setActionCommand("q");
        r = new JButton("r");
        r.setActionCommand("r");
        s = new JButton("s");
        s.setActionCommand("s");
        t = new JButton("t");
        t.setActionCommand("t");
        u = new JButton("u");
        u.setActionCommand("u");
        v = new JButton("v");
        v.setActionCommand("v");
        w = new JButton("w");
        w.setActionCommand("w");
        x = new JButton("x");
        x.setActionCommand("x");
        y = new JButton("y");
        y.setActionCommand("y");
        z = new JButton("z");
        z.setActionCommand("z");

        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        h.addActionListener(this);
        i.addActionListener(this);
        j.addActionListener(this);
        k.addActionListener(this);
        l.addActionListener(this);
        m.addActionListener(this);
        n.addActionListener(this);
        o.addActionListener(this);
        p.addActionListener(this);
        q.addActionListener(this);
        r.addActionListener(this);
        s.addActionListener(this);
        t.addActionListener(this);
        u.addActionListener(this);
        v.addActionListener(this);
        w.addActionListener(this);
        x.addActionListener(this);
        y.addActionListener(this);
        z.addActionListener(this);

        JPanel jp1 = new JPanel();
        JPanel jp4 = new JPanel();
        
        
        jp1.setLayout(new FlowLayout());
        jp1.setBackground(null);
       // jp1.setPreferredSize(new Dimension(200, 300));
        JL = new JLabel(star,SwingConstants.CENTER);
        
        JL.setFont(new Font("Monotype Corsiva", 1, 35));
         String myName = JL.getText();
         int RChance = (myName.length())/2;
       JL1 = new JLabel(""+RChance,SwingConstants.CENTER);
       //JLabel JL1 = new JLabel(""+RChance,SwingConstants.CENTER);
        JL2 = new JLabel("0",SwingConstants.CENTER);

        JLabel jl3 = new JLabel("  GUESS A COMPUTER SCIENCE WORD  ", SwingConstants.CENTER);
        jl3.setFont(new Font("Times New Roman", 1, 30));
        jp1.add(jl3);

        jp1.add(JL);
        JL1.setFont(new Font("Monotype Corsiva", 1, 30));
        JLabel jl4 = new JLabel("Remaining Chance :", SwingConstants.LEFT);
        jl4.setFont(new Font("Monotype Corsiva", 7, 20));
        jp4.add(jl4);
        jp4.add(JL1);
        JL2.setFont(new Font("Monotype Corsiva", 1, 35));
        JLabel jl8 = new JLabel(", Total Wrong Guesses : " ,SwingConstants.CENTER);
        jl8.setFont(new Font("Monotype Corsiva", 7, 20));
        jp4.add(jl8);
        jp4.add(JL2);
        jp1.setPreferredSize(new Dimension(600, 200));
        jp4.setPreferredSize(new Dimension(600, 50));
        jp4.setBackground(null);
        
        
        JPanel jp2 = new JPanel();
        jp2.setBackground(null);
        jp2.setPreferredSize(new Dimension(600, 35));
        jp2.add(a);
        jp2.add(b);
        jp2.add(c);
        jp2.add(d);
        jp2.add(e);
        jp2.add(f);
        jp2.add(g);
        jp2.add(h);
        jp2.add(i);
        jp2.add(j);
        jp2.add(k);
        jp2.add(l);
        jp2.add(m);
        
        
        
        jp2.add(new JLabel(""));

        JPanel jp3 = new JPanel();
        jp3.setBackground(null);
        jp3.setPreferredSize(new Dimension(600, 63));
        jp3.add(n);
        jp3.add(o);
        jp3.add(p);
        jp3.add(q);
        jp3.add(r);
        jp3.add(s);
        jp3.add(t);
        jp3.add(u);
        jp3.add(v);
        jp3.add(w);
        jp3.add(x);
        jp3.add(y);
        jp3.add(z);
        jp3.add(guesstxt);
        jp3.add(G);
        G.setPreferredSize(new Dimension(300,26));
        guesstxt.setPreferredSize(new Dimension(300,26));
        G.addActionListener(this);
        
      
        formMenu.add(menuItem1);
        formMenu.add(menuItem2);
        formMenu.add(menuItem3);
        formMenu.add(menuItem4);
        
        forsetting.add(setting);

        menuItem1.setIcon(newIcon);
        menuItem2.setIcon(saveIcon);
        menuItem3.setIcon(loadIcon);
        menuItem4.setIcon(exitIcon);
        setting.setIcon(optionIcon);



        navigationBar.add(formMenu);
        navigationBar.add(forsetting);
        
       frame.add(navigationBar);
       frame.setJMenuBar(navigationBar);
       

        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);
        menuItem4.addActionListener(this);
        setting.addActionListener(this);


  
        frame.setLayout(new FlowLayout());
        frame.add(jp1);
        frame.add(jp2);
        frame.add(jp3);
        frame.add(jp4);

        frame.setSize(615, 425);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        
        if(ex.getSource() == menuItem1){
           frame.dispose();
           initialize();
        }
        if(ex.getSource() == menuItem2){
          frame.dispose();
          saveGame sa = new saveGame();
          initialize();
        }
        if(ex.getSource() == menuItem3){
           frame.dispose();
          loadGame a = new loadGame();
          //initialize();
          
        }
        if(ex.getSource() == menuItem4){
         int confirm = JOptionPane.showConfirmDialog(null,"Do you Want To Save The Game");
         
         if(confirm == 0){
        saveGame sa = new saveGame();
        frame.dispose();
         }
         else{
             System.exit(0);
         }
        }
        if(ex.getSource() == setting){
          Setting se = new Setting();
        }
        if (!badGuess(ex.getActionCommand())) {
            setLabels();

            switch (ex.getActionCommand().charAt(0)) {
                case 'a':
                    a.setBackground(Color.red);
                    a.setEnabled(false);
                    break;
                case 'b':
                    b.setBackground(Color.red);
                    b.setEnabled(false);
                    break;
                case 'c':
                    c.setBackground(Color.red);
                    c.setEnabled(false);
                    break;
                case 'd':
                    d.setBackground(Color.red);
                    d.setEnabled(false);
                    break;
                case 'e':
                    e.setBackground(Color.red);
                    e.setEnabled(false);
                    break;
                case 'f':
                    f.setBackground(Color.red);
                    f.setEnabled(false);
                    break;
                case 'g':
                    g.setBackground(Color.red);
                    g.setEnabled(false);
                    break;
                case 'h':
                    h.setBackground(Color.red);
                    h.setEnabled(false);
                    break;
                case 'i':
                    i.setBackground(Color.red);
                    i.setEnabled(false);
                    break;
                case 'j':
                    j.setBackground(Color.red);
                    j.setEnabled(false);
                    break;
                case 'k':
                    k.setBackground(Color.red);
                    k.setEnabled(false);
                    break;
                case 'l':
                    l.setBackground(Color.red);
                    l.setEnabled(false);
                    break;
                case 'm':
                    m.setBackground(Color.red);
                    m.setEnabled(false);
                    break;
                case 'n':
                    n.setBackground(Color.red);
                    n.setEnabled(false);
                    break;
                case 'o':
                    o.setBackground(Color.red);
                    o.setEnabled(false);
                    break;
                case 'p':
                    p.setBackground(Color.red);
                    p.setEnabled(false);
                    break;
                case 'q':
                    q.setBackground(Color.red);
                    q.setEnabled(false);
                    break;
                case 'r':
                    r.setBackground(Color.red);
                    r.setEnabled(false);
                    break;
                case 's':
                    s.setBackground(Color.red);
                    s.setEnabled(false);
                    break;
                case 't':
                    t.setBackground(Color.red);
                    t.setEnabled(false);
                    break;
                case 'u':
                    u.setBackground(Color.red);
                    u.setEnabled(false);
                    break;
                case 'v':
                    v.setBackground(Color.red);
                    v.setEnabled(false);
                    break;
                case 'w':
                    w.setBackground(Color.red);
                    w.setEnabled(false);
                    break;
                case 'x':
                    x.setBackground(Color.red);
                    x.setEnabled(false);
                    break;
                case 'y':
                    y.setBackground(Color.red);
                    y.setEnabled(false);
                    break;
                case 'z':
                    z.setBackground(Color.red);
                    z.setEnabled(false);
                    break;
                case 'G':
                    frame.dispose();
                    initialize();
            }
        } else {
            setStar(ex.getActionCommand());
            if (JL.getText().contains("-")) {

            } else {

                int s = JOptionPane.showConfirmDialog(null, "YOU HAVE WON THE GAME\nDo you want to continue?");
                System.out.println(s);
                if (s == 0) {
                    frame.setVisible(false);
                    initialize();

                } else {
                    System.exit(0);
                }
            }

        }
       String myName = JL.getText();
        if (check == (myName.length())/2) {
            int s = JOptionPane.showConfirmDialog(null, "\nYOU HAVE LOSS THE GAME\nDo you want to continue?");
            if (s == 0) {
                frame.setVisible(false);
                initialize();
            } else {
                System.exit(0);
            }
        }
    }

    public void setLabels() {
        HangMan hm = new HangMan();
       String myName = JL.getText();
        check++;
        num[check] = 1;
        JL2.setText((check + 1) + " ");
        
        JL1.setText((( myName.length()/2)- (check + 1) + ""));

    }

    public void setStar(String s) {
        StringBuilder myName = new StringBuilder(JL.getText());

        for (int u2 = 0; u2 < myName.length(); u2++) {
            if (select.charAt(u2) == s.charAt(0)) {
                if (myName.charAt(u2) == '-') {
                    myName.setCharAt(u2, s.charAt(0));
                    JL.setText(myName.toString());
                    return;

                } else {
                    System.out.println("Doesn't Work");
                }
            }
        }

        //   JL.setText(myName);
    }
}
