package com.campaign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campaign.model.T_Campaign;
import com.campaign.service.VehicleCampaignService;

@RestController
@RequestMapping("/api")
public class CampaignController {
	@Autowired
	VehicleCampaignService vehiclecampaignservice;

	@GetMapping("/campaigns")
	public List<T_Campaign> getAllVehicals() {

		return vehiclecampaignservice.listAll();
	}

	@PostMapping("/campaigns")
	public T_Campaign createEmployee(@RequestBody T_Campaign tcampaign) {
		System.out.println(tcampaign.getMessage());
		// JSON to Model class conversion
		return vehiclecampaignservice.save(tcampaign);
	}

}
