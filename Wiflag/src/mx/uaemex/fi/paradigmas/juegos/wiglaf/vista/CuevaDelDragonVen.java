package mx.uaemex.fi.paradigmas.juegos.wiglaf.vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

import mx.uaemex.fi.paradigmas.juegos.wiglaf.control.ControlJuego;

public class CuevaDelDragonVen extends JFrame implements ActionListener {

	public static final String CAD_ATACA = "Ataca";
	public static final String CAD_NIVEL = "Establece";
	public static final String CAD_SALIR = "Salir";
	public static final String CAD_HISTORIAL = "Historial";
	private ControlJuego control;
	private JSpinner ataque;
	private JProgressBar barraAtaqueG;
	private JProgressBar barraDefensaG;
	private JProgressBar barraAtaqueD;
	private JProgressBar barraDefensaD; //Temporal, lo vamos a cambiar
	
	JPanel panelCont= new JPanel();
	JPanel panelFirst = new JPanel();
	JPanel panelSecond = new JPanel();
	JPanel panelThird = new JPanel();

	
	CardLayout c1 = new CardLayout();

	JLabel etqBanner0;
	JLabel etqBanner1;
	JLabel etqBanner2;
	JLabel etqBanner3;

	Icon icono0;
	Icon icono1;
	Icon icono2;
	Icon icono3;



	

	public CuevaDelDragonVen() {
		super("Cueva del dragon");
	
		
		JLabel etqNivel;
		JLabel etqBarraAtaqueG;
		JLabel etqBarraDefensaG;
		JLabel etqBarraAtaqueD;
		JLabel etqBarraDefensaD;
		JLabel etqBanner;
		Icon icono;
		
		JButton btnAtaca;
		JButton btnSetNivel;
		
		
		JPanel panelBarras;
		JPanel panelControles;
		JPanel panelBotones;
		JPanel panelSeleccion;
		JPanel panelMedio;
		JPanel panelBanner;
		Component espacio_1;
		Component espacio_2;
		Component espacio_3;
		Component espacio_4;
		JMenuBar barraMenu;
		
		//Creacion del menu
		barraMenu = new JMenuBar();
		this.setJMenuBar(barraMenu);
		
		JMenu menu = new JMenu("Archivo");
		JMenuItem mItem = new JMenuItem(CuevaDelDragonVen.CAD_SALIR);
		mItem.setActionCommand(CuevaDelDragonVen.CAD_SALIR);
		mItem.addActionListener(this);
		menu.add(mItem);
		barraMenu.add(menu);
		
		menu = new JMenu("Consultar");
		mItem = new JMenuItem(CuevaDelDragonVen.CAD_HISTORIAL);
		mItem.setActionCommand(CuevaDelDragonVen.CAD_HISTORIAL);
		mItem.addActionListener(this);
		menu.add(mItem);
		barraMenu.add(menu);
		
		//Inicializacion de componentes
		ataque = new JSpinner();
		
		etqBanner = new JLabel();
		icono = new ImageIcon("pel.jpeg");
		etqBanner.setIcon(icono);


		etqNivel = new JLabel("Nivel de ataque:");
		etqBarraAtaqueG = new JLabel("Ataque guerrero: ");
		etqBarraDefensaG = new JLabel("Defensa guerrero: ");
		etqBarraAtaqueD = new JLabel("Ataque dragon: ");
		etqBarraDefensaD = new JLabel("Defensa dragon: ");
		
		btnAtaca = new JButton(CuevaDelDragonVen.CAD_ATACA);
		btnAtaca.setActionCommand(CuevaDelDragonVen.CAD_ATACA);
		btnAtaca.addActionListener(this);
		
		btnSetNivel = new JButton(CAD_NIVEL);
		btnSetNivel.setActionCommand(CAD_NIVEL);
		btnSetNivel.addActionListener(this);
		
		barraAtaqueG = new JProgressBar(0,10);
		barraAtaqueG.setStringPainted(true);
		barraDefensaG = new JProgressBar(0,10);
		barraDefensaG.setStringPainted(true);
		barraAtaqueD = new JProgressBar(0,10);
		barraAtaqueD.setStringPainted(true);
		barraDefensaD = new JProgressBar(0,10);
		barraDefensaD.setStringPainted(true);
		
		
		espacio_1 = Box.createRigidArea(new Dimension(2,2));
		espacio_2 = Box.createRigidArea(new Dimension(2,2));
		espacio_3 = Box.createRigidArea(new Dimension(20,20));
		espacio_4 = Box.createRigidArea(new Dimension(20,20));
		
		//Paneles
		panelBarras = new JPanel(new GridLayout(2,5));
		panelBarras.setBorder(new EmptyBorder(5,5,5,5));
		
		panelBarras.add(etqBarraAtaqueG);
		panelBarras.add(barraAtaqueG);
		panelBarras.add(espacio_1);
		panelBarras.add(etqBarraAtaqueD);
		panelBarras.add(barraAtaqueD);
		panelBarras.add(etqBarraDefensaG);
		panelBarras.add(barraDefensaG);
		panelBarras.add(espacio_2);
		panelBarras.add(etqBarraDefensaD);
		panelBarras.add(barraDefensaD);
		
		
		panelBotones = new JPanel(new GridLayout(1,3));
		panelBotones.setBorder(new EmptyBorder(5,5,5,5));
		panelBotones.add(btnSetNivel);
		panelBotones.add(btnAtaca);
		
		panelSeleccion = new JPanel(new GridLayout(1,2));
		panelSeleccion.setBorder(new EmptyBorder(10,10,10,10));
		panelSeleccion.add(etqNivel);
		panelSeleccion.add(ataque);
		
		panelControles = new JPanel(new GridLayout(2,1));
		panelControles.add(panelSeleccion);
		panelControles.add(panelBotones);
		
		panelMedio = new JPanel(new GridLayout(1,2));
		panelMedio.add(panelControles);
		panelCont.setBackground(Color.BLACK);
		//aquiiii
		// 
		
		panelMedio.add(panelCont);
		
		panelBanner = new JPanel(new GridLayout(1,3));
		panelBanner.setBorder(new EmptyBorder(10,10,10,10));
		panelBanner.add(espacio_3);
		panelBanner.add(etqBanner);
		panelBanner.add(espacio_4);
		
		this.getContentPane().add(BorderLayout.NORTH,panelBanner);
		this.getContentPane().add(BorderLayout.CENTER, panelMedio);
		this.getContentPane().add(BorderLayout.SOUTH, panelBarras);
	}
	

	
	
