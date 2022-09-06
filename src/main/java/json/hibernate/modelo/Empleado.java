package json.hibernate.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EMPLEADO")
public class Empleado implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CODIGO")
	private Long codigo;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="APELLIDO")
	private String apellido;
	
	@Column(name="FEC_NAC")
	private Date nacimiento;
	
	public Empleado(Long codigo, String nombre, String apellido, Date nacimiento) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
	}

	public Empleado() {	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", nacimiento="
				+ nacimiento + "]";
	}
	
	
	
}
