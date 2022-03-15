package modelo;

import java.util.ArrayList;

public class Autor {

	private String dni;
	private String nombre;
	private String direccion;
	private int edad;
	private String nacionalidad;
	private ArrayList<Libro> libros=new ArrayList<>();
	
	public Autor() {}
	
	public Autor(String dni, String nombre, String direccion, int edad, String nacionalidad, ArrayList<Libro> libros) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}
	public Autor(String dni, String nombre, String direccion, int edad, String nacionalidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.nacionalidad = nacionalidad;

	}
	
	public void anadirLibro(Libro libro) {
		libros.add(libro);
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	
	
	
}
