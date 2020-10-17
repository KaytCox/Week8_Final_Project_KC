package proxyImage;

import java.net.*;
import javax.swing.*;
import java.util.*;

public class lewisImageFiles {
	imageDetails imageDetails;
	JFrame metaTitle = new JFrame("Lewis University");
	JMenuBar menuBar;
	JMenu siteMenu;
	Hashtable<String, String> logo = new Hashtable<String, String>();

	public static void main (String[] args) throws Exception {
		lewisImageFiles testDrive = new lewisImageFiles();
	}

	public lewisImageFiles() throws Exception {
		logo.put("Lewis Circle Logo","https://cdn.shopify.com/s/files/1/0030/3330/1104/products/LewisUniversityLogo_1200x630.png?v=1549131351");
		logo.put("Flyers Logo","https://www.lewisu.edu/academics/communications/img/lewislogo.png");
		logo.put("Lewis Web Logo","https://collegesofdistinction.com/wp-content/uploads/2018/08/lewis-university-logo.png");

		URL initialURL = new URL((String)logo.get("Lewis Web Logo"));
		menuBar = new JMenuBar();
		siteMenu = new JMenu("ENGINEERING, COMPUTING AND MATHEMATICAL SCIENCES DEPARTMENT");
		menuBar.add(siteMenu);
		metaTitle.setJMenuBar(menuBar);

		for (Enumeration<String> e = logo.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			siteMenu.add(menuItem); 
			menuItem.addActionListener(event -> {
				imageDetails.setIcon(new imageSetUp(getAlbumUrl(event.getActionCommand())));
				metaTitle.repaint();
			});
		}

		// set up metaTitle and menus

		Icon icon = new imageSetUp(initialURL);
		imageDetails = new imageDetails(icon);
		metaTitle.getContentPane().add(imageDetails);
		metaTitle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		metaTitle.setSize(800,600);
		metaTitle.setVisible(true);

	}

	URL getAlbumUrl(String name) {
		try {
			return new URL((String)logo.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}