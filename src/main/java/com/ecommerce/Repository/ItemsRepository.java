package com.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.dto.ItemDto;
import com.ecommerce.entities.Item;

public interface ItemsRepository extends JpaRepository<Item, Long> {

	void save(ItemDto items);

}
