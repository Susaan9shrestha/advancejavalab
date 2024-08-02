package userinfo;

import java.awt.*;
import javax.swing.*;

public class UserInfoApp extends JFrame {
    
    public UserInfoApp() {
      
        setTitle("User Information");
        setSize(500, 200); // Adjusted size to fit components better
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png")); // Adjust path if in a subfolder

        
        if (icon.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            System.err.println("Error loading image");
        }

      
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel iconLabel = new JLabel(icon);

     
        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);

       
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(iconLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(nameLabel, gbc); 

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gbc); 
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(emailLabel, gbc); 

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(emailField, gbc);

        
        setVisible(true);
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> new UserInfoApp());
    }
}
