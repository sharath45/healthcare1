package com.slokam.f22b5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.healthcare.Complaint;
import com.slokam.f22b5.service.ComplaintService;

@RestController
@RequestMapping("complaint")
public class ComplaintController {
	@Autowired
private ComplaintService ser;
	@PostMapping
public void saveComplaint(@RequestBody Complaint c) {
	ser.saveComplaint(c);
}
}
