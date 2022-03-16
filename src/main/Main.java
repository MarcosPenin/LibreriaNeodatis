package main;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBServer;

import conexion.Cliente;
import conexion.Servidor;
import controlador.Consultar;
import controlador.CrearBase;
import controlador.Insertar;
import controlador.Modificar;
import vista.VerMenu;

public class Main {

	public static void main(String[] args) {
		ODBServer server = Servidor.crearServidor();
		ODB odb = Cliente.iniciarCliente();
		CrearBase.crear(odb);	
		VerMenu.menuPrincipal(odb);
		
		
		
		Insertar.insertarAutor(odb);
		Modificar.modificarAutor(odb);
		Consultar.autoresItalianos(odb);
		
		
		odb.commit();
		odb.close();
		server.close();
	}

}
