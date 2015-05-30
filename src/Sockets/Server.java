package Sockets;

import java.net.*;
import java.io.*;

public class Server {
	ServerSocket server;
	Socket socket;
	int puerto = 9000;
	DataOutputStream salida;
	BufferedReader entrada;
	
	public void Inciar(){
		try{
			server = new ServerSocket(puerto);
			
			socket = new Socket();
			System.out.println("esperando");
			socket = server.accept();
			System.out.println("cliente conectado");
			
			entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String mensaje = entrada.readLine();
			System.out.println(mensaje);
			salida = new DataOutputStream(socket.getOutputStream());
			salida.writeUTF("Adios mundo");
			System.out.println("cliente conectado");
			socket.close();
		
			
		}
		catch(Exception e){
			
		}
	}

}

