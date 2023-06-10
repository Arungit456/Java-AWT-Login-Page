import java.awt.*;
import java.awt.event.*;

class awtloginpage extends Frame {
    TextField name, pass;
    Button b1, b2;

    awtloginpage() {
        setLayout(null);
        Label n = new Label("Name: ", Label.CENTER);
        Label p = new Label("Password: ", Label.CENTER);
        name = new TextField(20);
        pass = new TextField(20);
        pass.setEchoChar('*');
        b1 = new Button("Submit");
        b2 = new Button("Cancel");
        add(n);
        add(name);
        add(p);
        add(pass);
        add(b1);
        add(b2);
        n.setBounds(70, 90, 90, 20);
        p.setBounds(70, 130, 90, 20);
        name.setBounds(200, 90, 90, 20);
        pass.setBounds(200, 130, 90, 20);
        b1.setBounds(100, 200, 70, 20);
        b2.setBounds(200, 200, 70, 20);
    }

    public static void main(String args[]) {
        awtloginpage m1 = new awtloginpage();
        m1.setVisible(true);
        m1.setSize(400, 300);
        m1.setTitle("My login");
    }
}
