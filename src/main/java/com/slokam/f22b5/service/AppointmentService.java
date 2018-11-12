package com.slokam.f22b5.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22b5.Daos.AppointmentDao;
import com.slokam.f22b5.healthcare.Appointment;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao dao;
public void saveAppointment(Appointment ap) {
	dao.save(ap);
}
public Appointment getData(Long id) {
	Optional<Appointment> app=dao.findById(id);
	Appointment ap=app.get();
	return ap;
}
}
