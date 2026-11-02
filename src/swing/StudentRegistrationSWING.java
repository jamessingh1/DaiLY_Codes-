package swing;
import javax.swing.*;
import java.awt.FlowLayout;

public class StudentRegistrationSWING {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form (Swing)");

        // Components
        JLabel l1 = new JLabel("Name:");
        JTextField tfName = new JTextField(15);

        JLabel l2 = new JLabel("Roll No:");
        JTextField tfRoll = new JTextField(15);

        JButton btnSubmit = new JButton("Register");
        JLabel lResult = new JLabel("Status: Pending...");

        // Set Layout & Add Components
        frame.setLayout(new FlowLayout());
        frame.add(l1);
        frame.add(tfName);
        frame.add(l2);
        frame.add(tfRoll);
        frame.add(btnSubmit);
        frame.add(lResult);

        // Submit Button Action using Lambda
        btnSubmit.addActionListener(e -> {
            String name = tfName.getText();
            String roll = tfRoll.getText();
            lResult.setText("Registered: " + name + " (Roll: " + roll + ")");
        });

        // Automatic window close on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

