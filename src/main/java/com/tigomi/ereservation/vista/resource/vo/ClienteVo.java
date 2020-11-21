/**
 * 
 */
package com.tigomi.ereservation.vista.resource.vo;

import java.util.Set;
import javax.persistence.Entity;
import org.hibernate.annotations.GenericGenerator;
import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * 
 * @author Junior Aguilera
 *
 */
@Data
public class ClienteVo {
	private String nombreCli;
	private String apellidoCli;
	private String indentificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
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
	
	

}
