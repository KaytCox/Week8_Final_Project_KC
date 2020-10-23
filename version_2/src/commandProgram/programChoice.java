package commandProgram;

import java.awt.*;
import javax.swing.*;
    
public class programChoice {
    JFrame frame;
    JPanel panel;
    
    public static void main(String[] args) {
        programChoice example = new programChoice();
        example.go();
    }
    
    public void go() {
        frame = new JFrame();
        panel = new JPanel();

        JButton csButton = new JButton("Computer Science, M.S.");
        JButton dsButton = new JButton("Data Science, M.S.");
        JButton cButton = new JButton("Cybersecurity, M.S.");
        
        JLabel program = new JLabel("program");
        program.setOpaque(true);
        program.setBackground(Color.LIGHT_GRAY);
        
        csButton.addActionListener(event -> 
        	program.setBackground(Color.YELLOW)
        );
        dsButton.addActionListener(event -> 
        	program.setBackground(Color.RED)
        );
        cButton.addActionListener(event -> 
        	program.setBackground(Color.MAGENTA)
        );

        frame.setContentPane(panel);
        panel.add(csButton);
        panel.add(program);
        panel.add(dsButton);
        panel.add(cButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}