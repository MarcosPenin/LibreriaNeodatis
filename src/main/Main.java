package main;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBServer;

import conexion.Cliente;
import conexion.Servidor;
import controlador.CrearBase;
import controlador.Insertar;

public class Main {

	public static void main(String[] args) {
		ODBServer server = Servidor.crearServidor();
		ODB odb = Cliente.iniciarCliente();
		CrearBase.crear(odb);

		Insertar.insertarAutor(odb);
		
		odb.commit();
		odb.close();
		server.close();

	}

}
