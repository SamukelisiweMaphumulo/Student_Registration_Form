package PracticeFour;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudClass extends JFrame {
    // Initializing components
    private JTextField nameField, surnameField,idField, mobileField;
    private JRadioButton undergrad, postgrad, male, female;
    private JTextArea addressArea;
    private JCheckBox termsCheckBox;
    private JButton submitButton, resetButton;

    public StudClass() {
        setTitle("Student Registration");
        setSize(500, 400); // Adjusted size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Using null layout for custom positioning

        // Title Label
        JLabel titleLabel = new JLabel("Student Registration", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(100, 10, 300, 30);
        add(titleLabel);

        // Labels & Fields
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 50, 100, 20);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 50, 120, 20);
        add(nameField);
        
        JLabel surnameLabel = new JLabel("Surname");
        surnameLabel.setBounds(280, 50, 100, 20);
        add(surnameLabel);
        
        surnameField = new JTextField();
        surnameField.setBounds(350, 50, 120, 20);
        add(surnameField);
        
        JLabel idLabel = new JLabel("ID/Passport number");
        idLabel.setBounds(50, 80, 100, 20);
        add(idLabel);
        
        idField = new JTextField();
        idField.setBounds(150, 80, 200, 20);
        add(idField);

        JLabel mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(50, 110, 100, 20);
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(150, 110, 200, 20);
        add(mobileField);

        JLabel studentLabel = new JLabel("Student ...");
        studentLabel.setBounds(50, 140, 100, 20);
        add(studentLabel);

        // Radio Buttons
        undergrad = new JRadioButton("Undergrad");
        postgrad = new JRadioButton("Postgrad");
        ButtonGroup group = new ButtonGroup();
        group.add(undergrad);
        group.add(postgrad);

        undergrad.setBounds(150, 140, 100, 20);
        postgrad.setBounds(260, 140, 100, 20);
        add(undergrad);
        add(postgrad);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 170, 100, 20);
        add(addressLabel);

        addressArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(addressArea);
        scrollPane.setBounds(150, 170, 200, 40);
        add(scrollPane);

        // Terms Checkbox
        termsCheckBox = new JCheckBox("Accept Terms And Conditions.");
        termsCheckBox.setBounds(50, 220, 300, 20);
        add(termsCheckBox);

        // Buttons
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        submitButton.setBounds(150, 260, 80, 25);
        resetButton.setBounds(250, 260, 80, 25);
        add(submitButton);
        add(resetButton);

        // Button Actions
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Form Submitted");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                surnameField.setText("");
                idField.setText("");
                mobileField.setText("");
                addressArea.setText("");
                undergrad.setSelected(false);
                postgrad.setSelected(false);
                termsCheckBox.setSelected(false);
            }
        });

        
    }

    
    }
