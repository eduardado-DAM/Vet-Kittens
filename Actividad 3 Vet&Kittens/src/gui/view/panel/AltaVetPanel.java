package gui.view.panel;

import javax.swing.JPanel;


import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

/** Este Panel permitirá crear nuevos usuarios de la aplicación en el futuro. Será necesario hacer Login
 *  en 
 * 
 * @author Eduardo
 *
 */
public class AltaVetPanel extends JPanel {
	private static final long serialVersionUID = 7374330642730624468L;

	public AltaVetPanel() {
		setBackground(new Color(0, 51, 204));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("ALTA/EDICI\u00D3N VETERINARIOS");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
	}
	
	

}
