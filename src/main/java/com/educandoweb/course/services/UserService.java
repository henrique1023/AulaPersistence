package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
	
		//ele vai pegar o objeto que retornar e guardar em Optional
		Optional<User> obj = repository.findById(id);
		
		//esse metodo vai retornar o objeto que estiver em Optional
		return obj.get();
	}
	
	public User insert(User obj) {
		//esse metodo save do repository já retorna o objeto salvado
		return repository.save(obj);
	}
}
