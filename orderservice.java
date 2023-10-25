package com.cg.sm;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class orderservice {
	
	@Autowired 
	private orderRespository repository; 
	
	public List<OrderDetails> listAll(){
		return repository.findAll();	
		}
	public OrderDetails get1(Integer id) {
		return repository.findById(id).get();
		
	}
	public void Save(OrderDetails order) {
		repository.save(order);
		
	}
	
	public void delete(Integer id)
	{
	repository.deleteById(id);
	}
	

 
}
