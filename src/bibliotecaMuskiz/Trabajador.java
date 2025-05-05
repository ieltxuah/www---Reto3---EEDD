package bibliotecaMuskiz;

import java.util.Objects;

public class Trabajador extends Usuarios {
	private int empleado;
	private int cod_ss;
	
	/// CONSTRUCTORES ///
	public Trabajador(int codigo, String dni, String nombre, int telefono, String correo, String usuario,
			String contraseña, Penalizaciones penalizacion, int empleado, int cod_ss) {
		super(codigo, dni, nombre, telefono, correo, usuario, contraseña, penalizacion);
		this.empleado = empleado;
		this.cod_ss = cod_ss;
	}
	
	/// GETTERS y SETTERS ///
	/**
	 * @return the empleado
	 */
	public int getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}

	/**
	 * @return the cod_ss
	 */
	public int getCod_ss() {
		return cod_ss;
	}

	/**
	 * @param cod_ss the cod_ss to set
	 */
	public void setCod_ss(int cod_ss) {
		this.cod_ss = cod_ss;
	}
	
	/// TOSTRING ///
	@Override
	public String toString() {
		return "Trabajador [empleado=" + empleado + ", cod_ss=" + cod_ss + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cod_ss, empleado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return cod_ss == other.cod_ss && empleado == other.empleado;
	}


	/// METODOS ///
	public void generarCodEmpleado() {
		this.empleado = (int) (Math.random() * 9999) + 1;
		System.out.println("Código de empleado generado: " + this.empleado);
	}
	
	public Cliente changeTypeUser() {
		Cliente nuevoCliente = new Cliente(codigo, dni, nombre, telefono, correo, usuario, contraseña, penalizacion, socio);
		return nuevoCliente;
	}
	
}
