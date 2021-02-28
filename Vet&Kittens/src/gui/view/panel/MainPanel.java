package gui.view.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;

import gui.controller.ActionCommands;
import gui.controller.VKController;
import gui.view.service.GrowButton;
import gui.view.service.IconService;

import java.awt.Font;

import javax.swing.SwingConstants;
import java.awt.Cursor;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtEdusoftVets;

	public MainPanel(VKController controller) {
		setSize(new Dimension(800, 600));
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setBackground(new Color(0, 51, 51));
		setLayout(null);

		txtEdusoftVets = new JTextField();
		txtEdusoftVets.setBounds(0, 0, 797, 69);
		txtEdusoftVets.setHorizontalAlignment(SwingConstants.CENTER);
		txtEdusoftVets.setFont(new Font("Ink Free", Font.BOLD, 30));
		txtEdusoftVets.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtEdusoftVets.setBackground(SystemColor.textHighlight);
		txtEdusoftVets.setText("Edusoft: VETS & KITTENS");
		add(txtEdusoftVets);
		txtEdusoftVets.setColumns(10);

		
		JLabel lbLogo = new JLabel(IconService.getIconService().loadImage("vetLogo.png"));
		lbLogo.setBounds(182, 186, 440, 286);
		add(lbLogo);

		JButton btnEditCat = new JButton(IconService.getIconService().reSizedIcon(95, 120, "newCat.png"));
		btnEditCat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditCat.addActionListener(controller);
		btnEditCat.setActionCommand(ActionCommands.ALTACAT);
		btnEditCat.setBounds(47, 271, 140, 130);
		add(btnEditCat);
		btnEditCat.addMouseListener(new GrowButton(btnEditCat));

		JButton btnSearchCat = new JButton(IconService.getIconService().reSizedIcon(100, 120, "catSearch.png"));
		btnSearchCat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSearchCat.setBounds(612, 271, 140, 130);
		btnSearchCat.addActionListener(controller);
		btnSearchCat.setActionCommand(ActionCommands.BUSCACAT);
		add(btnSearchCat);
		btnSearchCat.addMouseListener(new GrowButton(btnSearchCat));
		
		JButton btLogOut = new JButton(IconService.getIconService().reSizedIcon(70, 70, "logOut.png"));
		btLogOut.setBackground(new Color(47, 79, 79));
		btLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btLogOut.setBounds(363, 457, 70, 69);
		btLogOut.addActionListener(controller);
		btLogOut.setActionCommand(ActionCommands.LOGOUT);
		add(btLogOut);
		btLogOut.addMouseListener(new GrowButton(btLogOut));
		
		JButton btAbout = new JButton(IconService.getIconService().reSizedIcon(110, 60, "about.png"));
		btAbout.setBackground(new Color(47, 79, 79));
		btAbout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btAbout.setBounds(700, 514, 70, 75);
		btAbout.addActionListener(controller);
		btAbout.setActionCommand(ActionCommands.ABOUT);
		add(btAbout);
		btAbout.addMouseListener(new GrowButton(btAbout));

	}

	
}
