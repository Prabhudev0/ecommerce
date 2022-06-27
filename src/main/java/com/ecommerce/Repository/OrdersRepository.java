package com.ecommerce.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.Order;

public interface OrdersRepository extends JpaRepository<Order, Long> {

	Optional<Order> findByorderId(long orderId);

}
