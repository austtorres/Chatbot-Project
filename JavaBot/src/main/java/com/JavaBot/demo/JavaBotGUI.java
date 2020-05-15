package com.JavaBot.demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;

/**
 * The GUI of the JavaBot application. This displays the chatbot including the
 * user's input options and the bot's answers.
 * 
 * @author Austin Torres, Aaron Hernandez
 *
 */
@SuppressWarnings("serial")
public class JavaBotGUI extends JFrame {

	private Color bgcolor = new Color(195, 246, 247);

	public JavaBotGUI() {
		super("JavaBot");
		
		// Click X to close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setResizable(false);
		
		// Set background with getContentPane
		this.getContentPane().setBackground(bgcolor);
		
		// absolute positioning
		this.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.RAISED, SystemColor.activeCaption, SystemColor.textHighlight));
		scrollPane.setBounds(334, 47, 322, 368);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(SystemColor.activeCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, SystemColor.activeCaption, SystemColor.textHighlight));
		panel.setBounds(334, 414, 322, 117);
		getContentPane().add(panel);
		
		JTextPane txtpnJavabot = new JTextPane();
		txtpnJavabot.setForeground(new Color(139, 69, 19));
		txtpnJavabot.setBackground(new Color(255, 255, 204));
		txtpnJavabot.setFont(new Font("Corbel", Font.PLAIN, 42));
		txtpnJavabot.setText("JavaBot");
		txtpnJavabot.setEditable(false);
		txtpnJavabot.setBounds(53, 82, 150, 66);
		getContentPane().add(txtpnJavabot);
	
		
		// Align window center of screen
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JavaBotGUI();
	}
}
