package com.ecommerce.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Repository.ItemsRepository;
import com.ecommerce.Repository.OrdersRepository;
import com.ecommerce.dto.ItemDto;
import com.ecommerce.dto.OrderDto;
import com.ecommerce.entities.Order;



@RestController
public class rest {

	@Autowired
	private OrdersRepository orderRepo;
	
	@Autowired
	private ItemsRepository itemRepo;
	
	@PostMapping("/order/create")
	public void saveOrder(@RequestBody OrderDto orderDto) {
		Order order = new Order();
		order.setOrderDate(orderDto.getOrderDate());
		order.setOrderStatus("New");
		orderRepo.save(order);
		
		for(ItemDto item : orderDto.getItems()) {
			itemRepo.save(item);
		}
		
		}
	
	@GetMapping("/order/{orderId}")
	 public Order getOrderDetails(@PathVariable long orderId) {
		try{
			Optional<Order> findById = orderRepo.findByorderId(orderId);
		Order order = findById.get();
        return order;
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
	 return null;
	}
 }

