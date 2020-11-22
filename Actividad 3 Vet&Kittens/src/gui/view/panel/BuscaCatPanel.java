package gui.view.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePickerImpl;

import gui.controller.ActionCommands;
import gui.controller.VKController;
import gui.view.component.JFocusField;
import gui.view.component.JNumberField;
import gui.view.component.datepicker.JDatePicker;
import gui.view.service.GrowButton;
import gui.view.service.IconService;

import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import java.awt.Cursor;

public class BuscaCatPanel extends JPanel {
	private static final long serialVersionUID = -57347373375207073L;

	// INPUT DEL USUARIO
	private JNumberField tfID;
	public JFocusField tfName;
	private JNumberField tfChipSerial;
	private JNumberField tfWeight;
	private JDatePickerImpl vaccineDatePicker;
	private JDatePickerImpl dobDatePicker;

	private JTable table; // muestra consultas
	private JLabel lbInfo; // informa al usuario del estado de la aplicación

	public BuscaCatPanel(VKController controller) {

		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.ORANGE);
		setLayout(null);

		lbInfo = new JLabel(">");
		lbInfo.setOpaque(true);
		lbInfo.setHorizontalAlignment(SwingConstants.LEFT);
		lbInfo.setFont(new Font("Miriam Libre", Font.ITALIC, 24));
		lbInfo.setBackground(new Color(0, 128, 128));
		lbInfo.setBounds(87, 330, 621, 33);
		add(lbInfo);

		JLabel lbName = new JLabel("Name");
		lbName.setToolTipText("Preg\u00FAntale a tu gato c\u00F3mo se llama");
		lbName.setBackground(new Color(0, 128, 128));
		lbName.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbName.setHorizontalAlignment(SwingConstants.CENTER);
		lbName.setOpaque(true);
		lbName.setBounds(85, 266, 110, 35);
		add(lbName);

		tfName = new JFocusField();
		tfName.setBounds(202, 266, 110, 35);
		add(tfName);
		tfName.setColumns(10);

		JLabel lbCabeceraBuscaGato = new JLabel("CAT SEARCH");
		lbCabeceraBuscaGato.setBackground(new Color(0, 128, 128));
		lbCabeceraBuscaGato.setOpaque(true);
		lbCabeceraBuscaGato.setFont(new Font("Miriam Libre", Font.ITALIC, 30));
		lbCabeceraBuscaGato.setHorizontalAlignment(SwingConstants.CENTER);
		lbCabeceraBuscaGato.setBounds(207, 40, 525, 91);
		add(lbCabeceraBuscaGato);

		JLabel lbChipSerial = new JLabel("Chip Serial");
		lbChipSerial.setToolTipText("N\u00FAmero");
		lbChipSerial.setBackground(new Color(0, 128, 128));
		lbChipSerial.setOpaque(true);
		lbChipSerial.setHorizontalAlignment(SwingConstants.CENTER);
		lbChipSerial.setFont(new Font("Miriam Libre", Font.PLAIN, 18));
		lbChipSerial.setBounds(85, 210, 107, 33);
		add(lbChipSerial);

		JLabel lbID = new JLabel("ID");
		lbID.setBackground(new Color(0, 128, 128));
		lbID.setToolTipText("N\u00FAmero de registro");
		lbID.setOpaque(true);
		lbID.setHorizontalAlignment(SwingConstants.CENTER);
		lbID.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbID.setBounds(85, 154, 107, 33);
		add(lbID);

		tfChipSerial = new JNumberField();
		tfChipSerial.setColumns(10);
		tfChipSerial.setBounds(202, 210, 110, 35);
		add(tfChipSerial);

		tfID = new JNumberField();
		tfID.setColumns(10);
		tfID.setBounds(202, 154, 110, 35);
		add(tfID);

		JLabel lbWeight = new JLabel("Weight");
		lbWeight.setBackground(new Color(0, 128, 128));
		lbWeight.setToolTipText("ej: 4.5");
		lbWeight.setOpaque(true);
		lbWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lbWeight.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbWeight.setBounds(479, 154, 107, 33);
		add(lbWeight);

