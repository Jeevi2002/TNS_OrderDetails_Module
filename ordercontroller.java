package com.cg.sm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ordercontroller {
	
	@Autowired
	private orderservice service ; 
	
	//retrieval
	@GetMapping("/orderdetails")
	public List<OrderDetails> list(){
		return service.listAll();
		
	}
	
	
	//retrieval by id 
	@GetMapping("/orderdetails/id")
	public ResponseEntity <OrderDetails> get(@PathVariable Integer id){
		try {
			OrderDetails order = service.get1(id);
			return new ResponseEntity<OrderDetails>(order, HttpStatus.OK );
		} 
		catch (Exception e) {
			return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND );
		}	
				}
	
	// Create operation
	@PostMapping("/orders")
	public void add(@RequestBody OrderDetails order){
		service.Save(order);
	}
	
	// Update operation
	@PutMapping("//order/{id}")
	public ResponseEntity<?> update(@RequestBody OrderDetails order, @PathVariable Integer id){
	try{

		OrderDetails existOrder = service.get1(id);
		service.Save(order);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (Exception e){
	return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
	}
	
	
	// Delete operation
	@DeleteMapping("/orders/{id}")
	public void delete(@PathVariable Integer id)
	{
	service.delete(id);
	}  
	
	
}