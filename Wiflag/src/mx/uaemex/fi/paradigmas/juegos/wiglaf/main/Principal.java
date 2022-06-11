package mx.uaemex.fi.paradigmas.juegos.wiglaf.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

import mx.uaemex.fi.paradigmas.juegos.wiglaf.control.ControlJuego;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.error.ValorFueraDeRangoException;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.modelo.Personaje;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.modelo.Record;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.vista.CuevaDelDragonVen;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.vista.HistorialTableModel;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.vista.HistorialVen;

public class Principal {

	
	public static void main(String[] args) {
        FileOutputStream fos;

		
	

		try {
			CuevaDelDragonVen v = new CuevaDelDragonVen();
			HistorialVen vH;
			HistorialTableModel modelo;
			ControlJuego control = new ControlJuego(10);
			Personaje guerrero = new Personaje();
			Personaje dragon = new Personaje();
			Record recD = new Record();
			Record recG = new Record();
			modelo = new HistorialTableModel();
			vH = new HistorialVen(modelo);
			try {
				fos = new FileOutputStream("salida.bin");
				ObjectOutputStream out = new ObjectOutputStream(fos);
				out.writeObject(modelo);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
           
			
			recD.setPersonaje(guerrero);
			recG.setPersonaje(dragon);
			
			control.setEnemigo(dragon);
			control.setGuerrero(guerrero);
			
			v.setControl(control);

			control.setVista(v);
			control.setVHistorial(vH);
			control.setModeloh(modelo);
			
			v.setBounds(10, 10, 200, 300);
			v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			v.pack();
			v.setVisible(true);
		} catch (ValorFueraDeRangoException e) {
			e.printStackTrace();
		}
	}
}
