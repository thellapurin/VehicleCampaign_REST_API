package com.campaign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campaign.model.T_Campaign;
//import com.campaign.repository.MessageRepository;
import com.campaign.repository.VehicleRepository;

@Service
public class VehicleCampaignService {

	@Autowired
	VehicleRepository vrepo;

	@Autowired
	// MessageRepository messageRepository;

	public List<T_Campaign> listAll() {

		return vrepo.findAll();
	}

	public T_Campaign save(T_Campaign t_campaign) {
		// messageRepository.save(t_campaign.getMessage());
		return vrepo.save(t_campaign);
	}

	public T_Campaign get(Integer id) {
		return vrepo.findById(id).get();
	}

	public void delete(Integer id) {
		vrepo.deleteById(id);

	}
}
