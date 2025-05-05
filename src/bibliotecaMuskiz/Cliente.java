package bibliotecaMuskiz;

import java.util.Objects;

public class Cliente extends Usuarios {
	private int socio;
	
	/// CONSTRUCTORES ///
	public Cliente(int codigo, String dni, String nombre, int telefono, String correo, String usuario,
			String contraseña, Penalizaciones penalizacion, int socio) {
		super(codigo, dni, nombre, telefono, correo, usuario, contraseña, penalizacion);
		this.socio = socio;
	}
	
	/// GETTERS y SETTERS ///
	/**
	 * @return the socio
	 */
	public int getSocio() {
		return socio;
	}

	/**
	 * @param socio the socio to set
	 */
	public void setSocio(int socio) {
		this.socio = socio;
	}
	
	/// TOSTRING ///
	@Override
	public String toString() {
		return "Cliente [socio=" + socio + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(socio);
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
		Cliente other = (Cliente) obj;
		return socio == other.socio;
	}


	/// METODOS ///
	public void generarCodEmpleado() {
		this.socio = (int) (Math.random() * 9999) + 1;
		System.out.println("Código de empleado generado: " + this.socio);
	}

	public Trabajador changeTypeUser(int cod_ss) {
		Trabajador nuevoTrabajador = new Trabajador(codigo, dni, nombre, telefono, correo, usuario, contraseña, penalizacion, empleado, cod_ss);
		return nuevoTrabajador;
	}

}
