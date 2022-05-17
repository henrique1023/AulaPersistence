package com.educandoweb.course.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "id_cpf")
	private Integer cpf;
	
	@Column(name = "nome", length = 20)
	private String nome;
	
	@Column(name = "telefone_celular", length = 12)
	private Integer telCel;
	
	@Column(name = "email", length = 30)
	private String email;
	
	@Column(name = "pronome_tratamento")
	private String pronomeTratamento;
}
