package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;


public class Dashboard extends JFrame {
    private JTabbedPane tabbedPane;

    public Dashboard() {
        setTitle("Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Add Student", createAddStudentPanel());
        tabbedPane.addTab("Add Book", createAddBookPanel());
        tabbedPane.addTab("Issue Book", createIssueBookPanel());
        tabbedPane.addTab("Display Record", createDisplayRecordPanel());

        add(tabbedPane);
    }

    private JPanel createAddStudentPanel() {
        JPanel panel = new JPanel(new GridLayout(6, 2));
        JTextField firstNameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JTextField genderField = new JTextField();
        JTextField programField = new JTextField();
        JTextField sectionField = new JTextField();
        JButton addButton = new JButton("Add Student");

        panel.add(new JLabel("First Name:"));
        panel.add(firstNameField);
        panel.add(new JLabel("Last Name:"));
        panel.add(lastNameField);
        panel.add(new JLabel("Gender:"));
        panel.add(genderField);
        panel.add(new JLabel("Program:"));
        panel.add(programField);
        panel.add(new JLabel("Section:"));
        panel.add(sectionField);
        panel.add(new JLabel());
        panel.add(addButton);

        addButton.addActionListener(e -> {
            Student student = new Student(firstNameField.getText(), lastNameField.getText(), genderField.getText(), programField.getText(), sectionField.getText());
            // DataBaseOperation dbOp = new DataBaseOperation();
            // dbOp.writeStudentData(student);
            // JOptionPane.showMessageDialog(this, "Student added successfully");
        });

        return panel;
    }

    private JPanel createAddBookPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JTextField authorField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField publicationField = new JTextField();
        JTextField subjectField = new JTextField();
        JButton addButton = new JButton("Add Book");

        panel.add(new JLabel("Author Name:"));
        panel.add(authorField);
        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Publication Name:"));
        panel.add(publicationField);
        panel.add(new JLabel("Subject:"));
        panel.add(subjectField);
        panel.add(new JLabel());
        panel.add(addButton);

        addButton.addActionListener(e -> {
            Book book = new Book();
            // DataBaseOperation dbOp = new DataBaseOperation();
            // dbOp.writeBookData(book);
            // JOptionPane.showMessageDialog(this, "Book added successfully");
        });

        return panel;
    }

    private JPanel createIssueBookPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JTextField studentIdField = new JTextField();
        JTextField bookIdField = new JTextField();
        JTextField issueDateField = new JTextField();
        JTextField dueDateField = new JTextField();
        JButton issueButton = new JButton("Issue Book");

        panel.add(new JLabel("Student ID:"));
        panel.add(studentIdField);
        panel.add(new JLabel("Book ID:"));
        panel.add(bookIdField);
        panel.add(new JLabel("Issue Date:"));
        panel.add(issueDateField);
        panel.add(new JLabel("Due Date:"));
        panel.add(dueDateField);
        panel.add(new JLabel());
        panel.add(issueButton);

        issueButton.addActionListener(e -> {
            BookIssue bookIssue = new BookIssue(Integer.parseInt(studentIdField.getText()), Integer.parseInt(bookIdField.getText()), issueDateField.getText(), dueDateField.getText());
            // DataBaseOperation dbOp = new DataBaseOperation();
            // dbOp.writeBookIssued(bookIssue);
            // JOptionPane.showMessageDialog(this, "Book issued successfully");
        });

        return panel;
    }

    private JPanel createDisplayRecordPanel() {
        JPanel panel = new JPanel();
        JTextArea displayArea = new JTextArea(10, 50);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        JButton refreshButton = new JButton("Refresh");

        panel.add(scrollPane);
        panel.add(refreshButton);

        refreshButton.addActionListener(e -> {
            // DataBaseOperation dbOp = new DataBaseOperation();
            // String records = dbOp.readBookIssue().toString(); // Customize this to format your output
            // displayArea.setText(records);
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dashboard().setVisible(true));
    }
}