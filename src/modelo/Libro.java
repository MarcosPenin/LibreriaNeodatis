package modelo;

import java.time.LocalDate;

public class Libro {

	private int cod;
	private String titulo;
	private String categoria;
	private float precio;


	public Libro() {
	}

	public Libro(int cod, String titulo, String categoria, float precio) {
		super();
		this.cod = cod;
		this.titulo = titulo;
		this.categoria = categoria;
		this.precio = precio;

	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}



}
