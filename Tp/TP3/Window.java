import javax.swing.*;
import javax.swing.plaf.PanelUI;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
public class Window extends JFrame {
    public Window(){
        this.setTitle("Application");
        this.setSize(400,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel p1=new Panel();
        Panel p2=new Panel();
        Panel p=new Panel();
        p1.setLayout(new BorderLayout());
        JTable table=new JTable();
        String[] columns = {"Id","Produit","Prix"};
        Object[][] data = {
                    {"1", "Produit1",
                     1200},
                    {"2", "produit2",500
                    }};
        DefaultTableModel model=new DefaultTableModel(data,columns);
        table.setModel(model);
        JScrollPane tpan=new JScrollPane(table);
        p1.add(tpan,BorderLayout.NORTH);

        p2.setLayout(new GridLayout(4,2));
        JLabel l1=new JLabel("Id");
        JTextField t1=new JTextField(20);
        JLabel l2=new JLabel("Libelle");
        JTextField t2=new JTextField(20);
        JLabel l3=new JLabel("Prix");
        JTextField t3=new JTextField(20);
        String[] list={"En Stock","En repture"};
        JLabel l4=new JLabel("Disponibilité");
        JComboBox box=new JComboBox<>(list);
        JButton b1=new JButton("ok");
        JButton b2=new JButton("Annuler");
        JButton b3=new JButton("Fermer");
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        p2.add(l3);
        p2.add(t3);
        p2.add(l4);
        p2.add(box);
        JPanel p3=new JPanel();
        p.setLayout(new GridLayout(2,1));
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p.add(p2);
        p.add(p3);

        p1.add(p,BorderLayout.SOUTH);
        this.setContentPane(p1);
        this.setVisible(true);
    
}}

