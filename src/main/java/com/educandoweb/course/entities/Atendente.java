package com.educandoweb.course.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atendente")
public class Atendente  extends Funcionario{
	
	@Id
	@Column(name = "hora_entrada")
	private Date horaEntrada;
	
	@Column(name = "hora_saida")
	private Date horaSaida;
	
	@Column(name = "email_inst")
	private String email;
}
