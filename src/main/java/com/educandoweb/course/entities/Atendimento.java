package com.educandoweb.course.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atedimento")
public class Atendimento {
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private List<Cliente> clientes = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "funcionarios_id")
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	@Id
	@Column(name = "atendimento", length = 12)
	private int idAtendimento;
	
	@Column(name = "data_hora")
	private Date dataHora;

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public int getIdAtendimento() {
		return idAtendimento;
	}

	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
	
}
