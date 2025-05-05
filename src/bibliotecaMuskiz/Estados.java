package bibliotecaMuskiz;

import java.util.Objects;

public class Estados implements ObtenerDatos {
	private int codigo;
	private String nombre;
	
	
	///// CONSTRUCTORES /////
	public Estados (int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Estados () {
		super();
		this.codigo = 0;
		this.nombre = "Incalculabre";
	}

	
	///// GETTERS & SETTERS /////
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
	
	//// TOSTRING ////
	@Override
	public String toString() {
		return "Estados [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

	///// HASCHCODE & EQUALS /////
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
		Estados other = (Estados) obj;
		return codigo == other.codigo && Objects.equals(nombre, other.nombre);
	}
	
	//// METODOS ////
	@Override
	public void obtenerNombre() {
		System.out.println("El estado del libro es "+nombre);
	}

	@Override
	public void obtenerCodigo() {
		// TODO Auto-generated method stub
		System.out.println("El codigo del estado es "+codigo);
	}
	
}
