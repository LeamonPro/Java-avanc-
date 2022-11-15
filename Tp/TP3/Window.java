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
        p1.add(tpan);
        String[] list={"En Stock","En repture"};
        JComboBox box=new JComboBox<>(list);
        p2.add(box);
        p1.add(p2);
        this.setContentPane(p1);
        this.setVisible(true);
    
}}
