package gui.controller.tablemodel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import data.model.cat.Cat;

public class CatTableModel extends AbstractTableModel{
	private static final long serialVersionUID = 4028134618621735468L;
	
	List<Cat> catDataList;
	
	public CatTableModel() {
		super();
		catDataList = new ArrayList<Cat>();
	}
	
	
	
	public void setDatos(List<Cat> datos) {
		this.catDataList = datos;
	}

	@Override
	public int getRowCount() {
		return catDataList.size();
	}

	@Override
	public int getColumnCount() {
		return 6;
	}
	
	@Override
	public String getColumnName(int column) {
		
		switch(column) {
		case 0: 
			return "ID";
		case 1:
			return "ChipSerial";
		case 2:
			return "Name";
		case 3: 
			return "Weight";
		case 4:
			return "DOB - Date";
		case 5:
			return "VaccineA - Date";
		}

		return "";

		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		//coge el objeto de la lista
		Cat cat = catDataList.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			return cat.getId();
		case 1:
			return cat.getChipSerial();
		case 2:
			return cat.getName();
		case 3:
			return cat.getWeight();
		case 4:
			return cat.getDob();
		case 5: 
			return cat.getVaccineA();
		default:
			return "";
		}
		
	}
	
	/** Reinicia los datos
	 * 
	 */
	public void clearTable() {
		catDataList = new ArrayList<Cat>();
	}

	
}
