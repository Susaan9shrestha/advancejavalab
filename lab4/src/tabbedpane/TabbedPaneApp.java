package tabbedpane;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneApp extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TabbedPaneApp() {
        // Set frame properties
        setTitle("TabbedPane Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Home Tab
        JPanel homePanel = new JPanel();
        homePanel.add(new JLabel("Welcome to the Home Tab!"));
        tabbedPane.addTab("Home", homePanel);

        // Profile Tab
        JPanel profilePanel = new JPanel(new GridLayout(2, 2)); // GridLayout with 2 rows and 2 columns

        // Add components to the Profile tab
        profilePanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        profilePanel.add(nameField);
        
        profilePanel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        profilePanel.add(emailField);

        tabbedPane.addTab("Profile", profilePanel);

        // Settings Tab
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new FlowLayout()); // Default layout for simplicity

        settingsPanel.add(new JLabel("Settings Options"));
        JButton settingsButton = new JButton("Save Settings");
        settingsPanel.add(settingsButton);

        tabbedPane.addTab("Settings", settingsPanel);

        // Add the tabbedPane to the frame
        add(tabbedPane, BorderLayout.CENTER);

        // Set frame visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(() -> new TabbedPaneApp());
    }
}
