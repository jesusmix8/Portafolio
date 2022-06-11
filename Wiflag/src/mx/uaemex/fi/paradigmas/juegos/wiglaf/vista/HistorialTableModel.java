package mx.uaemex.fi.paradigmas.juegos.wiglaf.vista;

import java.io.Serializable;

import javax.swing.table.AbstractTableModel;

import mx.uaemex.fi.paradigmas.juegos.wiglaf.modelo.Personaje;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.modelo.Record;

public class HistorialTableModel extends AbstractTableModel implements Serializable {
	private String nombresColumnas[] = {"Personaje","Ganados","Perdidos"};
	private Record[] records;
	
	
	public HistorialTableModel() {
		Personaje p;
		Record r;
		
		this.records = new Record[2];
		p = new Personaje();
		p.setNombre("Guerrero");
		r = new Record();
		r.setGanados(0);
		r.setPerdidos(0);
		r.setPersonaje(p);
		this.records[0] = r;
		
		p = new Personaje();
		p.setNombre("Dragon");
		r = new Record();
		r.setGanados(0);
		r.setPerdidos(0);
		r.setPersonaje(p);
		this.records[1] = r;
	}
	
	@Override
	public String getColumnName(int column) {
		return this.nombresColumnas[column];
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public int getRowCount() {
		return this.records.length;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
			case 0:
				return this.records[rowIndex].getPersonaje().getNombre();
			case 1:
				return this.records[rowIndex].getGanados();
			case 2:
				return this.records[rowIndex].getPerdidos();
			default:
				return null;
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if(columnIndex==1 || columnIndex==2) {
			int v = (Integer) aValue;
			if(columnIndex==1) {
				this.records[rowIndex].setGanados(v);
			} else {
				this.records[rowIndex].setPerdidos(v);
			}
		} 
	}
}