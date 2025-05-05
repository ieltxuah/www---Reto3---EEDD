package bibliotecaMuskiz;

import java.util.Objects;

public class Paises implements ObtenerDatos, GeneradorCodigos {
	private int codigo;
	private String nombre;
	
	/// CONSTRUCTOR ///
	public Paises(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Paises(String nombre) {
		super();
		this.codigo = generarCod();
		this.nombre = nombre;
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

	/// TOSTRING ///
	@Override
	public String toString() {
		return "Paises [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paises other = (Paises) obj;
		return codigo == other.codigo && Objects.equals(nombre, other.nombre);
	}
	
	/// METODOS ///
	@Override
	public void introducirse() {
		System.out.println("Hola, soy " + nombre + " y mi código es " + codigo + ".");
	}

	@Override
	public int generarCod() {
		int cod = (int) (Math.random() * 999) + 1; 
		return cod;
	}
}
