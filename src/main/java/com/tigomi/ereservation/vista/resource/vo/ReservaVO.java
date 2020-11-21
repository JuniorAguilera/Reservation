package com.tigomi.ereservation.vista.resource.vo;

import java.util.Date;

import lombok.Data;

/**
 * Clase que representa la tabla reserva
 * @author Junior Aguilera
 *
 */
@Data
public class ReservaVO {
	private String codigoRes;
	private Date fechaIngresoRes;
	private Date fechaSalidaRes;
	private int cantidadPersonasRes;
	private String descripcionRes;
	private ClienteVo cliente;
	
	public String getCodigoRes() {
		return codigoRes;
	}
	public void setCodigoRes(String codigoRes) {
		this.codigoRes = codigoRes;
	}
	public Date getFechaIngresoRes() {
		return fechaIngresoRes;
	}
	public void setFechaIngresoRes(Date fechaIngresoRes) {
		this.fechaIngresoRes = fechaIngresoRes;
	}
	public Date getFechaSalidaRes() {
		return fechaSalidaRes;
	}
	public void setFechaSalidaRes(Date fechaSalidaRes) {
		this.fechaSalidaRes = fechaSalidaRes;
	}
	public int getCantidadPersonasRes() {
		return cantidadPersonasRes;
	}
	public void setCantidadPersonasRes(int cantidadPersonasRes) {
		this.cantidadPersonasRes = cantidadPersonasRes;
	}
	public String getDescripcionRes() {
		return descripcionRes;
	}
	public void setDescripcionRes(String descripcionRes) {
		this.descripcionRes = descripcionRes;
	}
	public ClienteVo getCliente() {
		return cliente;
	}
	public void setCliente(ClienteVo cliente) {
		this.cliente = cliente;
	}
	
	
}