package com.kodewal.myntra.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewal.myntra.order.request.OrderRequest;

@Repository
public interface OrderRepository extends JpaRepository<OrderRequest, Integer>{

}
