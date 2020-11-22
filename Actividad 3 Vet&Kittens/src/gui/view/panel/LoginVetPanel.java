package gui.view.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

/** Esta pantalla será una ventana modal que permitirá hacer login al veterinario
 *  En la aplicación se mostrará en un lugar fijo quien está logeado y se podrán
 *  dar de alta nuevos gatos
 *  
 * @author Eduardo
 *
 */
public class LoginVetPanel extends JPanel {
	private static final long serialVersionUID = -57347373375207073L;

	public LoginVetPanel() {
		setBackground(Color.ORANGE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("LOGIN VETERINARIOS");
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);

	}

}
