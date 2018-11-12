package com.slokam.f22b5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.healthcare.Appointment;
import com.slokam.f22b5.service.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService ser;
	@PostMapping
public void saveAppointment(@RequestBody Appointment app) {
	ser.saveAppointment(app);
}
	@GetMapping("/{id}")
	public Appointment getData(@PathVariable("id") Long id) {
		Appointment ap=ser.getData(id);
		return ap;
	}
}
