
package vista;

import java.util.ArrayList;
import java.util.Scanner;

import org.neodatis.odb.ODB;

import controlador.Borrar;
import controlador.Consultar;
import controlador.Insertar;
import controlador.Modificar;
import utilidades.ControlData;
import utilidades.Menu;

public class VerMenu {

	static Scanner sc = new Scanner(System.in);
	static byte op;
	

	public static void menuPrincipal(ODB odb) {
		
		Menu menuPrincipal = new Menu(opciones());
		byte opMenu;
		System.out.println("*********************************************************************");
		System.out.println("****************************BIENVENIDO*********************** ");

		do {
			System.out.println("*********************************************************************");
			System.out.println("Introduzca la opci�n que desee realizar:");
			menuPrincipal.printMenu();
			opMenu = ControlData.lerByte(sc);
			switch (opMenu) {
			case 1:
				Insertar.insertarAutor(odb);
				break;
			case 2:
				Insertar.anadirLibroAutor(odb);
				break;
			case 3:
				Modificar.modificarAutor(odb);
				break;
			case 4:
				Modificar.modificarPrecio(odb);
				break;
			case 5:
				Borrar.libro(odb);
				break;
			case 6:
				Consultar.autoresRusos(odb);
				break;
			case 7: 
				Consultar.librosEntreFechas(odb);
				break;
			case 8:
				Consultar.autoresEspanolesMenores60(odb);
				break;
			case 9:
				Consultar.numAutoresNacion(odb);
				break;
			case 10:
				Consultar.librosAutor(odb);
				break;
			case 11:
				Consultar.libroConAutor(odb);
				break;
			}
		} while (opMenu != 12);
	}

	


	static ArrayList<String> opciones() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Altas de un autor con sus libros");
		opciones.add("Anadir un libro a un autor");
		opciones.add("Modificar la direccion de un autor recibiendo su DNI");
		opciones.add("Modificar el precio de un libro recibiendo su t�tulo");
		opciones.add("Borrado de libros recibiendo su c�digo");
		opciones.add("Consulta autores rusos");
		opciones.add("Consulta libros escritos por un autor entre dos fechas");
		opciones.add("Consulta autores espa�oles menores de 60 a�os");
		opciones.add("Ver n�mero de autores de una nacionalidad");
		opciones.add("Ver libros de un autor");
		opciones.add("Ver datos de un libro por t�tulo, incluyendo su autor");
		opciones.add("Salir");
		return opciones;
	}
	
	static ArrayList<String> siNo(){
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("S�");
		opciones.add("No");
		opciones.add("Salir");
		return opciones;
	}

	

}
