import java.awt.*;
import java.awt.event.*;

public class Ex extends Frame implements ActionListener {
    Label title, nom, prenom, age, gender, nationalite, loisir, adress, res;
    TextField txtNom, txtprenom, txtage;
    TextArea txtAddress, tout, resadd;
    Checkbox checkMale, checkFemale, Hobbies1, Hobbies2, Hobbies3, Hobbies4, term;
    CheckboxGroup genderCheckbox;
    Choice nationchoices;
    Button ok, Annuler;

    public Ex() {
        super("APP");
        setSize(1000, 700);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(61, 60, 70);
        setBackground(formColor);

        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont = new Font("arial", Font.PLAIN, 18);
        Font textFont = new Font("arial", Font.PLAIN, 15);

        title = new Label("Registration Form");
        title.setBounds(400, 40, 300, 50);
        title.setFont(titleFont);
        title.setForeground(Color.YELLOW);
        add(title);

        nom = new Label("Nom");
        nom.setBounds(250, 100, 150, 30);
        nom.setFont(labelFont);
        nom.setForeground(Color.WHITE);
        add(nom);

        txtNom = new TextField();
        txtNom.setBounds(400, 100, 400, 30);
        txtNom.setFont(textFont);
        add(txtNom);

        prenom = new Label("Prenom");
        prenom.setBounds(250, 150, 150, 30);
        prenom.setFont(labelFont);
        prenom.setForeground(Color.WHITE);
        add(prenom);

        txtprenom = new TextField();
        txtprenom.setBounds(400, 150, 400, 30);
        txtprenom.setFont(textFont);
        add(txtprenom);

        age = new Label("Age");
        age.setBounds(250, 200, 150, 30);
        age.setFont(labelFont);
        age.setForeground(Color.WHITE);
        add(age);

        txtage = new TextField();
        txtage.setBounds(400, 200, 400, 30);
        txtage.setFont(textFont);
        add(txtage);

        gender = new Label("Gender");
        gender.setBounds(250, 250, 150, 30);
        gender.setFont(labelFont);
        gender.setForeground(Color.WHITE);
        add(gender);

        genderCheckbox = new CheckboxGroup();

        checkMale = new Checkbox("Male", genderCheckbox, true);
        checkMale.setBounds(400, 250, 100, 30);
        checkMale.setFont(labelFont);
        checkMale.setForeground(Color.WHITE);
        add(checkMale);

        checkFemale = new Checkbox("Female", genderCheckbox, false);
        checkFemale.setBounds(500, 250, 100, 30);
        checkFemale.setFont(labelFont);
        checkFemale.setForeground(Color.WHITE);
        add(checkFemale);

        nationalite = new Label("nationalite");
        nationalite.setBounds(250, 300, 150, 30);
        nationalite.setFont(labelFont);
        nationalite.setForeground(Color.WHITE);
        add(nationalite);

        nationchoices = new Choice();
        nationchoices.setFont(labelFont);
        nationchoices.setBounds(400, 300, 400, 50);
        nationchoices.add("Tunisien");
        nationchoices.add("Algerien");
        nationchoices.add("Marocain");
        nationchoices.add("Libye");
        nationchoices.add("Mauritanien");
        add(nationchoices);

        loisir = new Label("Loisir");
        loisir.setBounds(250, 350, 150, 30);
        loisir.setFont(labelFont);
        loisir.setForeground(Color.WHITE);
        add(loisir);

        Hobbies1 = new Checkbox("Sport");
        Hobbies1.setBounds(400, 350, 100, 50);
        Hobbies1.setFont(labelFont);
        Hobbies1.setForeground(Color.WHITE);
        add(Hobbies1);

        Hobbies2 = new Checkbox("Music");
        Hobbies2.setBounds(500, 350, 100, 50);
        Hobbies2.setFont(labelFont);
        Hobbies2.setForeground(Color.WHITE);
        add(Hobbies2);

        Hobbies3 = new Checkbox("Dance");
        Hobbies3.setBounds(600, 350, 100, 50);
        Hobbies3.setFont(labelFont);
        Hobbies3.setForeground(Color.WHITE);
        add(Hobbies3);

        adress = new Label("Address");
        adress.setBounds(250, 400, 150, 30);
        adress.setFont(labelFont);
        adress.setForeground(Color.WHITE);
        add(adress);

        txtAddress = new TextArea(10, 30);
        txtAddress.setBounds(400, 400, 400, 100);
        txtAddress.setFont(labelFont);
        add(txtAddress);

        ok = new Button("OK");
        ok.setBounds(400, 550, 150, 30);
        ok.setFont(labelFont);
        ok.setBackground(Color.BLUE);
        ok.setForeground(Color.WHITE);
        ok.addActionListener(this);
        add(ok);

        Annuler = new Button("Annuler");
        Annuler.setBounds(560, 550, 150, 30);
        Annuler.setFont(labelFont);
        Annuler.setBackground(Color.RED);
        Annuler.setForeground(Color.WHITE);
        Annuler.addActionListener(this);
        add(Annuler);
        tout = new TextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(850, 100);
        tout.setText("");
        tout.setEditable(false);
        add(tout);
        term = new Checkbox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(400, 510);
        add(term);
        res = new Label("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(400, 600);
        add(res);

        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            if (term.getState() == true) {
                String data1;
                String data = "Nom : " + txtNom.getText() + "\n" + "Prenom : " + txtprenom.getText() + "\n" + "Age : "
                        + txtage.getText() + "\n";
                if (checkMale.getState() == true)
                    data1 = "Gender : Male" + "\n";
                else
                    data1 = "Gender : Female" + "\n";
                String data2 = "Nationalite : " + nationchoices.getSelectedItem() + "\n";
                String data3 = "Loisir : ";
                if (Hobbies1.getState() == true)
                    data3 = data3 + Hobbies1.getSelectedObjects()[0] + "\t";
                if (Hobbies2.getState() == true)
                    data3 = data3 + Hobbies2.getSelectedObjects()[0] + "\t";
                if (Hobbies3.getState() == true)
                    data3 = data3 + Hobbies3.getSelectedObjects()[0] + "\t";
                data3 = data3 + "\n";
                String data4 = "Address : " + txtAddress.getText();
                tout.setText(data + data1 + data2 + data3 + data4);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
                tout.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        } else if (e.getSource() == Annuler) {
            String def = "";
            txtNom.setText(def);
            txtprenom.setText(def);
            txtAddress.setText(def);
            txtage.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setState(false);
        }
    }

}