		// CALENDARIO VACUNA
		JLabel lbVaccine = new JLabel("Vaccine A");
		lbVaccine.setBackground(new Color(0, 128, 128));
		lbVaccine.setOpaque(true);
		lbVaccine.setHorizontalAlignment(SwingConstants.CENTER);
		lbVaccine.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbVaccine.setBounds(479, 266, 110, 35);
		add(lbVaccine);

		vaccineDatePicker = new JDatePicker().getJDatePicker();
		vaccineDatePicker.setBounds(596, 266, 110, 35);
		add(vaccineDatePicker);

		// CALENDARIO FECHA DE NACIMIENTO
		JLabel lbAge = new JLabel("DOB");
		lbAge.setBackground(new Color(0, 128, 128));
		lbAge.setOpaque(true);
		lbAge.setHorizontalAlignment(SwingConstants.CENTER);
		lbAge.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		lbAge.setBounds(479, 210, 107, 33);
		add(lbAge);

		dobDatePicker = new JDatePicker().getJDatePicker();
		dobDatePicker.setBounds(596, 210, 110, 35);
		add(dobDatePicker);

		// PESO
		tfWeight = new JNumberField();
		tfWeight.setColumns(10);
		tfWeight.setBounds(596, 154, 110, 35);
		add(tfWeight);

		// PANEL CON SCROLL PARA LA TABLA
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 391, 621, 175);
		add(scrollPane);

		// TABLA
		table = new JTable(controller.catTableModel);
		scrollPane.setViewportView(table);

		// BOTÓN USABILIDAD PARA VOLVER AL MENU PRINCIPAL
		JButton btBackToMain = new JButton(IconService.getIconService().reSizedIcon(95, 60, "vetLogo.png")); // cargo un icono reescalándolo
		btBackToMain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btBackToMain.setMargin(new Insets(0, 0, 0, 0));
		btBackToMain.setOpaque(true);
		btBackToMain.setHorizontalAlignment(SwingConstants.LEFT);
		btBackToMain.setFont(new Font("Miriam Libre", Font.ITALIC, 30));
		btBackToMain.setBackground(new Color(0, 128, 128));
		btBackToMain.setBounds(85, 40, 95, 91);
		btBackToMain.addActionListener(controller);
		btBackToMain.setActionCommand(ActionCommands.BACK_TO_MAIN);
		btBackToMain.addMouseListener(new GrowButton(btBackToMain));
		add(btBackToMain);

		// BOTÓN DE BÚSQUEDA
		JButton btnBusqueda = new JButton("SEARCH");
		btnBusqueda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBusqueda.addActionListener(controller);
		btnBusqueda.setActionCommand(ActionCommands.CONSULTA_TABLA_CAT);
		btnBusqueda.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		btnBusqueda.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 139, 139), new Color(0, 139, 139)));
		btnBusqueda.setBackground(new Color(255, 255, 255));
		btnBusqueda.setBounds(343, 210, 110, 35);
		add(btnBusqueda);

		// BOTÓN PARA RESETEAR LA BÚSQUEDA
		JButton btnReset = new JButton("RESET");
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.addActionListener(controller);
		btnReset.setActionCommand(ActionCommands.RESET_CAT_VIEW);
		btnReset.setFont(new Font("Miriam Libre", Font.PLAIN, 20));
		btnReset.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 139, 139), new Color(0, 139, 139)));
		btnReset.setBackground(Color.WHITE);
		btnReset.setBounds(342, 265, 110, 35);
		add(btnReset);

	}

	public JDatePickerImpl getVaccineDatePicker() {
		return vaccineDatePicker;
	}

	public JDatePickerImpl getDobDatePicker() {
		return dobDatePicker;
	}

	public JLabel getLbInfo() {
		return lbInfo;
	}

	public void setLbInfo(JLabel lbInfo) {
		this.lbInfo = lbInfo;
	}

	public JTextField getTfName() {
		return tfName;
	}

	public JTextField getTfChipSerial() {
		return tfChipSerial;
	}

	public JTextField getTfID() {
		return tfID;
	}

	public JTextField getTfWeight() {
		return tfWeight;
	}

}
