import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;


public class Lesson {
	static JFrame frame;
	static Container pane;
	static JPanel panel, panel2;
	static JLabel intro, prompt;
	static JButton startBtn;
	static Dimension screenSize;

	public static void main(String[] args) {
		//preparing the frame
		frame = new JFrame("Choose Your Own Adventure Game");
//		frame.setSize(500,500);
		pane = frame.getContentPane(); //getting content pane
		pane.setLayout(null); //applying null layout
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeFrameFullSize(frame);

		//make frame visible
		frame.setResizable(true);
		frame.setVisible(true);

		//creating controls
		panel = new JPanel(null);
		intro = new JLabel("Welcome to the game!");
		startBtn = new JButton("start!");

		//add controls to the container
		pane.add(panel);
		panel.add(intro);
		panel.add(startBtn);

		//setting bounds
		panel.setBounds(0, 0, screenSize.width, screenSize.height);
		intro.setBounds(50, 50, 200, 200);
		startBtn.setBounds(100, 100, 50, 20);

		//background
		//		panel.setBackground(Color.blue);

		//action listener
		startBtn.addActionListener(new startBtnActionListener());
	}
	
	private static void makeFrameFullSize(JFrame aFrame) {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		aFrame.setSize(screenSize.width, screenSize.height);
	}

	static class startBtnActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panel.setVisible(false); //make panel1 disappear
			//creating control
			panel2 = new JPanel(null);
			prompt = new JLabel("here is the story: ");

			pane.add(panel2);
			panel2.add(prompt);

			//set bounds
			panel2.setBounds(0, 0, 500, 500);
			prompt.setBounds(50, 50, 200, 200);
		}

	}
}


/*
 * 1. startBtnActionListener same class as Lesson
 * 2. create jbutton for start - creating controls
 * 3. instead of pane (the container) replace it with panel when adding the intro and startBtn components
 * 4. set bounds for the panel
 * 5. inside the startBtnActionListener: 
 * 	panel1 should be set to false
 * 	create panel2, create control for it, add it to the pane (container), setBounds to it, add any of its components
 * 6. If time permits: to use screenSize instead of numbers. for that the make frame full size 
 * 
 * 1. import java.awt.Dimension and import java.awt.Toolkit;
 * 2. variable - static Dimension screenSize
 * 3. create method:
 * //make the frame fill the full size of the screen
	private static void makeFrameFullSize(JFrame aFrame) {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		aFrame.setSize(screenSize.width/2, screenSize.height/2);
	}
 * 4. comment frame.setSize(500,500) and add makeFrameFullSize(frame);
 * 5. add screenSize.width and screenSize.height instead of numbers for setBounds

 * 
 */
//import javax.swing.*;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Lesson {
//	static JFrame frame;
//	static Container pane;
//	static JPanel panel, panel2;
//	static JLabel intro, prompt;
//	static JButton startBtn, optionBtn;
//	static Dimension screenSize;
//
//	public static void main(String[] args) {
//		//preparing the frame
//		frame = new JFrame("Choose Your Own Adventure Game");
//		frame.setSize(500,500);
//		pane = frame.getContentPane(); //getting content pane
//		pane.setLayout(null); //applying null layout
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		//make frame visible
//		frame.setResizable(false);
//		frame.setVisible(true);
//
//		//creating controls
//		panel = new JPanel(null);
//		intro = new JLabel("Welcome to the game!");
//		startBtn = new JButton("start");
//
//		//add controls
//		pane.add(panel);
//		panel.add(intro);
//		panel.add(startBtn);
//
//		//setting bounds
//		panel.setBounds(0, 0, 500, 500);
//		intro.setBounds(50, 50, 200, 200);
//		startBtn.setBounds(100, 100, 100, 20);
//
//		//action listener
//		startBtn.addActionListener(new startBtnActionListener());
//		
//		
//	}
//	//make the frame fill the full size of the screen
//	private static void makeFrameFullSize(JFrame aFrame) {
//		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		aFrame.setSize(screenSize.width, screenSize.height);
//	}
//
//
//
//	static class startBtnActionListener implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			panel.setVisible(false);
//			panel2 = new JPanel(null);
//			pane.add(panel2);
//			panel2.setBounds(0,0,500,500);
//			prompt = new JLabel("which option do you choose");
//			optionBtn = new JButton("option 1");
//			
//			panel2.add(prompt);
////			panel2.add(optionBtn);
//			
//			prompt.setBounds(50, 50, 200, 200);
//			
//		}
//	}
//}
//	
