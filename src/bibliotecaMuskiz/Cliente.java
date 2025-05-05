package bibliotecaMuskiz;

import java.util.Objects;

public class Cliente extends Usuarios {
	private int socio;
	
	/// CONSTRUCTORES ///
	public Cliente(int codigo, String dni, String nombre, int telefono, String correo, String usuario,
			String contraseña, int socio) {
		super(codigo, dni, nombre, telefono, correo, usuario, contraseña);
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
	@Override
	public void obtenerNombre() {
		// TODO Auto-generated method stub
		System.out.println("El nombre del cliente es "+nombre);
	}

	@Override
	public void obtenerCodigo() {
		// TODO Auto-generated method stub
		System.out.println("El codigo del cliente es "+codigo);

	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenas, yo soy "+nombre+" y soy el socio numero "+socio);
	}

}
