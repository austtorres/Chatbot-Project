package com.JavaBot.demo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import java.awt.Font;

/**
 * Class to create rounded and stylized buttons to be used to input choices made
 * by the user.
 * 
 * @author Austin Torres, Aaron Hernandez
 *
 */
@SuppressWarnings("serial")
public class RoundedButton extends JButton {
	
	Shape shape;

	public RoundedButton(String label) {
		super(label);
		setFont(new Font("Arial", Font.PLAIN, 18));
		
		// TODO: make string fit within button based the panel width
		
		// Remove rectangular shape from background
		setContentAreaFilled(false);
		// Prevent gray outline from appearing when button is clicked
		setFocusable(false);
	}

	protected void paintComponent(Graphics g) {
	  
		if (getModel().isArmed()) {
			g.setColor(JavaBotGUI.tempColor);
		} else {
			g.setColor(getBackground());
		}
		Graphics2D graphics2d = (Graphics2D) g;
		
		// Anti aliasing to make smoother corners
	    graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(getForeground());
		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
	}

	public boolean contains(int x, int y) {
		
		if (shape == null || !shape.getBounds().equals(getBounds())) {
			shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
		}
		
		return shape.contains(x, y);
	}
}
