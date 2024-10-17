package org.serratec.serratecpub.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Pedido {
	
	private Long id;
	private LocalDate dataPedido;
	private LocalDate dataEntrega;
	private LocalDate dataEnvio;
	private StatusPedido statusPedido;
	private Double valorTotal;
	
	private Cliente cliente;

	
	public Long getId() {
		return id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}