package com.slokam.f22b5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.Daos.DoctorDao;
import com.slokam.f22b5.healthcare.Doctor;
@RestController
public class DoctorController {
	@Autowired
private DoctorDao dao;
	@RequestMapping("saveDoctorData")
public void saveDoctorData(@RequestBody Doctor d) {
	dao.save(d);
}
}
