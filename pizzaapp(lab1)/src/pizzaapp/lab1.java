package pizzaapp;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class lab1 extends Frame {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



lab1() {
       setTitle("Rocky Woodfired Pizzas Management System");
       setVisible(true);
       setSize(800, 800);
       setLayout(new BorderLayout());
       
       Label titleLbl = new Label("Rocky Wood Pizzas Maangement System");
       Panel firstPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       Panel secondPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       Panel thirdPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       Panel lastPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       
       Panel gridPanel = new Panel(new GridLayout(3, 1));
       
       Font font = titleLbl.getFont();
       titleLbl.setFont(new Font(null, Font.BOLD, 18));
       firstPanel.add(titleLbl);
       
       Label cusNameLbl = new Label("Customer Name");
       TextField cusNameTxt = new TextField();
       cusNameTxt.setPreferredSize(new Dimension(300, 20));
       
       secondPanel.add(cusNameLbl);
       secondPanel.add(cusNameTxt);
       
       Label toppingsLbl = new Label("Number of Toppings");
       TextField toppingsTxt = new TextField();
       toppingsTxt.setPreferredSize(new Dimension(300, 20));
       
       CheckboxGroup chkgrp = new CheckboxGroup();
       Checkbox smallChk = new Checkbox("Small", chkgrp, false);
       Checkbox mediumChk = new Checkbox("Medium", chkgrp, false);
       Checkbox largeChk = new Checkbox("Large", chkgrp, false);
       
       thirdPanel.add(toppingsLbl);
       thirdPanel.add(toppingsTxt);
       thirdPanel.add(smallChk);
       thirdPanel.add(mediumChk);
       thirdPanel.add(largeChk);
       
       gridPanel.add(firstPanel);
       gridPanel.add(secondPanel);
       gridPanel.add(thirdPanel);
       
       
       TextArea descTxtArea = new TextArea();
       descTxtArea.setRows(5);
       
       Button enterBtn = new Button("Enter");
       Button displayAllBtn = new Button("Display All");
       Button searchBtn = new Button("Search");
       Button exitBtn = new Button("Exit");
       
       lastPanel.add(enterBtn);
       lastPanel.add(displayAllBtn);
       lastPanel.add(searchBtn);
       lastPanel.add(exitBtn);

       
       add(gridPanel, BorderLayout.NORTH);
       add(descTxtArea, BorderLayout.CENTER);
       add(lastPanel, BorderLayout.SOUTH);
       
       
       addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent event) {
               dispose();
           }
       });
   }
   
   
   
   public static void main(String args[]) {
       lab1 lab = new lab1();
   }
}