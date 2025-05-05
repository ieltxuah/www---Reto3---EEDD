package bibliotecaMuskiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Prestamos {
	private int codigo;
	private LocalDate fecha_Devolucion;
	private LocalDate fecha_Prestamo;
	
	/// CONSTRUCTORES ///
	public Prestamos(int codigo, LocalDate fecha_Devolucion, LocalDate fecha_Prestamo) {
		super();
		this.codigo = codigo;
		this.fecha_Devolucion = fecha_Devolucion;
		this.fecha_Prestamo = fecha_Prestamo;
	}

	public Prestamos(int codigo, LocalDate fecha_Prestamo) {
		super();
		this.codigo = codigo;
		this.fecha_Prestamo = fecha_Prestamo;
		this.fecha_Devolucion = null;
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
	 * @return the fecha_Devolucion
	 */
	public LocalDate getFecha_Devolucion() {
		return fecha_Devolucion;
	}

	/**
	 * @param fecha_Devolucion the fecha_Devolucion to set
	 */
	public void setFecha_Devolucion(LocalDate fecha_Devolucion) {
		this.fecha_Devolucion = fecha_Devolucion;
	}

	/**
	 * @return the fecha_Prestamo
	 */
	public LocalDate getFecha_Prestamo() {
		return fecha_Prestamo;
	}

	/**
	 * @param fecha_Prestamo the fecha_Prestamo to set
	 */
	public void setFecha_Prestamo(LocalDate fecha_Prestamo) {
		this.fecha_Prestamo = fecha_Prestamo;
	}
	
	/// TOSTRING ///
	@Override
	public String toString() {
		return "Prestamos [codigo=" + codigo + ", fecha_Devolucion=" + fecha_Devolucion + ", fecha_Prestamo="
				+ fecha_Prestamo + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fecha_Devolucion, fecha_Prestamo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamos other = (Prestamos) obj;
		return codigo == other.codigo && Objects.equals(fecha_Devolucion, other.fecha_Devolucion)
				&& Objects.equals(fecha_Prestamo, other.fecha_Prestamo);
	}
	
	/// METODOS ///
	public void recogidaLibro(LocalDate fecha_Devolucion) {
		this.fecha_Devolucion = fecha_Devolucion;
		System.out.println("Se ha devuelto el libro el "+fecha_Devolucion+" correctamente");
	}
	
	public boolean comprobarRetraso() {
		long diasDiferencia = ChronoUnit.DAYS.between(this.fecha_Devolucion, this.fecha_Devolucion);
		return diasDiferencia > 7;
	}
	
}
