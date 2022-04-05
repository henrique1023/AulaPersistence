package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.services.OrderItemService;

//Essas notações indicam que o objeto é de controle
@RestController
//e qual URL ele vai responder, http://localhost:8080/users
@RequestMapping(value = "/orderitem")
public class OrderItemResource {

	@Autowired
	private OrderItemService service;

	// esse metodo adiciona a tela os itens
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll() {
		List<OrderItem> list = service.findAll();
		// O metodo Response retorna no corpo da pagina a lista "list"
		return ResponseEntity.ok().body(list);
	}

	// essa notação indica que o id vai ser passado no link da pagina
	// http://localhost:8080/users/2
	@GetMapping(value = "/{id}")
	// para o spring entender que o valor vai vim da URL ele precisa da anotação
	// @PathVarible
	public ResponseEntity<OrderItem> findById(@PathVariable Long id) {
		OrderItem obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
