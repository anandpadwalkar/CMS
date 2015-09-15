package com.iitms.cms.transactions.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iitms.cms.transactions.entity.ComplaintRegisterEntity;
import com.iitms.cms.transactions.service.ComplaintRegisterService;

@Controller
public class ComplaintRegisterController {

	private static final Logger logger = LoggerFactory.getLogger(ComplaintRegisterController.class);
	@Autowired
	private ComplaintRegisterService complaintRegisterService;
	
	@RequestMapping(value = "/transaction/complaint")
	public String getComplaintForm(){
		return "complaint-register";
	}
	
	@RequestMapping(value = "/transaction/complaint/add")
	private String addComplaint(@ModelAttribute ComplaintRegisterEntity entity){
		logger.info("Entity : "   + entity);
		complaintRegisterService.addComplaint(entity);
		return "redirect:/transaction/complaint";
	}
}
