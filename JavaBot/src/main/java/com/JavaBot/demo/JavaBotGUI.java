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
import javax.swing.JTextArea;

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
	private Color tempColor = new Color(0x4484ce);

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
		scrollPane.setBackground(tempColor);
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.RAISED, SystemColor.activeCaption, SystemColor.textHighlight));
		scrollPane.setBounds(0, 0, 384, 504);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(SystemColor.activeCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, SystemColor.activeCaption, SystemColor.textHighlight));
		panel.setBounds(0, 503, 384, 159);
		getContentPane().add(panel);
	
		// Align window center of screen
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JavaBotGUI();
	}
}
