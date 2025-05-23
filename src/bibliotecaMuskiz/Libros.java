package bibliotecaMuskiz;

import java.util.ArrayList;
import java.util.Objects;

public class Libros implements ObtenerDatos, GeneradorCodigos {
	private int codigo;
	private int isbn;
	private String titulo;
	private int valoracion;

	/// CONSTRUCTORES ///
	public Libros(int codigo, int isbn, String titulo, int valoracion) {
		super();
		this.codigo = codigo;
		this.isbn = isbn;
		this.titulo = titulo;
		this.valoracion = valoracion;
	}
	
	public Libros(int isbn, String titulo, int valoracion) {
		super();
		this.codigo = generarCod();
		this.isbn = isbn;
		this.titulo = titulo;
		this.valoracion = valoracion;
	}
	
	public Libros(int codigo, int isbn, String titulo) {
		super();
		this.codigo = codigo;
		this.isbn = isbn;
		this.titulo = titulo;
		this.valoracion = 0;
	}
	
	public Libros(int isbn, String titulo) {
		super();
		this.codigo = generarCod();
		this.isbn = isbn;
		this.titulo = titulo;
		this.valoracion = 0;
	}

	/// GETTERS y SETTERS ///
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the valoracion
	 */
	public int getValoracion() {
		return valoracion;
	}

	/**
	 * @param valoracion the valoracion to set
	 */
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	/// TOSTRING ///
	@Override
	public String toString() {
		return "Libros [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", valoracion=" + valoracion
				+ "]";
	}

	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		return Objects.hash(isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		return isbn == other.isbn && Objects.equals(titulo, other.titulo);
	}
	
	/// METODOS ///
	public static double calcularMediaValoracion(ArrayList<Libros> libros) {
	    if (libros.isEmpty()) {
	        System.out.println("No hay libros disponibles para calcular la media.");
	        return 0;
	    }
	    double suma = 0;
	    for (Libros libro : libros) {
	        suma += libro.getValoracion();
	    }
	    return suma / libros.size();
	}

	@Override
	public void introducirse() {
		System.out.println("¡Hola! Soy '" + titulo + "', el libro que te transportará a mundos desconocidos. He recibido una valoración de " + valoracion + " estrellas. ¿Estás listo para sumergirte en mi historia?");
	}

	@Override
	public int generarCod() {
		int cod = (int) (Math.random() * 9999999) + 1; 
		return cod;
	}
	
}
