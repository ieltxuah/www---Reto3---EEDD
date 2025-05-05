package bibliotecaMuskiz;

import java.util.Objects;

public class Autores implements ObtenerDatos {
	private int codigo;
	private String nombre;
	private String apellido;
	private Paises pais;
	
	/// CONSTRUCTORES ///
	public Autores(int codigo, String nombre, String apellido, Paises pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
	}

	public Autores(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = "";
		this.pais = null; 
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

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * @return the pais
	 */
	public Paises getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Paises pais) {
		this.pais = pais;
	}

	/// TOSTRING ///
	@Override
	public String toString() {
		return "Autores [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + (pais != null ? pais.getNombre() : "No asignado") + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		return Objects.hash(apellido, codigo, nombre, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autores other = (Autores) obj;
		return Objects.equals(apellido, other.apellido) && codigo == other.codigo
				&& Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais);
	}

	/// METODOS ///
	@Override
	public void introducirse() {
		System.out.println("Hola, soy " + nombre + " " + apellido + " y mi código es " + codigo + ".");
        if (pais != null) {
        	System.out.println("Hola, soy " + nombre + " " + apellido + " de " + pais.getNombre() + " y mi código es " + codigo + ".");
        } else {
        	System.out.println("Hola, soy " + nombre + " " + apellido + " y mi código es " + codigo + ".");
        }
	}

}
