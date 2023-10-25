package com.cg.sm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRespository extends JpaRepository<OrderDetails, Integer>{
	
}
