package temperatureconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TemperatureConverterApp extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField celsiusField;
    private JTextField fahrenheitField;

    public TemperatureConverterApp() {
        
        setTitle("Celsius to Fahrenheit Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns

        
        JLabel celsiusLabel = new JLabel("Celsius:");
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        celsiusField = new JTextField();
        fahrenheitField = new JTextField();
        fahrenheitField.setEditable(false); 

        
        add(celsiusLabel);
        add(celsiusField);
        add(fahrenheitLabel);
        add(fahrenheitField);

        
        celsiusField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                convertTemperature();
            }
        });

       
        setVisible(true);
    }

    
    private void convertTemperature() {
        try {
            
            String celsiusText = celsiusField.getText();
            if (celsiusText.isEmpty()) {
                fahrenheitField.setText("");
                return;
            }

            double celsius = Double.parseDouble(celsiusText);
            double fahrenheit = (celsius * 9 / 5) + 32;

            
            fahrenheitField.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException e) {
           
            fahrenheitField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(() -> new TemperatureConverterApp());
    }
}
