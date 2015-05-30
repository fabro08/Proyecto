package Sockets;

import java.net.*;
import java.io.*;

import org.apache.poi.ss.formula.functions.IPMT;
import org.aspectj.lang.reflect.CatchClauseSignature;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;

public class Cliente {
	Socket cliente;
	int puerto = 9000;
	String ip = "localhost";
	BufferedReader entrada,teclado;
	PrintStream salida;
	public void IniciarCliente(){
		try{
			cliente = new Socket(ip,puerto);
			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			teclado = new BufferedReader(new InputStreamReader(System.in));
			String tec = teclado.readLine();
			salida = new PrintStream(cliente.getOutputStream());
			salida.println(tec);
			
			String msg = entrada.readLine();		
			System.out.println(msg);
			
			entrada.close();
			//teclado.close();
			salida.close();
			cliente.close();
			
		}
		catch(Exception e){
		}
	}
	
}
	