package gui.view.component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import gui.controller.VKController;

public class BasicButton extends JButton implements ActionListener, MouseListener{
	private static final long serialVersionUID = 1L;
	public String link = "https://eduardado.github.io";
	
	public BasicButton(Color color, String text, VKController controller) {
		super(text);
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setBackground(color);
		setContentAreaFilled(false);
		setOpaque(true);
		addActionListener(controller);
		addMouseListener(this);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.ORANGE);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		setBackground(SystemColor.cyan);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setBackground(Color.ORANGE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}



}
