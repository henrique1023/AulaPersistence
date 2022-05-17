package com.educandoweb.course.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario {
	
	@Id
	@Column(name = "id_interno")
	private Integer idInterno;
	
	@Column(name = "nome", length = 30)
	private String nome;
	
	@Column(name = "data_nascimento")
	private Date dataNasc;
	
	@Column(name = "salario")
	private Double salario;
	
	@Column(name = "telefone_celular", length = 12)
	private Long telCel;
	
	public Funcionario() {
	}
	
	public Funcionario(Integer idInterno, String nome, Date dataNasc, Double salario, Long telCel) {
		super();
		this.idInterno = idInterno;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.salario = salario;
		this.telCel = telCel;
	}
	public Integer getIdInterno() {
		return idInterno;
	}
	public void setIdInterno(Integer idInterno) {
		this.idInterno = idInterno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Long getTelCel() {
		return telCel;
	}
	public void setTelCel(Long telCel) {
		this.telCel = telCel;
	}
	
	
	
}
