package com.delivery.Application.repository;

import com.delivery.Application.model.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<Orderitem,Long> {
}
