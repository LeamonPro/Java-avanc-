
import javax.swing.*;
import java.awt.*;


public class Fenetre extends JFrame{
    public Fenetre(){
        this.setTitle("Ma premiére fenetre");
        this.setSize(400,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan=new JPanel();
        pan.setBackground(Color.WHITE);
        pan.setLayout(new GridLayout(2,1));
        JPanel pan1=new JPanel();
        pan1.setLayout(new GridLayout(2,2));
        JPanel pan2=new JPanel();
        pan2.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Login");
        JTextField t1=new JTextField(20);
        JLabel l2=new JLabel("Password");
        JPasswordField pwd=new JPasswordField(20);
        JButton b1=new JButton("ok");
        JButton b2=new JButton("Annuler");
        JButton b3=new JButton("Fermer");
        pan1.add(l1);
        pan1.add(t1);
        pan1.add(l2);
        pan1.add(pwd);
        pan2.add(b1);
        pan2.add(b2);
        pan2.add(b3);
        pan.add(pan1);
        pan.add(pan2);
        
        this.setContentPane(pan);
        this.setResizable(false);
        this.setVisible(true);

    }
}
