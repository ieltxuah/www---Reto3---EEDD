package bibliotecaMuskiz;

import java.util.Objects;

public class Ejemplares {
	private int codigo;
	private Libros libro;
	private Estados estado;
	
	/// CONSTRUCTORES ///
	public Ejemplares(int codigo, Libros libro, Estados estado) {
		super();
		this.codigo = codigo;
		this.libro = libro;
		this.estado = estado;
	}

	public Ejemplares() {
		super();
		this.codigo = 0;
		this.libro = null;
		this.estado = null;
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
	 * @return the libro
	 */
	public Libros getLibro() {
		return libro;
	}

	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libros libro) {
		this.libro = libro;
	}

	/**
	 * @return the estado
	 */
	public Estados getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	/// TOSTRING ///
	@Override
	public String toString() {
		return "Ejemplares [codigo=" + codigo + ", libro=" + libro + ", estado=" + estado + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		return Objects.hash(codigo, estado, libro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejemplares other = (Ejemplares) obj;
		return codigo == other.codigo && Objects.equals(estado, other.estado) && Objects.equals(libro, other.libro);
	}
}
