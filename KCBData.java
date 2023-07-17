package kcb;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KCBData implements TableModel {
	private String[] title = {
			"monday","tuesday","wednesday","thursday","friday","saterday","sunday"
	};
	
	private String[][] data = new String[8][7];
	
	public KCBData() {
		for( int i=0;i<data.length;i++) {
			for (int j=0;j<data[i].length;j++) {
				data[i][j] = " ";
			}
		}
	}
	
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return title[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		data[rowIndex][columnIndex] = (String)aValue;
	}

	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