	public void muestraNiveles(int a, int d, char p) {
		if(p=='g') {
			this.barraAtaqueG.setValue(a);
			this.barraDefensaG.setValue(d);
		} else {
			this.barraAtaqueD.setValue(a);
			this.barraDefensaD.setValue(d);
		}
	}
	
	public void setControl(ControlJuego control) {
		this.control = control;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		switch(comando) {
			case CuevaDelDragonVen.CAD_ATACA:
				this.control.pelea();
				break;
			case CuevaDelDragonVen.CAD_NIVEL:
				int v = (Integer) this.ataque.getValue();
				this.control.setNivel(v);
				break;
			case CuevaDelDragonVen.CAD_SALIR:
				System.exit(1);
			case CuevaDelDragonVen.CAD_HISTORIAL:
				this.control.pintahis();
				break;
			default:
				JOptionPane.showMessageDialog(this,"Accion no reconocida");
		}
	}
	
	public void muestraResultado(String f) {

		panelCont.setLayout(c1);

	

		etqBanner1 = new JLabel();
		icono1 = new ImageIcon("gg.jpg");
		etqBanner1.setIcon(icono1);
		
		panelFirst.add(etqBanner1);

		etqBanner2 = new JLabel();
		icono2 = new ImageIcon("perdiste.jpeg");
		etqBanner2.setIcon(icono2);
		panelSecond.add(etqBanner2);

		etqBanner3 = new JLabel();
		icono3 = new ImageIcon("tesp.jpeg");
		etqBanner3.setIcon(icono3);
		
		panelThird.add(etqBanner3);

		panelCont.add(panelFirst, "1");
		panelCont.add(panelThird, "3");
		panelCont.add(panelSecond,"2");

		if(f=="G"){
			c1.show(panelCont, "1");
		}if(f=="E"){
			c1.show(panelCont, "3");
		}if(f=="D"){
			c1.show(panelCont, "2");
		}
	
	}
}
