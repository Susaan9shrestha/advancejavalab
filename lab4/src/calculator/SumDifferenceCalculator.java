package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SumDifferenceCalculator extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField numberField1;
    private JTextField numberField2;
    private JLabel resultLabel;

    public SumDifferenceCalculator() {
       
        setTitle("Sum and Difference Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2)); 

        
        JLabel numberLabel1 = new JLabel("Number 1:");
        JLabel numberLabel2 = new JLabel("Number 2:");
        numberField1 = new JTextField();
        numberField2 = new JTextField();
        resultLabel = new JLabel("Result will be displayed here");

        
        add(numberLabel1);
        add(numberField1);
        add(numberLabel2);
        add(numberField2);
        add(new JLabel("")); 
        add(resultLabel);

       
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });

       
        setVisible(true);
    }

    
    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(numberField1.getText());
            double num2 = Double.parseDouble(numberField2.getText());
            double sum = num1 + num2;
            resultLabel.setText("Sum: " + sum);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

   
    private void calculateDifference() {
        try {
            double num1 = Double.parseDouble(numberField1.getText());
            double num2 = Double.parseDouble(numberField2.getText());
            double difference = num1 - num2;
            resultLabel.setText("Difference: " + difference);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(() -> new SumDifferenceCalculator());
    }
}
