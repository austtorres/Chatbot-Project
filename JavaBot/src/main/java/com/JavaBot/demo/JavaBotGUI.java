package com.JavaBot.demo;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * The GUI of the JavaBot application. This displays the chatbot including the
 * user's input options and the bot's answers.
 * 
 * @author Austin Torres, Aaron Hernandez
 *
 */
public class JavaBotGUI extends JFrame {

	private Color bgcolor = new Color(195, 246, 247);

	public JavaBotGUI() {
		this.setTitle("JavaBot");
		
		// Click X to close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		
		// Set background with getContentPane
		this.getContentPane().setBackground(bgcolor);
		
		// Align window center of screen
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JavaBotGUI();
	}

}
