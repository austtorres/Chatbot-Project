package com.JavaBot.demo;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;

/**
 * The GUI of the JavaBot application. This displays the chatbot including the
 * user's input options and the bot's answers.
 * 
 * @author Austin Torres, Aaron Hernandez
 *
 */
@SuppressWarnings("serial")
public class JavaBotGUI extends JFrame {

	public static final Color tempColor = new Color(0x99D3DF);
	public static final Color bottomColor = new Color(0xffa552);

	public JavaBotGUI() {
		super("JavaBot");
		
		// Click X to close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(398, 700);
		
		// Set background with getContentPane
		this.getContentPane().setBackground(tempColor);
		
		// absolute positioning
		this.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.RAISED, SystemColor.activeCaption, SystemColor.textHighlight));
		scrollPane.setBounds(0, 0, 384, 504);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBackground(tempColor);
		scrollPane.setViewportView(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(bottomColor);
		panel.setForeground(SystemColor.activeCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, SystemColor.activeCaption, SystemColor.textHighlight));
		panel.setBounds(0, 503, 384, 159);
		getContentPane().add(panel);
		
		RoundedButton button1 = new RoundedButton("Hello World, I like to drink lots of java while coding this.");
		button1.setForeground(Color.BLACK);
		button1.setBackground(Color.WHITE);
		panel.add(button1);
		
		JButton button2 = new JButton("Two");
		panel.add(button2);
		
		JButton button3 = new JButton("Three");
		panel.add(button3);
	
		// Align window center of screen
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JavaBotGUI();
	}
}
