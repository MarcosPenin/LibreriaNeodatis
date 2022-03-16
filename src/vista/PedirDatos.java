package vista;

import java.sql.Date;
import java.util.Scanner;

import modelo.Autor;
import modelo.Libro;
import utilidades.ControlData;

public class PedirDatos {

	static Scanner sc = new Scanner(System.in);

	public static Autor pedirAutor() {

		System.out.println("Introduce el DNI del nuevo autor");
		String dni = sc.nextLine();
		System.out.println("Introduce el nombre del nuevo autor");
		String nombre = sc.nextLine();
		System.out.println("Introduce la dirección del nuevo autor");
		String direccion = sc.nextLine();
		System.out.println("Introduce la edad del nuevo autor");
		int edad = ControlData.lerInt(sc);
		System.out.println("Introduce la nacionalidad del nuevo autor");
		String nacionalidad = sc.nextLine();
		Autor autor = new Autor(dni, nombre, direccion, edad, nacionalidad);
		return autor;
	}

	public static Libro pedirLibro() {
		
		System.out.println("Introduce el código del nuevo libro");
		int codigo=ControlData.lerInt(sc);
		System.out.println("Introduce el título del nuevo libro");
		String titulo=sc.nextLine();
		System.out.println("Introduce la categoría del nuevo libro");
		String categoria=sc.nextLine();
		System.out.println("Introduce el precio del nuevo libro");
		float precio=ControlData.lerFloat(sc);
		System.out.println("Introduce la fecha de publicación. Formato: YYYY-MM-DD");
		String fecha=sc.nextLine();
		Date fechaPublicacion= Date.valueOf(fecha);
		
		Libro libro=new Libro(codigo,titulo,categoria,precio,fechaPublicacion);
		return libro;
	}

	public static String pedirDni() {
		System.out.println("Introduce el dni");
		String dni=sc.nextLine();
		return dni;
	}

	public static String pedirNuevaDireccion() {
		System.out.println("Introduce la nueva dirección");
		String direccion=sc.nextLine();		
		return direccion;
	}

	public static String pedirTitulo() {
		System.out.println("Introduce el título");
		String titulo=sc.nextLine();
		return titulo;
	}

	public static String pedirNombre() {
		System.out.println("Introduce el nombre");
		String nombre=sc.nextLine();
		return nombre;
	}

	public static float pedirPrecio() {
		System.out.println("Introduce el precio");
		float precio=ControlData.lerFloat(sc);
		return precio;
	}

	public static int pedirCodigo() {
		System.out.println("Introduce el código");
		int codigo=ControlData.lerInt(sc);
		return codigo;
	}

	public static Date pedirFechaInicio() {
		Date fechaInicio = new Date(1500, 12, 12);
		return fechaInicio;
	}

	public static Date pedirFechaFin() {
		Date fechaFin = new Date(2000, 12, 12);
		return fechaFin;
	}

}
