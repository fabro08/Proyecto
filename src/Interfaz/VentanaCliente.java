package Interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Sockets.Cliente;
import Sockets.Server;

public class VentanaCliente extends JFrame implements ActionListener {

	private JLabel Texto;
	private JTextField entradaTexto;
	private JButton BotonBuscar;
	String nomb;
	boolean toca = false;
	
	Cliente cliente = new Cliente();

	public VentanaCliente() {
		super();
		ConfiguracionVentana();
		ComponentesVentana();
	}

	private void ConfiguracionVentana() {
		this.setTitle("​SpiderSearch Engine: Stage 2: Cliente");
		this.setSize(640, 410);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.getContentPane().setBackground(Color.LIGHT_GRAY);
	}

	private void ComponentesVentana() {
		// creamos los componentes
		Texto = new JLabel();
		entradaTexto = new JTextField();
		BotonBuscar = new JButton();
		// configuramos los componentes
		Texto.setText("Inserte el texto a buscar");
		Texto.setBounds(215, 125, 250, 25);
		entradaTexto.setBounds(180, 160, 250, 25);
		BotonBuscar.setText("Search");
		BotonBuscar.setBounds(200, 200, 200, 30);
		BotonBuscar.addActionListener(this);
		// adicionamos los componentes a la ventana
		this.add(Texto);
		this.add(entradaTexto);
		this.add(BotonBuscar);
	}
	public void actionPerformed(ActionEvent e) {
	//	getTexto(envtradaTexto.getText());
		
		cliente.IniciarCliente(entradaTexto.getText());
		
		
		//System.out.println(entradaTexto.getText());
		
	    
	}
		// JOptionPane.showMessageDialog(this, "Hola " + nombre + "."); }
	
	public void getTexto(String text){
		if (text.equals("a")){
			System.out.println("aaaa");
		}
		else{
			System.out.println("bbbbb");
		}
	}

		
	
}