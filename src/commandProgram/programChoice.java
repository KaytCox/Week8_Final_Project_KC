package commandProgram;

import java.awt.*;
import iteratorCourse.courseInfo;
import decorarorCompare.*;
import javax.swing.*;
    
public class programChoice{
    JFrame programFrame;
    JPanel programPanel;
    JLabel text;
    
    public static void main(String[] args) {
        programChoice example = new programChoice();
        //example.go();
    }
    
    public void go(JFrame frame, JPanel panel, GridBagConstraints c) {
        programFrame = new JFrame();
        programPanel = new JPanel();
        text = new JLabel(" ");
        programFrame.setContentPane(programPanel);
        programPanel.add(text);
        programCompare pc= new programCompare();
        System.out.println(pc.getCs());
        System.out.println(pc.getDs());
        courseInfo cc= new courseInfo();
        System.out.println(cc.getCc());

        JButton csButton = new JButton("Computer Science, M.S.");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(csButton, c);
        
        JButton dsButton = new JButton("Data Science, M.S.");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(dsButton, c);
        
        JButton cButton = new JButton("Programs Courses");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        panel.add(cButton, c);
        
        
        //JLabel program = new JLabel("program");
        //program.setOpaque(true);
        //program.setBackground(Color.LIGHT_GRAY);
        
        csButton.addActionListener(event -> 
        	//program.setBackground(Color.YELLOW));
        	writeToPanel(pc.getCs())
        );
        	
        dsButton.addActionListener(event -> 
        //	program.setBackground(Color.RED)
        	writeToPanel(pc.getDs())
        );
        cButton.addActionListener(event -> 
        //	program.setBackground(Color.MAGENTA)
        	writeToPanel(cc.getCc())
        );

        frame.setContentPane(panel);
        //frame.getContentPane().add(panel);
        //panel.add(csButton);
        //panel.add(program);
       // panel.add(dsButton);
        //panel.add(cButton);
        
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        programFrame.setSize(500,500);
        //frame.setVisible(true);
    }
    
    public void writeToPanel(String pressButton) {
    	text.setText(pressButton);
    	programFrame.setVisible(true);
    }
    
}