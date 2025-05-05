package bibliotecaMuskiz;

import java.util.Objects;

public abstract class Usuarios implements ObtenerDatos {
	protected int codigo;
	protected String dni;
	protected String nombre;
	protected int telefono;
	protected String correo;
	protected String usuario;
	protected String contraseña;
	
	
	///// METODOS /////
	public void cambiarTelf(int telefono) {
		this.telefono = telefono;
		System.out.println("Se ha cambiado el telefono correctamente a "+telefono);
	}
	
	public void cambiarCorreo(String correo) {
		this.correo = correo;
		System.out.println("Se ha cambiado el correo correctamente a "+correo);
	}
	
	public void cambiarUser(String usuario) {
		this.usuario = usuario;
		System.out.println("Se ha cambiado el usuario correctamente a "+usuario);
	}
	
	public void cambiarPass(String contraseña) {
		this.contraseña = contraseña;
		System.out.println("Se ha cambiado la contraseña correctamente");
	}
	
	public abstract void saludar();
	
	
	/////CONSTRUCTORES/////
	public Usuarios(int codigo, String dni, String nombre, int telefono, String correo, String usuario,
			String contraseña) {
		super();
		this.codigo = codigo;
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	
	/////GETTERS & SETTERS /////
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	///// TOSTRING /////
	@Override
	public String toString() {
		return "Usuarios [codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", correo=" + correo + ", usuario=" + usuario + ", contraseña=" + contraseña + "]";
	}

	
	///// HASCODE & EQUALS /////
	@Override
	public int hashCode() {
		return Objects.hash(codigo, contraseña, correo, dni, nombre, telefono, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return codigo == other.codigo && Objects.equals(contraseña, other.contraseña)
				&& Objects.equals(correo, other.correo) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre) && telefono == other.telefono
				&& Objects.equals(usuario, other.usuario);
	}
	
	
	
}
