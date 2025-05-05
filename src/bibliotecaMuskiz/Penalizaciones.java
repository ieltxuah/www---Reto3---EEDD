package bibliotecaMuskiz;

import java.util.Objects;

public class Penalizaciones{
	private int codigo;
	private String nombre;
	private int libros_permitidos;
	
	
	//// CONSTRUCTORES ////
	public Penalizaciones(int codigo, String nombre, int libros_permitidos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.libros_permitidos = libros_permitidos;
	}
	
	public Penalizaciones(int codigo) {
		super();
		this.codigo = codigo;
		this.nombre = "****";
		this.libros_permitidos = 0;
	}

	
	///// GETTERS & SETTERS/////
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codido) {
		this.codigo = codido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the libros_permitidos
	 */
	public int getLibros_permitidos() {
		return libros_permitidos;
	}

	/**
	 * @param libros_permitidos the libros_permitidos to set
	 */
	public void setLibros_permitidos(int libros_permitidos) {
		this.libros_permitidos = libros_permitidos;
	}
	
	//// TOSTRING ////
	@Override
	public String toString() {
		return "Penalizaciones [codido=" + codigo + ", nombre=" + nombre + ", libros_permitidos=" + libros_permitidos
				+ "]";
	}

	///// HASHCODE & EQUALS /////
	@Override
	public int hashCode() {
		return Objects.hash(codigo, libros_permitidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Penalizaciones other = (Penalizaciones) obj;
		return codigo == other.codigo && libros_permitidos == other.libros_permitidos
				&& Objects.equals(nombre, other.nombre);
	}
	
}