package com.campaign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campaign.model.T_Campaign;

public interface VehicleRepository extends JpaRepository<T_Campaign, Integer> {

}
