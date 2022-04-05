package com.educandoweb.course.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

//Essas notações indicam que o objeto é de controle
@RestController
//e qual URL ele vai responder, http://localhost:8080/users
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	// esse metodo adiciona a tela os itens
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		// O metodo Response retorna no corpo da pagina a lista "list"
		return ResponseEntity.ok().body(list);
	}

	// essa notação indica que o id vai ser passado no link da pagina
	// http://localhost:8080/users/2
	@GetMapping(value = "/{id}")
	// para o spring entender que o valor vai vim da URL ele precisa da anotação
	// @PathVarible
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//quando é para gravar algo no banco, se usa post
	@PostMapping
	//para o sistema saber que oque vai vim é um json que vai ser transformado em objeto
	//se usa @RasquestBody
	public ResponseEntity<User> insert(@RequestBody User obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
