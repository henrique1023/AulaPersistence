package com.educandoweb.course.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.educandoweb.course.entities.enums.CategoriaChn;

@Entity
@Table(name = "entregador")
public class Entregador extends Funcionario{
	
	@Id
	@Column(name = "numero_cnh")
	Integer numero;
	
	@Column(name = "categoria_cnh")
	CategoriaChn cnh;
}
