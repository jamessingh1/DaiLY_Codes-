package awt;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Student Registration Form (AWT)");
        Label l1 = new Label("Name:");
        TextField tfName = new TextField(15);

        Label l2 = new Label("Roll No:");
        TextField tfRoll = new TextField(15);

        Button btnSubmit = new Button("Register");
        Label lResult = new Label("Status: Pending...");

        frame.setLayout(new FlowLayout());
        frame.add(l1);
        frame.add(tfName);
        frame.add(l2);
        frame.add(tfRoll);
        frame.add(btnSubmit);
        frame.add(lResult);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String roll = tfRoll.getText();
                lResult.setText("Registered: " + name + " (Roll: " + roll + ")");
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}