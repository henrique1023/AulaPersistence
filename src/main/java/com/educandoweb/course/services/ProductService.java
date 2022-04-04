package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
	
		//ele vai pegar o objeto que retornar e guardar em Optional
		Optional<Product> obj = repository.findById(id);
		
		//esse metodo vai retornar o objeto que estiver em Optional
		return obj.get();
	}
}
