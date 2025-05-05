package bibliotecaMuskiz;

import java.util.Objects;

public class Trabajador extends Usuarios {
	private int empleado;
	private int cod_ss;
	
	/// CONSTRUCTORES ///
	public Trabajador(int codigo, String dni, String nombre, int telefono, String correo, String usuario,
			String contraseña, int empleado, int cod_ss) {
		super(codigo, dni, nombre, telefono, correo, usuario, contraseña);
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
	@Override
	public void obtenerNombre() {
		// TODO Auto-generated method stub
		System.out.println("El nombre del empleado es "+nombre);
	}

	@Override
	public void obtenerCodigo() {
		// TODO Auto-generated method stub
		System.out.println("El codigo del empleado es "+codigo);
	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenas, yo soy "+nombre+" y soy el empleado numero "+empleado);
	}
	
	public void cambiarSS(int cod_ss) {
		this.cod_ss = cod_ss;
		System.out.println("Se ha cambiado el codigo de seguridad social correctamente");
	}

}
