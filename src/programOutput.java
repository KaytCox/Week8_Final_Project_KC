
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

public class programOutput {

    public static void main(String[] args) throws Exception {
        JFrame frame= new JFrame("Lewis University");
        JPanel panel= new JPanel(new GridBagLayout());
        JPanel imagePanel= new JPanel();
        GridBagConstraints c = new GridBagConstraints();
    	JMenuBar menuBar = new JMenuBar();
    	JMenu siteMenu = new JMenu("Select an Image");    
    	
        programChoice example = new programChoice();
        lewisImageFiles testDrive = new lewisImageFiles();
        example.go(frame, panel, c);
        testDrive.publicImages(frame, menuBar, siteMenu, imagePanel);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.getContentPane();
        frame.pack();
        frame.setVisible(true);
    }


    

}
