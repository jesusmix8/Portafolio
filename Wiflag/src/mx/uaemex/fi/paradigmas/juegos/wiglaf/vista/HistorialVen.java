package mx.uaemex.fi.paradigmas.juegos.wiglaf.vista;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import mx.uaemex.fi.paradigmas.juegos.wiglaf.control.ControlJuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistorialVen extends JFrame  implements ActionListener {
	private ControlJuego control;
	private JTable tabla;
	public static final String CAD_Guardar = "Guardar";

	public HistorialVen(TableModel m) {
		super("Historial");
		JButton buttonGuardar = new JButton(CAD_Guardar);
		buttonGuardar.setActionCommand(HistorialVen.CAD_Guardar);
		buttonGuardar.addActionListener(this);
		
		tabla = new JTable(m);
		this.add(tabla);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setResizable(false);

	}
	public void setControl(ControlJuego control) {
		this.control = control;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
			case HistorialVen.CAD_Guardar:
				control.g
				break;
		
			default:
				break;
		}
	}
}