package mx.uaemex.fi.paradigmas.juegos.wiglaf.control;

import java.util.Random;

import javax.swing.JOptionPane;

import mx.uaemex.fi.paradigmas.juegos.wiglaf.error.ValorFueraDeRangoException;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.modelo.Personaje;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.vista.CuevaDelDragonVen;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.vista.HistorialTableModel;
import mx.uaemex.fi.paradigmas.juegos.wiglaf.vista.HistorialVen;

public class ControlJuego {
	private Random rand;
	private int nivelMaximo;
	private Personaje guerrero; 
	private Personaje enemigo;
	private CuevaDelDragonVen vista;
	private HistorialVen vHistorial;
	private HistorialTableModel modeloh;
	
	
	public void setGuerrero(Personaje guerrero) {
		this.guerrero = guerrero;
	}

	public void setEnemigo(Personaje enemigo) {
		this.enemigo = enemigo;
	}

	public void setVHistorial(HistorialVen v) {
		this.vHistorial = v;
	}

	public void setModeloh(HistorialTableModel modeloh) {
		this.modeloh = modeloh;
	}

	public void pintahis(){
		this.vHistorial.setVisible(true);
	}

	
	public void voidguardar(){

	}
	public void setVista(CuevaDelDragonVen v) {
		this.vista = v;
	}
	
	public void setNivel(int n) {
		int v;
		this.guerrero.setAtaque(n);
		try {
			int d = this.calculaDefensa(n);
			this.guerrero.setDefensa(d);
			this.vista.muestraNiveles(n, d, 'g');
			//Poner los niveles del dragon
			v = this.rand.nextInt(this.nivelMaximo);
			this.enemigo.setAtaque(v);
			d = this.calculaDefensa(v);
			this.enemigo.setDefensa(d);
			this.vista.muestraNiveles(v, d, 'd');
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Valor de ataque fuera de rango");
		}
	}
	
	public ControlJuego(int max) throws ValorFueraDeRangoException{
		if(max<1) {
			throw new ValorFueraDeRangoException();
		} else {
			this.nivelMaximo = max;
			this.rand = new Random();
		}
	}
	


	public int calculaDefensa(int ataque) throws ValorFueraDeRangoException{
		if(ataque > this.nivelMaximo || ataque < 1) {
			throw new ValorFueraDeRangoException("El maximo valor de ataque es "
		           + this.nivelMaximo + " y el valor minimo es 1");
		}
		int maximo = this.nivelMaximo + 2 - ataque;
		return this.rand.nextInt(maximo);
	}
	
	public void pelea() {
		int resGuerrero = this.guerrero.getAtaque() - this.enemigo.getDefensa();
		int resDragon = this.enemigo.getAtaque() - this.guerrero.getDefensa();
		
		if(resGuerrero > resDragon) {
			int perdidos=(Integer)this.modeloh.getValueAt(1, 2);
			perdidos++;
			this.modeloh.setValueAt(perdidos, 1, 2);
			int ganados=(Integer)this.modeloh.getValueAt(0, 1);
			ganados++;
			this.modeloh.setValueAt(ganados, 0, 1);

			this.vista.muestraResultado("G");
		} else if(resGuerrero < resDragon) {
			int perdidos=(Integer)this.modeloh.getValueAt(0, 2);
			perdidos++;
			this.modeloh.setValueAt(perdidos, 0, 2);
			int ganados=(Integer)this.modeloh.getValueAt(1, 1);
			ganados++;
			this.modeloh.setValueAt(ganados, 1, 1);

			this.vista.muestraResultado("D");
		} else {
			this.vista.muestraResultado("E");
		}
	}
}
