package bibliotecaMuskiz;

import java.util.Objects;

public class Ejemplares {
	private int codigo;
	
	/// CONSTRUCTORES ///
	public Ejemplares(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Ejemplares() {
		super();
		this.codigo = 0;
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
	
	/// TOSTRING ///
	@Override
	public String toString() {
		return "Ejemplares [codigo=" + codigo + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
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
		return codigo == other.codigo;
	}
}
