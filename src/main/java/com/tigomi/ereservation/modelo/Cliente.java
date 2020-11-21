/**
 * 
 */
package com.tigomi.ereservation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * @author Junior Aguilera
 *
 */
@Data
@Entity
@Table(name="cliente")
@NamedQuery(name="Cliente.findByIdentificacion", query = "Select c from Cliente c where c.indentificacionCli= ?1")
public class Cliente {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String indentificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	
	@OneToMany(mappedBy="cliente")
	private Set<Reserva> reservas;
	
	public Cliente() {
		
	}

	public String getIdCli() {
		return idCli;
	}

	public void setIdCli(String idCli) {
		this.idCli = idCli;
	}

	public String getNombreCli() {
		return nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getApellidoCli() {
		return apellidoCli;
	}

	public void setApellidoCli(String apellidoCli) {
		this.apellidoCli = apellidoCli;
	}

	public String getIndentificacionCli() {
		return indentificacionCli;
	}

	public void setIndentificacionCli(String indentificacionCli) {
		this.indentificacionCli = indentificacionCli;
	}

	public String getDireccionCli() {
		return direccionCli;
	}

	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}

	public String getTelefonoCli() {
		return telefonoCli;
	}

	public void setTelefonoCli(String telefonoCli) {
		this.telefonoCli = telefonoCli;
	}

	public String getEmailCli() {
		return emailCli;
	}

	public void setEmailCli(String emailCli) {
		this.emailCli = emailCli;
	}

	public Set<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}


	
	
}
