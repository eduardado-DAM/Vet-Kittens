package gui.view.panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePickerImpl;

import gui.controller.ActionCommands;
import gui.controller.VKController;
import gui.view.component.JFloatNumberField;
import gui.view.component.JFocusField;
import gui.view.component.JNumberField;
import gui.view.component.datepicker.JDatePicker;
import gui.view.service.GrowButton;
import gui.view.service.IconService;

public class AltaCatPanel extends JPanel {

	private static final long serialVersionUID = 7374330642730624468L;

	// INPUTS DEL USUARIO
	private JNumberField tfChipSerial;
	public  JFocusField ffName;
	private JFloatNumberField nfWeight;
	private JDatePickerImpl vaccineaDatePicker; // Calendario de vacunación
	private JDatePickerImpl dobDatePicker; // Calendario de fecha de nacimiento

	private JLabel lbInfo; // para informar al usuario
	private JButton btVolver; // Botón para volver al menú principal

	// GETTERS & SETTERS
	public JLabel getLbInfo() {
		return lbInfo;
	}

	public JDatePickerImpl getDobDatePicker() {
		return dobDatePicker;
	}

	public JDatePickerImpl getVaccineDatePicker() {
		return vaccineaDatePicker;
	}

	public JFocusField getTfName() {
		return ffName;
	}

	public JNumberField getTfChipSerial() {
		return tfChipSerial;
	}

	public JNumberField getTfWeight() {
		return nfWeight;
	}

	// CONSTRUCTOR
	public AltaCatPanel(VKController controller) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(new Color(0, 128, 128));
		setLayout(null);

		// BANNER PRINCIPAL
		JLabel lbCabeceraBuscaGato = new JLabel("CAT REGISTRY");
		lbCabeceraBuscaGato.setBackground(Color.ORANGE);
		lbCabeceraBuscaGato.setOpaque(true);
		lbCabeceraBuscaGato.setFont(new Font("Miriam Libre", Font.ITALIC, 30));
		lbCabeceraBuscaGato.setHorizontalAlignment(SwingConstants.CENTER);
		lbCabeceraBuscaGato.setBounds(197, 40, 533, 91);
		add(lbCabeceraBuscaGato);

		// NÚMERO DE SERIE DEL CHIP
		JLabel lbChipSerial = new JLabel("Chip Serial");
		lbChipSerial.setToolTipText("Number. eg. 1234567");
		lbChipSerial.setBackground(Color.ORANGE);
		lbChipSerial.setOpaque(true);
		lbChipSerial.setHorizontalAlignment(SwingConstants.CENTER);
		lbChipSerial.setFont(new Font("Miriam Libre", Font.PLAIN, 18));
		lbChipSerial.setBounds(85, 223, 107, 33);
		add(lbChipSerial);

		tfChipSerial = new JNumberField(Color.orange);
		tfChipSerial.setEditable(true);
		tfChipSerial.setColumns(10);
		tfChipSerial.setBounds(202, 223, 110, 35);
		add(tfChipSerial);

		// NOMBRE
		JLabel lbName = new JLabel("Name");
		lbName.setToolTipText("Ask you cat");
		lbName.setBackground(Color.ORANGE);
		lbName.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbName.setHorizontalAlignment(SwingConstants.CENTER);
		lbName.setOpaque(true);
		lbName.setBounds(85, 279, 110, 35);
		add(lbName);

		ffName = new JFocusField(Color.orange); // focus naranja para para distinguirlo del fondo verde
		ffName.setBounds(202, 279, 110, 35);
		add(ffName);
		ffName.setColumns(10);

		// PESO
		JLabel lbWeight = new JLabel("Weight");
		lbWeight.setBackground(Color.ORANGE);
		lbWeight.setToolTipText("Kg: eg. 4.55");
		lbWeight.setOpaque(true);
		lbWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lbWeight.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbWeight.setBounds(479, 197, 107, 33);
		add(lbWeight);

		nfWeight = new JFloatNumberField(Color.orange); // borde focus naranja
		nfWeight.setColumns(10);
		nfWeight.setLimit(6); // 6 cifras máximo
		nfWeight.setBounds(596, 197, 110, 35);
		add(nfWeight);

		// CALENDARIO VACUNA
		JLabel lbVaccine = new JLabel("Vaccine A");

		lbVaccine.setBackground(Color.ORANGE);
		lbVaccine.setOpaque(true);
		lbVaccine.setHorizontalAlignment(SwingConstants.CENTER);
		lbVaccine.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbVaccine.setBounds(479, 309, 110, 35); 
		add(lbVaccine);

		vaccineaDatePicker = new JDatePicker().getJDatePicker();
		vaccineaDatePicker.setBounds(596, 309, 110, 35); // bug desaparece en el modo diseño
		add(vaccineaDatePicker);

		// CALENDARIO FECHA DE NACIMIENTO
		JLabel lbDOB = new JLabel("DOB");
		lbDOB.setToolTipText("Date of Birth");
		lbDOB.setBackground(Color.ORANGE);
		lbDOB.setOpaque(true);
		lbDOB.setHorizontalAlignment(SwingConstants.CENTER);
		lbDOB.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbDOB.setBounds(479, 253, 107, 33); // bug desaparece en el modo diseño
		add(lbDOB);

		dobDatePicker = new JDatePicker().getJDatePicker();
		dobDatePicker.setBounds(596, 253, 110, 35);
		add(dobDatePicker);

		// INFORMACIÓN PARA EL USUARIO
		lbInfo = new JLabel(">");
		lbInfo.setVerticalAlignment(SwingConstants.TOP);
		lbInfo.setOpaque(true);
		lbInfo.setHorizontalAlignment(SwingConstants.LEFT);
		lbInfo.setFont(new Font("Miriam Libre", Font.ITALIC, 24));
		lbInfo.setBackground(Color.ORANGE);
		lbInfo.setBounds(85, 393, 621, 155);
		add(lbInfo);

		// BOTÓN PARA VOLVER AL MENÚ PRINCIPAL
		btVolver = new JButton(IconService.getIconService().reSizedIcon(95, 60, "vetLogo.png"));
		btVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btVolver.setMargin(new Insets(0, 0, 0, 0));
		btVolver.setOpaque(true);
		btVolver.setHorizontalAlignment(SwingConstants.LEFT);
		btVolver.setFont(new Font("Miriam Libre", Font.ITALIC, 30));
		btVolver.setBackground(Color.ORANGE);
		btVolver.setBounds(85, 40, 95, 91);
		btVolver.addActionListener(controller);
		btVolver.addMouseListener(new GrowButton(btVolver));
		btVolver.setActionCommand(ActionCommands.BACK_TO_MAIN);
		add(btVolver);

		// BOTÓN REGISTRAR
		JButton btnAlta = new JButton("REGISTER");
		btnAlta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlta.addActionListener(controller);
		btnAlta.setActionCommand(ActionCommands.INSERT);

		btnAlta.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		btnAlta.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 139, 139), new Color(0, 139, 139)));
		btnAlta.setBackground(new Color(255, 255, 255));
		btnAlta.setBounds(342, 252, 110, 35);
		add(btnAlta);

	}

}
