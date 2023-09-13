package com.india.airLines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.india.airLines.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> 
{
	
}
