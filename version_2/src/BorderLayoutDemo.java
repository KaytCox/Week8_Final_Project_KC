
import javax.swing.*;
import commandProgram.*;
import decorarorCompare.*;
import iteratorCourse.*;
import proxyImage.*;
import java.awt.*;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class BorderLayoutDemo {
    public static boolean RIGHT_TO_LEFT = false;
    
    public static void addComponentsToPane(Container pane) {
        
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("/n"));
            return;
        }
        
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
        
        JButton button = new JButton("School Images");
        pane.add(button, BorderLayout.PAGE_START);
        
        button = new JButton("Descrpition");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);
        
        button = new JButton("Curriculum");
        pane.add(button, BorderLayout.LINE_START);
        
        button = new JButton("Career Outlook");
        pane.add(button, BorderLayout.LINE_END);
    }
    
    private static void createAndShowGUI() {
       
        JFrame frame = new JFrame("Lewis University - Master in Computer Science");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
